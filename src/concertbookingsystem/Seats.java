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
public abstract class Seats extends JButton  {
   /* public Seats(int posx,int posy,int width,int height, SeatingState seat){
       setBounds(posx, posy, width, height);
       addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt) {
           // setBackground(Color.RED);
            switch (seat.getState(posy/30, posx/45)){
                case 0:
                    seat.setState(-1, posy/30, posx/45);  
                    setBackground(Color.RED);
                    break;
                case -1:
                    seat.setState(-1, posy/30, posx/45);  
                    setBackground(Color.GRAY);
            }
                
        }
        });*/
    }


