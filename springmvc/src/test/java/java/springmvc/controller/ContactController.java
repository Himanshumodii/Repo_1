package java.springmvc.controller;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.springmvc.model.User;
import java.springmvc.service.UserService;

@Controller
public class ContactController {
     
	@Autowired  
	private UserService userService;
	
	// if we want to add similar code on multiple method so we can @ModelAttribute Annotastion  
	/* 
	 * @ModelAttribute
	 * public void ContactDataForModel(Model m) {
	 * m.addAttribute("Header","LearnCodeWith Himanshu");
	 * m.addAttribute("Desc","Home for Programmer:");
	 * }
	 */
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
       m.addAttribute("Header","LearnCodeWith Himanshu");
       m.addAttribute("Desc","Home for Programmer:");		 
	  return "contact";
	}
	
	@RequestMapping(path= "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
   	   {				  
	      System.out.println(user);	
	      if(user.getUserName().isBlank()){
	    	  return "redirect:/contact";
	      }
	      
	      this.userService.createUser(user);
		  model.addAttribute("Header","LearnCodeWith Himanshu");
		  model.addAttribute("Desc","Home for Programmer:");
	      return "success";
			/*
			 * System.out.println("user email" + userEmail); System.out.println("user name"
			 * + userName); System.out.println("user password" + userPassword);
			 * 
			 * model.addAttribute("name",userName); model.addAttribute("email",userEmail);
			 * model.addAttribute("password",userPassword);
			 */    
         //model.addAttribute("user",user); 
	}
}
/*                             
 * //form se data fatch kerni ka old prossess
 * 
 * 
 * @RequestMapping(path= "/processform", method = RequestMethod.POST) public
 * String handleForm(HttpServletRequest request) {
 * 
 * String email = request.getParameter("email");
 * System.out.println("User email is "+ email); return ""; }
 * 
 * @RequestMapping(path= "/processform", method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam("email") String userEmail,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String userPassword, Model model) { // For console
 * 
 * System.out.println("User Email: "+userEmail);
 * System.out.println("User Name: "+userName);
 * System.out.println("User Password: "+userPassword);
 * 
 * 
 * User user = new User();
 * user.setEmail(userEmail);
 * user.setPassword(userPassword);
 * user.setUserName(userName);
 * 
 * System.out.println(user);
 * model.addAttribute("name",userName);
 * model.addAttribute("email",userEmail);
 * model.addAttribute("password",userPassword);
 * 
 * model.addAttribute("user",user);
 *  return "success"; }
 */