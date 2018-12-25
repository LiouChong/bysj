package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping(value = "/index")
    public String getIndexPage() {
        return "index";
    }

    @RequestMapping(value = "/home-categories-description")
    public String getDescriptionPage() {
        return "home-categories-description";
    }

    @RequestMapping(value = "/home-categories-articles")
    public String getArticlesPage() {
        return "/WEB-INF/views/shouchang.jsp";
    }


    @RequestMapping(value = "/faq")
    public String getFAQPage() {
        return "faq";
    }

    @RequestMapping(value = "/blue-skin")
    public String getBlueItem() {
        return "blue-skin";
    }

    @RequestMapping(value = "/green-skin")
    public String getGreenItem() {
        return "green-skin";
    }

    @RequestMapping(value = "/red-skin")
    public String getRedItem() {
        return "red-skin";
    }

    @RequestMapping(value = "/full-width")
    public String getFull_WidThPage() {
        return "full-width";
    }

    @RequestMapping(value = "/elements")
    public String getElementPage() {
        return "elements";
    }

    @RequestMapping(value = "/page")
    public String getPagePage() {
        return "page";
    }

    @RequestMapping(value = "/contact")
    public String getContactPage() {
        return "contact";
    }

    @RequestMapping(value = "/single")
    public String getSingPage() {
        return "single";
    }


}
