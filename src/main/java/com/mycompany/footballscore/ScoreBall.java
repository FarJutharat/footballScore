/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.footballscore;

/**
 *
 * @author macintoch
 */
import java.beans.PropertyChangeListener;
import java.util.Scanner;

public class ScoreBall {
    public static void main(String[] args) {
    Responsible1 obj1 = new Responsible1();
    Responsible2 obj2 = new Responsible2();
    MySource obj = new MySource();
    obj.register(obj1);
    obj.register(obj2);
    
    String score = "";
    Boolean checkout = false;
    Scanner inp = new Scanner(System.in);
    while(checkout!=true){
    System.out.print("Enter Score Thai : ");
    score = inp.nextLine();
    System.out.println("Enter Score Thai "+ score + " UAE");
    if(score.equals("")) {
        checkout = true;
        return; }
    else obj.setData(score);
        }
    }
}
