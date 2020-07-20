package dmc.service;


import dmc.domain.event.Event;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "cvs")
public interface FegignEventService {

    @RequestMapping(method = RequestMethod.GET, path = "/cvc/v1/event/searchByName?name={eventName}")
    String getProductInfo(
            @PathVariable("eventName") String eventName);

}
