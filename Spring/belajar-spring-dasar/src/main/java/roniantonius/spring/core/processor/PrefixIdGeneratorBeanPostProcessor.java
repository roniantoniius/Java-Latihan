package roniantonius.spring.core.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.aware.IdAware;

import java.util.UUID;
@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix ID generator Procesor for Bean{}", beanName);
        if (bean instanceof IdAware){
            log.info("Prefix Set ID generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("RON-"+idAware.getId());
        }
        return bean;
    }
}
