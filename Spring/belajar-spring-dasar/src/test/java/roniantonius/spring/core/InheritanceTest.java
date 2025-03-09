package roniantonius.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import roniantonius.spring.core.service.MerchantService;
import roniantonius.spring.core.service.MerchantServiceImpl;

public class InheritanceTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testInheritance(){
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImpl merchantService1 = applicationContext.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService, merchantService1);
    }

}
