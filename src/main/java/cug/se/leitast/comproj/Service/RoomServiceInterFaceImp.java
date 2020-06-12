package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Controller.Room;
import cug.se.leitast.comproj.Dao.RoomRepository;
import cug.se.leitast.comproj.Entity.RoomEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceInterFaceImp implements  RoomServiceInterFace{
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room findOne(String roomid) {
        // TODO Auto-generated method stub
        return roomRepository.findById(roomid).orElse(null);
    }

    @Override
    public List<Room> findAll() {
        // TODO Auto-generated method stub
        return roomRepository.findAll();
    }

    @Override
    public List<Room> findByRoomfloor(int roomfloor) {
        // TODO Auto-generated method stub
        return roomRepository.findByRoomfloor(roomfloor);
    }

    @Override
    public List<Room> findByRoomwindow(String roomwindow) {
        // TODO Auto-generated method stub
        return roomRepository.findByRoomwindow(roomwindow);
    }

    @Override
    public List<Room> findByRoompriceLessThanEqual(int min_price) {
        // TODO Auto-generated method stub
        return roomRepository.findByRoompriceLessThanEqual(min_price);
    }

    @Override
    public List<Room> findByRoomisclean(String roomisclean) {
        // TODO Auto-generated method stub
        return roomRepository.findByRoomisclean(roomisclean);
    }

    @Override
    public List<Room> findByRoomtype(String roomtype) {
        // TODO Auto-generated method stub
        return roomRepository.findByRoomtype(roomtype);
    }

    @Override
    public List<Room> findByRoomstatus(String roomstatus) {
        // TODO Auto-generated method stub
        return roomRepository.findByRoomstatus(roomstatus);
    }

    @Override
    public Room save(Room room) {
        // TODO Auto-generated method stub
        return roomRepository.save(room);
    }



    @Override
    public List<Room> find(Integer roomfloor, String roomwindow, String roomisclean, String roomtype, String roomstatus) {
        // TODO Auto-generated method stub
        //32个条件
        //只有一个不为空 查询一个条件
        //1.查询楼层
        if(roomfloor!=null && roomwindow==null && roomisclean==null && roomtype==null && roomstatus==null)
            return roomRepository.findByRoomfloor(roomfloor);
            //2.查询窗户
        else if(roomfloor==null && roomwindow!=null && roomisclean==null && roomtype==null && roomstatus==null)
            return roomRepository.findByRoomwindow(roomwindow);
            //3.查询是否干净
        else if(roomfloor==null && roomwindow==null && roomisclean!=null && roomtype==null && roomstatus==null)
            return roomRepository.findByRoomisclean(roomisclean);
            //4.查询房间类型
        else if(roomfloor==null && roomwindow==null && roomisclean==null && roomtype!=null && roomstatus==null)
            return roomRepository.findByRoomtype(roomtype);
            //5.查询房间状态
        else if(roomfloor==null && roomwindow==null && roomisclean==null && roomtype==null && roomstatus!=null)
            return roomRepository.findByRoomstatus(roomstatus);
            //两个不为空，查询两个条件
            //6.查询楼层和窗户
        else if(roomfloor!=null && roomwindow!=null && roomisclean==null && roomtype==null && roomstatus==null)
            return roomRepository.findByRoomfloorAndRoomwindow(roomfloor, roomwindow);
            //7.查询楼层和是否干净
        else if(roomfloor!=null && roomwindow==null && roomisclean!=null && roomtype==null && roomstatus==null)
            return roomRepository.findByRoomfloorAndRoomisclean(roomfloor, roomisclean);
            //8.查询楼层和类型
        else if(roomfloor!=null && roomwindow==null && roomisclean==null && roomtype!=null && roomstatus==null)
            return roomRepository.findByRoomfloorAndRoomtype(roomfloor,roomtype);
            //9.查询楼层和状态
        else if(roomfloor!=null && roomwindow==null && roomisclean==null && roomtype==null && roomstatus!=null)
            return roomRepository.findByRoomfloorAndRoomstatus(roomfloor, roomstatus);
            //10.查询窗户和是否干净
        else if(roomfloor==null && roomwindow!=null && roomisclean!=null && roomtype==null && roomstatus==null)
            return roomRepository.findByRoomwindowAndRoomisclean(roomwindow, roomisclean);
            //11.查询窗户和类型
        else if(roomfloor==null && roomwindow!=null && roomisclean==null && roomtype!=null && roomstatus==null)
            return roomRepository.findByRoomwindowAndRoomtype(roomwindow, roomtype);
            //12.查询窗户和状态
        else if(roomfloor==null && roomwindow!=null && roomisclean==null && roomtype==null && roomstatus!=null)
            return roomRepository.findByRoomwindowAndRoomstatus(roomwindow, roomstatus);
            //13.查询是否干净和类型
        else if(roomfloor==null && roomwindow==null && roomisclean!=null && roomtype!=null && roomstatus==null)
            return roomRepository.findByRoomiscleanAndRoomtype(roomisclean, roomtype);
            //14.查询是否干净和状态
        else if(roomfloor==null && roomwindow==null && roomisclean!=null && roomtype==null && roomstatus!=null)
            return roomRepository.findByRoomiscleanAndRoomstatus(roomisclean, roomstatus);
            //15.查询类型和状态
        else if(roomfloor==null && roomwindow==null && roomisclean==null && roomtype!=null && roomstatus!=null)
            return roomRepository.findByRoomtypeAndRoomstatus(roomtype, roomstatus);
            //三个不为空 查询三个条件
            //16.查询楼层 窗户 是否干净
        else if(roomfloor!=null && roomwindow!=null && roomisclean!=null && roomtype==null && roomstatus==null)
            return roomRepository.findByRoomfloorAndRoomwindowAndRoomisclean(roomfloor, roomwindow, roomisclean);
            //17.查询楼层 窗户 类型
        else if(roomfloor!=null && roomwindow!=null && roomisclean==null && roomtype!=null && roomstatus==null)
            return roomRepository.findByRoomfloorAndRoomwindowAndRoomtype(roomfloor, roomwindow, roomtype);
            //18.查询楼层 窗户 状态
        else if(roomfloor!=null && roomwindow!=null && roomisclean==null && roomtype==null && roomstatus!=null)
            return roomRepository.findByRoomfloorAndRoomwindowAndRoomstatus(roomfloor, roomwindow, roomstatus);
            //19.查询楼层 是否干净 类型
        else if(roomfloor!=null && roomwindow==null && roomisclean!=null && roomtype!=null && roomstatus==null)
            return roomRepository.findByRoomfloorAndRoomiscleanAndRoomtype(roomfloor, roomisclean, roomtype);
            //20.查询楼层 是否干净 状态
        else if(roomfloor!=null && roomwindow==null && roomisclean!=null && roomtype==null && roomstatus!=null)
            return roomRepository.findByRoomfloorAndRoomiscleanAndRoomstatus(roomfloor, roomisclean, roomstatus);
            //21.查询楼层 类型 状态
        else if(roomfloor!=null && roomwindow==null && roomisclean==null && roomtype!=null && roomstatus!=null)
            return roomRepository.findByRoomfloorAndRoomtypeAndRoomstatus(roomfloor, roomtype, roomstatus);
            //22.查询窗户 是否干净 类型
        else if(roomfloor==null && roomwindow!=null && roomisclean!=null && roomtype!=null && roomstatus==null)
            return roomRepository.findByRoomwindowAndRoomiscleanAndRoomtype(roomwindow, roomisclean, roomtype);
            //23.查询窗户 是否干净  状态
        else if(roomfloor==null && roomwindow!=null && roomisclean!=null && roomtype==null && roomstatus!=null)
            return roomRepository.findByRoomwindowAndRoomiscleanAndRoomstatus(roomwindow, roomisclean, roomstatus);
            //24.查询窗户 类型 状态
        else if(roomfloor==null && roomwindow!=null && roomisclean==null && roomtype!=null && roomstatus!=null)
            return roomRepository.findByRoomwindowAndRoomtypeAndRoomstatus(roomwindow, roomtype, roomstatus);
            //25.查询是否干净 类型 状态
        else if(roomfloor==null && roomwindow==null && roomisclean!=null && roomtype!=null && roomstatus!=null)
            return roomRepository.findByRoomiscleanAndRoomtypeAndRoomstatus(roomisclean, roomtype, roomstatus);
            //查询四个条件
            //26.查询楼层 窗户 是否干净 类型
        else if(roomfloor!=null && roomwindow!=null && roomisclean!=null && roomtype!=null && roomstatus==null)
            return roomRepository.findByRoomfloorAndRoomwindowAndRoomiscleanAndRoomtype(roomfloor, roomwindow, roomisclean, roomtype);
            //27.查询楼层 窗户 是否干净 状态
        else if(roomfloor!=null && roomwindow!=null && roomisclean!=null && roomtype==null && roomstatus!=null)
            return roomRepository.findByRoomfloorAndRoomwindowAndRoomiscleanAndRoomstatus(roomfloor, roomwindow, roomisclean, roomstatus);
            //28.查询楼层 窗户 状态 类型
        else if(roomfloor!=null && roomwindow!=null && roomisclean==null && roomtype!=null && roomstatus!=null)
            return roomRepository.findByRoomfloorAndRoomwindowAndRoomtypeAndRoomstatus(roomfloor, roomwindow, roomtype, roomstatus);
            //29.查询楼层 是否干净 类型 状态
        else if(roomfloor!=null && roomwindow==null && roomisclean!=null && roomtype!=null && roomstatus!=null)
            return roomRepository.findByRoomfloorAndRoomiscleanAndRoomtypeAndRoomstatus(roomfloor, roomisclean, roomtype, roomstatus);
            //30.查询窗户 是否干净  类型 状态
        else if(roomfloor==null && roomwindow!=null && roomisclean!=null && roomtype!=null && roomstatus!=null)
            return roomRepository.findByRoomwindowAndRoomiscleanAndRoomtypeAndRoomstatus(roomwindow, roomisclean, roomtype, roomstatus);
            //31.查询全部
        else if(roomfloor!=null && roomwindow!=null && roomisclean!=null && roomtype!=null && roomstatus!=null)
            return roomRepository.findByRoomfloorAndRoomwindowAndRoomiscleanAndRoomtypeAndRoomstatus(roomfloor, roomwindow, roomisclean, roomtype, roomstatus);

            //32.全部为空
        else return roomRepository.findAll();

    }

    @Override
    public void delete(Room room) {
        // TODO Auto-generated method stub
        roomRepository.delete(room);
    }
}
