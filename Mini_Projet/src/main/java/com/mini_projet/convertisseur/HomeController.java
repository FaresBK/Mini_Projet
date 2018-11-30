package com.mini_projet.convertisseur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//private JdbcTemplate template;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView home(){
		return new ModelAndView("home","hello",new client());
	}
	
    @RequestMapping(value="/addclient",method=RequestMethod.POST)
    public ModelAndView addclient(){
	  return new ModelAndView("redirect:/client");
  }
    @RequestMapping("/client")
    public ModelAndView login(){
    	return new ModelAndView("client","command",new client());
    	
    }
    @RequestMapping(value="/loge",method=RequestMethod.POST)
    public ModelAndView loginclient(@ModelAttribute("p")client cl){
	  System.out.println(cl.getEmail()+" "+cl.getpasswored());
	 return new ModelAndView("redirect:/convertisseur");
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public ModelAndView addclient1(){
	  return new ModelAndView("redirect:/inscri");
	}
    
    @RequestMapping("/inscri")
    public ModelAndView inscription(){
       return new ModelAndView("inscri","command",new client());
    	
    }
    
   @RequestMapping(value="/conveti",method=RequestMethod.POST)
    public ModelAndView inscriclient(@ModelAttribute("p")client cl){
	   try {
		
		  
		   String sql = "INSERT INTO `client`(`id`, `nom`, `prenom`, `email`, `passwored`) "
		   		+ "VALUES ([value-1],[value-2],[value-3],[value-4],[value-5])";
		   
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	  System.out.println(cl.getnom()+" "+cl.getprenom()+" "+cl.getEmail()+" "+cl.getpasswored());
	 return new ModelAndView("redirect:/convertisseur");
    }
	  
   @RequestMapping("/convertisseur")
   public ModelAndView converti(){
      return new ModelAndView("convertisseur","command",new client());
   	
   }
    
}
