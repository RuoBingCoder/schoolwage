package com.school.wage.controller;

import com.school.wage.dao.ChanRespoditory;
import com.school.wage.pojo.Change;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Authur: 石建雷
 * @Date:2018/12/15
 */
@RestController
@RequestMapping("/title")
public class TitleController {

    @Autowired
    private ChanRespoditory chanRespoditory;

    @GetMapping("from")
    public ModelAndView createUser(Model model) {

        model.addAttribute("change", new Change(null, null, null, null));
        return new ModelAndView("from/jobfrom", "titleModel", model);

    }


    /**
     * 修改用户
     *
     * @param Tno
     * @param model
     * @return
     */
    @GetMapping("/modify/{Tno}")
    public ModelAndView from(@PathVariable("Tno") Long Tno, Model model) {

        Change change = chanRespoditory.findById(Tno).get();

        model.addAttribute("change", change);

        return new ModelAndView("from/jobfrom", "titleModel", model);

    }

    /**
     * 保存用户
     *
     * @param change
     * @param model
     * @return
     */
    @PostMapping
    public ModelAndView save(Change change, Model model) {

        change = chanRespoditory.save(change);

        model.addAttribute("change", change);

        return new ModelAndView("from/jobfrom", "titleModel", model);

    }

    @GetMapping("/inquire/{Tno}")
    public ModelAndView inquire(@PathVariable("Tno") Long Tno, Model model) {
        Change change = chanRespoditory.findById(Tno).get();

        model.addAttribute("change", change);
        return new ModelAndView("user/jobtitle", "titleModel", model);

    }
}
