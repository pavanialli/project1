package com.frontend.controller;

//import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.online.onlinebooksbackend.dao.UserDAO;
import com.niit.online.onlinebooksbackend.model.User;

//import com.niit.online.onlinebooksbackend.model.User;

@Controller
public class HomeController
{

  @RequestMapping("/")
public String showhome()
{
	return "home";
	}

//----------- admin page mapping------------//

@RequestMapping("/adminhome")
public String showadmin()
{
	return "adminhome";
	}


//-----------aboutus page mapping------------//

@RequestMapping("/aboutus")
public String showabtus()
{
	return "aboutus";
}

//-----------comic page mapping------------//

@RequestMapping("/comic")
public String showcom()
{
	return "comic";
}

//----------ent1 page mapping----------//
@RequestMapping("/ent1")
public String showent1()
{
return "ent1";
}

//--------bio page mapping--------//
@RequestMapping("/bio")
public String showbio()
{
	return "bio";
}

//--------product page mapping-------//
@RequestMapping("/product")
public String showpro()
{
	return "product";
}

//------homepage mapping------//
@RequestMapping("/home")
public String showh1()
{
	return "home";
}

//---------login page------//
@RequestMapping("/login")
public String show()
{
	return "login";
}

//-------Two methods for loginpage pro,sup,cat-------//
/*@RequestMapping("/validate")
public void checkuser(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	PrintWriter out=res.getWriter();
	String s1=req.getParameter("loginName");
	String s2=req.getParameter("passwd");
	if(s1.equals("pa")&&s2.equals("pa"))
			{
				out.println("valid");
			}
	else 
	{
		out.println("Invalid");
	}
}*/
@RequestMapping("/validate")
public ModelAndView checkUser(@RequestParam("loginName")String s1,@RequestParam("passwd")String s2)
		{
	String message;
	ModelAndView mv;
	if(s1.equals("pa")&&s2.equals("pa"))
	{
		message="valid";
		mv=new ModelAndView("adminhome");
		mv.addObject("info",message);
	}
	else
	{
		message="invalid";
		mv=new ModelAndView("login");
		mv.addObject("info",message);	
	}
	return mv;
		}

//------mapping Spring Register pg--------//

@ModelAttribute
public User returnobject() {
	return new User();
}

@Autowired
UserDAO userDAO;

@RequestMapping("/Register")
public ModelAndView showRegister(@ModelAttribute("user")User user,BindingResult result,HttpServletRequest request)
{
	ModelAndView mv=new ModelAndView("Register");
     return mv;	
}
@RequestMapping(value="/addUser",method = RequestMethod.POST)
 public String addUser(@Valid @ModelAttribute("user")User user,ModelMap model,BindingResult result,HttpServletRequest request) {
	System.out.println("in adduser method");
	model.addAttribute("username",user.getUsername());
	model.addAttribute("emailid",user.getEmailid());
	model.addAttribute("id",user.getId());
	model.addAttribute("phno",user.getEmailid());
	user.setEnabled("true");
	user.setRole("ROLE_USER");
	userDAO.saveOrUpdate(user);
	return "login";
}

}


	

