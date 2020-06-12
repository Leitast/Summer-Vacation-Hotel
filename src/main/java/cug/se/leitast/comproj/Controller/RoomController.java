package cug.se.leitast.comproj.Controller;

import cug.se.leitast.comproj.Entity.RoomEntity;
import cug.se.leitast.comproj.Service.RoomService;
import cug.se.leitast.comproj.Service.RoomServiceInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("roomManage")
public class RoomController {
    @Autowired
    RoomService roomservice;

    @Autowired
    RoomServiceInterFace roomService;

    @RequestMapping("search/list")
    @ResponseBody
    public ResultV0 search(@RequestParam(value = "page") Integer page, @RequestParam(value = "limit") Integer limit){
        List<RoomEntity> roomlist = roomservice.search();
        ResultV0 resultV0 = new ResultV0();
        resultV0.setCode(0);
        resultV0.setMsg("");
        resultV0.setData(roomlist);
        return resultV0;
    }

    //条件查询
    @RequestMapping("/search")
    @ResponseBody
    public ResultV0 find(@RequestParam(value ="id") String roomid,
                         @RequestParam(value = "floor") Integer roomfloor,
                         @RequestParam(value = "window")String roomwindow,
                         @RequestParam(value = "clean") String roomisclean,
                         @RequestParam(value = "type") String roomtype,
                         @RequestParam(value = "status")String roomstatus){
//1.查询
        //2.数据返回给前端
        List<Room> roomlist=new ArrayList<Room>();
        if(!roomid.equals(""))
        {
            roomlist.add(roomService.findOne(roomid));
            ResultV0 resultVO=new ResultV0();
            resultVO.setCode(0);
            resultVO.setData(roomlist);
            resultVO.setMsg("成功");
            return resultVO;
        }

        if(roomtype.equals(""))
            roomtype=null;
        if(roomstatus.equals(""))
            roomstatus=null;
        if(roomwindow.equals(""))
            roomwindow=null;
        if(roomisclean.equals(""))
            roomisclean=null;

        System.out.println(roomwindow);
        roomlist=roomService.find(roomfloor, roomwindow, roomisclean, roomtype, roomstatus);
        System.out.println(roomlist);
        System.out.println(roomwindow);
        ResultV0 resultVO=new ResultV0();
        resultVO.setCode(0);
        resultVO.setData(roomlist);
        resultVO.setMsg("成功");
        return resultVO;
    }


    @RequestMapping("update")
    @ResponseBody
    public String update_room(@RequestParam(value = "id") String roomid,
                              @RequestParam(value = "floor") Integer roomfloor,
                              @RequestParam(value = "window")String roomwindow,
                              @RequestParam(value = "clean") String roomisclean,
                              @RequestParam(value = "type") String roomtype,
                              @RequestParam(value = "status")String roomstatus,
                              @RequestParam(value = "occupancy")String roomoccupancy,
                              @RequestParam(value = "price") Integer roomprice){
        RoomEntity roomentity  =new RoomEntity();
        roomentity.setRoom_occupancy(roomoccupancy);
        roomentity.setRoom_floor(roomfloor);
        roomentity.setRoom_window(roomwindow);
        roomentity.setRoom_is_clean(roomisclean);
        roomentity.setRoom_price(roomprice);
        roomentity.setRoom_status(roomstatus);
        roomentity.setRoom_type(roomtype);
        roomentity.setRoom_id(roomid);
        roomservice.update_room(roomentity);
        return "success";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete_room(@RequestParam("room_id") String id){
        roomservice.delete_room(id);
        return "success";
    }

    @RequestMapping("add")
    @ResponseBody
    public String add_room(@RequestParam(value = "id") String roomid,
                           @RequestParam(value = "floor") Integer roomfloor,
                           @RequestParam(value = "window")String roomwindow,
                           @RequestParam(value = "clean") String roomisclean,
                           @RequestParam(value = "type") String roomtype,
                           @RequestParam(value = "status")String roomstatus,
                           @RequestParam(value = "occupancy")String roomoccupancy,
                           @RequestParam(value = "price") Integer roomprice){
        RoomEntity roomentity  =new RoomEntity();
        roomentity.setRoom_occupancy(roomoccupancy);
        roomentity.setRoom_floor(roomfloor);
        roomentity.setRoom_window(roomwindow);
        roomentity.setRoom_is_clean(roomisclean);
        roomentity.setRoom_price(roomprice);
        roomentity.setRoom_status(roomstatus);
        roomentity.setRoom_type(roomtype);
        roomentity.setRoom_id(roomid);
        roomservice.add_room(roomentity);
        return "success";
    }

}
