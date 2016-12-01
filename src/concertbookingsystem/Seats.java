/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbookingsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Flor
 */
public class Seats extends JButton implements ActionListener {
    public Seats(int posx,int posy,int width,int height){
       this.setBounds(posx, posy, width, height);
       this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) 
    {
        this.setBackground(Color.RED);
    }
}

