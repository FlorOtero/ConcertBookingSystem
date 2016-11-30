/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbookingsystem;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Flor
 */
public class Seats extends JButton implements ActionListener {
    public Seats(int posx,int posy, int width, int height){
       setBounds(posx, posy, width, height);
       //setBackground(new java.awt.Color(255, 204, 102));
       addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.RED);
    }
}
