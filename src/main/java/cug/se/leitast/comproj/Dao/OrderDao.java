package cug.se.leitast.comproj.Dao;

import cug.se.leitast.comproj.Entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {
    //插入订单信息
    public void insert_info(OrderEntity orderentity);
}
