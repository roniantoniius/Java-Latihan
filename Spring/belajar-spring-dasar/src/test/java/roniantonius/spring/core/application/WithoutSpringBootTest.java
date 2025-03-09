package roniantonius.spring.core.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import roniantonius.spring.core.data.Foo;

public class WithoutSpringBootTest {
    private ConfigurableApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(FooAplication.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFoo(){
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
