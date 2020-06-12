package cug.se.leitast.comproj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {
    @RequestMapping("/ManageSystem")
    public String managesystem(){
        return "views/index";
    }

    @RequestMapping("/ppp")
    public String ppp(){
        return "views/set/pwd";
    }

    @RequestMapping("/info")
    public String info(){
        return "views/set/info";
    }

    @RequestMapping("/orderManage/order")
    public String orderManage(){
        return "views/orderManage/order_page";
    }

    @RequestMapping("/roomManage/edit")
    public String roomManageEdit(){
        return "views/roomManage/editRoom";
    }

    @RequestMapping("/roomManage/room")
    public String roomManage(){
        return "views/roomManage/room";
    }

    @RequestMapping("/staffManage/edit")
    public String staffManageEdit(){
        return "views/staffManage/editStaffPage";
    }

    @RequestMapping("/staffManage/staff")
    public String staffManage(){
        return "views/staffManage/staff_page";
    }

    @RequestMapping("/userManage/user")
    public String userManage(){
        return "views/userManage/user_page";
    }
}
