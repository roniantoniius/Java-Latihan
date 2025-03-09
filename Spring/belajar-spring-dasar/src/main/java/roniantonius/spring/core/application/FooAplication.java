package roniantonius.spring.core.application;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import roniantonius.spring.core.data.Bar;
import roniantonius.spring.core.data.Foo;
import roniantonius.spring.core.listener.AppStartingListener;

import java.util.List;

@SpringBootApplication
public class FooAplication {
    @Bean
    public Foo foo(Bar bar){
        return new Foo();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooAplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of(new AppStartingListener()));

        // listeners dalam spring boot bisa dijalankan bahkan sebelum Application Context jalan
        ConfigurableApplicationContext configurableApplicationContext = application.run(args);
        Foo foo = configurableApplicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooAplication.class, args);
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }
}
