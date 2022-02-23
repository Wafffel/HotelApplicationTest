package com.krzysztof.hotelapplicationtest.remote.rest.dto.response;

public class HotelDto {
    private Integer id;
    private String name;
    private RoomDto rooms;

    public void setRooms(RoomDto rooms) {
        this.rooms = rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoomDto getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public HotelDto() {
    }

    public HotelDto(Integer id, String name, RoomDto rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }
}