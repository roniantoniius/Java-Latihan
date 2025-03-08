package roniantonius.spring.core;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import roniantonius.spring.core.data.Foo;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest{

    @Test
    void testDuplicate(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void getBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Foo foo = context.getBean(Foo.class); // ini sebenernya bakal error, dan solusinya kita bikin class PrimaryConfiguration baru, sama seperti sekarang

        // nanti di testnya kita bisa jadiin ApplicationContext sebagai constructor.
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);
        Foo foo3 = context.getBean("ron", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo2, foo3);
    }
}