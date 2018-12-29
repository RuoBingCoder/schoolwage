package com.school.wage.controller;

import com.school.wage.dao.EmpRepository;
import com.school.wage.pojo.Change;
import com.school.wage.pojo.EmployeeMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Authur: 石建雷
 * @Date:2018/12/10
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class Display {
    @Autowired
    private EmpRepository empRepository;

    /**
     * 显示全部用户信息
     *
     * @param model
     * @return
     */
    @GetMapping
    public ModelAndView list(Model model) {
        model.addAttribute("Teacher", empRepository.findAll());
        model.addAttribute("title", "学校工资管理系统");
        return new ModelAndView("user/list", "userModel", model);


    }


    /*@GetMapping("/delete/{Tno}")
    public ModelAndView delete(@PathVariable("Tno") Long Tno) {
        empRepository.deleteById(Tno);
        return new ModelAndView("redirect:/user");


    }*/

    /*
     * 创建用户
     * */
    @GetMapping("from")

    public ModelAndView createfrom(Model model) {


//        list.add(new EmployeeMessage(null,null,null,null,null,null));
        model.addAttribute("Teacher", new EmployeeMessage(null, null, null, null, null, null));
        model.addAttribute("title", "创建用户");
        return new ModelAndView("from/from", "userModel", model);

    }

    /**
     * 保存用户
     *
     * @param user
     * @param model
     * @return
     */
    @PostMapping

    public ModelAndView save(EmployeeMessage user, Model model) {
        user = empRepository.save(user);

        model.addAttribute("title", "保存用户");
        model.addAttribute("Teacher", user);
        return new ModelAndView("from/from", "userModel", model);

    }

    /**
     * 修改用户
     *
     * @param Tno
     * @param model
     * @return
     */

    @GetMapping("/modify/{Tno}")
    public ModelAndView modify(@PathVariable("Tno") Long Tno, Model model) {

        EmployeeMessage user = empRepository.findById(Tno).get();
        System.out.println("---------------------------------");
        model.addAttribute("Teacher", user);
        model.addAttribute("title", "修改用户");
        return new ModelAndView("from/from", "userModel", model);

    }

    /**
     * 查询用户
     *
     * @param Tno
     * @param model
     * @return
     */


    @PostMapping("/search")
    public ModelAndView search(@RequestParam("Tno") Long Tno, Model model) {

        if (!empRepository.existsById(Tno)) {
            model.addAttribute("error", "请输入正确的员工号！");
            return new ModelAndView("error/error", "errorModel", model);

        } else {

            EmployeeMessage user = empRepository.findById(Tno).get();
            model.addAttribute("Teacher", user);

            return new ModelAndView("user/inquire", "userModel", model);


        }
    }
}