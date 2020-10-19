package de.mat2095.my_slither;
import javax.swing.*;
  public class MyThread2 implements Runnable {

    public void run(){
        //code taken from max o'didily on youtube
         String filepath="Music.wav";
         MusicStuff musicObject=new MusicStuff();
         musicObject.playMusic(filepath);
       //new Sound();
    }
  }
