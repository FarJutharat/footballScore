package com.mycompany.footballscore;

public interface Source {
    public void notifyObservers();
    public void register(MyObserver observer);
}

