package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.web.form.SampleForm;

@Controller
@RequestMapping("/")
public class WebController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping("sample/result")
    public String result(@ModelAttribute("sampleForm") SampleForm form) {
        /*
         * 画面で入力された値はform.getName()で取得可能。 今回は何もしないので、ビュー名を返すだけ。
         */
        return "output";
    }

}
