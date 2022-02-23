package com.krzysztof.hotelapplicationtest.remote.rest.dto.response;

import java.math.BigDecimal;

public class RoomDto {
    private Integer id;
    private Integer bedCounts;
    private BigDecimal price;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setBedCounts(Integer bedCounts) {
        this.bedCounts = bedCounts;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getBedCounts() {
        return bedCounts;
    }

    public Integer getId() {
        return id;
    }

    public RoomDto() {
    }

    public RoomDto(Integer id, Integer bedCounts, BigDecimal price) {
        this.id = id;
        this.bedCounts = bedCounts;
        this.price = price;
    }
}
