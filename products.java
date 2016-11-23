package com.frontend.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.online.onlinebooksbackend.dao.ProductDAO;
import com.niit.online.onlinebooksbackend.dao.SupplierDAO;
import com.niit.online.onlinebooksbackend.model.Product;
import com.niit.online.onlinebooksbackend.model.Supplier;


@Controller
public class products {

	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/addProduct")
	public ModelAndView showAddProduct(Model model) {
		System.out.println("in product");
		ModelAndView mv=new ModelAndView("addProduct");
		model.addAttribute("productlist",productDAO.list());
		return mv;
	}

	// ------------ addproduct.jsp page------------ //

	@RequestMapping("/addCategory")
	public String show1() {
		return "addCategory";
	}

	// ------------ addCategory.jsp page------------ //
	
	
	/*@RequestMapping("/addSupplier")
	public String show2() {
		return "addSupplier";
	}*/

	// ------------ addSupplier.jsp page------------ //

	
	
	@RequestMapping(value="/viewdetail")
	
    public ModelAndView showViewDetails(@RequestParam("id") String id,Model model)throws Exception
	{
		//String pid=id;
		System.out.println("viewproduct paaaaaage");
		int i=Integer.parseInt(id);
			//ModelAndView mv = new ModelAndView("viewdetail");
			
			model.addAttribute("productlist", productDAO.list());
			Product product=productDAO.get(i);
			
			return new ModelAndView("viewdetail","product",product);
}
	
	
	
	// ------------ Viewdetail.jsp page------------ //
	
	@ModelAttribute
	public Product returnObject() {
		return new Product();
	}

	@RequestMapping(value = "/addProd", method = RequestMethod.POST)
	public String ShowAddProduct(@ModelAttribute("product") Product product, Model model, BindingResult result,	HttpServletRequest request) throws IOException {
		@SuppressWarnings("unused")
		String filename;
		@SuppressWarnings("unused")
		byte[] bytes;
		System.out.println(product.getProdname());
		System.out.println("image uploaded");
		System.out.println("myproduct controller called");
		MultipartFile image = product.getImage();
		Path path;// belong to nio package
		path = Paths.get("E:/Project1/onlinebooks/src/main/webapp/resources/images/" + product.getProdname() + ".jpg");
		System.out.println("Path=" + path);
		System.out.println("File name" + product.getImage().getOriginalFilename());
		if (image != null && !image.isEmpty()) {
			try { 
				image.transferTo(new File(path.toString()));
				System.out.println("Image Saved in:" + path.toString());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Image not saved");
			}
		}

		productDAO.saverOrUpdate(product);
		
		model.addAttribute("message","product added successfully");
		model.addAttribute("productList",productDAO.list());
        return "product";
	}
	
	String setName;
	List<Product> plist;
	
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues() throws Exception {
		String result="";
		plist = productDAO.list();
		Gson gson = new Gson();
		result = gson.toJson(plist);
		return result;
	}
	

	// ------------ addproduct.jsp page------------ //
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping("/addSupplier")
	public ModelAndView showSupplier(@ModelAttribute("supplier")Supplier supplier,BindingResult result,HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("addSupplier");
	     return mv;	
	}
	@RequestMapping(value="/addsupp",method = RequestMethod.POST)
	 public String addSupplier(@Valid @ModelAttribute("supplier")Supplier supplier,ModelMap model,BindingResult result,HttpServletRequest request) {
		
		System.out.println("In add supplier method");
		model.addAttribute("id",supplier.getId());
		model.addAttribute("address",supplier.getAddress());
		model.addAttribute("name",supplier.getName());
		
		supplierDAO.saveOrUpdate(supplier);
		return "login";
	}
}
