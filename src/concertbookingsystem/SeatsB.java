/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbookingsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Flor
 */
public class SeatsB extends Seats{    
    Color bronze = new Color(204,153,102);
public SeatsB(int posx,int posy,int width,int height, SeatingStateB seat){
        int state;
       setBounds(posx, posy, width, height);
       state=seat.getState(posy/30, posx/45);
       if(state==0){
         setBackground(bronze);
       }
       if(state==1){
           setBackground(Color.RED);
       } 
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
                    setBackground(bronze); 
                    break;
                case 1:
                    JOptionPane.showConfirmDialog(null, "You can't unbook a seat in bronze section", "Warning", JOptionPane.CLOSED_OPTION);
                break;
            }
                
        }
        });
    }
    
}
