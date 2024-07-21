package com.mikescherbakov.lldelevatorsystem.model.command;

import com.mikescherbakov.lldelevatorsystem.model.ElevatorCar;

public class VentilationCommand extends ServiceCommand<Boolean> {

  public VentilationCommand(ElevatorCar elevatorCar) {
    super(elevatorCar);
  }

  @Override
  public Boolean get() {
    // TODO Enables ventilation inside the elevator car
    return true;
  }
}
