package dmc.web;


import dmc.domain.event.Event;
import dmc.domain.event.dto.EventListResponseDto;
import dmc.domain.news.News;
import dmc.domain.news.dto.NewsListResponseDto;
import dmc.service.EventService;
import dmc.service.NewsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CVSWebController {

    @Autowired
    private EventService eventService;

    @Autowired
    private NewsService newsService;



    @GetMapping("/new")
    public String news(@PageableDefault Pageable pageable, Model model) {
        Page<News> list = newsService.getNewsList(pageable);
        model.addAttribute("news", list);
        return "new_paging";
    }


    @GetMapping("/new/{store}")
    public String news(@PathVariable String store, Model model) {
        List<News> list = newsService.findByStore(store);
        model.addAttribute("news", list);
        return "new"; // templates/display.html
    }


    //페이징
    @GetMapping("/event")
    public String event(@PageableDefault Pageable pageable, Model model) {

        Page<Event> list = eventService.getEventList(pageable);
        model.addAttribute("events", list);

//		Page<BoardEntity> boardList = boardService.getBoardList(pageable);
//		model.addAttribute("boardList", boardList);

//		List<Event> list = eventService.findEvents();
//		model.addAttribute("events", list);
        return "event_paging";
    }




    @GetMapping("/event/{store}")
    public String event(@PathVariable String store, Model model) {

        //페이징을 하려면 service - repository를 설계해야 한다.
//		Page<Event> list = eventService.getEventList(pageable);
//		model.addAttribute("events", list);


        List<Event> list = eventService.findByStore(store);
        model.addAttribute("events", list);

        return "event"; // templates/display.html

    }






    @GetMapping("/event/search")
    public String eventNameSearch(@RequestParam(value = "name") String name, Model model) {

        String searchName = name;
        List<EventListResponseDto> list = this.eventService.searchByName(name);
        model.addAttribute("events", list);

        log.info(" " + list.size());
        log.info("" + name);

        return "event";
    }

    @GetMapping("/event/category")
    public String eventCategorySearch(@RequestParam(value = "evt") String evt, @RequestParam(value = "product1") String product1, Model model) {

        String searchEvt = evt;
        String SearchProduct1 = product1;

        List<EventListResponseDto> list = this.eventService.searchByCategory(evt, product1);
        model.addAttribute("events", list);

        log.info(" " + list.size());
        log.info("" + evt);
        log.info("" + product1);

        return "event";
    }



    @GetMapping("/new/search")
    public String newsNameSearch(@RequestParam(value = "name") String name, Model model) {

        String searchName = name;
        List<NewsListResponseDto> list = this.newsService.searchByName(name);
        model.addAttribute("news", list);

        log.info(" " + list.size());
        log.info("" + name);

        return "new";
    }

    @GetMapping("/new/category")
    public String newsCategorySearch(@RequestParam(value = "product1") String product1, Model model) {


        String SearchProduct1 = product1;

        List<NewsListResponseDto> list = this.newsService.searchByCategory(product1);
        model.addAttribute("news", list);

        log.info(" " + list.size());
        log.info("" + product1);

        return "new";
    }

}
