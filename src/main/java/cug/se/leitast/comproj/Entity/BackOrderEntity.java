package cug.se.leitast.comproj.Entity;

public class BackOrderEntity {

    private String ordernum;
    private String contact_name;
    private String card;
    private String phone;
    private String entertime;
    private String leavetime;

    public BackOrderEntity() {
    }

    public BackOrderEntity(String ordernum, String contact_name, String card, String phone, String entertime, String leavetime) {
        this.ordernum = ordernum;
        this.contact_name = contact_name;
        this.card = card;
        this.phone = phone;
        this.entertime = entertime;
        this.leavetime = leavetime;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    @Override
    public String toString() {
        return "BackOrderEntity{" +
                "ordernum='" + ordernum + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", card='" + card + '\'' +
                ", phone='" + phone + '\'' +
                ", entertime='" + entertime + '\'' +
                ", leavetime='" + leavetime + '\'' +
                '}';
    }
}
