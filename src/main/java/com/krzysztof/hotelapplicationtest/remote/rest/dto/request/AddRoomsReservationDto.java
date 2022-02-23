package com.krzysztof.hotelapplicationtest.remote.rest.dto.request;

public class AddRoomsReservationDto {
    private Integer id;
    private Integer roomId;
    private Integer days;

    public void setDays(Integer days) {
        this.days = days;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDays() {
        return days;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public Integer getId() {
        return id;
    }

    public AddRoomsReservationDto() {
    }

    public AddRoomsReservationDto(Integer id, Integer roomId, Integer days) {
        this.id = id;
        this.roomId = roomId;
        this.days = days;
    }
}
