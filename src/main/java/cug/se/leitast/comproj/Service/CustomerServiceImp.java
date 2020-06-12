package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Dao.CustomerDao;
import cug.se.leitast.comproj.Entity.BackCustomerEntity;
import cug.se.leitast.comproj.Entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    CustomerDao customerdao;

    @Override
    public String verify_password(CustomerEntity customerentity) {
        return customerdao.verify_password(customerentity);
    }

    @Override
    public List<String> verify_username(Map map) {
        return customerdao.verify_username(map);
    }

    @Override
    public String login(String username, String password) {
        return customerdao.login(username,password);
    }

    @Override
    public void register(CustomerEntity customerentity) {
        customerdao.register(customerentity);
    }

    @Override
    public void forget(CustomerEntity customerentity) {
        customerdao.forget(customerentity);
    }

    @Override
    public List<BackCustomerEntity> searchall() {
        return customerdao.searchall();
    }

    @Override
    public List<BackCustomerEntity> search(String username) {
        return customerdao.search(username);
    }
}
