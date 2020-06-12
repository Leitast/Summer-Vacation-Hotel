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
    ,url: "/roomManage/search/list" //这是数据接口，连接数据库得到数据之后需要写成room_data.js的数据格式
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'room_id', width: 90, title: '房间号', sort: true}
      ,{field: 'room_type', title: '房间类型', minWidth: 100}
      ,{field: 'room_floor', title: '楼层', minwidth: 80, sort: true}
      ,{field: 'room_status', title: '房间状态', minwidth: 100}
      ,{field: 'room_window', title: '是否有窗', minwidth: 100}
      ,{field: 'room_occupancy', title: '限住人数', minWidth: 80}
      ,{field: 'room_price', title: '价格', minWidth: 80, sort: true}
      ,{field: 'room_is_clean', title: '是否打扫', minWidth: 80}
    ]]
    ,page: true
    ,limit: 10
    ,limits: [10, 15, 20, 25, 30]
    ,text: '对不起，加载出现异常！'
  });

  //订单管理
  table.render({
    elem: '#LAY-orderManage-order'
    ,id: "LAY-orderManage-order"
    ,url: "/orderManage/search/list" //这是数据接口，连接数据库得到数据之后需要写成order_data.json的格式
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'ordernum', width: 90, title: '订单号'}
      ,{field: 'contact_name', title: '入住人姓名', minWidth: 100}
      ,{field: 'card', title: '身份证号', minWidth: 100}
      ,{field: 'phone', title: '预定人电话', minWidth: 100}
      ,{field: 'entertime', title: '入住时间', minWidth: 100, sort: true}
      ,{field: 'leavetime', title: '退房时间', minWidth: 100, sort: true}
    ]]
    ,page: true
    ,limit: 10
    ,limits: [10, 15, 20, 25, 30]
    ,text: '对不起，加载出现异常！'
  });

  exports('contlist', {})
});