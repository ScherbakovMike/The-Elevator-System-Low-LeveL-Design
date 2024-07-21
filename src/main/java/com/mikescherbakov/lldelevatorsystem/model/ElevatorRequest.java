package com.mikescherbakov.lldelevatorsystem.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public abstract class ElevatorRequest {

  private final Floor floor;
}
