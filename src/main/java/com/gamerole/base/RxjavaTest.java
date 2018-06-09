package com.gamerole.base;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class RxjavaTest {
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(ObservableEmitter<Object> observableEmitter) throws Exception {
                observableEmitter.onNext(123);

            }
        }).subscribe(o -> {
            System.out.println(o);
        });
    }
}
