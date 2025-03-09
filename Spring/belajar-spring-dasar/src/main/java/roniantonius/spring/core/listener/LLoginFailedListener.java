package roniantonius.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.event.LoginFailedEvent;

@Component
@Slf4j
public class LLoginFailedListener implements ApplicationListener<LoginFailedEvent> {

    @Override
    public void onApplicationEvent(LoginFailedEvent event) {
        log.info("Login attempt failed with username {}", event.getUser());
    }
}
