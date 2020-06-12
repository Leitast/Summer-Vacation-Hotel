package cug.se.leitast.comproj.Controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
@Data
public class Room {
    @Id
    @JsonProperty("room_id")
    @Column(name = "room_id")
    private String roomid;

    @JsonProperty("room_type")
    @Column(name = "room_type")
    private String roomtype;

    @JsonProperty("room_floor")
    @Column(name = "room_floor")
    private int roomfloor;

    @JsonProperty("room_window")
    @Column(name = "room_window")
    private String roomwindow;

    @JsonProperty("room_occupancy")
    @Column(name = "room_occupancy")
    private String roomoccupancy;

    @JsonProperty("room_price")
    @Column(name = "room_price")
    private int roomprice;

    @JsonProperty("room_is_clean")
    @Column(name = "room_is_clean")
    private String roomisclean;

    @JsonProperty("room_status")
    @Column(name ="room_status")
    private String roomstatus;
}
