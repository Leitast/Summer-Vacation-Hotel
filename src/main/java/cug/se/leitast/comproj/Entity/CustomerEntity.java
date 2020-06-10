package cug.se.leitast.comproj.Entity;

public class CustomerEntity {
    private String username;
    private String password;
    private String fullname;
    private String phone;

    public CustomerEntity() {
    }

    public CustomerEntity(String username, String password, String fullname, String phone) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
