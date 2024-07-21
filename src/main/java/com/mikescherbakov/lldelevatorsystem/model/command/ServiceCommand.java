package com.mikescherbakov.lldelevatorsystem.model.command;

import com.mikescherbakov.lldelevatorsystem.model.ElevatorCar;
import java.util.function.Supplier;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class ServiceCommand<T> implements Supplier<T> {

  private final ElevatorCar elevatorCar;
}
