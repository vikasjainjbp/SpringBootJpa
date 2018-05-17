package com.my.vikas.controller;

import com.my.vikas.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articleWithComments")
    public ModelAndView getArticleWithComments(@RequestParam String title){
        return new ModelAndView("articles","articleList",articleService.findArticleByTitle(title));
    }

}
