package roniantonius.spring.core;
import org.springframework.context.annotation.*;
import roniantonius.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Configuration
public class DuplicateConfiguration{
    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Primary // ini bakal jadiin sebagai default ketiak mengakses bean
    @Bean
    public Foo foo2(){
        return new Foo();
    }

    // kita juga bisa set nama bean bebas, biar ga secara default mengambil nama si method. Tapi tetep inget kalau nama bean harus unik
    @Bean(value = "ron")
    public Foo foo3(){
        log.info("Rename nama bean!");
        return new Foo();
    }
}