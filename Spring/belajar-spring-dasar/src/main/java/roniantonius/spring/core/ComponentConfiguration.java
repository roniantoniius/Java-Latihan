package roniantonius.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "roniantonius.spring.core.repository",
        "roniantonius.spring.core.service",
        "roniantonius.spring.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
