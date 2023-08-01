package java.springmvc.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path = "/index", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url:");
		model.addAttribute("name", "Shyam Modi");
		model.addAttribute("id", 1421);
		
		List<String> friends = new ArrayList<String>();
		friends.add("jai");
        friends.add("vinod");
        friends.add("kumkum");
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
	    System.out.println("this is the about controller ");
		return "about";
	}	
	
	@RequestMapping("help")
	public ModelAndView help(ModelAndView modeandview) {
		System.out.println("this is help controller :");
        // creating model and view object
        // ModelAndView modeandview = new ModelAndView();
		//setting the data
		modeandview.addObject("name","Shivraj sign chouhan");
		modeandview.addObject("rollnumber", 111111111);
		LocalDateTime now = LocalDateTime.now();
		modeandview.addObject("time", now);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(435);
		list.add(34);
		modeandview.addObject("Marks",list);
           
		//setting the view name
		modeandview.setViewName("help");		
		return modeandview;
	}
}