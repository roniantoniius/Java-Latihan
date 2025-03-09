package roniantonius.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import roniantonius.spring.core.event.LoginSuccessEvent;
import roniantonius.spring.core.listener.LLoginAgainSuccessListener;
import roniantonius.spring.core.listener.LLoginFailedListener;
import roniantonius.spring.core.listener.LLoginSuccessListener;
import roniantonius.spring.core.listener.UserListener;
import roniantonius.spring.core.service.AuthService;
import roniantonius.spring.core.service.UserService;

public class EventListenerTest {
    @Configuration
    @Import({
            UserService.class,
            LLoginSuccessListener.class,
            LLoginAgainSuccessListener.class,
            UserListener.class,
            LLoginFailedListener.class
    })
    public static class TestConfiguration{}
    private ConfigurableApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent(){
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("roni", "pass");
        userService.login("dsa", "dsaa");
    }
}
