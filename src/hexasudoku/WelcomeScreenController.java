/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexasudoku;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author elise
 */
public class WelcomeScreenController implements Initializable {
    
    @FXML
    public Pane login_area;
    @FXML
    public Pane register_area;
    @FXML
    private TextField username_login;
    @FXML
    private PasswordField password_login;
    @FXML
    private Label login_error;
    @FXML
    private TextField username_register;
    @FXML
    private PasswordField password_register;
    @FXML
    private PasswordField password_check;
    @FXML
    private Label register_error;
    @FXML
    private Label register_success;
    @FXML
    private Label leader1;
    @FXML
    private Label leader2;
    @FXML
    private Label leader3;
    @FXML
    private Label leader4;
    @FXML
    private Label leader5;
    @FXML
    private Label leader6;
    @FXML
    private Label leader7;
    
    public int seconds;
    
    
   //New DataFile Object, to write/read the file
    DataFile cursor = new DataFile();
    
    //This mehtod is used to close the application (by clicking on the right top corner cross
    @FXML
    private void close_application(MouseEvent event){
        System.exit(0); //System call
    }
    
    //Makes Login Pane Invisible and Register Pane Visible, simulating a Controller change
    @FXML
    private void goToRegist(MouseEvent event) throws IOException{
        login_area.setVisible(false); //login becomes invisible
        register_area.setVisible(true); //register becomes visible
    }
    
    //Makes Register visible and Login Invisible, simulating a Controller Change
    @FXML
    private void goToLogin(MouseEvent event) throws IOException{
        register_area.setVisible(false); //Register becomes invisible
        login_area.setVisible(true); //Login becomes visible
    }
    
