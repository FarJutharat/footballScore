package com.mycompany.footballscore;
import java.util.ArrayList;

public class MySource implements Source {
    private final ArrayList<MyObserver> list;
    private String score;

    public MySource() {
        this.list = new ArrayList<MyObserver>();
    }
    //private ใช้ set ในการ set ค่า
    public void setData(String sdata){
        score = sdata;
        notifyObservers();
    }
    public String getData(){
        return score;
    }

    @Override 
    public void register(MyObserver observer){
        list.add(observer);
    }

    @Override 
    public void notifyObservers(){
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
        }
    }



}
