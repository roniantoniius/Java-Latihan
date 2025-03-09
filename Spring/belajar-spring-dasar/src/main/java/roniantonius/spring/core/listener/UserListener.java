package roniantonius.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserListener {
    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event){
        log.info("Success login with username {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent2(LoginSuccessEvent event){
        log.info("Success login with username {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent3(LoginSuccessEvent event){
        log.info("Success login with username {}", event.getUser());
    }
}
