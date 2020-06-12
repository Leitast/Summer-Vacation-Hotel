package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Dao.StaffDao;
import cug.se.leitast.comproj.Entity.StaffEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffServiceImp implements StaffService{
    @Autowired
    StaffDao stafffdao;

    @Override
    public void insert_staff(StaffEntity staffentity) {
        stafffdao.insert_staff(staffentity);
    }

    @Override
    public void delete_staff(String id) {
        stafffdao.delete_staff(id);
    }

    @Override
    public List<StaffEntity> search() {
        return stafffdao.search();
    }

    @Override
    public void update_staff(StaffEntity staffentity) {
        stafffdao.update_staff(staffentity);
    }
}
