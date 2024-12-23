package org.example.skillbox_mod2.eventlistener;
/*package org.example.skillbox_mod2.eventlistener;

import lombok.extern.log4j.Log4j2;
import org.example.skillbox_mod2.eventlistener.event.AddUserEvent;
import org.example.skillbox_mod2.eventlistener.event.DeleteUserEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AllEventListener {
    @Async
    @EventListener
    public void handleAddUserEvent(AddUserEvent addUserEvent) {
        log.info("User - {} added success", addUserEvent.payload());
    }

    @Async
    @EventListener
    public void handleDeleteUserEvent(DeleteUserEvent deleteUserEvent) {
        log.info("User with UUID: {} - deleted", deleteUserEvent.payload());
    }
}*/

import org.example.skillbox_mod2.eventlistener.event.AddUserEvent;
import org.example.skillbox_mod2.eventlistener.event.DeleteUserEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

@Service
public class AllEventListener {
    private static final Logger log = LoggerFactory.getLogger(AllEventListener.class);

    @Async
    @EventListener
    public void handleAddUserEvent(AddUserEvent addUserEvent) {
        log.info("User - {} added success", addUserEvent.payload());
    }

    @Async
    @EventListener
    public void handleDeleteUserEvent(DeleteUserEvent deleteUserEvent) {
        log.info("User with UUID: {} - deleted", deleteUserEvent.payload());
    }
}

