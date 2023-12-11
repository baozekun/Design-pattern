package com.bzk.designpattern.behaviorandtemplatemode.observer;

public class ObserverPartternClient {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.change(10);
    }
}
