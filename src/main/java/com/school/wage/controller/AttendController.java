package com.school.wage.controller;

import com.school.wage.dao.AttendRespoditory;
import com.school.wage.pojo.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Authur: 石建雷
 * @Date:2018/12/16
 */
@RestController
@RequestMapping("/attendance")
public class AttendController {
    @Autowired
    private AttendRespoditory attendRespoditory;

    /**
     *
     * 考勤查询
     * @param Tno
     * @param model
     * @return
     */
    @GetMapping(value = "/inquire/{Tno}")

    public ModelAndView inquireModel(@PathVariable("Tno") Long Tno, Model model){

        Attendance attendance=attendRespoditory.findById(Tno).get();
        model.addAttribute("attendance",attendance);

        return  new ModelAndView("user/attview","attendModel",model);

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

        Attendance attendance = attendRespoditory.findById(Tno).get();

        model.addAttribute("attendance",  attendance);

        return new ModelAndView("from/attfrom", "attendModel", model);

    }

    /**
     * 保存用户
     *
     * @param attendance
     * @param model
     * @return
     */
    @PostMapping
    public ModelAndView save(Attendance  attendance, Model model) {


        attendance = attendRespoditory.save(attendance);

        model.addAttribute("attendance", attendance);

        return new ModelAndView("from/attfrom", "attendModel", model);

    }

}
