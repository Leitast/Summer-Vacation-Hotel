package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Entity.StaffEntity;

import java.util.List;
import java.util.Map;

public interface StaffService {
    //add
    public void insert_staff(StaffEntity staffentity);

    //delete
    public void delete_staff(String id);

    //search
    public List<StaffEntity> search();

    //update
    public void update_staff(StaffEntity staffentity);
}
