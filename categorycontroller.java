package com.frontend.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.online.onlinebooksbackend.dao.CategoryDAO;
import com.niit.online.onlinebooksbackend.model.Category;
import com.niit.online.onlinebooksbackend.model.Supplier;

@Controller
public class categorycontroller {

	 @Autowired
	    Category category;
	    
		@Autowired
		CategoryDAO categoryDAO;
		
		@ModelAttribute
		public Category returnObject2() {
			return new Category();
		}
		
		@RequestMapping("/addCategory")
		public ModelAndView ShowAddcategory(Model model) {
			ModelAndView mv = new ModelAndView("addCategory");

			model.addAttribute("categoryList", categoryDAO.list());

			System.out.println("added category details  in controller");

			return mv;
		}

		@RequestMapping(value = "/addCat", method = RequestMethod.POST)
		public String addSupp(@ModelAttribute("category") Category category, Model model, BindingResult result,	HttpServletRequest request) throws IOException {
			if (category.getCatid() == 0) {
				// new supplier, add it

				categoryDAO.saveOrUpdate(category);
				System.out.println("adding of new category in controller");
			} else {
				// existing supplier, call update

				categoryDAO.saveOrUpdate(category);
				System.out.println("addcat update method of category in controller");
			}
			return "redirect:/addCategory";
		}

		
		/*@RequestMapping("/addCategory")
		public ModelAndView showCategory(@ModelAttribute("category")Category category,BindingResult result,HttpServletRequest request)
		{
			ModelAndView mv=new ModelAndView("addCategory");
		     return mv;	
		}
		@RequestMapping(value="/addCat",method = RequestMethod.POST)
		 public String addCategory(@Valid @ModelAttribute("category")Category category,ModelMap model,BindingResult result,HttpServletRequest request) {
			
			System.out.println("In add category method");
			//model.addAttribute("catid",category.getCatid());
			model.addAttribute("descriptions",category.getDescription());
			
			categoryDAO.saveOrUpdate(category);
			return "login";
		}*/
	
		
		/*@RequestMapping("/addCategory")
		public ModelAndView showAddCategory(@Valid @ModelAttribute("category") Category c1, BindingResult result,
				HttpServletRequest request) throws IOException {

			System.out.println("In add category page");
			return new ModelAndView("addCategory");

		}
*/		/* delete supplier... */
		@RequestMapping(value = "/deletecategory{catid}")
		public ModelAndView deletecategory(@PathVariable("catid") int id) throws Exception {
			System.out.println("deleting category");
			//int i = Integer.parseInt(id);
			category = categoryDAO.get(id);
			ModelAndView mv = new ModelAndView("addCategory");
			categoryDAO.delete(category);
			mv.addObject("addCategory", 0);
			System.out.println("delete catId:" + id);
			return mv;
		}
	

		@RequestMapping(value = "/editcategory{catid}")
		public ModelAndView Updatecategory(@PathVariable("catid") int id, Model model , HttpSession session)
				throws Exception {
			model.addAttribute("category", new Category());
		  session.setAttribute("hello", category.getCatid());
		  int idget = (Integer) session.getAttribute("hello");
	       //int i = Integer.parseInt(id);
		    model.addAttribute("category", categoryDAO.get(idget));
			System.out.println("getting11....category in controller.." + category.getCatid()+".........catidget"+idget);
			model.addAttribute("categoryList", categoryDAO.list());
			System.out.println("edit  list ..category in controller");
			ModelAndView mv = new ModelAndView("addCategory");
			return mv;

		}
	}