package ga.vlvn.vega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bar-chart")
public class BarChartController {
    @GetMapping({"/", "", "/horizontal"})
    public String index() {
        return "bar-chart";
    }

    @GetMapping("/vertical")
    public String vertial() {
        return "bar-chart-vertical";
    }
}
