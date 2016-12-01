/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbookingsystem;

/**
 *
 * @author Flor
 */
public  class SeatingState {  
    public class Index{
        int state;
        String name;
    }
    Index[][] index= new Index[10][3];      
    public int getState(int row, int column){
        return index[row][column].state;
    }
    public void setState(int seatState, int row, int column){
        index[row][column].state= seatState;
    }
    public void setName(String userName, int row, int column){
        index[row][column].name=userName;
    }
    public String getName(int row, int column){
        return index[row][column].name;
    }
}

