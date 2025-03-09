package roniantonius.spring.core.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import roniantonius.spring.core.application.FooAplication;
import roniantonius.spring.core.data.Foo;

@SpringBootTest(classes = FooAplication.class)
class FooAplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testSpringBoot(){
        Assertions.assertNotNull(foo);
    }
}
