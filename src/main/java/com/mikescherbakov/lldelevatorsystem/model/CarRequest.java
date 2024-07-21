package com.mikescherbakov.lldelevatorsystem.model;

import lombok.Getter;

@Getter
public class CarRequest extends ElevatorRequest {

  private final Floor desiredFloor;

  public CarRequest(Floor floor, Floor desiredFloor) {
    super(floor);
    this.desiredFloor = desiredFloor;
  }
}
