package com.mikescherbakov.lldelevatorsystem.model.command;

import com.mikescherbakov.lldelevatorsystem.model.ElevatorCar;

public class EmergencyCallCommand extends ServiceCommand<Boolean> {

  public EmergencyCallCommand(ElevatorCar elevatorCar) {
    super(elevatorCar);
  }

  @Override
  public Boolean get() {
    // TODO Calls emergency
    return true;
  }
}
