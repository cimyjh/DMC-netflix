package dmc.service;

import dmc.domain.Event;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "cvs", url="http://localhost:8080")
public interface FeignCvsRemoteService {

//    @RequestMapping(path="/v1/event")
//    String getEvents();

    @RequestMapping(path="/v1/event")
    List<Event> getEvents();

}