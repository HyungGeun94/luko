package hg.jh.luko;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LottoController {


    @GetMapping("/lotto")
    @ResponseBody
    public String lottotest(){
        return "lottoo";


    }
}
