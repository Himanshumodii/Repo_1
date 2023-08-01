package java.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//  RedirectView:
	
	  @RequestMapping("/one")
	  public RedirectView one() {
	  
	  System.out.println("this is one handler:");
	  RedirectView redirectView = new RedirectView();
	  redirectView.setUrl("enjoy");
	  return redirectView;
	  }
	
//   Redirect prefix:
	/*
	 * @RequestMapping("/one")
	 * public String one() {
	 * System.out.println("this is one handler");
	 *  return "redirect:/enjoy"; }
	 */
	@RequestMapping("/enjoy")
	public String two() {
		
		System.out.println("this is second handler:");
		return "contact";
	}	
}