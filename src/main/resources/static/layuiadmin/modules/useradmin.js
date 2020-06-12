/**

 @Name：layuiAdmin 用户管理 管理员管理 角色管理
 @Author：star1029
 @Site：http://www.layui.com/admin/
 @License：LPPL
    
 */


layui.define(['table', 'form'], function(exports){
  var $ = layui.$
  ,table = layui.table
  ,form = layui.form;

  //用户管理
  table.render({
    elem: '#LAY-userManage-user'
    ,url: "/userManage/search/list" //数据模拟接口,实现之后传入格式相同的json字符串即可
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'username', width: 150, title: '用户账号'}
      ,{field: 'password', title: '用户密码', minWidth: 100}
      ,{field: 'fullname', title: '用户姓名'}
    ]]
    ,page: true
    ,limit: 30
    ,text: '对不起，加载出现异常！'
  });

  //员工管理
  table.render({
    elem: '#LAY-staffManage-staff'
    ,url: "/staffManage/search" //数据模拟接口
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'staff_id', width: 110, title: '员工工号', sort: true}
      ,{field: 'staff_name', title: '员工姓名'}
      ,{field: 'staff_age', title: '员工年龄'}
      ,{field: 'staff_position', title: '员工职位'}
      ,{field: 'staff_salary', title: '员工工资'}
      ,{field: 'staff_phone', title: '员工手机号'}
    ]]
    ,text: '对不起，加载出现异常！'
  });

  exports('useradmin', {})
});