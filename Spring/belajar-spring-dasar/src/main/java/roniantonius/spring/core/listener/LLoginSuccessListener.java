package roniantonius.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class LLoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login user {}", event.getUser());
    }
}
