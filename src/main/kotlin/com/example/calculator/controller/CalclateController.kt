package com.example.calculator.controller

import com.example.calculator.model.FDat
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class CalclateController {
    @GetMapping("/") // inputから変更
    public fun input(model: Model): String {
        model.addAttribute("fdat", FDat());
        return "index";
    }
    @PostMapping("/result")
    public fun result(@ModelAttribute fdat: FDat, model: Model): String {
        calculate(fdat);
        model.addAttribute("fdat", fdat);
        return "result";
    }
    private fun calculate(fdat: FDat): Unit {
        var ans: Double = 0.0;
        var num1: Double = fdat.getNum1();
        var num2: Double = fdat.getNum2();
        var ope: String = fdat.getOpe();
        if(ope.equals("+")) {
            ans = (num1 + num2);
        } else if(ope.equals(("-"))) {
            ans = (num1 - num2);
        } else if(ope.equals("×")) {
            ans = (num1 * num2);
        } else if(ope.equals("÷")) {
            ans = (num1 / num2);
        }
        fdat.setAns(ans);
    }
}