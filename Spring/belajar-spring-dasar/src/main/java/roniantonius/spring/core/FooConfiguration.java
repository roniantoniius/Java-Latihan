package roniantonius.spring.core;

import org.springframework.context.annotation.Bean;
import roniantonius.spring.core.data.Foo;

public class FooConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }
}
