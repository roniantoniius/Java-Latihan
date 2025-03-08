package roniantonius.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import roniantonius.spring.core.data.Bar;
import roniantonius.spring.core.data.Foo;
import roniantonius.spring.core.scope.DoubletonScope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Scope("prototype")
    @Bean
    public Foo foo(){
        log.info("Bikin foo di class Scope prototype");
        return new Foo();
    }

    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        return new Bar();
    }
}
