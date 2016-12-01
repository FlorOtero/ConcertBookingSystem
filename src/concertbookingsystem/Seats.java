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
public class Seats extends JButton  {
    public Seats(int posx,int posy,int width,int height, SeatingState seat){
       setBounds(posx, posy, width, height);
       addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt) {
            setBackground(Color.RED);
            seat.setState(-1, posx, posy);
        }
        });
    }
}

