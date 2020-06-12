package cug.se.leitast.comproj.Dao;

import cug.se.leitast.comproj.Controller.Room;
import cug.se.leitast.comproj.Entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, String> {
    //通过楼层查询
    public List<Room> findByRoomfloor(int roomfloor);

    //通过是否有窗户查询
    public List<Room> findByRoomwindow(String roomwindow);

    //通过是否干净查询
    public List<Room> findByRoomisclean(String roomisclean);

    //通过类型查询
    public List<Room> findByRoomtype(String roomtype);

    //通过状态查询
    public List<Room> findByRoomstatus(String roomstatus);

    //通过小于该价格
    public List<Room> findByRoompriceLessThanEqual(int max_price);

    //多条件查询
    //两条件查询
    public List<Room> findByRoomfloorAndRoomwindow(int roomfloor,String roomwindow);

    public List<Room> findByRoomfloorAndRoomisclean(int roomfloor,String roomisclean);

    public List<Room> findByRoomfloorAndRoomtype(int roomfloor,String roomtype);

    public List<Room> findByRoomfloorAndRoomstatus(int roomfloor,String roomstatus);

    public List<Room> findByRoomwindowAndRoomisclean(String roomwindow,String roomisclean);

    public List<Room> findByRoomwindowAndRoomtype(String roomwindow,String roomtype);

    public List<Room> findByRoomwindowAndRoomstatus(String roomwindow,String roomstatus);

    public List<Room> findByRoomiscleanAndRoomtype(String roomisclean,String roomtype);

    public List<Room> findByRoomiscleanAndRoomstatus(String roomisclean,String roomstatus);

    public List<Room> findByRoomtypeAndRoomstatus(String roomtype,String roomstatus);

    //三条件查询
    public List<Room> findByRoomfloorAndRoomwindowAndRoomisclean(int roomfloor,String roomwindow,String roomisclean);

    public List<Room> findByRoomfloorAndRoomwindowAndRoomtype(int roomfloor,String roomwindow,String roomtype);

    public List<Room> findByRoomfloorAndRoomwindowAndRoomstatus(int roomfloor,String roomwindow,String roomstatus);

    public List<Room> findByRoomfloorAndRoomiscleanAndRoomtype(int roomfloor,String roomisclean,String roomtype);

    public List<Room> findByRoomfloorAndRoomiscleanAndRoomstatus(int roomfloor,String roomisclean,String roomstatus);

    public List<Room> findByRoomfloorAndRoomtypeAndRoomstatus(int roomfloor,String roomtype,String roomstatus);

    public List<Room> findByRoomwindowAndRoomiscleanAndRoomtype(String roomwindow,String roomisclean,String roomtype);

    public List<Room> findByRoomwindowAndRoomiscleanAndRoomstatus(String roomwindow,String roomisclean,String roomstatus);

    public List<Room> findByRoomwindowAndRoomtypeAndRoomstatus(String roomwindow,String roomtype,String roomstatus);

    public List<Room> findByRoomiscleanAndRoomtypeAndRoomstatus(String roomisclean,String roomtype,String roomstatus);

    //四条件查询
    public List<Room> findByRoomfloorAndRoomwindowAndRoomiscleanAndRoomtype(int roomfloor,String roomwindow,String roomisclean,String roomtype);

    public List<Room> findByRoomfloorAndRoomwindowAndRoomiscleanAndRoomstatus(int roomfloor,String roomwindow,String roomisclean,String roomstatus);

    public List<Room> findByRoomfloorAndRoomwindowAndRoomtypeAndRoomstatus(int roomfloor,String roomwindow,String roomtype,String roomstatus);

    public List<Room> findByRoomfloorAndRoomiscleanAndRoomtypeAndRoomstatus(int roomfloor,String roomisclean,String roomtype,String roomstatus);

    public List<Room> findByRoomwindowAndRoomiscleanAndRoomtypeAndRoomstatus(String roomwindow,String roomisclean,String roomtype,String roomstatus);

    //五条件查询
    public List<Room> findByRoomfloorAndRoomwindowAndRoomiscleanAndRoomtypeAndRoomstatus(int roomfloor,String roomwindow,String roomisclean,String roomtype,String roomstatus);
}
