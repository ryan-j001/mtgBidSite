package com.mtg.controller;

import com.mtg.LoginBean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {

	public static final String LOGIN = "login";
	public static final String WELCOME = "welcome";
	private static final String LOGIN_ERROR = "loginError";


	@GetMapping(value = "/")
	public ModelAndView displayHome(HttpServletRequest request, HttpServletResponse response) {

		return displayLogin(request, response);
	}


	@GetMapping(value = "/login")
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView(LOGIN);
		LoginBean loginBean = new LoginBean();
		model.addObject(loginBean);
		return model;

	}

	@PostMapping(value = "/login")
	public ModelAndView executeLogin(HttpServletRequest request, @ModelAttribute("loginBean") LoginBean loginBean) {
		request.setAttribute("loggedInUser", loginBean.getUsername());
		return displayWelcome(request);
	}

	@GetMapping(value = "/welcome")
	public ModelAndView displayWelcome(HttpServletRequest request) {
		return new ModelAndView(WELCOME);
	}

	@GetMapping(value = "/loginError")
	public ModelAndView displayLoginError(HttpServletRequest request) {
				return new ModelAndView(LOGIN_ERROR);
	}


}
