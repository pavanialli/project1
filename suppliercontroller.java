package com.frontend.controller;

import javax.servlet.http.HttpServletRequest;
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

import com.niit.online.onlinebooksbackend.dao.SupplierDAO;
import com.niit.online.onlinebooksbackend.model.Supplier;

@Controller
public class suppliercontroller {


    @Autowired
	Supplier supplier;

	@Autowired
	SupplierDAO supplierDAO;

	@ModelAttribute
	public Supplier returnObject2() {
		return new Supplier();

	}

	@RequestMapping("/addSupplier")
	public ModelAndView showSupplier(@ModelAttribute("supplier")Supplier supplier,BindingResult result,HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("addSupplier");
	     return mv;	
	}
	@RequestMapping(value="/addSupplier",method = RequestMethod.POST)
	 public String addSupplier(@Valid @ModelAttribute("supplier")Supplier supplier,ModelMap model,BindingResult result,HttpServletRequest request) {
		
		System.out.println("In add supplier method");
		//model.addAttribute("id",supplier.getId());
		model.addAttribute("address",supplier.getAddress());
		model.addAttribute("name",supplier.getName());
		
		supplierDAO.saveOrUpdate(supplier);
		return "login";
	}
                  

	/* delete supplier... */
	@RequestMapping(value = "/deletesupplier{id}")
	public ModelAndView showDeleteSupplier(@PathVariable("id") String id, Model model) throws Exception {

		int i = Integer.parseInt(id);

		supplier = supplierDAO.get(i);

		System.out.println("supplier deleteeeee");

		ModelAndView mv = new ModelAndView("addsupplier");

		supplierDAO.delete(supplier);
		mv.addObject("addsupplier", 0);

		System.out.println("delete Id:" + id);

		return mv;

	}

	/*
	 * /////////////////////////
	 */

	@RequestMapping(value = "/editsupplier{id}")
	public ModelAndView UpdatesuppPage(@PathVariable("id") String id, Model model) throws Exception {
		int i = Integer.parseInt(id);

		model.addAttribute("supplier", supplierDAO.get(i));
		model.addAttribute("SupplierList", supplierDAO.list());
		System.out.println("edit supplier in controller");
		ModelAndView mv = new ModelAndView("addsupplier");
		return mv;

	}
}