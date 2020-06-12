package cug.se.leitast.comproj.Dao;

import cug.se.leitast.comproj.Entity.StaffEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface StaffDao {
    //插入员工信息
    public void insert_staff(StaffEntity staffentity);

    //删除员工信息
    public void delete_staff(@Param("id") String id);

    //查找员工信息
    public List<StaffEntity> search();

    //更改员工信息
    public void update_staff(StaffEntity staffentity);
}
