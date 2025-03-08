package roniantonius.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import roniantonius.spring.core.data.Connection;
import roniantonius.spring.core.data.Server;

@Configuration
public class LifeCycleConfiguration {
    @Bean
    public Connection connection(){
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server(){
        return new Server();
    }
}
