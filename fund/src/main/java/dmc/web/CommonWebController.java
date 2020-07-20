package dmc.web;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CommonWebController {




    @GetMapping("/")
    public String resume() {

        return "resume"; // templates/index.html
    }

    @GetMapping("/index")
    public String index() {

        return "index"; // templates/index.html
    }



    // 로그인 결과 페이지
    @GetMapping("/loginSuccess")
    public String dispLoginResult() {
        return "/loginSuccess";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/logout")
    public String dispLogout() {
        return "/logout";
    }

    // 접근 거부 페이지
    @GetMapping("/accessDenied")
    public String dispDenied() {
        return "/accessDenied";
    }


}
