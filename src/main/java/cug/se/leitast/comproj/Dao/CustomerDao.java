package cug.se.leitast.comproj.Dao;

import cug.se.leitast.comproj.Entity.BackCustomerEntity;
import cug.se.leitast.comproj.Entity.CustomerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerDao {
    //验证登陆密码是否正确
    public String verify_password(CustomerEntity customerentity);

    //验证是否有该用户信息
    public List<String> verify_username(@Param("content") Map map);

    //登陆
    public String login(@Param("username") String username, @Param("password") String password);

    //注册
    public void register(CustomerEntity customerentity);

    //修改密码
    public void forget(CustomerEntity customerentity);

    //用户管理全部
    public List<BackCustomerEntity> searchall();

    //用户管理部分
    public List<BackCustomerEntity> search(@Param("username") String username);
}
