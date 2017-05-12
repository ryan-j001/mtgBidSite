package com.mtg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

	public static final String LOGIN = "login";
	public static final String WELCOME = "welcome";


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView displayHome(HttpServletRequest request, HttpServletResponse response) {
		return displayLogin(request, response);
	}


	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView(LOGIN);
		LoginBean loginBean = new LoginBean();
		model.addObject(loginBean);
		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, @ModelAttribute("loginBean") LoginBean loginBean) {
		request.setAttribute("loggedInUser", loginBean.getUsername());
		return new ModelAndView(WELCOME);
	}

}
