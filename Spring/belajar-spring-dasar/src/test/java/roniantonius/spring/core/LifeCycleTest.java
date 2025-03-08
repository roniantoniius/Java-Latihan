package roniantonius.spring.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import roniantonius.spring.core.data.Connection;
import roniantonius.spring.core.data.Server;

public class LifeCycleTest {
    private ConfigurableApplicationContext applicationContext;

    // ini kita inisialisasi, jadi secara otomatis, mengakses Bean untuk afterProperties di Connection (mulai)
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        // atau bisa shutdown secara otomitis
//        applicationContext.registerShutdownHook();
    }

    // ini kita akhiri sesi
    @AfterEach
    void tearDown(){
        applicationContext.close();
    }
    @Test
    void testConnection(){
        Connection connection = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer(){
        Server server = applicationContext.getBean(Server.class);
    }
}
