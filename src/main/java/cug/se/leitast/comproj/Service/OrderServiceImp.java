package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Dao.OrderDao;
import cug.se.leitast.comproj.Entity.BackOrderEntity;
import cug.se.leitast.comproj.Entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImp implements OrderService{

    @Autowired
    OrderDao orderdao;

    @Override
    public void insert_info(OrderEntity orderentity) {
        orderdao.insert_info(orderentity);
    }

    @Override
    public List<BackOrderEntity> second() {
        System.out.println(orderdao.second());
        return orderdao.second();
    }

    @Override
    public List<BackOrderEntity> search(String phone) {
        return orderdao.search(phone);
    }

    @Override
    public void delete_order(String id) {
        orderdao.delete_order(id);
    }
}
