package com.bzk.designpattern.creationmode.singleton;

public class LazyManSafe {
    private static LazyManSafe INSTANCE = null;

    private LazyManSafe() {
    }

    public static synchronized LazyManSafe getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyManSafe();
        }
        return INSTANCE;
    }
}
