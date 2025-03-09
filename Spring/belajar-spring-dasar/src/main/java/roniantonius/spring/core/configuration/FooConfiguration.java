package roniantonius.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import roniantonius.spring.core.data.Foo;

public class FooConfiguration {

    @Primary
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Foo foo2() { return new Foo(); }

    @Bean
    public Foo foo3() { return new Foo(); }
}
