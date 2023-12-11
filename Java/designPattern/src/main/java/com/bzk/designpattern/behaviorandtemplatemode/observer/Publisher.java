package com.bzk.designpattern.behaviorandtemplatemode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 发布者
 */
public class Publisher {
    private static List<Observer> observerList = new ArrayList<>();

    static {
        observerList.add(new ObserverImpl());
    }

    private void notifyObserver(int i){
        for (Observer o : observerList) {
            o.update(i);
        }
    }

    public void change(int i){
        notifyObserver(i);
    }
}
