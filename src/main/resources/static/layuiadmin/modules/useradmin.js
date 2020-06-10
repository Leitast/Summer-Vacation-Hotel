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
    ,url: layui.setter.base + '/json/userData/user_data.json' //数据模拟接口,实现之后传入格式相同的json字符串即可
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'id', width: 150, title: '用户账号'}
      ,{field: 'username', title: '用户名称', minWidth: 100}
      ,{field: 'password', title: '用户密码'}
    ]]
    ,page: true
    ,limit: 30
    ,text: '对不起，加载出现异常！'
  });

  //员工管理
  table.render({
    elem: '#LAY-staffManage-staff'
    ,url: layui.setter.base + '/json/staffData/staff_data.json' //数据模拟接口
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'staff_id', width: 110, title: '员工工号', sort: true}
      ,{field: 'staff_name', title: '员工姓名'}
      ,{field: 'staff_year', title: '员工年龄'}
      ,{field: 'staff_position', title: '员工职位'}
      ,{field: 'staff_salary', title: '员工工资'}
      ,{field: 'staff_phone', title: '员工手机号'}
      ,{title: '操作', width: 150, align: 'center', fixed: 'right', toolbar: '#table-useradmin-admin'}
    ]]
    ,text: '对不起，加载出现异常！'
  });
  
  //员工管理监听工具条
  table.on('tool(LAY-staffManage-staff)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.prompt({
        formType: 1
        ,title: '敏感操作，请验证口令'
      }, function(value, index){
        layer.close(index);
        layer.confirm('确定删除此员工？', function(index){
          console.log(obj)
          obj.del();
          layer.close(index);
        });
      });
    }else if(obj.event === 'edit'){
      var tr = $(obj.tr);

      layer.open({
        type: 2
        ,title: '编辑员工'
        ,content: '../../views/staffManage/editStaff.html'
        ,area: ['420px', '420px']
        ,btn: ['确定', '取消']
        ,yes: function(index, layero){
          var iframeWindow = window['layui-layer-iframe'+ index]
          ,submitID = 'LAY-user-back-submit'
          ,submit = layero.find('iframe').contents().find('#'+ submitID);

          //监听提交
          iframeWindow.layui.form.on('submit('+ submitID +')', function(data){
            var field = data.field; //获取提交的字段
            
            //提交 Ajax 成功后，静态更新表格中的数据
            //$.ajax({});
            table.reload('LAY-user-front-submit'); //数据刷新
            layer.close(index); //关闭弹层
          });  
          
          submit.trigger('click');
        }
        ,success: function(layero, index){           
          
        }
      })
    }
  });

  exports('useradmin', {})
});