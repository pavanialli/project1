package com.frontend.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

//import com.niit.online.onlinebooksbackend.dao.ProductDAO;
import com.niit.online.onlinebooksbackend.model.Product;

@Controller
public class products {
	
	/*@Autowired
	ProductDAO productDAO;
	
@RequestMapping("/addProduct")
public String show()
{
	return "addProduct";
}*/

//------------ addproduct.jsp page------------ //


@RequestMapping("/addCategory")
public String show1()
{
	return "addCategory";
}

//------------ addCategory.jsp page------------ //
@RequestMapping("/addSupplier")
public String show2()
{
	return "addSupplier";
}
}

//------------ addSupplier.jsp page------------ //


/*@ModelAttribute
public Product returnObject()
{
	return new Product();
}
@RequestMapping(value="/addProd",method=RequestMethod.POST)
public String ShowAddProduct(@ModelAttribute("product")Product product,Model model,BindingResult result,HttpServletRequest request)throws IOException
{
	@SuppressWarnings("unused")
    String filename;
	@SuppressWarnings("unused")
	byte[] bytes;
	System.out.println(product.getProdname());
	System.out.println("image uploaded");
    System.out.println("myproduct controller called");
    MultipartFile image=product.getImage();
    Path path;//belong to nio package
    path=Paths.get("E:/Project1/onlinebooks/src/main/webapp/resources/images/"+product.getProductid()+".jpg");
    System.out.println("Path="+path);
    System.out.println("File name"+product.getImage().getOriginalFilename());
    if(image!=null&&!image.isEmpty())
    {
    	try
    	{
    		image.transferTo(new File(path.toString()));
    		System.out.println("Image Saved in:"+path.toString());
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		System.out.println("Image not saved");
    	}
    }
    
    productDAO.saverOrUpdate(product);
    
    return "addProduct";
}
}*/
    
    	
    		
    		
    		
    		
    	
    

