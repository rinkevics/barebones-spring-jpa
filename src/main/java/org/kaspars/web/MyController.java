package org.kaspars.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class MyController {

    @Autowired
    public MyBean myBean;

    @GetMapping
    public String test(Model model) {
        model.addAttribute("attr", "controller/" + myBean.method());
        return "test";
    }

}