    //Method to execute the login process
    @FXML 
    private void login(MouseEvent event) throws Exception {
        
        int cont=0;
        String pass = "";
        
        Vector<Player> player = new Vector<Player>(); //Creates an empty Players Vector
      
        player = cursor.readPlayer(); //Read all the data from to File to the Players Vector
        
        //Runs through the player vector and if it finds the username, it increments the count
        for (int i=0; i<player.size(); i++){
           if (username_login.getText().equals(player.elementAt(i).getName())){
               cont=cont+1;
               pass=player.elementAt(i).getPass();
           }         
        }
        //If the count is not zero, it means the username exists, so it's okay keep going
        if(cont!=0){
            //Now, we need to check if the password is okay...
            //If its okay, let's start the game
            if(pass.equals(password_login.getText())){
                Player tmp_player = new Player(username_login.getText(),"");
                Vector<Player> tmp_player_vector = new Vector<Player>();
                tmp_player_vector.add(tmp_player);
                cursor.saveString(tmp_player_vector);
                Parent parent = FXMLLoader.load(getClass().getResource("Game.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(parent);
                stage.initStyle(StageStyle.UNDECORATED); //Resize is off, and some more things
                stage.setScene(scene);
                stage.show();
            }
            //If it's not okay, show an error message
            else{
                login_error.setText("Wrong Password!");
            }
        }
        //If count is zero, the username does not exists, show error message
        else{
            login_error.setText("Wrong Username!");
        }
                
    }
    
    //Method to execute the regist process
    @FXML
    public void registerUser(MouseEvent event) throws Exception{
        int cont=0;
        Vector<Player> player = new Vector<Player>(); //Creates a new empty Players Vector
        player = cursor.readPlayer(); //Stores all the data from the file in the players vector
        Player challenger = new Player(username_register.getText(), password_register.getText()); //Cerates a new player object, with the username and password inserted by the user
        //Runs through the players vector, if it finds the username, increment the count
        for (int i=0; i<player.size(); i++){
           if (username_register.getText().equals(player.elementAt(i).getName())){
               cont=cont+1;
           }
        }
        //If count is not zero, username is already in use, show error
        if(cont!=0){
            register_success.setText("");
            register_error.setText("This username is already in use, please pick another one!");
        }
        //If the username is free...
        else{
            //If the two password fields match
            if(password_register.getText().equals(password_check.getText())){
                player.add(challenger); //Add player object to the vector
                try{
                    cursor.savePlayer(player); //write the vector on the file
                    register_error.setText("");
                    register_success.setText("successfully registered!"); //Send sucess message
                    //Go back to login
                    register_area.setVisible(false); //Make register area invisible
                    login_area.setVisible(true); //Make login area visible
                //Tratamento de Excepções
                } catch (IOException ex) {
                Logger.getLogger(WelcomeScreenController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(WelcomeScreenController.class.getName()).log(Level.SEVERE, null, ex);
                }
                //-----------------------
            }
            //Passwords do not match, send error message
            else{
                register_success.setText("");
                register_error.setText("Passwords Do Not Match!");
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Make sure panes are okay, set login visible and register invisible
        register_area.setVisible(false); 
        login_area.setVisible(true);
        update_leaderboard();
        seconds=30;
        constant_update();
    }    
    
    public void update_leaderboard(){
        Vector<Score> score= new Vector<Score>(); //Creates a new empty Players Vector
        score = cursor.readScore(); //Stores all the data from the file in the players vector
        int tam = score.size();
        int tam_dynamic=tam;
        Vector<Score> ordered = new Vector<Score>();
        int max_score=0, max_pos=0;
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam_dynamic;j++){
                if(score.get(j).getScore()>max_score){
                    max_score=score.get(j).getScore();
                    max_pos=j;
                }
            }
            ordered.add(score.get(max_pos));
            score.remove(max_pos);
            max_score=0;
            max_pos=0;
            tam_dynamic--;
        }
        int new_tam = ordered.size();
        for(int j=0;j<new_tam;j++){
                System.out.println(ordered.get(j).toString());
            }
        Score tmp;
        leader1.setText("--------");
        leader2.setText("--------");
        leader3.setText("--------");
        leader4.setText("--------");
        leader5.setText("--------");
        leader6.setText("--------");
        leader7.setText("--------");
        if(new_tam>=1){
            tmp = ordered.get(0);
            leader1.setText(tmp.getName()+": "+tmp.getScore()+" Points, "+tmp.getDifficulty()+"");
        }
        if(new_tam>=2){
            tmp = ordered.get(1);
            leader2.setText(tmp.getName()+": "+tmp.getScore()+" Points, "+tmp.getDifficulty()+"");
        }
        if(new_tam>=3){
            tmp = ordered.get(2);
            leader3.setText(tmp.getName()+": "+tmp.getScore()+" Points, "+tmp.getDifficulty()+"");
        }
        if(new_tam>=4){
            tmp = ordered.get(3);
            leader4.setText(tmp.getName()+": "+tmp.getScore()+" Points, "+tmp.getDifficulty()+"");
        }
        if(new_tam>=5){
            tmp = ordered.get(4);
            leader5.setText(tmp.getName()+": "+tmp.getScore()+" Points, "+tmp.getDifficulty()+"");
        }
        if(new_tam>=6){
            tmp = ordered.get(5);
            leader6.setText(tmp.getName()+": "+tmp.getScore()+" Points, "+tmp.getDifficulty()+"");
        }
        if(new_tam>=7){
            tmp = ordered.get(6);
            leader7.setText(tmp.getName()+": "+tmp.getScore()+" Points, "+tmp.getDifficulty()+"");
        }
        
    }
    
    public void doTime(){
        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
        if(time!=null){
            time.stop();
        }
        
        KeyFrame frame = new KeyFrame(Duration.seconds(1),new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                    seconds--;
                    if(seconds<=0){
                        time.stop();
                        constant_update();
                    }
            }
            
        });
        time.getKeyFrames().add(frame);
        time.playFromStart();
    }
    
    public void constant_update(){
        update_leaderboard();
        seconds=30;
        doTime();
        System.out.println("Atualizei");
    }
    
}
