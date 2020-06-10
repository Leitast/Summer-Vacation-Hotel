package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Dao.OrderDao;
import cug.se.leitast.comproj.Entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImp implements OrderService{

    @Autowired
    OrderDao orderdao;

    @Override
    public void insert_info(OrderEntity orderentity) {
        orderdao.insert_info(orderentity);
    }
}
