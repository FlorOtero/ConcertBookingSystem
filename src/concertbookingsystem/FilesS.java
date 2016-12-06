/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbookingsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Flor
 */
public class FilesS  extends Files {
    
public static void saveFile(SeatingStateS seatS)throws IOException{
        FileWriter file = null;
        PrintWriter pw = null;
        try{
            file = new FileWriter("SilverInfo.txt");
            pw = new PrintWriter(file);   
            for (int i=0;i<3 ; i++ ) { 		
                for (int j=0;j<10 ;j++ ) {
                    pw.println(seatS.getName(i,j)+","+seatS.getState(i,j)+","+seatS.getFreeProgramme(i,j)+".");
                } 
            }       
                 
        } 
        catch (Exception e) {
            e.printStackTrace();       
        } finally {    
                try {  
                    // Nuevamente aprovechamos el finally
                    if(null!=file){
                        file.close();
                    }
                    }catch(Exception e2){
                            e2.printStackTrace();
                     }
                }
    }

     
 public SeatingStateS readFile()throws FileNotFoundException, IOException, ClassNotFoundException
 {  
    SeatingStateS seatS=new SeatingStateS();
    File file = null;
    FileReader fr = null;
    BufferedReader br = null;
    try {
	file = new File ("SilverInfo.txt");
	fr = new FileReader (file);
	br = new BufferedReader(fr);
	String line;
        for (int i=0;i<3 ; i++ ) {
            for (int j=0;j<10 ;j++ ) {
               if((line=br.readLine())!=null){
                    setData(line, i, j, seatS);
                }
            }
            
        } 
        
    }catch(Exception e){
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
 return seatS; 
 }
 public void setData(String line, int r,  int c, SeatingStateS seat ){
        	int i=0;
        	String name = "";
        	boolean freeProgramme = false;
        	int state = 0;
               
        	while(line.charAt(i)!=','){
        		name+=line.charAt(i);
        		i++;
        	}
        	i++;
                String number="";
        	while(line.charAt(i)!=','){
        		number+=line.charAt(i);
        		i++;
        	}
                state=Integer.parseInt(number);
        	i++;
                String aux="";
              
        	while(line.charAt(i)!='.'){
                        aux+=line.charAt(i);
        		i++;
        	}
                
                freeProgramme=Boolean.parseBoolean(aux);

        	seat.setFreeProgramme(freeProgramme,r,c);
        	seat.setName(name, r ,c);
        	seat.setState(state, r, c);
    }
}
