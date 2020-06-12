package cug.se.leitast.comproj.Dao;

import cug.se.leitast.comproj.Entity.RoomEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoomDao {
    //search
    public List<RoomEntity> search();

    //update
    public void update_room(RoomEntity roomentity);

    //delete
    public void delete_room(@Param("id") String id);

    //add
    public void add_room(RoomEntity roomentity);
}
