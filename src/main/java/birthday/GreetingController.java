package birthday;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private static final String template = "Many More Happy returns, %s! have a great day";
   int i = 0;

    @RequestMapping("/wish")
    public @ResponseBody Wish greeting(
            @RequestParam(value="name", required=false, defaultValue="Gowtham") String name) {
        return new Wish(i++,
                            String.format(template, name));
    }
}