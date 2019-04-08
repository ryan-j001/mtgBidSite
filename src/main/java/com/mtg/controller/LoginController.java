package com.mtg.controller;

import com.mtg.LoginBean;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {

	public static final String LOGIN = "login";
	public static final String WELCOME = "welcome";
	private static final String LOGIN_ERROR = "loginError";


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
		return displayWelcome(request);
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView displayWelcome(HttpServletRequest request) {
		return new ModelAndView(WELCOME);
	}


	@RequestMapping(value = "/loginError", method = RequestMethod.GET)
	public ModelAndView displayLoginError(HttpServletRequest request) {
				return new ModelAndView(LOGIN_ERROR);
	}


}
