package com.krzysztof.hotelapplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {
    private List<AddRoomsReservationDto> roomsReservation;
    private AddPersonDto person;

    public void setPerson(AddPersonDto person) {
        this.person = person;
    }

    public void setRoomsReservation(List<AddRoomsReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public AddPersonDto getPerson() {
        return person;
    }

    public AddReservationDto() {
    }

    public List<AddRoomsReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public AddReservationDto(List<AddRoomsReservationDto> roomsReservation, AddPersonDto person) {
        this.roomsReservation = roomsReservation;
        this.person = person;
    }
}
