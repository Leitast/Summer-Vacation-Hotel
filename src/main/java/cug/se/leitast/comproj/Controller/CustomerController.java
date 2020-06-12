package cug.se.leitast.comproj.Controller;

import cug.se.leitast.comproj.Entity.CustomerEntity;
import cug.se.leitast.comproj.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerservice;

    @RequestMapping(value="/")
    public String index(){
        return "index";
    }

    //验证登陆密码是否正确
    @RequestMapping("/customer/verify_password")
    @ResponseBody
    public String verify_password(@RequestBody CustomerEntity customerentity){
        return customerservice.verify_password(customerentity);
    }

    //验证是否有该用户信息
    @RequestMapping("/customer/verify_username")
    @ResponseBody
    public List<String> verify_username(Map map){
        return customerservice.verify_username(map);
    }

//    //进入到主界面
//    @RequestMapping("/login")
//    public String login(String username, String password){
//        return customerservice.login(username,password);
//        //return "redirect:/home.html";
//    }

    //进入到主界面
    @RequestMapping(value="/loginPage")
    public String login(HttpServletRequest request, HttpSession session){
        String username = request.getParameter("loginusername");
        String password = request.getParameter("loginpassword");
        String fullname = customerservice.login(username,password);
        if(fullname != null){
            return "redirect:/Home";
        }else{
            return "redirect:/";
        }
        //return "redirect:/home.html";
    }

    @RequestMapping("/Register")
    public String RegisterPage(){
        return "reg";
    }

    @RequestMapping("/Home")
    public String Home(){
        return "home";
    }

    @RequestMapping("/forget")
    public String forgetpage(){
        return "forget";
    }

    @RequestMapping("/RegisterPage")
    public String register(@RequestBody CustomerEntity customerentity){
        customerservice.register(customerentity);
        return "redirect:/";
    }

    @RequestMapping("/ForgetPage")
    public String forget(@RequestBody CustomerEntity customerentity){
        customerservice.forget(customerentity);
        return "redirect:/";
    }
}
