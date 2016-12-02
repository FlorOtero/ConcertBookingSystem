/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbookingsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Mariano Dios
 */
public class SeatsS extends Seats{     
public SeatsS(int posx,int posy,int width,int height, SeatingStateS seat){
       setBounds(posx, posy, width, height);
       setBackground(Color.GRAY);
       addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt) {
           // setBackground(Color.RED);
            switch (seat.getState(posy/30, posx/45)){
                case 0:
                    seat.setState(-1, posy/30, posx/45);  
                    setBackground(Color.RED);
                    break;
                case -1:
                    seat.setState(0, posy/30, posx/45);  
                    setBackground(Color.GRAY);
                    break;
                case 1:
                    seat.setState(-1, posy/30, posx/45);  
                    setBackground(Color.GRAY);
                    break;    
            }
                
        }
        });
    }
    
}
