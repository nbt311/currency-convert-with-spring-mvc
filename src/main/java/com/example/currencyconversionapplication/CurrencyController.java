package com.example.currencyconversionapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyController {
    @GetMapping("/convert")
    public ModelAndView showFormConvert() {
       ModelAndView mv = new ModelAndView("/WEB-INF/views/input.jsp");
       return mv;
    }
    @PostMapping("/convert")
    public ModelAndView currencyConvert(@RequestParam("exchangeRate") double exchangeRate,
                                        @RequestParam ("usdAmount") double usdAmount) {

        double vnAmount = usdAmount *  exchangeRate;
        System.out.println(vnAmount);
        ModelAndView mv = new ModelAndView("/WEB-INF/views/result.jsp");
        mv.addObject("vnAmount",vnAmount);
        return mv;
    }

}
