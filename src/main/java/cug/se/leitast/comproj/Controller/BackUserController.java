package cug.se.leitast.comproj.Controller;

import cug.se.leitast.comproj.Entity.BackCustomerEntity;
import cug.se.leitast.comproj.Entity.BackOrderEntity;
import cug.se.leitast.comproj.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("userManage")
public class BackUserController {
    @Autowired
    CustomerService customerservice;

    @RequestMapping("search/list")
    @ResponseBody
    public ResultV0 searchall(@RequestParam(value = "page") Integer page, @RequestParam(value = "limit") Integer limit){
        List<BackCustomerEntity> orderlist = customerservice.searchall();
        ResultV0 resultV0 = new ResultV0();
        resultV0.setCode(0);
        resultV0.setMsg("");
        resultV0.setData(orderlist);
        return resultV0;
    }

    @RequestMapping("search")
    @ResponseBody
    public ResultV0 search(@RequestParam("username") String username){
        List<BackCustomerEntity> orderlist = customerservice.search(username);
        System.out.println(orderlist);
        ResultV0 resultV0 = new ResultV0();
        resultV0.setCode(0);
        resultV0.setMsg("");
        resultV0.setData(orderlist);
        return resultV0;
    }
}
