package roniantonius.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import roniantonius.spring.core.factory.PaymentGateawayClientFactoryBean;

@Configuration
@Import({PaymentGateawayClientFactoryBean.class})
public class FactoryConfiguration {
}
