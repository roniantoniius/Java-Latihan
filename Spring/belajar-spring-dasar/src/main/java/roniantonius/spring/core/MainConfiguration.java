package roniantonius.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import roniantonius.spring.core.configuration.BarConfiguration;
import roniantonius.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
