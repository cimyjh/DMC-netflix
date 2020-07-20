package dmc.api;

import dmc.domain.Event;
import dmc.service.CvsService;
import dmc.service.FeignCvsRemoteService;
import dmc.service.FeignProductRemoteService;
import dmc.service.ProductRemoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/displays")
public class DisplayController {

    private final ProductRemoteService productRemoteService;
    private final FeignProductRemoteService feignProductRemoteService;
    private final FeignCvsRemoteService feignCvsRemoteService;
    private final CvsService cvsService;


//    public DisplayController(ProductRemoteService productRemoteService,
//                             FeignProductRemoteService feignProductRemoteService) {
//        this.productRemoteService = productRemoteService;
//        this.feignProductRemoteService = feignProductRemoteService;
//    }

    @GetMapping(path = "/{displayId}")
    public String getDisplayDetail(@PathVariable String displayId) {
        String productInfo = getProductInfo();
        return String.format("[display id = %s at %s %s ]", displayId, System.currentTimeMillis(), productInfo);
    }

    private String getProductInfo() {
        return feignProductRemoteService.getProductInfo("12345");
    }

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping(path = "/v1/events")
    public List<Event> getEvents(){
        return cvsService.getEvents();
    }
}