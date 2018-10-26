package dk.kea.swc3.dat17c.demo.controller;

import dk.kea.swc3.dat17c.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/")
//    @ResponseBody
    public ModelAndView index(
            @RequestParam(defaultValue = "Vince") String name,
            @RequestParam(defaultValue = "-1") Integer age,
            @RequestParam(defaultValue = "M") Character gender)   {
        User u = new User(name, age, gender);


        ModelAndView mv = new ModelAndView("index");
        mv.getModel().put("user",u);
        return mv;
    }



}
