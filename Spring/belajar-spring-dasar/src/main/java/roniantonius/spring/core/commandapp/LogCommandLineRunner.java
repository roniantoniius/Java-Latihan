package roniantonius.spring.core.commandapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;

import java.lang.reflect.Array;
import java.util.Arrays;

@Slf4j
public class LogCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Log command line runner : {}", Arrays.toString(args));
    }
}
