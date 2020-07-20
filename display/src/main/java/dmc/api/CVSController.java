package dmc.api;

import dmc.domain.Event;
import dmc.domain.News;
import dmc.service.FeignCvsRemoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/cvs")
public class CVSController {

    private final FeignCvsRemoteService feignCvsRemoteService;


    @GetMapping(path = "/event")
    public List<Event> getEvents(){
        return feignCvsRemoteService.getEvents();
    }

    @GetMapping(path = "/event/searchByName/{eventName}")
    public List<Event> getEventName(@PathVariable String eventName){
        return feignCvsRemoteService.getEventName(eventName);
    }

    @GetMapping(path = "/event/searchByCategory/{evt}/{product}")
    public List<Event> getEventCategory(
            @PathVariable String evt,
            @PathVariable String product){
        return feignCvsRemoteService.getEventCategory(evt, product);
    }

    @GetMapping(path = "/new")
    public List<News> getNews(){
        return feignCvsRemoteService.getNews();
    }

    @GetMapping(path = "/new/searchByName/{newsName}")
    public List<News> getNewName(@PathVariable String newsName){
        return feignCvsRemoteService.getNewsName(newsName);
    }

    @GetMapping(path = "/new/searchByCategory/{product2}")
    public List<News> getNewCategory(@PathVariable String product2){
        return feignCvsRemoteService.getNewsCategory(product2);
    }



}