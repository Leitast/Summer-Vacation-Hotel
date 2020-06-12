package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Controller.Room;
import cug.se.leitast.comproj.Entity.RoomEntity;

import java.util.List;

public interface RoomServiceInterFace {
    Room findOne(String roomid);
    List<Room> findAll();
    List<Room> findByRoomfloor(int roomfloor);
    List<Room> findByRoomwindow(String roomwindow);
    List<Room> findByRoompriceLessThanEqual(int min_price);
    List<Room> findByRoomisclean(String roomisclean);
    List<Room> findByRoomtype(String roomtype);
    List<Room> findByRoomstatus(String roomstatus);

    List<Room> find(Integer roomfloor,String roomwindow,String roomisclean,String roomtype,String roomstatus);
    Room save(Room room);
    void delete(Room room);


}
