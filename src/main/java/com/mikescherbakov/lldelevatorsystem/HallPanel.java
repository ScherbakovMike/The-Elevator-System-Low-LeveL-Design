package com.mikescherbakov.lldelevatorsystem;

import com.mikescherbakov.lldelevatorsystem.model.Direction;
import com.mikescherbakov.lldelevatorsystem.model.Floor;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HallPanel extends InformationPanel implements Observer<Direction> {

  private final Floor floor;
  private Direction currentDirection;

  @Override
  public void onSubscribe(@NonNull Disposable d) {

  }

  @Override
  public void onNext(@NonNull Direction direction) {
    this.currentDirection = direction;
  }

  @Override
  public void onError(@NonNull Throwable e) {

  }

  @Override
  public void onComplete() {

  }
}
