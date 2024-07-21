package com.mikescherbakov.lldelevatorsystem.service;

import com.mikescherbakov.lldelevatorsystem.model.ElevatorCar;
import com.mikescherbakov.lldelevatorsystem.model.ElevatorRequest;
import com.mikescherbakov.lldelevatorsystem.model.Floor;
import com.mikescherbakov.lldelevatorsystem.model.OptimizationStrategy;
import com.mikescherbakov.lldelevatorsystem.model.command.ServiceCommand;
import java.util.concurrent.CompletableFuture;

public class ElevatorSystemImpl implements ElevatorSystem {

  @Override
  public CompletableFuture<Floor> moveTheCar(ElevatorCar car, Floor desirableFloor) {
    return null;
  }

  @Override
  public CompletableFuture<Boolean> processRequest(ElevatorRequest request) {
    return null;
  }

  @Override
  public CompletableFuture<Boolean> openDoor(ServiceCommand<Boolean> command) {
    return null;
  }

  @Override
  public CompletableFuture<Boolean> closeDoor(ServiceCommand<Boolean> command) {
    return null;
  }

  @Override
  public CompletableFuture<Boolean> enableVentilation(ServiceCommand<Boolean> command) {
    return null;
  }

  @Override
  public CompletableFuture<Boolean> emergencyCall(ServiceCommand<Boolean> command) {
    return null;
  }

  @Override
  public CompletableFuture<Boolean> setOptimizationStrategy(OptimizationStrategy strategy) {
    return null;
  }
}
