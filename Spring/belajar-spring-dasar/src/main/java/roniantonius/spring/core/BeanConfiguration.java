package roniantonius.spring.core;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import roniantonius.spring.core.data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {
    @Bean
    public Foo foo(){
        log.info("Membuat foo baru!");
        return new Foo();
    }
}
