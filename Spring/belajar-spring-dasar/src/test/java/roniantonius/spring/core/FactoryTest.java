package roniantonius.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import roniantonius.spring.core.client.PaymentGateawayClient;

public class FactoryTest {
    private ConfigurableApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFactory(){
        PaymentGateawayClient paymentGateawayClient = applicationContext.getBean(PaymentGateawayClient.class);
        Assertions.assertNotNull(paymentGateawayClient);
        Assertions.assertEquals("https://roni.com", paymentGateawayClient.getEndpoint());
        Assertions.assertEquals("ronia314fio", paymentGateawayClient.getPrivateKey());
        Assertions.assertEquals("publicr", paymentGateawayClient.getPublicKey());
    }
}
