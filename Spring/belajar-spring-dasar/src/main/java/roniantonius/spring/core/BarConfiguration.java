package roniantonius.spring.core;

import org.springframework.context.annotation.Bean;
import roniantonius.spring.core.data.Bar;

public class BarConfiguration {
    @Bean
    public Bar bar(){
        return new Bar();
    }
}
