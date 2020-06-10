/**
客房管理,订单管理的table格式
 */


layui.define(['table', 'form'], function(exports){
  var $ = layui.$
  ,table = layui.table
  ,form = layui.form;

  //客房管理数据表格
  table.render({
    elem: '#LAY-roomManage-room'
    ,url: layui.setter.base + '/json/roomData/room_data.json' //这是数据接口，连接数据库得到数据之后需要写成room_data.js的数据格式
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'room_id', width: 90, title: '房间号', sort: true}
      ,{field: 'room_type', title: '房间类型', minWidth: 100}
      ,{field: 'room_floor', title: '楼层', minwidth: 80, sort: true}
      ,{field: 'room_status', title: '房间状态', minwidth: 100}
      ,{field: 'room_window', title: '是否有窗', minwidth: 100}
      ,{field: 'room_occupancy', title: '限住人数', minWidth: 80}
      ,{field: 'price', title: '价格', minWidth: 80, sort: true}
      ,{field: 'room_is_clean', title: '是否打扫', minWidth: 80}
      ,{title: '操作', minWidth: 150, align: 'center', fixed: 'right', toolbar: '#table-content-list'}
    ]]
    ,page: true
    ,limit: 10
    ,limits: [10, 15, 20, 25, 30]
    ,text: '对不起，加载出现异常！'
  });
  
  //客房管理监听工具条
  table.on('tool(LAY-roomManage-room)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.confirm('确定删除此房间？', function(index){
        obj.del();
        layer.close(index);
      });
    } else if(obj.event === 'edit'){
      layer.open({
        type: 2
        ,title: '编辑客房'
        ,content: '../../views/roomManage/editRoom.html?id='+ data.id
        ,maxmin: true
        ,area: ['550px', '550px']
        ,btn: ['确定', '取消']
        ,yes: function(index, layero){
          var iframeWindow = window['layui-layer-iframe'+ index]
          ,submit = layero.find('iframe').contents().find("#layuiadmin-app-form-edit");

          //监听提交
          iframeWindow.layui.form.on('submit(layuiadmin-app-form-edit)', function(data){
            var field = data.field; //获取提交的字段
            
            //提交 Ajax 成功后，静态更新表格中的数据
            //$.ajax({});              
            obj.update({
              label: field.label
              ,title: field.title
              ,author: field.author
              ,status: field.status
            }); //数据更新
            
            form.render();
            layer.close(index); //关闭弹层
          });  
          
          submit.trigger('click');
        }
      });
    }
  });

  //订单管理
  table.render({
    elem: '#LAY-orderManage-order'
    ,url: layui.setter.base + '/json/orderData/order_data.json' //这是数据接口，连接数据库得到数据之后需要写成order_data.json的格式
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'id', width: 90, title: '订单号', sort: true}
      ,{field: 'passenger_name1', title: '入住人姓名', minWidth: 100}
      ,{field: 'passenger_id1', title: '身份证号', minWidth: 100}
      ,{field: 'passenger_name2', title: '入住人姓名', minWidth: 100}
      ,{field: 'passenger_id2', title: '身份证号', minWidth: 100}
      ,{field: 'phone_number', title: '预定人电话', minWidth: 100}
      ,{field: 'check_in_time', title: '入住时间', minWidth: 100, sort: true}
      ,{field: 'check_out_time', title: '退房时间', minWidth: 100, sort: true}
      ,{field: 'room_id', title: '房间号', minWidth: 80, sort: true}
      ,{title: '操作', width: 90, align: 'center', fixed: 'right', toolbar: '#table-content-com'}
    ]]
    ,page: true
    ,limit: 10
    ,limits: [10, 15, 20, 25, 30]
    ,text: '对不起，加载出现异常！'
  });
  
  //订单管理监听工具条
  table.on('tool(LAY-orderManage-order)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.confirm('确定删除此订单？', function(index){
        obj.del();
        layer.close(index);
      });
    }
  });

  exports('contlist', {})
});