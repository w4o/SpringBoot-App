package cn.ueedit.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Frank on 2017/4/12.
 */
@Controller
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(value={"","index"})
    String hello(){
        return "hello";
    }
}
