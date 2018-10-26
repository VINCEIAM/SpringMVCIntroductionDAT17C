package dk.kea.swc3.dat17c.demo.controller;


import dk.kea.swc3.dat17c.demo.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    @GetMapping("/car.html")
    public ModelAndView car(
            @RequestParam(defaultValue = "none") String make,
            @RequestParam(defaultValue = "none") String model,
            @RequestParam(defaultValue = "0") Integer year,
            @RequestParam(defaultValue = "0") Integer horsepower)
    {
        Car myCar = new Car(make, model, year, horsepower);

        ModelAndView mv = new ModelAndView("car");
        mv.getModel().put("car", myCar);
        return mv;
    }

}
