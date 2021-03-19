package com.ltts.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.user.domain.User;
import com.ltts.user.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	 public String viewHomePage(Model model) {
        List<User> listuser = service.listAll();
        model.addAttribute("listuser", listuser);
        System.out.print("Get / ");	
        return "index";
    }
	
	 @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("user", new User());
	        return "new";
	    }

	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveUser(@ModelAttribute("user") User use) {
	        service.save(use);
	        return "redirect:/";
	    }
	 @RequestMapping("/edit/{id}")
	    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("new");
	        User use = service.get(id);
	        mav.addObject("user", use);
	        return mav;
	        
	    }
	 @RequestMapping("/delete/{id}")
	    public String deletestudent(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/";
	    }

}
