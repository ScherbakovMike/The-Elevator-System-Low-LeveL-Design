package com.mikescherbakov.lldelevatorsystem;

import com.mikescherbakov.lldelevatorsystem.model.ElevatorCar;
import com.mikescherbakov.lldelevatorsystem.model.Floor;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarPanel extends InformationPanel implements Observer<Floor> {

  private final ElevatorCar elevatorCar;
  private Floor currentFloor;

  @Override
  public void onSubscribe(@NonNull Disposable d) {
    // TODO document why this method is empty
  }

  @Override
  public void onNext(@NonNull Floor floor) {
    this.currentFloor = floor;
  }

  @Override
  public void onError(@NonNull Throwable e) {
    // TODO document why this method is empty
  }

  @Override
  public void onComplete() {
    // TODO document why this method is empty
  }
}
