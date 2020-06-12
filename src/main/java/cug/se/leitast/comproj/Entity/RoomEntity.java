package cug.se.leitast.comproj.Entity;

public class RoomEntity {
    private String room_id;
    private String room_type;
    private Integer room_floor;
    private String room_status;
    private String room_window;
    private String room_occupancy;
    private Integer room_price;
    private String room_is_clean;

    public RoomEntity() {
    }

    public RoomEntity(String room_id, String room_type, Integer room_floor, String room_status, String room_window, String room_occupancy, Integer room_price, String room_is_clean) {
        this.room_id = room_id;
        this.room_type = room_type;
        this.room_floor = room_floor;
        this.room_status = room_status;
        this.room_window = room_window;
        this.room_occupancy = room_occupancy;
        this.room_price = room_price;
        this.room_is_clean = room_is_clean;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public Integer getRoom_floor() {
        return room_floor;
    }

    public void setRoom_floor(Integer room_floor) {
        this.room_floor = room_floor;
    }

    public String getRoom_status() {
        return room_status;
    }

    public void setRoom_status(String room_status) {
        this.room_status = room_status;
    }

    public String getRoom_window() {
        return room_window;
    }

    public void setRoom_window(String room_window) {
        this.room_window = room_window;
    }

    public String getRoom_occupancy() {
        return room_occupancy;
    }

    public void setRoom_occupancy(String room_occupancy) {
        this.room_occupancy = room_occupancy;
    }

    public Integer getRoom_price() {
        return room_price;
    }

    public void setRoom_price(Integer room_price) {
        this.room_price = room_price;
    }

    public String getRoom_is_clean() {
        return room_is_clean;
    }

    public void setRoom_is_clean(String room_is_clean) {
        this.room_is_clean = room_is_clean;
    }

    @Override
    public String toString() {
        return "RoomEntity{" +
                "room_id='" + room_id + '\'' +
                ", room_type='" + room_type + '\'' +
                ", room_floor=" + room_floor +
                ", room_status='" + room_status + '\'' +
                ", room_window='" + room_window + '\'' +
                ", room_occupancy='" + room_occupancy + '\'' +
                ", room_price=" + room_price +
                ", room_is_clean='" + room_is_clean + '\'' +
                '}';
    }
}
