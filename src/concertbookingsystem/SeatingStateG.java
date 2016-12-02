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
public class SeatingStateG extends SeatingState{
    public class Index{
        int state=0;
        String name;
        boolean freeAccess=false;
        public void setState(int state) {
            this.state = state;
        }
    }
   Index[][] index= new Index[3][10];  
   public SeatingStateG(){
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                if(index[i][j] == null){
                  index[i][j]= new Index();
          
                }

            }
        }
    }
    public int getState(int row, int column){
        return index[row][column].state;
    }
    // 0 for available, -1 for selected and 1 for booked
    public void setState(int seatState, int row, int column){
        index[row][column].setState(seatState);
    }
    public void setName(String userName, int row, int column){
        index[row][column].name=userName;
    }
    public String getName(int row, int column){
        return index[row][column].name;
    }
    public void setFreeAccess(boolean s, int row, int column){
        index[row][column].freeAccess=s;
    }
    public boolean getFreeAccess( int row, int column){
        return index[row][column].freeAccess;
    }
}
