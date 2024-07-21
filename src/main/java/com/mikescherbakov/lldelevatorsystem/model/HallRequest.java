package com.mikescherbakov.lldelevatorsystem.model;

import lombok.Getter;

@Getter
public class HallRequest extends ElevatorRequest {

  private final Direction direction;

  public HallRequest(Floor floor, Direction direction) {
    super(floor);
    this.direction = direction;
  }
}
