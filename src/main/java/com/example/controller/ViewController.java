package com.example.controller;

import com.example.dao.UniversityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    UniversityDao universityDao;

    @Autowired
    public void setUniversityDao(UniversityDao universityDao) {
        this.universityDao = universityDao;
    }

    @RequestMapping("/")
    public String Hello(ModelMap modelMap) {
        modelMap.addAttribute("universities",
                universityDao.getAllUniversities());
        return "universities";
    }

}
