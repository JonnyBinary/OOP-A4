package de.fh_kiel.oop;

import processing.core.PApplet;
import processing.core.PImage;

public class Processing extends PApplet {
    private final int W = 800;
    private final int H = 600;


    public void settings(){
        size(W,H);
    }

    public void setup(){

    }

    public void draw(){
        background(0,0,255);
    }


    public static void main(String[] args){
        String[] processingArgs = {"Grundlegendes Beispiel"};
        Processing test = new Processing();
        PApplet.runSketch(processingArgs, test);
    }

}
