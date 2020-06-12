package cug.se.leitast.comproj.Controller;

import cug.se.leitast.comproj.Entity.BackOrderEntity;
import cug.se.leitast.comproj.Entity.OrderEntity;
import cug.se.leitast.comproj.Entity.RoomEntity;
import cug.se.leitast.comproj.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("orderManage")
public class BackOrderController {
    @Autowired
    OrderService orderservice;


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("ordernum") String id){
        orderservice.delete_order(id);
        return "success";

    }

    @RequestMapping("search/list")
    @ResponseBody
    public ResultV0 searchall(@RequestParam(value = "page") Integer page, @RequestParam(value = "limit") Integer limit){
        List<BackOrderEntity> orderlist = orderservice.second();
        System.out.println(orderlist);
        ResultV0 resultV0 = new ResultV0();
        resultV0.setCode(0);
        resultV0.setMsg("");
        resultV0.setData(orderlist);
        return resultV0;
    }

    @RequestMapping("search")
    @ResponseBody
    public ResultV0 search(@RequestParam("phonenum") String phonenum){
        List<BackOrderEntity> orderlist = orderservice.search(phonenum);
        ResultV0 resultV0 = new ResultV0();
        resultV0.setCode(0);
        resultV0.setMsg("");
        resultV0.setData(orderlist);
        return resultV0;
    }
}
