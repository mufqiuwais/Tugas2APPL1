/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor6;

/**
 *
 * @author mufqi
 */
// ******************************************************************
// MoveCircle.java
//
// Uses CirclePanel to display a GUI that lets the user move
// a circle by pressing buttons.
// ******************************************************************
import java.awt.*;
import javax.swing.*;
public class MoveCircle {
    final static int X = 400;
    final static int Y = 300;
    public static void main(String[] args) {
        JFrame frame = new JFrame ("MoveCircle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(X,Y);
        frame.getContentPane().add(new CirclePanel(X,Y));
        frame.setVisible(true);
    }
} 
