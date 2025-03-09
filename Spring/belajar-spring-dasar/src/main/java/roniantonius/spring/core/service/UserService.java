package roniantonius.spring.core.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.data.User;
import roniantonius.spring.core.event.LoginFailedEvent;
import roniantonius.spring.core.event.LoginSuccessEvent;

@Component
public class UserService implements ApplicationEventPublisherAware { // interface ini untuk mendapatkan objek ApplicationEventPublisher untuk publish event

    // untuk mengirim event
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password){
        if (isLogin(username, password)){ // method ini menerima sebuah ApplicationEvent
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        } else {
            applicationEventPublisher.publishEvent(new LoginFailedEvent(new User(username)));
            return false;
        }
    }

    private boolean isLogin(String username, String password) {
        return "roni".equals(username) && "pass".equals(password);
    }
}