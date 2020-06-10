package cug.se.leitast.comproj.Controller;

import cug.se.leitast.comproj.Entity.OrderEntity;
import cug.se.leitast.comproj.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @Autowired
    OrderService orderservice;

    //图册界面
    @RequestMapping("/Gallery")
    public String gallery(){
        return "gallery";
    }

    //预定界面
    @RequestMapping("/Book")
    public String book(){
        return "book";
    }

    //预定函数
    @RequestMapping("/Reverse")
    public String insert_info(@RequestBody OrderEntity orderentity){
        orderservice.insert_info(orderentity);
        return "redirect:/";
    }
}
