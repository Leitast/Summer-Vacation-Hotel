package cug.se.leitast.comproj.Controller;

import cug.se.leitast.comproj.Entity.StaffEntity;
import cug.se.leitast.comproj.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/staffManage")
public class StaffController {
    @Autowired
    StaffService staffservice;

    @RequestMapping("/add")
    @ResponseBody
    public String insert_staff(@RequestParam("staff_id") String id,
                             @RequestParam("staff_name") String name,
                             @RequestParam("staff_age") String age,
                             @RequestParam("staff_position") String position,
                             @RequestParam("staff_salary") String salary,
                             @RequestParam("staff_phone") String phone
                             ){
        StaffEntity staffentity = new StaffEntity();
        staffentity.setStaff_id(id);
        staffentity.setStaff_name(name);
        staffentity.setStaff_age(age);
        staffentity.setStaff_position(position);
        staffentity.setStaff_salary(salary);
        staffentity.setStaff_phone(phone);
        staffservice.insert_staff(staffentity);
        return "success";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("staff_id") String id){
        staffservice.delete_staff(id);
        return "success";
    }

    @RequestMapping("/search")
    @ResponseBody
    public ResultV0 search(){
        List<StaffEntity> staffentity = staffservice.search();
        ResultV0 resultV0 = new ResultV0();
        resultV0.setCode(0);
        resultV0.setData(staffentity);
        resultV0.setMsg("成功");
        return resultV0;
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update_staff(@RequestParam("staff_id") String id,
                         @RequestParam("staff_name") String name,
                         @RequestParam("staff_age")String age,
                         @RequestParam("staff_position") String position,
                         @RequestParam("staff_salary") String salary,
                         @RequestParam("staff_phone") String phone){
        StaffEntity staffentity = new StaffEntity();
        staffentity.setStaff_id(id);
        staffentity.setStaff_name(name);
        staffentity.setStaff_age(age);
        staffentity.setStaff_position(position);
        staffentity.setStaff_salary(salary);
        staffentity.setStaff_phone(phone);
        staffservice.update_staff(staffentity);
        return "success";

    }
}
