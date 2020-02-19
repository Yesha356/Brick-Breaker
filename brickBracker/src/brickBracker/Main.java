/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickBracker;

import javax.swing.JFrame;

/**
 *
 * @author umesha
 */
public class Main {
    public static void main(String[] args)
    { JFrame obj =new JFrame();
    gameplay Gameplay= new gameplay();
     obj.setBounds(10,10,700,600);
     obj.setTitle("Breakout Ball");
     obj.setResizable(false);
     obj.setVisible(true);
     obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     obj.add(Gameplay);
    }
}

   // private static class gameplay {

       // public gameplay() {
        
    
