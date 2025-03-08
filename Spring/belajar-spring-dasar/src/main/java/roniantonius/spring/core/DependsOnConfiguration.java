package roniantonius.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import roniantonius.spring.core.data.Bar;
import roniantonius.spring.core.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn( value = { "bar" })
    public Foo foo(){
        log.info("Bikin method foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Bikin method bar");
        return new Bar();
    }
}
