package roniantonius.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import roniantonius.spring.core.data.Bar;

public class BarConfiguration {
    @Bean
    public Bar bar(){
        return new Bar();
    }
}
