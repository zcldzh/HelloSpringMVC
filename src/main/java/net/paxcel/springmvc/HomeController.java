package net.paxcel.springmvc;

import net.paxcel.springmvc.service.MyService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MyService myService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {		
		return "home";
	}
	
	@RequestMapping(value = "/test1.do", method = RequestMethod.GET)
	public ModelAndView testSessionFactory1() {
		logger.info("Session Factory 1");
		ModelMap modelMap = new ModelMap();
		modelMap.put("userNames", myService.getUserNameListFromSessionFactory1());
		return new ModelAndView("test1", modelMap);
	}
	
	@RequestMapping(value = "/test2.do", method = RequestMethod.GET)
	public ModelAndView testSessionFactory2() {
		logger.info("Session Factory 2");
		ModelMap modelMap = new ModelMap();
		modelMap.put("orders", myService.getOrderDetailsListFromSessionFactory2());
		return new ModelAndView("test2", modelMap);
	}
	
}
