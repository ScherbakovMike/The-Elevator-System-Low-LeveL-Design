package com.mikescherbakov.lldelevatorsystem.model;

import lombok.Getter;

@Getter
public record Floor(Building building, Integer floorNumber) {

}
