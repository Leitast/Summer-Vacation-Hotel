package cug.se.leitast.comproj.Entity;

public class OrderEntity {
    private String ordernum;
    private String contact_name;
    private String card;
    private String entertime;
    private String leavetime;
    private String roomtype;
    private String phone;
    private String requirement;

    public OrderEntity() {
    }

    public OrderEntity(String ordernum, String contact_name, String card, String entertime, String leavetime, String roomtype, String phone, String requirement) {
        this.ordernum = ordernum;
        this.contact_name = contact_name;
        this.card = card;
        this.entertime = entertime;
        this.leavetime = leavetime;
        this.roomtype = roomtype;
        this.phone = phone;
        this.requirement = requirement;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getEntertime() {
        return entertime;
    }

    public void setEntertime(String entertime) {
        this.entertime = entertime;
    }

    public String getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(String leavetime) {
        this.leavetime = leavetime;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "ordernum='" + ordernum + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", card='" + card + '\'' +
                ", entertime='" + entertime + '\'' +
                ", leavetime='" + leavetime + '\'' +
                ", roomtype='" + roomtype + '\'' +
                ", phone='" + phone + '\'' +
                ", requirement='" + requirement + '\'' +
                '}';
    }
}
