package com.school.wage.controller;

import com.school.wage.dao.ReferRespoditory;
import com.school.wage.pojo.Attendance;
import com.school.wage.pojo.Refer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Authur: 石建雷
 * @Date:2018/12/17
 */
@RestController
@RequestMapping("/basicwage")
public class ReferController {
    @Autowired
    private ReferRespoditory referRespoditory;

    @GetMapping("/inquire/{Title}")
    public ModelAndView refermodel(@PathVariable("Title") String Title, Model model) {

        Refer refer = referRespoditory.findById(Title).get();

        model.addAttribute("refer", refer);
        return new ModelAndView("user/refer", "referModel", model);
    }

    /**
     * 修改用户
     *
     * @param Tno
     * @param model
     * @return
     */
    @GetMapping("/modify/{Title}")
    public ModelAndView from(@PathVariable("Title") String Title, Model model) {

        Refer refer = referRespoditory.findById(Title).get();

        model.addAttribute("refer", refer);

        return new ModelAndView("from/referfrom", "referModel", model);

    }

    /**
     * 保存用户
     *
     * @param change
     * @param model
     * @return
     */
    @PostMapping
    public ModelAndView save(Refer refer, Model model) {


        refer = referRespoditory.save(refer);

        model.addAttribute("refer", refer);

        return new ModelAndView("from/referfrom", "referModel", model);

    }


}
