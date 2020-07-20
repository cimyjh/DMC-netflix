package dmc.service;

import dmc.domain.Event;
import dmc.domain.News;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "cvs", url="http://localhost:8080")
public interface FeignCvsRemoteService {

    @RequestMapping(path="/v1/event")
    List<Event> getEvents();


    @RequestMapping(path="/v1/event/searchByName?name={eventName}")
    List<Event> getEventName(
            @PathVariable("eventName") String eventName);


    @RequestMapping(path="/v1/event/searchByCategory?evt={evt}&product1={product}")
    List<Event> getEventCategory(
            @PathVariable("evt") String evt,
            @PathVariable("product") String product);


    @RequestMapping(path="/v1/news")
    List<News> getNews();


    @RequestMapping(path="/v1/news/searchByName?name={newsName}")
    List<News> getNewsName(
            @PathVariable("newsName") String newsName);


    @RequestMapping(path="/v1/news/searchByCategory?product1={product}")
    List<News> getNewsCategory(
            @PathVariable("product") String product);

}