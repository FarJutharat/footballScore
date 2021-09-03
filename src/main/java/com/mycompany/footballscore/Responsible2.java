package com.mycompany.footballscore;

public class Responsible2 implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("live result : Thai "+((MySource)o).getData()+" UAE");
    }
}
