package com.school.wage.controller;

import com.school.wage.dao.PayRespoditory;
import com.school.wage.pojo.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Authur: 石建雷
 * @Date:2018/12/17
 */
@RestController
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayRespoditory payRespoditory;

    @GetMapping("/inquire/{Tno}")
    public ModelAndView paymodel(@PathVariable("Tno") Long Tno, Model model) {
        Pay pay = payRespoditory.findById(Tno).get();
        model.addAttribute("pay", pay);

        return new ModelAndView("user/pay", "payModel", model);

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

        Pay pay = payRespoditory.findById(Tno).get();

        model.addAttribute("pay", pay);

        return new ModelAndView("from/payfrom", "payModel", model);

    }

    /**
     * 保存用户
     *
     * @param pay
     * @param model
     * @return
     */
    @PostMapping
    public ModelAndView save(Pay pay, Model model) {


        pay = payRespoditory.save(pay);

        model.addAttribute("pay", pay);

        return new ModelAndView("from/payfrom", "payModel", model);

    }

}
