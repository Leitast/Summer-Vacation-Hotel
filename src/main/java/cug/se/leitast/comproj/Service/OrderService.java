package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Entity.BackOrderEntity;
import cug.se.leitast.comproj.Entity.OrderEntity;

import java.util.List;

public interface OrderService {
    public void insert_info(OrderEntity orderentity);

    public List<BackOrderEntity> second();

    public List<BackOrderEntity> search(String phone);

    public void delete_order(String id);
}
