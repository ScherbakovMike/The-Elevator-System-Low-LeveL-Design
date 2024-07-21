package com.mikescherbakov.lldelevatorsystem.model.command;

import com.mikescherbakov.lldelevatorsystem.model.ElevatorCar;

public class OpenDoorCommand extends ServiceCommand<Boolean> {

  public OpenDoorCommand(ElevatorCar elevatorCar) {
    super(elevatorCar);
  }

  @Override
  public Boolean get() {
    // TODO Opens the elevator car door
    return true;
  }
}
