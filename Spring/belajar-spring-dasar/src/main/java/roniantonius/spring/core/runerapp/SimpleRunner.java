package roniantonius.spring.core.runerapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class SimpleRunner implements ApplicationRunner {

    // Menerapkan Application Runner lebih efisien daripada Command Line Runner yang menghasilkan dalam bentuk bullet, atau dipisah per spasi
    // Namun dengan Applicaition Runner, inputnya dilakukan parsing (awalan '--')
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> profiles = args.getOptionValues("profiles");
        log.info("Profiles: {}", profiles);
    }
}
