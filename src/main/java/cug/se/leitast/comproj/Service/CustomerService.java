package cug.se.leitast.comproj.Service;

import cug.se.leitast.comproj.Entity.CustomerEntity;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    //验证登陆密码是否正确
    public String verify_password(CustomerEntity customerentity);

    //验证是否有该用户信息
    public List<String> verify_username(Map map);

    //登陆
    public String login(String username, String password);

    //注册
    public void register(CustomerEntity customerentity);

    //修改密码
    public void forget(CustomerEntity customerentity);

}
