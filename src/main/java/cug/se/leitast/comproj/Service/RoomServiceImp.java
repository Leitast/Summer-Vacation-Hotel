package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Dao.RoomDao;
import cug.se.leitast.comproj.Entity.RoomEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImp implements RoomService{
    @Autowired
    RoomDao roomdao;

    @Override
    public List<RoomEntity> search() {
        return roomdao.search();
    }

    @Override
    public void update_room(RoomEntity roomentity) {
        roomdao.update_room(roomentity);
    }

    @Override
    public void delete_room(String id) {
        roomdao.delete_room(id);
    }

    @Override
    public void add_room(RoomEntity roomentity) {
        roomdao.add_room(roomentity);
    }
}
