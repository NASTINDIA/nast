package com.nast.nast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.nast.nast.entity.UserEntity;
import com.nast.nast.service.UserService;



@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
//	@GetMapping("/")
//	public String showhome(Model model)  {
//		model.addAttribute("userentity", new UserEntity());
//        return "home";
//}
	
	@GetMapping("/")
    public String showhome(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "index";
    }

    @PostMapping("/")
    public String submithomeform(@ModelAttribute UserEntity userEntity, Model model) {
        // Process the UserEntity (e.g., save to DB, send email, etc.)
    	userService.saveUser(userEntity); 
        model.addAttribute("message", "Thank you for your userentity!");
        return "index";
    }
    
    @GetMapping("/contact")
    public String showForm(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "contact";
    }
    
    @PostMapping("/contact")
    public String submitform(@ModelAttribute UserEntity userEntity, Model model) {
        // Process the UserEntity (e.g., save to DB, send email, etc.)
    	userService.saveUser(userEntity); 
        model.addAttribute("message", "Thank you for your userentity!");
        return "contact";
    }
    
    @GetMapping("/contacts")
    public String showForms(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "contacts";
    }
    
    @PostMapping("/contacts")
    public String submitforms(@ModelAttribute UserEntity userEntity, Model model) {
        // Process the UserEntity (e.g., save to DB, send email, etc.)
    	userService.saveUser(userEntity); 
        model.addAttribute("message", "Thank you for your userentity!");
        return "contacts";
    }
    
    @GetMapping("/whynast")
    public String whynast(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "whynast";
    }
    
    @GetMapping("/studentwork")
    public String workofstudent(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "studentwork";
    }
    
    @GetMapping("/franchise")
    public String franchise(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "franchise";
    }
    
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "about";
    }
    
    @GetMapping("/graphics_socialmedia")
    public String graphics_socialmedia(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "graphics_socialmedia";
    }
    
   
    
    @GetMapping("/video_motion")
    public String video_motion(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "video_motion";
    }
    
    @GetMapping("/all_courses")
    public String all_courses(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "all_courses";
    }
    
    @GetMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "courses";
    }
    
    @GetMapping("/admission")
    public String admission(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "admission";
    }
}
