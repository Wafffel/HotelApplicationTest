package com.krzysztof.hotelapplicationtest.remote.rest.dto.response;

import com.krzysztof.hotelapplicationtest.domain.StatusType;
import com.krzysztof.hotelapplicationtest.remote.rest.dto.request.AddPersonDto;
import com.krzysztof.hotelapplicationtest.remote.rest.dto.request.AddRoomsReservationDto;

import java.util.List;

public class ReservationsDto {
    private Integer id;
    private StatusType status;
    private List<AddRoomsReservationDto> roomsReservation;
    private AddPersonDto person;

    public void setPerson(AddPersonDto person) {
        this.person = person;
    }

    public void setRoomsReservation(List<AddRoomsReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AddPersonDto getPerson() {
        return person;
    }

    public List<AddRoomsReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public StatusType getStatus() {
        return status;
    }

    public Integer getId() {
        return id;
    }

    public ReservationsDto() {
    }

    public ReservationsDto(Integer id, StatusType status, List<AddRoomsReservationDto> roomsReservation, AddPersonDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }
}
