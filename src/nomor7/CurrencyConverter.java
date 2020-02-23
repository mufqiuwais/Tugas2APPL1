/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor7;

/**
 *
 * @author mufqi
 */
// ***********************************************************************
// CurrencyConverter.java
//
// Computes the dollar value of the cost of an item in another currency.
// ***********************************************************************
import java.awt.*;
import javax.swing.*;
public class CurrencyConverter {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Currency Converter");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        RatePanel ratePanel = new RatePanel ();
        frame.setSize(900,100);
        frame.getContentPane().add(ratePanel);
        frame.setVisible(true);
    }
} 
