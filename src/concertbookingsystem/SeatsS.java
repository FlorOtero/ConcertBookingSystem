/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbookingsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Flor
 */
public class SeatsS extends Seats {
     public SeatsS(int posx,int posy,int width,int height, SeatingState seat){
       setBounds(posx, posy, width, height);
       setBackground(Color.GRAY);
       addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt) {
            if(seat.getState(posy/30, posx/45)==0){
                setBackground(Color.RED);
                seat.setState(-1, posy/30, posx/45);  
            }
            if(seat.getState(posy/30, posx/45)==-1){
                seat.setState(0, posy/30, posx/45);  
                setBackground(Color.GRAY);
            }
            if(seat.getState(posy/30, posx/45)==1){
                seat.setState(0, posy/30, posx/45); 
                setBackground(Color.GRAY);
            }
        }
        });
    }  
}
