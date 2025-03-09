package roniantonius.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import roniantonius.spring.core.data.MultiFoo;
import roniantonius.spring.core.repository.CategoryRepository;
import roniantonius.spring.core.repository.CustomerRepository;
import roniantonius.spring.core.repository.ProductRepository;
import roniantonius.spring.core.service.CategoryService;
import roniantonius.spring.core.service.CustomerService;
import roniantonius.spring.core.service.ProductService;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService(){
        ProductService service1 = applicationContext.getBean(ProductService.class);
        ProductService service2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(service1, service2);
    }

    @Test
    void testConstructorDependencyInjection(){
        ProductService service = applicationContext.getBean(ProductService.class);
        ProductRepository bean = applicationContext.getBean(ProductRepository.class);
        Assertions.assertSame(service.getProductRepository(), bean);
    }

    @Test
    void testSetterDependencyInjection(){
        CategoryService bean = applicationContext.getBean(CategoryService.class);
        CategoryRepository bean1 = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(bean1, bean.getCategoryRepository());
    }

    @Test
    void testFieldDependencyInjection(){
        // penerapan field DI melalui anotasi Qualifier
        CustomerService service = applicationContext.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepo = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepo = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepo, service.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepo, service.getPremiumCustomerRepository());
    }

    @Test
    void testObjectProvider(){
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }
}
