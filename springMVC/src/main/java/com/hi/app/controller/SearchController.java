package com.hi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @RequestMapping("/search/main")
    public String main(){
        getQueryList();
        getSearchType();
        return "search/main";
    }

    @ModelAttribute("keywords")
    public String[] getQueryList(){
        return new String[] {"안녕", "안녀엉", "안녀어엉"};
    }

    @ModelAttribute("searchType")
    public List<String> getSearchType(){
        List<String> list = new ArrayList<>();
        list.add("id");
        list.add("title");
        list.add("keyword");

        return list;
    }
}
