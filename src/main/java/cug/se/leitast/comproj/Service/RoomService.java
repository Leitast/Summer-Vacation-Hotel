package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Entity.RoomEntity;

import java.util.List;

public interface RoomService {

    //search
    public List<RoomEntity> search();

    //update
    public void update_room(RoomEntity roomentity);

    //delete
    public void delete_room(String id);

    //add
    public void add_room(RoomEntity roomentity);
}
