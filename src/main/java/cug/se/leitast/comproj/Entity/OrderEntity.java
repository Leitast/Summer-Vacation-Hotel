package cug.se.leitast.comproj.Entity;

import java.util.Date;

public class OrderEntity {
    private String OrderNum;
    private String Contact_Name;
    private String Card;
    private String EnterTime;
    private String LeaveTime;
    private String RoomType;
    private String Phone;
    private String Requirement;

    public OrderEntity() {
    }

    public OrderEntity(String OrderNum, String Contact_Name, String Card, String EnterTime, String LeaveTime, String RoomType, String Phone, String Requirement) {
        this.OrderNum = OrderNum;
        this.Contact_Name = Contact_Name;
        this.Card = Card;
        this.EnterTime = EnterTime;
        this.LeaveTime = LeaveTime;
        this.RoomType = RoomType;
        this.Phone = Phone;
        this.Requirement = Requirement;
    }

    public String getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(String OrderNum) {
        OrderNum = OrderNum;
    }

    public String getContact_Name() {
        return Contact_Name;
    }

    public void setContact_Name(String Contact_Name) {
        Contact_Name = Contact_Name;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String Card) {
        Card = Card;
    }

    public String getEnterTime() {
        return EnterTime;
    }

    public void setEnterTime(String EnterTime) {
        EnterTime = EnterTime;
    }

    public String getLeaveTime() {
        return LeaveTime;
    }

    public void setLeaveTime(String LeaveTime) {
        LeaveTime = LeaveTime;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        RoomType = RoomType;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        Phone = Phone;
    }

    public String getRequirement() {
        return Requirement;
    }

    public void setRequirement(String Requirement) {
        Requirement = Requirement;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "OrderNum='" + OrderNum + '\'' +
                ", Contact_Name='" + Contact_Name + '\'' +
                ", Card='" + Card + '\'' +
                ", EnterTime='" + EnterTime + '\'' +
                ", LeaveTime='" + LeaveTime + '\'' +
                ", RoomType='" + RoomType + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Requirement='" + Requirement + '\'' +
                '}';
    }
}
