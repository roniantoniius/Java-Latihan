package roniantonius.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import roniantonius.spring.core.data.Bar;
import roniantonius.spring.core.data.Foo;
import roniantonius.spring.core.data.FooBar;

public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    // penggunaan anotasi QUalifier untuk mengambil method spesifik
    @Bean
    public FooBar foobar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
