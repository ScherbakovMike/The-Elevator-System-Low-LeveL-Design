package com.mikescherbakov.lldelevatorsystem.model.command;

import com.mikescherbakov.lldelevatorsystem.model.ElevatorCar;

public class CloseDoorCommand extends ServiceCommand<Boolean> {

  public CloseDoorCommand(ElevatorCar elevatorCar) {
    super(elevatorCar);
  }

  @Override
  public Boolean get() {
    // TODO Closes the elevator car door
    return true;
  }
}
