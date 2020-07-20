package dmc.service;

import dmc.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvsService {

    @Autowired
    FeignCvsRemoteService feignCvsRemoteService;

    public List<Event> getEvents(){
        return feignCvsRemoteService.getEvents();
    }
}
