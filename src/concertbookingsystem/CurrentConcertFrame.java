/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbookingsystem;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;
import java.util.Random;
/**
 *
 * @author Flor
 */
public class CurrentConcertFrame extends javax.swing.JFrame 
{
    int rows=3, columns=10;
    SeatingStateG seatingG;
    SeatingStateS seatingS;
    SeatingStateB seatingB;
    String concertName, date;
    int priceG, priceS, priceB;
    int  book=0;
    Random rnd = new Random();
    int num=(int)(rnd.nextDouble() * 10 + 0);
    public CurrentConcertFrame()
    {
        restoreInfoConcert();
        initComponents();
        this.setTitle("Concert Name: " + concertName+ " Date: "+date);
        jLabel17.setText("£"+String.valueOf(priceG));
        jLabel18.setText("£"+String.valueOf(priceS));
        jLabel20.setText("£"+String.valueOf(priceB));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
//Remove any existing WindowListeners
for ( WindowListener wl : this.getWindowListeners())
        this.removeWindowListener(wl);
        this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) 
        {                
            JOptionPane.showMessageDialog(null, "Please select the 'EXIT' button to be able to save the changes, otherwise press 'Cancel'");                
        }
    });
        seatPlan();    
        
    }  

    public void restoreInfoConcert()
    {
        File archive = null;
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            archive = new File ("concert.txt");
            fr = new FileReader (archive);
            br = new BufferedReader(fr);
            String line;
            if((line=br.readLine())!=null)
            {
                concertName=line;
            }
            if((line=br.readLine())!=null)
            {
                date=line;
            }
            if((line=br.readLine())!=null)
            {
                priceB=Integer.parseInt(line);
            }
            if((line=br.readLine())!=null)
            {
                priceS=Integer.parseInt(line);
            }
            if((line=br.readLine())!=null)
            {
                priceG=Integer.parseInt(line);
            }
    }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }   
    }

    public void seatPlan()
    {
        for(int i=1;i<4;i++)
        {
            switch(i)
            {
                case 1: 
                    SeatsG[][] seatG = new SeatsG[rows][columns];
                    seatingG= new SeatingStateG();
                    
                    for(int row=0; row<rows;row++)
                    {
                        for(int column=0;column<columns; column++)
                        {  
                            seatG[row][column]= new SeatsG(45*column, 30*row, 15, 15, seatingG);
                            jPanel1.add(seatG[row][column]);
                        }
                    }  
                    break ;    
                case 2:
                    seatingS= new SeatingStateS();
                    SeatsS[][] seatS = new SeatsS[rows][columns];
                    for(int row=0; row<rows;row++)
                    {
                        for(int column=0;column<columns; column++)
                        {
                            seatS[row][column]= new SeatsS(45*column, 30*row, 15, 15, seatingS);
                            jPanel3.add(seatS[row][column]);
                        }
                    }   
                    break ;
                case 3: 
                    seatingB= new SeatingStateB(); 
                    SeatsB[][] seatB = new SeatsB[rows][columns];
                    Color bronze = new Color(204,153,102);
                    for(int row=0; row<rows;row++)
                    {
                        for(int column=0;column<columns; column++)
                        {
                            seatB[row][column]= new SeatsB(45*column, 30*row, 15, 15, seatingB);
                
                            jPanel4.add(seatB[row][column]);
                        }
                    }  
                break ;
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setText("3");

        jLabel10.setText("2");

        jLabel9.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(487, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Unbook");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jLabel8.setText("6");

        jLabel7.setText("5");

        jLabel6.setText("4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jLabel14.setText("9");

        jLabel12.setText("7");

        jLabel13.setText("8");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        jLabel4.setLabelFor(jPanel1);
        jLabel4.setText("1          2          3          4         5         6         7        8          9          10");
        jLabel4.setToolTipText("");

        jLabel5.setText("Seat number");

        jLabel1.setText("Gold Section");

        jLabel2.setText("Silver Section");

        jLabel3.setText("Bronze Section");

        jLabel15.setText("Isle");

        jLabel17.setText("Price");

        jLabel18.setText("Price");

        jLabel20.setText("Price");

        jMenu2.setText("Options");

        jMenuItem2.setText("Check Availability");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Search");

        jMenuItem3.setText("By Name");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("By Seat");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel17)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel18)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel20))))
                                        .addGap(98, 98, 98))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 298, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(197, 197, 197))))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel18))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(404, 404, 404)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 

  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PrincipalFrame myFrame=new PrincipalFrame();
        myFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = JOptionPane.showInputDialog("Enter name for the booking: ");
        boolean seatSelected=false, goldBooking=false;
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
               if(seatingG.getState(r, c)==-1){
                   if(book!=num){    
                        book++;
                   }else{
                        JOptionPane.showMessageDialog(null, "You have won a free access to backstage!", "Good news!", JOptionPane.PLAIN_MESSAGE);
                        seatingG.setFreeAccess(true,r, c);
                        book=0;
                        Random rnd = new Random();
                        num=(int)(rnd.nextDouble() * 10 + 0);
                   }
                    seatingG.setState(1, r, c);
                    seatingG.setName(name, r, c);
                    seatSelected=true;
                    goldBooking=true;
                }
                if(seatingS.getState(r, c)==-1){
                    seatingS.setState(1, r, c);
                    seatingS.setName(name, r, c);
                    seatSelected=true;
                    int resp = JOptionPane.showConfirmDialog(null, "Do you want a free programme?");
                    if(resp==0){
                        seatingS.setFreeProgramme(true, r, c);
                    }                   
                }
                if(seatingB.getState(r, c)==-1){
                    seatingB.setState(1, r, c);
                    seatingB.setName(name, r, c);
                    seatSelected=true;
                }
            }
        }
        if(seatSelected==false){
            JOptionPane.showMessageDialog(null, "You must select a seat to book", "Warning", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean seatSelected=false;
        String name="";
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                if(seatingG.getState(r, c)==-1){
                    seatingG.setState(1, r, c);
                    seatingG.setName(name, r, c);
                    seatSelected=true;
                }
                if(seatingS.getState(r, c)==-1){
                    seatingS.setState(0, r, c);
                    seatingS.setName(name, r, c);
                    if(seatingS.getFreeProgramme(r, c)==true){
                        seatingS.setFreeProgramme(false, r, c);
                    }
                    seatSelected=true;
                }
            }
        }
        if(seatSelected==false){
            JOptionPane.showMessageDialog(null, "You must select a seat to unbook", "Warning", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
                int available=0, booked=0, value=0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                if(seatingG.getState(r, c)==0){
                    available++;                  
                }
                if(seatingG.getState(r, c)==1){
                    booked++;
                    value=value+priceG;
                }
                if(seatingS.getState(r, c)==0){
                    available++;                    
                }
                if(seatingS.getState(r, c)==1){
                    booked++;
                    value=value+priceS;
                }
                if(seatingB.getState(r, c)==0){
                    available++;                   
                }
                if(seatingB.getState(r, c)==1){
                    booked++;
                    value=value+priceB;
                }
                    
                }
                
            }     
        JOptionPane.showMessageDialog(this, "Number of available seats " + available + " Number of booked seats " + booked+" Total value of all sales: "+ value,
        	"Status", JOptionPane.PLAIN_MESSAGE) ;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String name=JOptionPane.showInputDialog("Enter name you want to search: ");
        String res="";
        boolean nameExists=false;
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                if(seatingG.getState(r, c)==1){
                     if(seatingG.getName(r, c).compareTo(name) == 0)
                     {
                        res=res+"; Seat "+(c+1)+" Isle: "+(r+1); 
                        nameExists=true;
                    }
                }
                if(seatingS.getState(r, c)==1){
                   if(seatingS.getName(r, c).compareTo(name) == 0)
                   {
                        res=res+"; Seat "+(c+1)+" Isle: "+(r+4);
                        nameExists=true;
                    } 
                }
                if(seatingB.getState(r, c)==1){
                  if(seatingB.getName(r, c).compareTo(name) == 0)
                  { 
                        res=res+"; Seat "+(c+1)+" Isle: "+(r+7); 
                        nameExists=true;                      
                  }
                }
                
            }
        }
        if(nameExists==true){
          JOptionPane.showMessageDialog(this, "You have booking/s in: "+res);  
        }else{
           JOptionPane.showMessageDialog(this, "You must provide a valid name"); 
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String i=JOptionPane.showInputDialog("Enter isle you want to search: ");
        String s=JOptionPane.showInputDialog("Enter seat you want to search: ");
        int isle, seat;      
        isle=Integer.parseInt(i);
        seat=Integer.parseInt(s);
        if(seat>0 && seat<11){
            if(isle>0 &&isle<10)
            {
               if(isle>0 && isle<4)
                {
                    JOptionPane.showMessageDialog(this, "Purchaser name: "+seatingG.getName(isle-1, seat-1)+ " Receiving a back-stage pass: "+seatingG.getFreeAccess(isle-1, seat-1));
                }
                if(isle>3 && isle<7)
                {
                    JOptionPane.showMessageDialog(this, "Purchaser name: "+seatingS.getName(isle-4, seat-1)+ " Receiving a free programe pass: "+seatingS.getFreeProgramme(isle-4, seat-1)); 
                }
                if(isle>6 && isle<10)
                {
                    JOptionPane.showMessageDialog(this, "Purchaser name: "+seatingB.getName(isle-7, seat-1));
                } 
            }else
            {
                JOptionPane.showMessageDialog(this, "Please provide a valid number of isle");
            }
        }else
        {
            JOptionPane.showMessageDialog(this, "Please provide a valid number of seat");           
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrentConcertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentConcertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentConcertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentConcertFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentConcertFrame().setVisible(true);
            }
        });
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
