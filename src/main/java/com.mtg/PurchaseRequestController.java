package com.mtg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PurchaseRequestController {
    private static final String MY_REQUESTS_VIEW = "myRequests";
    private static final String MY_LOGIN_VIEW = "login";

    private static final String MY_REQUESTS_MODEL_ATTRIBUTE = "myRequestList";
    private String MY_INDEX_VIEW = "index";


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDefaultPage(Model model) {

        return getMyRequests(model);

    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getMyRequests(Model model) {
        List<String> tmp = new ArrayList<String>();
        tmp.add("Bob");
        tmp.add("Bill");
        tmp.add("Fred");

        model.addAttribute(MY_REQUESTS_MODEL_ATTRIBUTE, tmp);
        return MY_LOGIN_VIEW;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postLoginDetails(HttpServletRequest request) {

        request.toString();
        return MY_INDEX_VIEW;
    }

}
