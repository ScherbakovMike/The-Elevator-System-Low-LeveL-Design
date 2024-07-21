package com.mikescherbakov.lldelevatorsystem.service;

import com.mikescherbakov.lldelevatorsystem.model.ElevatorCar;
import com.mikescherbakov.lldelevatorsystem.model.ElevatorRequest;
import com.mikescherbakov.lldelevatorsystem.model.Floor;
import com.mikescherbakov.lldelevatorsystem.model.OptimizationStrategy;
import com.mikescherbakov.lldelevatorsystem.model.command.ServiceCommand;
import java.util.concurrent.CompletableFuture;

public interface ElevatorSystem {

  CompletableFuture<Floor> moveTheCar(ElevatorCar car, Floor desirableFloor);

  CompletableFuture<Boolean> processRequest(ElevatorRequest request);

  CompletableFuture<Boolean> openDoor(ServiceCommand<Boolean> command);

  CompletableFuture<Boolean> closeDoor(ServiceCommand<Boolean> command);

  CompletableFuture<Boolean> enableVentilation(ServiceCommand<Boolean> command);

  CompletableFuture<Boolean> emergencyCall(ServiceCommand<Boolean> command);

  CompletableFuture<Boolean> setOptimizationStrategy(OptimizationStrategy strategy);
}
