package com.nttdata.taller3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@SpringBootApplication
public class Taller3Application {

	public static void main(String[] args) {
		
		Observable<String> observable = Observable.just("mensaje 1", "mensaje2");
		
		observable.subscribe(new Observer<Object>() {
			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("1 -> Suscrito");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("1 -> " + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Error 1: " + e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("1 -> Completo");
			}
		});
		
		observable.subscribe(new Observer<Object>() {
			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("2 -> Suscrito");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("2 -> " + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Error 2:" + e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("2 ->  Completo");
			}
		});
	}
}
