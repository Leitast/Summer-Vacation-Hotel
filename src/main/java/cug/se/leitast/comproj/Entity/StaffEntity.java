package cug.se.leitast.comproj.Entity;

public class StaffEntity {
    private String staff_id;
    private String staff_name;
    private String staff_age;
    private String staff_position;
    private String staff_salary;
    private String staff_phone;

    public StaffEntity() {
    }

    public StaffEntity(String staff_id, String staff_name, String staff_age, String staff_position, String staff_salary, String staff_phone) {
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.staff_age = staff_age;
        this.staff_position = staff_position;
        this.staff_salary = staff_salary;
        this.staff_phone = staff_phone;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(String staff_age) {
        this.staff_age = staff_age;
    }

    public String getStaff_position() {
        return staff_position;
    }

    public void setStaff_position(String staff_position) {
        this.staff_position = staff_position;
    }

    public String getStaff_salary() {
        return staff_salary;
    }

    public void setStaff_salary(String staff_salary) {
        this.staff_salary = staff_salary;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    public void setStaff_phone(String staff_phone) {
        this.staff_phone = staff_phone;
    }

    @Override
    public String toString() {
        return "StaffEntity{" +
                "staff_id='" + staff_id + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", staff_age='" + staff_age + '\'' +
                ", staff_position='" + staff_position + '\'' +
                ", staff_salary='" + staff_salary + '\'' +
                ", staff_phone='" + staff_phone + '\'' +
                '}';
    }
}
