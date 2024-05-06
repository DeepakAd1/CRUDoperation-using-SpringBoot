package com.demopro;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control {
	@Autowired
	stdao stdao;
	@RequestMapping("home")
	public String show() {
		return "home.jsp";
	}
	@RequestMapping("/adduser")
	public ModelAndView adduser(Student st) {
		ModelAndView mv=new ModelAndView("home.jsp");
		Student st1=stdao.save(st);
		mv.addObject(st1);
		return mv;
		
	}
	@RequestMapping("/getuser")
	public ModelAndView getuser(@RequestParam int id) {
		ModelAndView mv=new ModelAndView("getuser.jsp");
		Student st1=stdao.findById(id).orElse(new Student());
		mv.addObject("Student",st1);
		return mv;		
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int id) {
		ModelAndView mv=new ModelAndView("delete.jsp");
		Student st1=stdao.findById(id).orElse(new Student());
		stdao.deleteById(id);
		mv.addObject("Student",st1);
		return mv;		
	}
	@RequestMapping("update")
	public ModelAndView update(Student st) {
		ModelAndView mv=new ModelAndView("update.jsp");
		Student st1=stdao.findById(st.getId()).orElse(new Student());
		st1.setDept(st.getDept());
		st1.setName(st.getName());
		stdao.save(st1);
		mv.addObject("Student",st1);
		return mv;
		
	}
	@RequestMapping("back")
	public String home() {
		return "home.jsp";
	}
}
