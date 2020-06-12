package cug.se.leitast.comproj.Dao;

import cug.se.leitast.comproj.Entity.BackOrderEntity;
import cug.se.leitast.comproj.Entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    //插入订单信息
    public void insert_info(OrderEntity orderentity);

    //查找
    public List<BackOrderEntity> second();

    //手机号
    public List<BackOrderEntity> search(@Param("phone") String phone);

    //删除
    public void delete_order(@Param("ordernum") String id);
}
