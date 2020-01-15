/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexasudoku;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;


/**
 *
 * @author elise
 */


/**
 * 
 * This class is used to write and read information from the File "Players.dat"
 */
public class DataFile {
    //Constructor
    public DataFile(){
        
    }
    
    //Function to read data from the File and return it in a Vector Structure of Players
    public Vector <Player> readPlayer(){
        
        Vector <Player> player = new Vector <Player>(); //Create an empty Vector of Players
        
        try{
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream("Players.dat")); //Creates a object to reference the file (for reading purposes)
            player = ((Vector <Player>) fin.readObject()); //Store all the data in the file in the Vector
            fin.close(); //Close the file
        }
        //Catching Exceptions
        catch (IOException IORead){
            System.out.println(IORead.getMessage());
        }
        catch (ClassNotFoundException IORead){
            System.out.println(IORead.getMessage());
        }
        //------------------
        //Returning the Vector
        return player;
    }
    
    //Function to sava a Vector of Players in the File
    public void savePlayer(Vector<Player> jog) throws IOException,ClassNotFoundException{
        
        ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("Players.dat")); //Creates a object to reference the file (for writting purposes)
        
        fout.writeObject(jog); //Writes the Vector data in the file
        fout.flush(); //To really write the content on the file
        fout.close(); //Closing the file
        }
    
    public Vector <Score> readScore(){
        
        Vector <Score> score = new Vector <Score>(); //Create an empty Vector of Players
        
        try{
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream("Scores.dat")); //Creates a object to reference the file (for reading purposes)
            score = ((Vector <Score>) fin.readObject()); //Store all the data in the file in the Vector
            fin.close(); //Close the file
        }
        //Catching Exceptions
        catch (IOException IORead){
            System.out.println(IORead.getMessage());
        }
        catch (ClassNotFoundException IORead){
            System.out.println(IORead.getMessage());
        }
        //------------------
        //Returning the Vector
        return score;
    }
    
    //Function to sava a Vector of Players in the File
    public void saveScore(Vector<Score> score) throws IOException,ClassNotFoundException{
        
        ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("Scores.dat")); //Creates a object to reference the file (for writting purposes)
        
        fout.writeObject(score); //Writes the Vector data in the file
        fout.flush(); //To really write the content on the file
        fout.close(); //Closing the file
        }
    
    //Function to sava a Vector of Players in the File
    public void saveString(Vector<Player> jog) throws IOException,ClassNotFoundException{
        
        ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("tmp.dat")); //Creates a object to reference the file (for writting purposes)
        
        fout.writeObject(jog); //Writes the Vector data in the file
        fout.flush(); //To really write the content on the file
        fout.close(); //Closing the file
        }
    
    public String readString(){
        Vector <Player> player = new Vector <Player>(); //Create an empty Vector of Players
        
        try{
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream("tmp.dat")); //Creates a object to reference the file (for reading purposes)
            player = ((Vector <Player>) fin.readObject()); //Store all the data in the file in the Vector
            fin.close(); //Close the file
        }
        //Catching Exceptions
        catch (IOException IORead){
            System.out.println(IORead.getMessage());
        }
        catch (ClassNotFoundException IORead){
            System.out.println(IORead.getMessage());
        }
        //------------------
        //Returning the Vector
        return player.get(0).getName();
    }
    
    public void clearTmp() throws FileNotFoundException, IOException{
        ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("tmp.dat")); //Creates a object to reference the file (for writting purposes)
        
        fout.writeChars(""); //Writes the Vector data in the file
        fout.flush(); //To really write the content on the file
        fout.close(); //Closing the file
        }
    }
