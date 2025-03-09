package roniantonius.spring.core.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import roniantonius.spring.core.data.User;

public class LoginFailedEvent extends ApplicationEvent {
    @Getter
    private User user;
    public LoginFailedEvent(User user) {
        super(user);
        this.user = user;
    }
}
