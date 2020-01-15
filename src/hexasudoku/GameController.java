/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexasudoku;

import java.io.IOException;
import java.net.URL;
import javafx.util.Duration;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author elise
 */
public class GameController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    //New DataFile Object, to write/read the file
    DataFile cursor = new DataFile();
    
    @FXML
    private ImageView winner;
    
    @FXML
    private Button close;
    @FXML
    private Button easy;
    @FXML
    private Button medium;
    @FXML
    private Button hard;
    @FXML
    private Button play;
    @FXML
    private Button pause;
    @FXML
    private Button check_go;
    @FXML
    private Button surrender_go;
    @FXML
    private Label state_label;
    
    @FXML
    private GridPane q0;
    @FXML
    private GridPane q1;
    @FXML
    private GridPane q2;
    @FXML
    private GridPane q3;
    @FXML
    private GridPane q4;
    @FXML
    private GridPane q5;
    @FXML
    private GridPane q6;
    @FXML
    private GridPane q7;
    @FXML
    private GridPane q8;
    @FXML
    private GridPane q9;
    @FXML
    private GridPane qa;
    @FXML
    private GridPane qb;
    @FXML
    private GridPane qc;
    @FXML
    private GridPane qd;
    @FXML
    private GridPane qe;
    @FXML
    private GridPane qf;
    
    
    @FXML
    private TextField t00;
    @FXML
    private TextField t01;
    @FXML
    private TextField t02;
    @FXML
    private TextField t03;
    @FXML
    private TextField t04;
    @FXML
    private TextField t05;
    @FXML
    private TextField t06;
    @FXML
    private TextField t07;
    @FXML
    private TextField t08;
    @FXML
    private TextField t09;
    @FXML
    private TextField t0a;
    @FXML
    private TextField t0b;
    @FXML
    private TextField t0c;
    @FXML
    private TextField t0d;
    @FXML
    private TextField t0e;
    @FXML
    private TextField t0f;
    @FXML
    private TextField t10;
    @FXML
    private TextField t11;
    @FXML
    private TextField t12;
    @FXML
    private TextField t13;
    @FXML
    private TextField t14;
    @FXML
    private TextField t15;
    @FXML
    private TextField t16;
    @FXML
    private TextField t17;
    @FXML
    private TextField t18;
    @FXML
    private TextField t19;
    @FXML
    private TextField t1a;
    @FXML
    private TextField t1b;
    @FXML
    private TextField t1c;
    @FXML
    private TextField t1d;
    @FXML
    private TextField t1e;
    @FXML
    private TextField t1f;
    @FXML
    private TextField t20;
    @FXML
    private TextField t21;
    @FXML
    private TextField t22;
    @FXML
    private TextField t23;
    @FXML
    private TextField t24;
    @FXML
    private TextField t25;
    @FXML
    private TextField t26;
    @FXML
    private TextField t27;
    @FXML
    private TextField t28;
    @FXML
    private TextField t29;
    @FXML
    private TextField t2a;
    @FXML
    private TextField t2b;
    @FXML
    private TextField t2c;
    @FXML
    private TextField t2d;
    @FXML
    private TextField t2e;
    @FXML
    private TextField t2f;
    @FXML
    private TextField t30;
    @FXML
    private TextField t31;
    @FXML
    private TextField t32;
    @FXML
    private TextField t33;
    @FXML
    private TextField t34;
    @FXML
    private TextField t35;
    @FXML
    private TextField t36;
    @FXML
    private TextField t37;
    @FXML
    private TextField t38;
    @FXML
    private TextField t39;
    @FXML
    private TextField t3a;
    @FXML
    private TextField t3b;
    @FXML
    private TextField t3c;
    @FXML
    private TextField t3d;
    @FXML
    private TextField t3e;
    @FXML
    private TextField t3f;
    @FXML
    private TextField t40;
    @FXML
    private TextField t41;
    @FXML
    private TextField t42;
    @FXML
    private TextField t43;
    @FXML
    private TextField t44;
    @FXML
    private TextField t45;
    @FXML
    private TextField t46;
    @FXML
    private TextField t47;
    @FXML
    private TextField t48;
    @FXML
    private TextField t49;
    @FXML
    private TextField t4a;
    @FXML
    private TextField t4b;
    @FXML
    private TextField t4c;
    @FXML
    private TextField t4d;
    @FXML
    private TextField t4e;
    @FXML
    private TextField t4f;
    @FXML
    private TextField t50;
    @FXML
    private TextField t51;
    @FXML
    private TextField t52;
    @FXML
    private TextField t53;
    @FXML
    private TextField t54;
    @FXML
    private TextField t55;
    @FXML
    private TextField t56;
    @FXML
    private TextField t57;
    @FXML
    private TextField t58;
    @FXML
    private TextField t59;
    @FXML
    private TextField t5a;
    @FXML
    private TextField t5b;
    @FXML
    private TextField t5c;
    @FXML
    private TextField t5d;
    @FXML
    private TextField t5e;
    @FXML
    private TextField t5f;
    @FXML
    private TextField t60;
    @FXML
    private TextField t61;
    @FXML
    private TextField t62;
    @FXML
    private TextField t63;
    @FXML
    private TextField t64;
    @FXML
    private TextField t65;
    @FXML
    private TextField t66;
    @FXML
    private TextField t67;
    @FXML
    private TextField t68;
    @FXML
    private TextField t69;
    @FXML
    private TextField t6a;
    @FXML
    private TextField t6b;
    @FXML
    private TextField t6c;
    @FXML
    private TextField t6d;
    @FXML
    private TextField t6e;
    @FXML
    private TextField t6f;
    @FXML
    private TextField t70;
    @FXML
    private TextField t71;
    @FXML
    private TextField t72;
    @FXML
    private TextField t73;
    @FXML
    private TextField t74;
    @FXML
    private TextField t75;
    @FXML
    private TextField t76;
    @FXML
    private TextField t77;
    @FXML
    private TextField t78;
    @FXML
    private TextField t79;
    @FXML
    private TextField t7a;
    @FXML
    private TextField t7b;
    @FXML
    private TextField t7c;
    @FXML
    private TextField t7d;
    @FXML
    private TextField t7e;
    @FXML
    private TextField t7f;
    @FXML
    private TextField t80;
    @FXML
    private TextField t81;
    @FXML
    private TextField t82;
    @FXML
    private TextField t83;
    @FXML
    private TextField t84;
    @FXML
    private TextField t85;
    @FXML
    private TextField t86;
    @FXML
    private TextField t87;
    @FXML
    private TextField t88;
    @FXML
    private TextField t89;
    @FXML
    private TextField t8a;
    @FXML
    private TextField t8b;
    @FXML
    private TextField t8c;
    @FXML
    private TextField t8d;
    @FXML
    private TextField t8e;
    @FXML
    private TextField t8f;
    @FXML
    private TextField t90;
    @FXML
    private TextField t91;
    @FXML
    private TextField t92;
    @FXML
    private TextField t93;
    @FXML
    private TextField t94;
    @FXML
    private TextField t95;
    @FXML
    private TextField t96;
    @FXML
    private TextField t97;
    @FXML
    private TextField t98;
    @FXML
    private TextField t99;
    @FXML
    private TextField t9a;
    @FXML
    private TextField t9b;
    @FXML
    private TextField t9c;
    @FXML
    private TextField t9d;
    @FXML
    private TextField t9e;
    @FXML
    private TextField t9f;
    @FXML
    private TextField ta0;
    @FXML
    private TextField ta1;
    @FXML
    private TextField ta2;
    @FXML
    private TextField ta3;
    @FXML
    private TextField ta4;
    @FXML
    private TextField ta5;
    @FXML
    private TextField ta6;
    @FXML
    private TextField ta7;
    @FXML
    private TextField ta8;
    @FXML
    private TextField ta9;
    @FXML
    private TextField taa;
    @FXML
    private TextField tab;
    @FXML
    private TextField tac;
    @FXML
    private TextField tad;
    @FXML
    private TextField tae;
    @FXML
    private TextField taf;
    @FXML
    private TextField tb0;
    @FXML
    private TextField tb1;
    @FXML
    private TextField tb2;
    @FXML
    private TextField tb3;
    @FXML
    private TextField tb4;
    @FXML
    private TextField tb5;
    @FXML
    private TextField tb6;
    @FXML
    private TextField tb7;
    @FXML
    private TextField tb8;
    @FXML
    private TextField tb9;
    @FXML
    private TextField tba;
    @FXML
    private TextField tbb;
    @FXML
    private TextField tbc;
    @FXML
    private TextField tbd;
    @FXML
    private TextField tbe;
    @FXML
    private TextField tbf;
    @FXML
    private TextField tc0;
    @FXML
    private TextField tc1;
    @FXML
    private TextField tc2;
    @FXML
    private TextField tc3;
    @FXML
    private TextField tc4;
    @FXML
    private TextField tc5;
    @FXML
    private TextField tc6;
    @FXML
    private TextField tc7;
    @FXML
    private TextField tc8;
    @FXML
    private TextField tc9;
    @FXML
    private TextField tca;
    @FXML
    private TextField tcb;
    @FXML
    private TextField tcc;
    @FXML
    private TextField tcd;
    @FXML
    private TextField tce;
    @FXML
    private TextField tcf;
    @FXML
    private TextField td0;
    @FXML
    private TextField td1;
    @FXML
    private TextField td2;
    @FXML
    private TextField td3;
    @FXML
    private TextField td4;
    @FXML
    private TextField td5;
    @FXML
    private TextField td6;
    @FXML
    private TextField td7;
    @FXML
    private TextField td8;
    @FXML
    private TextField td9;
    @FXML
    private TextField tda;
    @FXML
    private TextField tdb;
    @FXML
    private TextField tdc;
    @FXML
    private TextField tdd;
    @FXML
    private TextField tde;
    @FXML
    private TextField tdf;
    @FXML
    private TextField te0;
    @FXML
    private TextField te1;
    @FXML
    private TextField te2;
    @FXML
    private TextField te3;
    @FXML
    private TextField te4;
    @FXML
    private TextField te5;
    @FXML
    private TextField te6;
    @FXML
    private TextField te7;
    @FXML
    private TextField te8;
    @FXML
    private TextField te9;
    @FXML
    private TextField tea;
    @FXML
    private TextField teb;
    @FXML
    private TextField tec;
    @FXML
    private TextField ted;
    @FXML
    private TextField tee;
    @FXML
    private TextField tef;
    @FXML
    private TextField tf0;
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf4;
    @FXML
    private TextField tf5;
    @FXML
    private TextField tf6;
    @FXML
    private TextField tf7;
    @FXML
    private TextField tf8;
    @FXML
    private TextField tf9;
    @FXML
    private TextField tfa;
    @FXML
    private TextField tfb;
    @FXML
    private TextField tfc;
    @FXML
    private TextField tfd;
    @FXML
    private TextField tfe;
    @FXML
    private TextField tff;
    
    public int seconds=0;
    
    public boolean playing=false;
    public boolean paused=true;
    
    public boolean facil=false;
    public boolean medio = false;
    public boolean dificil = false;
    
    public String username = "";
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        username=cursor.readString();
        System.out.println("user: "+username);
        play.setVisible(true);
        winner.setVisible(false);
        paused=true;
        playing=false;
        play.setVisible(false);
        pause.setVisible(false);
        check_go.setVisible(false);
        surrender_go.setVisible(false);
        blockTable();
    }  
    
    @FXML
    private void close_application(MouseEvent event){
        Stage stage = (Stage) close.getScene().getWindow();
    // do what you have to do
        stage.close();
    }
    
    public void resume_game(){
        paused=false;
        play.setVisible(false);
        pause.setVisible(true);
        check_go.setVisible(true);
        surrender_go.setVisible(false);
        unlockTable();
    }
    
    public void pause_game(){
        paused=true;
        pause.setVisible(false);
        play.setVisible(true);
        check_go.setVisible(false);
        surrender_go.setVisible(true);
        blockTable();
    }
    
    public void surrender(){
        seconds=0;
        playing=false;
        state_label.setText("");
        winner.setVisible(false);
        paused=true;
        play.setVisible(false);
        pause.setVisible(false);
        check_go.setVisible(false);
        surrender_go.setVisible(false);
        easy.setVisible(true);
        easy.setDisable(false);
        medium.setVisible(true);
        medium.setDisable(false);
        hard.setVisible(true);
        hard.setDisable(false);
        clearTable();
        blockTable();
        facil = false;
        medio = false;
        dificil = false;
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
                if(!paused){
                    seconds--;
                    state_label.setText("Time Left: "+seconds);
                    if(seconds<=0){
                        time.stop();
                        if(playing){
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setHeaderText("Timeout!");
                            alert.show();
                            playing=false;
                            surrender();
                        }
                    }
                }
            }
            
        });
        time.getKeyFrames().add(frame);
        time.playFromStart();
    }
    
    //Gera 8 em 16 quadrados
    @FXML
    public void easyMode(MouseEvent event){
            paused=true;
            play.setVisible(false);
            pause.setVisible(false);
            check_go.setVisible(false);
            surrender_go.setVisible(false);
            easy.setVisible(true);
            easy.setDisable(true);
            medium.setVisible(false);
            medium.setDisable(false);
            hard.setVisible(false);
            hard.setVisible(false);
            playing=false;
            seconds=0;
            state_label.setText("Starting New Game (Easy)");
            clearTable();
            winner.setVisible(false);
            seconds=500;
            easysolution();
            playing=true;
            paused=false;
            pause.setVisible(true);
            check_go.setVisible(true);
            unlockTable();
            facil = true;
            medio = false;
            dificil = false;
            doTime();
    }
    
    @FXML
    public void mediumMode(MouseEvent event){
            paused=true;
            play.setVisible(false);
            pause.setVisible(false);
            check_go.setVisible(false);
            surrender_go.setVisible(false);
            easy.setVisible(false);
            easy.setDisable(false);
            medium.setVisible(true);
            medium.setDisable(true);
            hard.setVisible(false);
            hard.setVisible(false);
            playing=false;
            seconds=0;
            state_label.setText("Starting New Game (Medium)");
            clearTable();
            winner.setVisible(false);
            seconds = 680;
            mediumsolution();
            playing=true;
            paused=false;
            pause.setVisible(true);
            check_go.setVisible(true);
            unlockTable();
            facil = false;
            medio = true;
            dificil = false;
            doTime();
    }
    
    @FXML
    public void hardMode(MouseEvent event){
            paused=true;
            play.setVisible(false);
            pause.setVisible(false);
            check_go.setVisible(false);
            surrender_go.setVisible(false);
            easy.setVisible(false);
            easy.setDisable(false);
            medium.setVisible(false);
            medium.setDisable(false);
            hard.setVisible(true);
            hard.setVisible(true);
            playing=false;
            seconds=0;
            state_label.setText("Starting New Game (Hard)");
            clearTable();
            winner.setVisible(false);
            seconds=800;
            hardsolution();
            playing=true;
            paused=false;
            pause.setVisible(true);
            check_go.setVisible(true);
            unlockTable();
            facil = false;
            medio = false;
            dificil = true;
            doTime();
    }
    
    @FXML
    public void easysolution(){
        //Primeiro bloco
                t05.setText("9");
                t05.setEditable(false);
                t08.setText("4");
                t08.setEditable(false);
                t00.setText("0");
                t00.setEditable(false);
                t0c.setText("C");
                t0c.setEditable(false);
                t09.setText("5");
                t09.setEditable(false);
                t0d.setText("D");
                t0d.setEditable(false);
                //Segundo bloco
                t1d.setText("9");
                t1d.setEditable(false);
                t10.setText("4");
                t10.setEditable(false);
                t14.setText("0");
                t14.setEditable(false);
                t18.setText("C");
                t18.setEditable(false);
                t11.setText("5");
                t11.setEditable(false);
                t19.setText("D");
                t19.setEditable(false);
                //Terceiro bloco
                t21.setText("9");
                t21.setEditable(false);
                t2c.setText("4");
                t2c.setEditable(false);
                t28.setText("0");
                t28.setEditable(false);
                t24.setText("C");
                t24.setEditable(false);
                t2d.setText("5");
                t2d.setEditable(false);
                t25.setText("D");
                t25.setEditable(false);
                //Quarto bloco
                t39.setText("9");
                t39.setEditable(false);
                t34.setText("4");
                t34.setEditable(false);
                t3c.setText("0");
                t3c.setEditable(false);
                t30.setText("C");
                t30.setEditable(false);
                t35.setText("5");
                t35.setEditable(false);
                t31.setText("D");
                t31.setEditable(false);
                //Quinto bloco
                t47.setText("9");
                t47.setEditable(false);
                t49.setText("4");
                t49.setEditable(false);
                t41.setText("0");
                t41.setEditable(false);
                t4f.setText("C");
                t4f.setEditable(false);
                t4b.setText("5");
                t4b.setEditable(false);
                t46.setText("D");
                t46.setEditable(false);
                //Sexto bloco
                t5f.setText("9");
                t5f.setEditable(false);
                t51.setText("4");
                t51.setEditable(false);
                t55.setText("0");
                t55.setEditable(false);
                t5b.setText("C");
                t5b.setEditable(false);
                t53.setText("5");
                t53.setEditable(false);
                t5e.setText("D");
                t5e.setEditable(false);
                //Sétimo bloco
                t63.setText("9");
                t63.setEditable(false);
                t6d.setText("4");
                t6d.setEditable(false);
                t69.setText("0");
                t69.setEditable(false);
                t67.setText("C");
                t67.setEditable(false);
                t6f.setText("5");
                t6f.setEditable(false);
                t62.setText("D");
                t62.setEditable(false);
                //Óitavo bloco
                t7b.setText("9");
                t7b.setEditable(false);
                t75.setText("4");
                t75.setEditable(false);
                t7d.setText("0");
                t7d.setEditable(false);
                t73.setText("C");
                t73.setEditable(false);
                t77.setText("5");
                t77.setEditable(false);
                t7a.setText("D");
                t7a.setEditable(false);
                //Nono bloco
                t84.setText("9");
                t84.setEditable(false);
                t8a.setText("4");
                t8a.setEditable(false);
                t82.setText("0");
                t82.setEditable(false);
                t8e.setText("C");
                t8e.setEditable(false);
                t88.setText("5");
                t88.setEditable(false);
                t8f.setText("D");
                t8f.setEditable(false);
                //Décimo bloco
                t9c.setText("9");
                t9c.setEditable(false);
                t92.setText("4");
                t92.setEditable(false);
                t96.setText("0");
                t96.setEditable(false);
                t9a.setText("C");
                t9a.setEditable(false);
                t90.setText("5");
                t90.setEditable(false);
                t9b.setText("D");
                t9b.setEditable(false);
                //Décimo Primeiro bloco
                ta0.setText("9");
                ta0.setEditable(false);
                tae.setText("4");
                tae.setEditable(false);
                taa.setText("0");
                taa.setEditable(false);
                ta6.setText("C");
                ta6.setEditable(false);
                tac.setText("5");
                tac.setEditable(false);
                ta7.setText("D");
                ta7.setEditable(false);
                //Décimo Segundo bloco
                tb8.setText("9");
                tb8.setEditable(false);
                tb6.setText("4");
                tb6.setEditable(false);
                tbe.setText("0");
                tbe.setEditable(false);
                tb2.setText("C");
                tb2.setEditable(false);
                tb4.setText("5");
                tb4.setEditable(false);
                tb3.setText("D");
                tb3.setEditable(false);
                //Décimo Terceiro bloco
                tc6.setText("9");
                tc6.setEditable(false);
                tcb.setText("4");
                tcb.setEditable(false);
                tc3.setText("0");
                tc3.setEditable(false);
                tcd.setText("C");
                tcd.setEditable(false);
                tca.setText("5");
                tca.setEditable(false);
                tc4.setText("D");
                tc4.setEditable(false);
                //Décimo Quarto bloco
                tde.setText("9");
                tde.setEditable(false);
                td3.setText("4");
                td3.setEditable(false);
                td7.setText("0");
                td7.setEditable(false);
                td9.setText("C");
                td9.setEditable(false);
                td2.setText("5");
                td2.setEditable(false);
                tdc.setText("D");
                tdc.setEditable(false);
                //Décimo Quinto bloco
                te2.setText("9");
                te2.setEditable(false);
                tef.setText("4");
                tef.setEditable(false);
                teb.setText("0");
                teb.setEditable(false);
                te5.setText("C");
                te5.setEditable(false);
                tee.setText("5");
                tee.setEditable(false);
                te0.setText("D");
                te0.setEditable(false);
                //Décimo Sexto bloco
                tfa.setText("9");
                tfa.setEditable(false);
                tf7.setText("4");
                tf7.setEditable(false);
                tff.setText("0");
                tff.setEditable(false);
                tf1.setText("C");
                tf1.setEditable(false);
                tf6.setText("5");
                tf6.setEditable(false);
                tf8.setText("D");
                tf8.setEditable(false);
    }
    
    @FXML
    public void mediumsolution(){
        //Primeiro bloco
                t0f.setText("F");
                t0f.setEditable(false);
                t04.setText("8");
                t04.setEditable(false);
                t0a.setText("6");
                t0a.setEditable(false);
                t02.setText("2");
                t02.setEditable(false);
                //Segundo bloco
                t1b.setText("F");
                t1b.setEditable(false);
                t1c.setText("8");
                t1c.setEditable(false);
                t12.setText("6");
                t12.setEditable(false);
                t16.setText("2");
                t16.setEditable(false);
                //Terceiro bloco
                t27.setText("F");
                t27.setEditable(false);
                t20.setText("8");
                t20.setEditable(false);
                t2e.setText("6");
                t2e.setEditable(false);
                t2a.setText("2");
                t2a.setEditable(false);
                //Quarto bloco
                t33.setText("F");
                t33.setEditable(false);
                t38.setText("8");
                t38.setEditable(false);
                t36.setText("6");
                t36.setEditable(false);
                t3e.setText("2");
                t3e.setEditable(false);
                //Quinto bloco
                t4d.setText("F");
                t4d.setEditable(false);
                t45.setText("8");
                t45.setEditable(false);
                t48.setText("6");
                t48.setEditable(false);
                t40.setText("2");
                t40.setEditable(false);
                //Sexto bloco
                t5a.setText("F");
                t5a.setEditable(false);
                t5d.setText("8");
                t5d.setEditable(false);
                t50.setText("6");
                t50.setEditable(false);
                t54.setText("2");
                t54.setEditable(false);
                //Sétimo bloco
                t66.setText("F");
                t66.setEditable(false);
                t61.setText("8");
                t61.setEditable(false);
                t6c.setText("6");
                t6c.setEditable(false);
                t68.setText("2");
                t68.setEditable(false);
                //Oitavo bloco
                t72.setText("F");
                t72.setEditable(false);
                t79.setText("8");
                t79.setEditable(false);
                t74.setText("6");
                t74.setEditable(false);
                t7c.setText("2");
                t7c.setEditable(false);
                //Nono bloco
                t8c.setText("F");
                t8c.setEditable(false);
                t86.setText("8");
                t86.setEditable(false);
                t8b.setText("6");
                t8b.setEditable(false);
                t83.setText("2");
                t83.setEditable(false);
                //Décimo bloco
                t99.setText("F");
                t99.setEditable(false);
                t98.setText("8");
                t98.setEditable(false);
                t93.setText("6");
                t93.setEditable(false);
                t97.setText("2");
                t97.setEditable(false);
                //Décimo Primeiro bloco
                ta5.setText("F");
                ta5.setEditable(false);
                ta2.setText("8");
                ta2.setEditable(false);
                taf.setText("6");
                taf.setEditable(false);
                tab.setText("2");
                tab.setEditable(false);
                //Décimo Segundo bloco
                tb1.setText("F");
                tb1.setEditable(false);
                tba.setText("8");
                tba.setEditable(false);
                tb7.setText("6");
                tb7.setEditable(false);
                tbf.setText("2");
                tbf.setEditable(false);
                //Décimo Terceiro bloco
                tce.setText("F");
                tce.setEditable(false);
                tc7.setText("8");
                tc7.setEditable(false);
                tc9.setText("6");
                tc9.setEditable(false);
                tc1.setText("2");
                tc1.setEditable(false);
                //Décimo Quarto bloco
                td8.setText("F");
                td8.setEditable(false);
                tdf.setText("8");
                tdf.setEditable(false);
                td1.setText("6");
                td1.setEditable(false);
                td5.setText("2");
                td5.setEditable(false);
                //Décimo Quinto bloco
                te4.setText("F");
                te4.setEditable(false);
                te3.setText("8");
                te3.setEditable(false);
                ted.setText("6");
                ted.setEditable(false);
                te9.setText("2");
                te9.setEditable(false);
                //Décimo Quinto bloco
                tf0.setText("F");
                tf0.setEditable(false);
                tfb.setText("8");
                tfb.setEditable(false);
                tf5.setText("6");
                tf5.setEditable(false);
                tfd.setText("2");
                tfd.setEditable(false);
    }
    
    @FXML
    public void hardsolution(){
        //Primeiro bloco
            t08.setText("4");
            t08.setEditable(false);
            t07.setText("B");
            t07.setEditable(false);
            //Segundo bloco
            t10.setText("4");
            t10.setEditable(false);
            t1f.setText("B");
            t1f.setEditable(false);
            //Terceiro bloco
            t2c.setText("4");
            t2c.setEditable(false);
            t23.setText("B");
            t23.setEditable(false);
            //Quarto bloco
            t34.setText("4");
            t34.setEditable(false);
            t3b.setText("B");
            t3b.setEditable(false);
            //Quinto bloco
            t49.setText("4");
            t49.setEditable(false);
            t4e.setText("B");
            t4e.setEditable(false);
            //Sexto bloco
            t51.setText("4");
            t51.setEditable(false);
            t59.setText("B");
            t59.setEditable(false);
            //Sétimo bloco
            t6d.setText("4");
            t6d.setEditable(false);
            t65.setText("B");
            t65.setEditable(false);
            //Oitavo bloco
            t75.setText("4");
            t75.setEditable(false);
            t71.setText("B");
            t71.setEditable(false);
            //Nono bloco
            t8a.setText("4");
            t8a.setEditable(false);
            t8c.setText("B");
            t8c.setEditable(false);
            //Décimo bloco
            t92.setText("4");
            t92.setEditable(false);
            t98.setText("B");
            t98.setEditable(false);
            //Décimo Primeiro bloco
            tae.setText("4");
            tae.setEditable(false);
            ta4.setText("B");
            ta4.setEditable(false);
            //Décimo Segundo bloco
            tb6.setText("4");
            tb6.setEditable(false);
            tb0.setText("B");
            tb0.setEditable(false);
            //Décimo Terceiro bloco
            tcb.setText("4");
            tcb.setEditable(false);
            tcd.setText("B");
            tcd.setEditable(false);
            //Décimo Quarto bloco
            td3.setText("4");
            td3.setEditable(false);
            tda.setText("B");
            tda.setEditable(false);
            //Décimo Quinto bloco
            tef.setText("4");
            tef.setEditable(false);
            te6.setText("B");
            te6.setEditable(false);
            //Décimo Sexto bloco
            tf7.setText("4");
            tf7.setEditable(false);
            tf2.setText("B");
            tf2.setEditable(false);
    }
    
        @FXML
    public void clearTable(){
        t00.setText("");
        t01.setText("");
        t02.setText("");
        t03.setText("");
        t04.setText("");
        t05.setText("");
        t06.setText("");
        t07.setText("");
        t08.setText("");
        t09.setText("");
        t0a.setText("");
        t0b.setText("");
        t0c.setText("");
        t0d.setText("");
        t0e.setText("");
        t0f.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
        t13.setText("");
        t14.setText("");
        t15.setText("");
        t16.setText("");
        t17.setText("");
        t18.setText("");
        t19.setText("");
        t1a.setText("");
        t1b.setText("");
        t1c.setText("");
        t1d.setText("");
        t1e.setText("");
        t1f.setText("");
        t20.setText("");
        t21.setText("");
        t22.setText("");
        t23.setText("");
        t24.setText("");
        t25.setText("");
        t26.setText("");
        t27.setText("");
        t28.setText("");
        t29.setText("");
        t2a.setText("");
        t2b.setText("");
        t2c.setText("");
        t2d.setText("");
        t2e.setText("");
        t2f.setText("");
        t30.setText("");
        t31.setText("");
        t32.setText("");
        t33.setText("");
        t34.setText("");
        t35.setText("");
        t36.setText("");
        t37.setText("");
        t38.setText("");
        t39.setText("");
        t3a.setText("");
        t3b.setText("");
        t3c.setText("");
        t3d.setText("");
        t3e.setText("");
        t3f.setText("");
        t40.setText("");
        t41.setText("");
        t42.setText("");
        t43.setText("");
        t44.setText("");
        t45.setText("");
        t46.setText("");
        t47.setText("");
        t48.setText("");
        t49.setText("");
        t4a.setText("");
        t4b.setText("");
        t4c.setText("");
        t4d.setText("");
        t4e.setText("");
        t4f.setText("");
        t50.setText("");
        t51.setText("");
        t52.setText("");
        t53.setText("");
        t54.setText("");
        t55.setText("");
        t56.setText("");
        t57.setText("");
        t58.setText("");
        t59.setText("");
        t5a.setText("");
        t5b.setText("");
        t5c.setText("");
        t5d.setText("");
        t5e.setText("");
        t5f.setText("");
        t60.setText("");
        t61.setText("");
        t62.setText("");
        t63.setText("");
        t64.setText("");
        t65.setText("");
        t66.setText("");
        t67.setText("");
        t68.setText("");
        t69.setText("");
        t6a.setText("");
        t6b.setText("");
        t6c.setText("");
        t6d.setText("");
        t6e.setText("");
        t6f.setText("");
        t70.setText("");
        t71.setText("");
        t72.setText("");
        t73.setText("");
        t74.setText("");
        t75.setText("");
        t76.setText("");
        t77.setText("");
        t78.setText("");
        t79.setText("");
        t7a.setText("");
        t7b.setText("");
        t7c.setText("");
        t7d.setText("");
        t7e.setText("");
        t7f.setText("");
        t80.setText("");
        t81.setText("");
        t82.setText("");
        t83.setText("");
        t84.setText("");
        t85.setText("");
        t86.setText("");
        t87.setText("");
        t88.setText("");
        t89.setText("");
        t8a.setText("");
        t8b.setText("");
        t8c.setText("");
        t8d.setText("");
        t8e.setText("");
        t8f.setText("");
        t90.setText("");
        t91.setText("");
        t92.setText("");
        t93.setText("");
        t94.setText("");
        t95.setText("");
        t96.setText("");
        t97.setText("");
        t98.setText("");
        t99.setText("");
        t9a.setText("");
        t9b.setText("");
        t9c.setText("");
        t9d.setText("");
        t9e.setText("");
        t9f.setText("");
        ta0.setText("");
        ta1.setText("");
        ta2.setText("");
        ta3.setText("");
        ta4.setText("");
        ta5.setText("");
        ta6.setText("");
        ta7.setText("");
        ta8.setText("");
        ta9.setText("");
        taa.setText("");
        tab.setText("");
        tac.setText("");
        tad.setText("");
        tae.setText("");
        taf.setText("");
        tb0.setText("");
        tb1.setText("");
        tb2.setText("");
        tb3.setText("");
        tb4.setText("");
        tb5.setText("");
        tb6.setText("");
        tb7.setText("");
        tb8.setText("");
        tb9.setText("");
        tba.setText("");
        tbb.setText("");
        tbc.setText("");
        tbd.setText("");
        tbe.setText("");
        tbf.setText("");
        tc0.setText("");
        tc1.setText("");
        tc2.setText("");
        tc3.setText("");
        tc4.setText("");
        tc5.setText("");
        tc6.setText("");
        tc7.setText("");
        tc8.setText("");
        tc9.setText("");
        tca.setText("");
        tcb.setText("");
        tcc.setText("");
        tcd.setText("");
        tce.setText("");
        tcf.setText("");
        td0.setText("");
        td1.setText("");
        td2.setText("");
        td3.setText("");
        td4.setText("");
        td5.setText("");
        td6.setText("");
        td7.setText("");
        td8.setText("");
        td9.setText("");
        tda.setText("");
        tdb.setText("");
        tdc.setText("");
        tdd.setText("");
        tde.setText("");
        tdf.setText("");
        te0.setText("");
        te1.setText("");
        te2.setText("");
        te3.setText("");
        te4.setText("");
        te5.setText("");
        te6.setText("");
        te7.setText("");
        te8.setText("");
        te9.setText("");
        tea.setText("");
        teb.setText("");
        tec.setText("");
        ted.setText("");
        tee.setText("");
        tef.setText("");
        tf0.setText("");
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        tf7.setText("");
        tf8.setText("");
        tf9.setText("");
        tfa.setText("");
        tfb.setText("");
        tfc.setText("");
        tfd.setText("");
        tfe.setText("");
        tff.setText("");
    }
    
    @FXML
    public void unlockTable(){
        t00.setEditable(true);
        t01.setEditable(true);
        t02.setEditable(true);
        t03.setEditable(true);
        t04.setEditable(true);
        t05.setEditable(true);
        t06.setEditable(true);
        t07.setEditable(true);
        t08.setEditable(true);
        t09.setEditable(true);
        t0a.setEditable(true);
        t0b.setEditable(true);
        t0c.setEditable(true);
        t0d.setEditable(true);
        t0e.setEditable(true);
        t0f.setEditable(true);
        t10.setEditable(true);
        t11.setEditable(true);
        t12.setEditable(true);
        t13.setEditable(true);
        t14.setEditable(true);
        t15.setEditable(true);
        t16.setEditable(true);
        t17.setEditable(true);
        t18.setEditable(true);
        t19.setEditable(true);
        t1a.setEditable(true);
        t1b.setEditable(true);
        t1c.setEditable(true);
        t1d.setEditable(true);
        t1e.setEditable(true);
        t1f.setEditable(true);
        t20.setEditable(true);
        t21.setEditable(true);
        t22.setEditable(true);
        t23.setEditable(true);
        t24.setEditable(true);
        t25.setEditable(true);
        t26.setEditable(true);
        t27.setEditable(true);
        t28.setEditable(true);
        t29.setEditable(true);
        t2a.setEditable(true);
        t2b.setEditable(true);
        t2c.setEditable(true);
        t2d.setEditable(true);
        t2e.setEditable(true);
        t2f.setEditable(true);
        t30.setEditable(true);
        t31.setEditable(true);
        t32.setEditable(true);
        t33.setEditable(true);
        t34.setEditable(true);
        t35.setEditable(true);
        t36.setEditable(true);
        t37.setEditable(true);
        t38.setEditable(true);
        t39.setEditable(true);
        t3a.setEditable(true);
        t3b.setEditable(true);
        t3c.setEditable(true);
        t3d.setEditable(true);
        t3e.setEditable(true);
        t3f.setEditable(true);
        t40.setEditable(true);
        t41.setEditable(true);
        t42.setEditable(true);
        t43.setEditable(true);
        t44.setEditable(true);
        t45.setEditable(true);
        t46.setEditable(true);
        t47.setEditable(true);
        t48.setEditable(true);
        t49.setEditable(true);
        t4a.setEditable(true);
        t4b.setEditable(true);
        t4c.setEditable(true);
        t4d.setEditable(true);
        t4e.setEditable(true);
        t4f.setEditable(true);
        t50.setEditable(true);
        t51.setEditable(true);
        t52.setEditable(true);
        t53.setEditable(true);
        t54.setEditable(true);
        t55.setEditable(true);
        t56.setEditable(true);
        t57.setEditable(true);
        t58.setEditable(true);
        t59.setEditable(true);
        t5a.setEditable(true);
        t5b.setEditable(true);
        t5c.setEditable(true);
        t5d.setEditable(true);
        t5e.setEditable(true);
        t5f.setEditable(true);
        t60.setEditable(true);
        t61.setEditable(true);
        t62.setEditable(true);
        t63.setEditable(true);
        t64.setEditable(true);
        t65.setEditable(true);
        t66.setEditable(true);
        t67.setEditable(true);
        t68.setEditable(true);
        t69.setEditable(true);
        t6a.setEditable(true);
        t6b.setEditable(true);
        t6c.setEditable(true);
        t6d.setEditable(true);
        t6e.setEditable(true);
        t6f.setEditable(true);
        t70.setEditable(true);
        t71.setEditable(true);
        t72.setEditable(true);
        t73.setEditable(true);
        t74.setEditable(true);
        t75.setEditable(true);
        t76.setEditable(true);
        t77.setEditable(true);
        t78.setEditable(true);
        t79.setEditable(true);
        t7a.setEditable(true);
        t7b.setEditable(true);
        t7c.setEditable(true);
        t7d.setEditable(true);
        t7e.setEditable(true);
        t7f.setEditable(true);
        t80.setEditable(true);
        t81.setEditable(true);
        t82.setEditable(true);
        t83.setEditable(true);
        t84.setEditable(true);
        t85.setEditable(true);
        t86.setEditable(true);
        t87.setEditable(true);
        t88.setEditable(true);
        t89.setEditable(true);
        t8a.setEditable(true);
        t8b.setEditable(true);
        t8c.setEditable(true);
        t8d.setEditable(true);
        t8e.setEditable(true);
        t8f.setEditable(true);
        t90.setEditable(true);
        t91.setEditable(true);
        t92.setEditable(true);
        t93.setEditable(true);
        t94.setEditable(true);
        t95.setEditable(true);
        t96.setEditable(true);
        t97.setEditable(true);
        t98.setEditable(true);
        t99.setEditable(true);
        t9a.setEditable(true);
        t9b.setEditable(true);
        t9c.setEditable(true);
        t9d.setEditable(true);
        t9e.setEditable(true);
        t9f.setEditable(true);
        ta0.setEditable(true);
        ta1.setEditable(true);
        ta2.setEditable(true);
        ta3.setEditable(true);
        ta4.setEditable(true);
        ta5.setEditable(true);
        ta6.setEditable(true);
        ta7.setEditable(true);
        ta8.setEditable(true);
        ta9.setEditable(true);
        taa.setEditable(true);
        tab.setEditable(true);
        tac.setEditable(true);
        tad.setEditable(true);
        tae.setEditable(true);
        taf.setEditable(true);
        tb0.setEditable(true);
        tb1.setEditable(true);
        tb2.setEditable(true);
        tb3.setEditable(true);
        tb4.setEditable(true);
        tb5.setEditable(true);
        tb6.setEditable(true);
        tb7.setEditable(true);
        tb8.setEditable(true);
        tb9.setEditable(true);
        tba.setEditable(true);
        tbb.setEditable(true);
        tbc.setEditable(true);
        tbd.setEditable(true);
        tbe.setEditable(true);
        tbf.setEditable(true);
        tc0.setEditable(true);
        tc1.setEditable(true);
        tc2.setEditable(true);
        tc3.setEditable(true);
        tc4.setEditable(true);
        tc5.setEditable(true);
        tc6.setEditable(true);
        tc7.setEditable(true);
        tc8.setEditable(true);
        tc9.setEditable(true);
        tca.setEditable(true);
        tcb.setEditable(true);
        tcc.setEditable(true);
        tcd.setEditable(true);
        tce.setEditable(true);
        tcf.setEditable(true);
        td0.setEditable(true);
        td1.setEditable(true);
        td2.setEditable(true);
        td3.setEditable(true);
        td4.setEditable(true);
        td5.setEditable(true);
        td6.setEditable(true);
        td7.setEditable(true);
        td8.setEditable(true);
        td9.setEditable(true);
        tda.setEditable(true);
        tdb.setEditable(true);
        tdc.setEditable(true);
        tdd.setEditable(true);
        tde.setEditable(true);
        tdf.setEditable(true);
        te0.setEditable(true);
        te1.setEditable(true);
        te2.setEditable(true);
        te3.setEditable(true);
        te4.setEditable(true);
        te5.setEditable(true);
        te6.setEditable(true);
        te7.setEditable(true);
        te8.setEditable(true);
        te9.setEditable(true);
        tea.setEditable(true);
        teb.setEditable(true);
        tec.setEditable(true);
        ted.setEditable(true);
        tee.setEditable(true);
        tef.setEditable(true);
        tf0.setEditable(true);
        tf1.setEditable(true);
        tf2.setEditable(true);
        tf3.setEditable(true);
        tf4.setEditable(true);
        tf5.setEditable(true);
        tf6.setEditable(true);
        tf7.setEditable(true);
        tf8.setEditable(true);
        tf9.setEditable(true);
        tfa.setEditable(true);
        tfb.setEditable(true);
        tfc.setEditable(true);
        tfd.setEditable(true);
        tfe.setEditable(true);
        tff.setEditable(true);
    }
    
    @FXML
    public void blockTable(){
        t00.setEditable(false);
        t01.setEditable(false);
        t02.setEditable(false);
        t03.setEditable(false);
        t04.setEditable(false);
        t05.setEditable(false);
        t06.setEditable(false);
        t07.setEditable(false);
        t08.setEditable(false);
        t09.setEditable(false);
        t0a.setEditable(false);
        t0b.setEditable(false);
        t0c.setEditable(false);
        t0d.setEditable(false);
        t0e.setEditable(false);
        t0f.setEditable(false);
        t10.setEditable(false);
        t11.setEditable(false);
        t12.setEditable(false);
        t13.setEditable(false);
        t14.setEditable(false);
        t15.setEditable(false);
        t16.setEditable(false);
        t17.setEditable(false);
        t18.setEditable(false);
        t19.setEditable(false);
        t1a.setEditable(false);
        t1b.setEditable(false);
        t1c.setEditable(false);
        t1d.setEditable(false);
        t1e.setEditable(false);
        t1f.setEditable(false);
        t20.setEditable(false);
        t21.setEditable(false);
        t22.setEditable(false);
        t23.setEditable(false);
        t24.setEditable(false);
        t25.setEditable(false);
        t26.setEditable(false);
        t27.setEditable(false);
        t28.setEditable(false);
        t29.setEditable(false);
        t2a.setEditable(false);
        t2b.setEditable(false);
        t2c.setEditable(false);
        t2d.setEditable(false);
        t2e.setEditable(false);
        t2f.setEditable(false);
        t30.setEditable(false);
        t31.setEditable(false);
        t32.setEditable(false);
        t33.setEditable(false);
        t34.setEditable(false);
        t35.setEditable(false);
        t36.setEditable(false);
        t37.setEditable(false);
        t38.setEditable(false);
        t39.setEditable(false);
        t3a.setEditable(false);
        t3b.setEditable(false);
        t3c.setEditable(false);
        t3d.setEditable(false);
        t3e.setEditable(false);
        t3f.setEditable(false);
        t40.setEditable(false);
        t41.setEditable(false);
        t42.setEditable(false);
        t43.setEditable(false);
        t44.setEditable(false);
        t45.setEditable(false);
        t46.setEditable(false);
        t47.setEditable(false);
        t48.setEditable(false);
        t49.setEditable(false);
        t4a.setEditable(false);
        t4b.setEditable(false);
        t4c.setEditable(false);
        t4d.setEditable(false);
        t4e.setEditable(false);
        t4f.setEditable(false);
        t50.setEditable(false);
        t51.setEditable(false);
        t52.setEditable(false);
        t53.setEditable(false);
        t54.setEditable(false);
        t55.setEditable(false);
        t56.setEditable(false);
        t57.setEditable(false);
        t58.setEditable(false);
        t59.setEditable(false);
        t5a.setEditable(false);
        t5b.setEditable(false);
        t5c.setEditable(false);
        t5d.setEditable(false);
        t5e.setEditable(false);
        t5f.setEditable(false);
        t60.setEditable(false);
        t61.setEditable(false);
        t62.setEditable(false);
        t63.setEditable(false);
        t64.setEditable(false);
        t65.setEditable(false);
        t66.setEditable(false);
        t67.setEditable(false);
        t68.setEditable(false);
        t69.setEditable(false);
        t6a.setEditable(false);
        t6b.setEditable(false);
        t6c.setEditable(false);
        t6d.setEditable(false);
        t6e.setEditable(false);
        t6f.setEditable(false);
        t70.setEditable(false);
        t71.setEditable(false);
        t72.setEditable(false);
        t73.setEditable(false);
        t74.setEditable(false);
        t75.setEditable(false);
        t76.setEditable(false);
        t77.setEditable(false);
        t78.setEditable(false);
        t79.setEditable(false);
        t7a.setEditable(false);
        t7b.setEditable(false);
        t7c.setEditable(false);
        t7d.setEditable(false);
        t7e.setEditable(false);
        t7f.setEditable(false);
        t80.setEditable(false);
        t81.setEditable(false);
        t82.setEditable(false);
        t83.setEditable(false);
        t84.setEditable(false);
        t85.setEditable(false);
        t86.setEditable(false);
        t87.setEditable(false);
        t88.setEditable(false);
        t89.setEditable(false);
        t8a.setEditable(false);
        t8b.setEditable(false);
        t8c.setEditable(false);
        t8d.setEditable(false);
        t8e.setEditable(false);
        t8f.setEditable(false);
        t90.setEditable(false);
        t91.setEditable(false);
        t92.setEditable(false);
        t93.setEditable(false);
        t94.setEditable(false);
        t95.setEditable(false);
        t96.setEditable(false);
        t97.setEditable(false);
        t98.setEditable(false);
        t99.setEditable(false);
        t9a.setEditable(false);
        t9b.setEditable(false);
        t9c.setEditable(false);
        t9d.setEditable(false);
        t9e.setEditable(false);
        t9f.setEditable(false);
        ta0.setEditable(false);
        ta1.setEditable(false);
        ta2.setEditable(false);
        ta3.setEditable(false);
        ta4.setEditable(false);
        ta5.setEditable(false);
        ta6.setEditable(false);
        ta7.setEditable(false);
        ta8.setEditable(false);
        ta9.setEditable(false);
        taa.setEditable(false);
        tab.setEditable(false);
        tac.setEditable(false);
        tad.setEditable(false);
        tae.setEditable(false);
        taf.setEditable(false);
        tb0.setEditable(false);
        tb1.setEditable(false);
        tb2.setEditable(false);
        tb3.setEditable(false);
        tb4.setEditable(false);
        tb5.setEditable(false);
        tb6.setEditable(false);
        tb7.setEditable(false);
        tb8.setEditable(false);
        tb9.setEditable(false);
        tba.setEditable(false);
        tbb.setEditable(false);
        tbc.setEditable(false);
        tbd.setEditable(false);
        tbe.setEditable(false);
        tbf.setEditable(false);
        tc0.setEditable(false);
        tc1.setEditable(false);
        tc2.setEditable(false);
        tc3.setEditable(false);
        tc4.setEditable(false);
        tc5.setEditable(false);
        tc6.setEditable(false);
        tc7.setEditable(false);
        tc8.setEditable(false);
        tc9.setEditable(false);
        tca.setEditable(false);
        tcb.setEditable(false);
        tcc.setEditable(false);
        tcd.setEditable(false);
        tce.setEditable(false);
        tcf.setEditable(false);
        td0.setEditable(false);
        td1.setEditable(false);
        td2.setEditable(false);
        td3.setEditable(false);
        td4.setEditable(false);
        td5.setEditable(false);
        td6.setEditable(false);
        td7.setEditable(false);
        td8.setEditable(false);
        td9.setEditable(false);
        tda.setEditable(false);
        tdb.setEditable(false);
        tdc.setEditable(false);
        tdd.setEditable(false);
        tde.setEditable(false);
        tdf.setEditable(false);
        te0.setEditable(false);
        te1.setEditable(false);
        te2.setEditable(false);
        te3.setEditable(false);
        te4.setEditable(false);
        te5.setEditable(false);
        te6.setEditable(false);
        te7.setEditable(false);
        te8.setEditable(false);
        te9.setEditable(false);
        tea.setEditable(false);
        teb.setEditable(false);
        tec.setEditable(false);
        ted.setEditable(false);
        tee.setEditable(false);
        tef.setEditable(false);
        tf0.setEditable(false);
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        tf5.setEditable(false);
        tf6.setEditable(false);
        tf7.setEditable(false);
        tf8.setEditable(false);
        tf9.setEditable(false);
        tfa.setEditable(false);
        tfb.setEditable(false);
        tfc.setEditable(false);
        tfd.setEditable(false);
        tfe.setEditable(false);
        tff.setEditable(false);
    }
    
    @FXML
    public boolean checkSquare(){
        ArrayList<String> q0_elem = new ArrayList<String>();
        q0_elem.add(t00.getText());
        q0_elem.add(t01.getText());
        q0_elem.add(t02.getText());
        q0_elem.add(t03.getText());
        q0_elem.add(t04.getText());
        q0_elem.add(t05.getText());
        q0_elem.add(t06.getText());
        q0_elem.add(t07.getText());
        q0_elem.add(t08.getText());
        q0_elem.add(t09.getText());
        q0_elem.add(t0a.getText());
        q0_elem.add(t0b.getText());
        q0_elem.add(t0c.getText());
        q0_elem.add(t0d.getText());
        q0_elem.add(t0e.getText());
        q0_elem.add(t0f.getText());
        if((q0_elem.contains("0")) && (q0_elem.contains("1")) && (q0_elem.contains("2")) && (q0_elem.contains("3")) && (q0_elem.contains("4")) && (q0_elem.contains("5")) && 
                (q0_elem.contains("6")) && (q0_elem.contains("7")) && (q0_elem.contains("8")) && (q0_elem.contains("9")) && (q0_elem.contains("A")) && (q0_elem.contains("B")) && 
                (q0_elem.contains("C")) && (q0_elem.contains("D")) && (q0_elem.contains("E")) && (q0_elem.contains("F"))){
            
                    ArrayList<String> q1_elem = new ArrayList<String>();
                    q1_elem.add(t10.getText());
                    q1_elem.add(t11.getText());
                    q1_elem.add(t12.getText());
                    q1_elem.add(t13.getText());
                    q1_elem.add(t14.getText());
                    q1_elem.add(t15.getText());
                    q1_elem.add(t16.getText());
                    q1_elem.add(t17.getText());
                    q1_elem.add(t18.getText());
                    q1_elem.add(t19.getText());
                    q1_elem.add(t1a.getText());
                    q1_elem.add(t1b.getText());
                    q1_elem.add(t1c.getText());
                    q1_elem.add(t1d.getText());
                    q1_elem.add(t1e.getText());
                    q1_elem.add(t1f.getText());
                    if((q1_elem.contains("0")) && (q1_elem.contains("1")) && (q1_elem.contains("2")) && (q1_elem.contains("3")) && (q1_elem.contains("4")) && (q1_elem.contains("5")) && 
                            (q1_elem.contains("6")) && (q1_elem.contains("7")) && (q1_elem.contains("8")) && (q1_elem.contains("9")) && (q1_elem.contains("A")) && (q1_elem.contains("B")) && 
                            (q1_elem.contains("C")) && (q1_elem.contains("D")) && (q1_elem.contains("E")) && (q1_elem.contains("F"))){

                        ArrayList<String> q2_elem = new ArrayList<String>();
                        q2_elem.add(t20.getText());
                        q2_elem.add(t21.getText());
                        q2_elem.add(t22.getText());
                        q2_elem.add(t23.getText());
                        q2_elem.add(t24.getText());
                        q2_elem.add(t25.getText());
                        q2_elem.add(t26.getText());
                        q2_elem.add(t27.getText());
                        q2_elem.add(t28.getText());
                        q2_elem.add(t29.getText());
                        q2_elem.add(t2a.getText());
                        q2_elem.add(t2b.getText());
                        q2_elem.add(t2c.getText());
                        q2_elem.add(t2d.getText());
                        q2_elem.add(t2e.getText());
                        q2_elem.add(t2f.getText());
                        if((q2_elem.contains("0")) && (q2_elem.contains("1")) && (q2_elem.contains("2")) && (q2_elem.contains("3")) && (q2_elem.contains("4")) && (q2_elem.contains("5")) && 
                                (q2_elem.contains("6")) && (q2_elem.contains("7")) && (q2_elem.contains("8")) && (q2_elem.contains("9")) && (q2_elem.contains("A")) && (q2_elem.contains("B")) && 
                                (q2_elem.contains("C")) && (q2_elem.contains("D")) && (q2_elem.contains("E")) && (q2_elem.contains("F"))){

                                ArrayList<String> q3_elem = new ArrayList<String>();
                                q3_elem.add(t30.getText());
                                q3_elem.add(t31.getText());
                                q3_elem.add(t32.getText());
                                q3_elem.add(t33.getText());
                                q3_elem.add(t34.getText());
                                q3_elem.add(t35.getText());
                                q3_elem.add(t36.getText());
                                q3_elem.add(t37.getText());
                                q3_elem.add(t38.getText());
                                q3_elem.add(t39.getText());
                                q3_elem.add(t3a.getText());
                                q3_elem.add(t3b.getText());
                                q3_elem.add(t3c.getText());
                                q3_elem.add(t3d.getText());
                                q3_elem.add(t3e.getText());
                                q3_elem.add(t3f.getText());
                                if((q3_elem.contains("0")) && (q3_elem.contains("1")) && (q3_elem.contains("2")) && (q3_elem.contains("3")) && (q3_elem.contains("4")) && (q3_elem.contains("5")) && 
                                        (q3_elem.contains("6")) && (q3_elem.contains("7")) && (q3_elem.contains("8")) && (q3_elem.contains("9")) && (q3_elem.contains("A")) && (q3_elem.contains("B")) && 
                                        (q3_elem.contains("C")) && (q3_elem.contains("D")) && (q3_elem.contains("E")) && (q3_elem.contains("F"))){

                                        ArrayList<String> q4_elem = new ArrayList<String>();
                                        q4_elem.add(t40.getText());
                                        q4_elem.add(t41.getText());
                                        q4_elem.add(t42.getText());
                                        q4_elem.add(t43.getText());
                                        q4_elem.add(t44.getText());
                                        q4_elem.add(t45.getText());
                                        q4_elem.add(t46.getText());
                                        q4_elem.add(t47.getText());
                                        q4_elem.add(t48.getText());
                                        q4_elem.add(t49.getText());
                                        q4_elem.add(t4a.getText());
                                        q4_elem.add(t4b.getText());
                                        q4_elem.add(t4c.getText());
                                        q4_elem.add(t4d.getText());
                                        q4_elem.add(t4e.getText());
                                        q4_elem.add(t4f.getText());
                                        if((q4_elem.contains("0")) && (q4_elem.contains("1")) && (q4_elem.contains("2")) && (q4_elem.contains("3")) && (q4_elem.contains("4")) && (q4_elem.contains("5")) && 
                                                (q4_elem.contains("6")) && (q4_elem.contains("7")) && (q4_elem.contains("8")) && (q4_elem.contains("9")) && (q4_elem.contains("A")) && (q4_elem.contains("B")) && 
                                                (q4_elem.contains("C")) && (q4_elem.contains("D")) && (q4_elem.contains("E")) && (q4_elem.contains("F"))){


                                                ArrayList<String> q5_elem = new ArrayList<String>();
                                                q5_elem.add(t50.getText());
                                                q5_elem.add(t51.getText());
                                                q5_elem.add(t52.getText());
                                                q5_elem.add(t53.getText());
                                                q5_elem.add(t54.getText());
                                                q5_elem.add(t55.getText());
                                                q5_elem.add(t56.getText());
                                                q5_elem.add(t57.getText());
                                                q5_elem.add(t58.getText());
                                                q5_elem.add(t59.getText());
                                                q5_elem.add(t5a.getText());
                                                q5_elem.add(t5b.getText());
                                                q5_elem.add(t5c.getText());
                                                q5_elem.add(t5d.getText());
                                                q5_elem.add(t5e.getText());
                                                q5_elem.add(t5f.getText());
                                                if((q5_elem.contains("0")) && (q5_elem.contains("1")) && (q5_elem.contains("2")) && (q5_elem.contains("3")) && (q5_elem.contains("4")) && (q5_elem.contains("5")) && 
                                                        (q5_elem.contains("6")) && (q5_elem.contains("7")) && (q5_elem.contains("8")) && (q5_elem.contains("9")) && (q5_elem.contains("A")) && (q5_elem.contains("B")) && 
                                                        (q5_elem.contains("C")) && (q5_elem.contains("D")) && (q5_elem.contains("E")) && (q5_elem.contains("F"))){

                                                        ArrayList<String> q6_elem = new ArrayList<String>();
                                                        q6_elem.add(t60.getText());
                                                        q6_elem.add(t61.getText());
                                                        q6_elem.add(t62.getText());
                                                        q6_elem.add(t63.getText());
                                                        q6_elem.add(t64.getText());
                                                        q6_elem.add(t65.getText());
                                                        q6_elem.add(t66.getText());
                                                        q6_elem.add(t67.getText());
                                                        q6_elem.add(t68.getText());
                                                        q6_elem.add(t69.getText());
                                                        q6_elem.add(t6a.getText());
                                                        q6_elem.add(t6b.getText());
                                                        q6_elem.add(t6c.getText());
                                                        q6_elem.add(t6d.getText());
                                                        q6_elem.add(t6e.getText());
                                                        q6_elem.add(t6f.getText());
                                                        if((q6_elem.contains("0")) && (q6_elem.contains("1")) && (q6_elem.contains("2")) && (q6_elem.contains("3")) && (q6_elem.contains("4")) && (q6_elem.contains("5")) && 
                                                                (q6_elem.contains("6")) && (q6_elem.contains("7")) && (q6_elem.contains("8")) && (q6_elem.contains("9")) && (q6_elem.contains("A")) && (q6_elem.contains("B")) && 
                                                                (q6_elem.contains("C")) && (q6_elem.contains("D")) && (q6_elem.contains("E")) && (q6_elem.contains("F"))){

                                                                ArrayList<String> q7_elem = new ArrayList<String>();
                                                                q7_elem.add(t70.getText());
                                                                q7_elem.add(t71.getText());
                                                                q7_elem.add(t72.getText());
                                                                q7_elem.add(t73.getText());
                                                                q7_elem.add(t74.getText());
                                                                q7_elem.add(t75.getText());
                                                                q7_elem.add(t76.getText());
                                                                q7_elem.add(t77.getText());
                                                                q7_elem.add(t78.getText());
                                                                q7_elem.add(t79.getText());
                                                                q7_elem.add(t7a.getText());
                                                                q7_elem.add(t7b.getText());
                                                                q7_elem.add(t7c.getText());
                                                                q7_elem.add(t7d.getText());
                                                                q7_elem.add(t7e.getText());
                                                                q7_elem.add(t7f.getText());
                                                                if((q7_elem.contains("0")) && (q7_elem.contains("1")) && (q7_elem.contains("2")) && (q7_elem.contains("3")) && (q7_elem.contains("4")) && (q7_elem.contains("5")) && 
                                                                        (q7_elem.contains("6")) && (q7_elem.contains("7")) && (q7_elem.contains("8")) && (q7_elem.contains("9")) && (q7_elem.contains("A")) && (q7_elem.contains("B")) && 
                                                                        (q7_elem.contains("C")) && (q7_elem.contains("D")) && (q7_elem.contains("E")) && (q7_elem.contains("F"))){

                                                                        ArrayList<String> q8_elem = new ArrayList<String>();
                                                                        q8_elem.add(t80.getText());
                                                                        q8_elem.add(t81.getText());
                                                                        q8_elem.add(t82.getText());
                                                                        q8_elem.add(t83.getText());
                                                                        q8_elem.add(t84.getText());
                                                                        q8_elem.add(t85.getText());
                                                                        q8_elem.add(t86.getText());
                                                                        q8_elem.add(t87.getText());
                                                                        q8_elem.add(t88.getText());
                                                                        q8_elem.add(t89.getText());
                                                                        q8_elem.add(t8a.getText());
                                                                        q8_elem.add(t8b.getText());
                                                                        q8_elem.add(t8c.getText());
                                                                        q8_elem.add(t8d.getText());
                                                                        q8_elem.add(t8e.getText());
                                                                        q8_elem.add(t8f.getText());
                                                                        if((q8_elem.contains("0")) && (q8_elem.contains("1")) && (q8_elem.contains("2")) && (q8_elem.contains("3")) && (q8_elem.contains("4")) && (q8_elem.contains("5")) && 
                                                                                (q8_elem.contains("6")) && (q8_elem.contains("7")) && (q8_elem.contains("8")) && (q8_elem.contains("9")) && (q8_elem.contains("A")) && (q8_elem.contains("B")) && 
                                                                                (q8_elem.contains("C")) && (q8_elem.contains("D")) && (q8_elem.contains("E")) && (q8_elem.contains("F"))){

                                                                                ArrayList<String> q9_elem = new ArrayList<String>();
                                                                                q9_elem.add(t90.getText());
                                                                                q9_elem.add(t91.getText());
                                                                                q9_elem.add(t92.getText());
                                                                                q9_elem.add(t93.getText());
                                                                                q9_elem.add(t94.getText());
                                                                                q9_elem.add(t95.getText());
                                                                                q9_elem.add(t96.getText());
                                                                                q9_elem.add(t97.getText());
                                                                                q9_elem.add(t98.getText());
                                                                                q9_elem.add(t99.getText());
                                                                                q9_elem.add(t9a.getText());
                                                                                q9_elem.add(t9b.getText());
                                                                                q9_elem.add(t9c.getText());
                                                                                q9_elem.add(t9d.getText());
                                                                                q9_elem.add(t9e.getText());
                                                                                q9_elem.add(t9f.getText());
                                                                                if((q9_elem.contains("0")) && (q9_elem.contains("1")) && (q9_elem.contains("2")) && (q9_elem.contains("3")) && (q9_elem.contains("4")) && (q9_elem.contains("5")) && 
                                                                                        (q9_elem.contains("6")) && (q9_elem.contains("7")) && (q9_elem.contains("8")) && (q9_elem.contains("9")) && (q9_elem.contains("A")) && (q9_elem.contains("B")) && 
                                                                                        (q9_elem.contains("C")) && (q9_elem.contains("D")) && (q9_elem.contains("E")) && (q9_elem.contains("F"))){

                                                                                        ArrayList<String> qa_elem = new ArrayList<String>();
                                                                                        qa_elem.add(ta0.getText());
                                                                                        qa_elem.add(ta1.getText());
                                                                                        qa_elem.add(ta2.getText());
                                                                                        qa_elem.add(ta3.getText());
                                                                                        qa_elem.add(ta4.getText());
                                                                                        qa_elem.add(ta5.getText());
                                                                                        qa_elem.add(ta6.getText());
                                                                                        qa_elem.add(ta7.getText());
                                                                                        qa_elem.add(ta8.getText());
                                                                                        qa_elem.add(ta9.getText());
                                                                                        qa_elem.add(taa.getText());
                                                                                        qa_elem.add(tab.getText());
                                                                                        qa_elem.add(tac.getText());
                                                                                        qa_elem.add(tad.getText());
                                                                                        qa_elem.add(tae.getText());
                                                                                        qa_elem.add(taf.getText());
                                                                                        if((qa_elem.contains("0")) && (qa_elem.contains("1")) && (qa_elem.contains("2")) && (qa_elem.contains("3")) && (qa_elem.contains("4")) && (qa_elem.contains("5")) && 
                                                                                                (qa_elem.contains("6")) && (qa_elem.contains("7")) && (qa_elem.contains("8")) && (qa_elem.contains("9")) && (qa_elem.contains("A")) && (qa_elem.contains("B")) && 
                                                                                                (qa_elem.contains("C")) && (qa_elem.contains("D")) && (qa_elem.contains("E")) && (qa_elem.contains("F"))){

                                                                                                ArrayList<String> qb_elem = new ArrayList<String>();
                                                                                                qb_elem.add(tb0.getText());
                                                                                                qb_elem.add(tb1.getText());
                                                                                                qb_elem.add(tb2.getText());
                                                                                                qb_elem.add(tb3.getText());
                                                                                                qb_elem.add(tb4.getText());
                                                                                                qb_elem.add(tb5.getText());
                                                                                                qb_elem.add(tb6.getText());
                                                                                                qb_elem.add(tb7.getText());
                                                                                                qb_elem.add(tb8.getText());
                                                                                                qb_elem.add(tb9.getText());
                                                                                                qb_elem.add(tba.getText());
                                                                                                qb_elem.add(tbb.getText());
                                                                                                qb_elem.add(tbc.getText());
                                                                                                qb_elem.add(tbd.getText());
                                                                                                qb_elem.add(tbe.getText());
                                                                                                qb_elem.add(tbf.getText());
                                                                                                if((qb_elem.contains("0")) && (qb_elem.contains("1")) && (qb_elem.contains("2")) && (qb_elem.contains("3")) && (qb_elem.contains("4")) && (qb_elem.contains("5")) && 
                                                                                                        (qb_elem.contains("6")) && (qb_elem.contains("7")) && (qb_elem.contains("8")) && (qb_elem.contains("9")) && (qb_elem.contains("A")) && (qb_elem.contains("B")) && 
                                                                                                        (qb_elem.contains("C")) && (qb_elem.contains("D")) && (qb_elem.contains("E")) && (qb_elem.contains("F"))){

                                                                                                        ArrayList<String> qc_elem = new ArrayList<String>();
                                                                                                        qc_elem.add(tc0.getText());
                                                                                                        qc_elem.add(tc1.getText());
                                                                                                        qc_elem.add(tc2.getText());
                                                                                                        qc_elem.add(tc3.getText());
                                                                                                        qc_elem.add(tc4.getText());
                                                                                                        qc_elem.add(tc5.getText());
                                                                                                        qc_elem.add(tc6.getText());
                                                                                                        qc_elem.add(tc7.getText());
                                                                                                        qc_elem.add(tc8.getText());
                                                                                                        qc_elem.add(tc9.getText());
                                                                                                        qc_elem.add(tca.getText());
                                                                                                        qc_elem.add(tcb.getText());
                                                                                                        qc_elem.add(tcc.getText());
                                                                                                        qc_elem.add(tcd.getText());
                                                                                                        qc_elem.add(tce.getText());
                                                                                                        qc_elem.add(tcf.getText());
                                                                                                        if((qc_elem.contains("0")) && (qc_elem.contains("1")) && (qc_elem.contains("2")) && (qc_elem.contains("3")) && (qc_elem.contains("4")) && (qc_elem.contains("5")) && 
                                                                                                                (qc_elem.contains("6")) && (qc_elem.contains("7")) && (qc_elem.contains("8")) && (qc_elem.contains("9")) && (qc_elem.contains("A")) && (qc_elem.contains("B")) && 
                                                                                                                (qc_elem.contains("C")) && (qc_elem.contains("D")) && (qc_elem.contains("E")) && (qc_elem.contains("F"))){

                                                                                                                ArrayList<String> qd_elem = new ArrayList<String>();
                                                                                                                qd_elem.add(td0.getText());
                                                                                                                qd_elem.add(td1.getText());
                                                                                                                qd_elem.add(td2.getText());
                                                                                                                qd_elem.add(td3.getText());
                                                                                                                qd_elem.add(td4.getText());
                                                                                                                qd_elem.add(td5.getText());
                                                                                                                qd_elem.add(td6.getText());
                                                                                                                qd_elem.add(td7.getText());
                                                                                                                qd_elem.add(td8.getText());
                                                                                                                qd_elem.add(td9.getText());
                                                                                                                qd_elem.add(tda.getText());
                                                                                                                qd_elem.add(tdb.getText());
                                                                                                                qd_elem.add(tdc.getText());
                                                                                                                qd_elem.add(tdd.getText());
                                                                                                                qd_elem.add(tde.getText());
                                                                                                                qd_elem.add(tdf.getText());
                                                                                                                if((qd_elem.contains("0")) && (qd_elem.contains("1")) && (qd_elem.contains("2")) && (qd_elem.contains("3")) && (qd_elem.contains("4")) && (qd_elem.contains("5")) && 
                                                                                                                        (qd_elem.contains("6")) && (qd_elem.contains("7")) && (qd_elem.contains("8")) && (qd_elem.contains("9")) && (qd_elem.contains("A")) && (qd_elem.contains("B")) && 
                                                                                                                        (qd_elem.contains("C")) && (qd_elem.contains("D")) && (qd_elem.contains("E")) && (qd_elem.contains("F"))){

                                                                                                                        ArrayList<String> qe_elem = new ArrayList<String>();
                                                                                                                        qe_elem.add(te0.getText());
                                                                                                                        qe_elem.add(te1.getText());
                                                                                                                        qe_elem.add(te2.getText());
                                                                                                                        qe_elem.add(te3.getText());
                                                                                                                        qe_elem.add(te4.getText());
                                                                                                                        qe_elem.add(te5.getText());
                                                                                                                        qe_elem.add(te6.getText());
                                                                                                                        qe_elem.add(te7.getText());
                                                                                                                        qe_elem.add(te8.getText());
                                                                                                                        qe_elem.add(te9.getText());
                                                                                                                        qe_elem.add(tea.getText());
                                                                                                                        qe_elem.add(teb.getText());
                                                                                                                        qe_elem.add(tec.getText());
                                                                                                                        qe_elem.add(ted.getText());
                                                                                                                        qe_elem.add(tee.getText());
                                                                                                                        qe_elem.add(tef.getText());
                                                                                                                        if((qe_elem.contains("0")) && (qe_elem.contains("1")) && (qe_elem.contains("2")) && (qe_elem.contains("3")) && (qe_elem.contains("4")) && (qe_elem.contains("5")) && 
                                                                                                                                (qe_elem.contains("6")) && (qe_elem.contains("7")) && (qe_elem.contains("8")) && (qe_elem.contains("9")) && (qe_elem.contains("A")) && (qe_elem.contains("B")) && 
                                                                                                                                (qe_elem.contains("C")) && (qe_elem.contains("D")) && (qe_elem.contains("E")) && (qe_elem.contains("F"))){

                                                                                                                                ArrayList<String> qf_elem = new ArrayList<String>();
                                                                                                                                qf_elem.add(tf0.getText());
                                                                                                                                qf_elem.add(tf1.getText());
                                                                                                                                qf_elem.add(tf2.getText());
                                                                                                                                qf_elem.add(tf3.getText());
                                                                                                                                qf_elem.add(tf4.getText());
                                                                                                                                qf_elem.add(tf5.getText());
                                                                                                                                qf_elem.add(tf6.getText());
                                                                                                                                qf_elem.add(tf7.getText());
                                                                                                                                qf_elem.add(tf8.getText());
                                                                                                                                qf_elem.add(tf9.getText());
                                                                                                                                qf_elem.add(tfa.getText());
                                                                                                                                qf_elem.add(tfb.getText());
                                                                                                                                qf_elem.add(tfc.getText());
                                                                                                                                qf_elem.add(tfd.getText());
                                                                                                                                qf_elem.add(tfe.getText());
                                                                                                                                qf_elem.add(tff.getText());
                                                                                                                                if((qf_elem.contains("0")) && (qf_elem.contains("1")) && (qf_elem.contains("2")) && (qf_elem.contains("3")) && (qf_elem.contains("4")) && (qf_elem.contains("5")) && 
                                                                                                                                        (qf_elem.contains("6")) && (qf_elem.contains("7")) && (qf_elem.contains("8")) && (qf_elem.contains("9")) && (qf_elem.contains("A")) && (qf_elem.contains("B")) && 
                                                                                                                                        (qf_elem.contains("C")) && (qf_elem.contains("D")) && (qf_elem.contains("E")) && (qf_elem.contains("F"))){

                                                                                                                                        return true;

                                                                                                                                }
                                                                                                                                else{
                                                                                                                                    state_label.setText("Solução Errada!");
                                                                                                                                    return false;
                                                                                                                                }

                                                                                                                        }
                                                                                                                        else{
                                                                                                                            state_label.setText("Solução Errada!");
                                                                                                                            return false;
                                                                                                                        }

                                                                                                                }
                                                                                                                else{
                                                                                                                    state_label.setText("Solução Errada!");
                                                                                                                    return false;
                                                                                                                }

                                                                                                        }
                                                                                                        else{
                                                                                                            state_label.setText("Solução Errada!");
                                                                                                            return false;
                                                                                                        }

                                                                                                }
                                                                                                else{
                                                                                                    state_label.setText("Solução Errada!");
                                                                                                    return false;
                                                                                                }

                                                                                        }
                                                                                        else{
                                                                                            state_label.setText("Solução Errada!");
                                                                                            return false;
                                                                                        }

                                                                                }
                                                                                else{
                                                                                    state_label.setText("Solução Errada!");
                                                                                    return false;
                                                                                }

                                                                        }
                                                                        else{
                                                                            state_label.setText("Solução Errada!");
                                                                            return false;
                                                                        }

                                                                }
                                                                else{
                                                                    state_label.setText("Solução Errada!");
                                                                    return false;
                                                                }

                                                        }
                                                        else{
                                                            state_label.setText("Solução Errada!");
                                                            return false;
                                                        }


                                                }
                                                else{
                                                    state_label.setText("Solução Errada!");
                                                    return false;
                                                }

                                        }
                                        else{
                                            state_label.setText("Solução Errada!");
                                            return false;
                                        }

                                }
                                else{
                                    state_label.setText("Solução Errada!");
                                    return false;
                                }

                        }
                        else{
                            state_label.setText("Solução Errada!");
                            return false;
                        }
                    }
                    else{
                        state_label.setText("Solução Errada!");
                        return false;
                    }
            
        }
        else{
            state_label.setText("Solução Errada!");
            return false;
        }
    }
        
    @FXML
    public boolean checkLine(){
        ArrayList<String> l0_elem = new ArrayList<String>();
        l0_elem.add(t00.getText());
        l0_elem.add(t01.getText());
        l0_elem.add(t02.getText());
        l0_elem.add(t03.getText());
        l0_elem.add(t10.getText());
        l0_elem.add(t11.getText());
        l0_elem.add(t12.getText());
        l0_elem.add(t13.getText());
        l0_elem.add(t20.getText());
        l0_elem.add(t21.getText());
        l0_elem.add(t22.getText());
        l0_elem.add(t23.getText());
        l0_elem.add(t30.getText());
        l0_elem.add(t31.getText());
        l0_elem.add(t32.getText());
        l0_elem.add(t33.getText());
        
        if((l0_elem.contains("0")) && (l0_elem.contains("1")) && (l0_elem.contains("2")) && (l0_elem.contains("3")) && (l0_elem.contains("4")) && (l0_elem.contains("5")) && 
           (l0_elem.contains("6")) && (l0_elem.contains("7")) && (l0_elem.contains("8")) && (l0_elem.contains("9")) && (l0_elem.contains("A")) && (l0_elem.contains("B")) && 
           (l0_elem.contains("C")) && (l0_elem.contains("D")) && (l0_elem.contains("E")) && (l0_elem.contains("F"))){
            
            ArrayList<String> l1_elem = new ArrayList<String>();
            l1_elem.add(t04.getText());
            l1_elem.add(t05.getText());
            l1_elem.add(t06.getText());
            l1_elem.add(t07.getText());
            l1_elem.add(t14.getText());
            l1_elem.add(t15.getText());
            l1_elem.add(t16.getText());
            l1_elem.add(t17.getText());
            l1_elem.add(t24.getText());
            l1_elem.add(t25.getText());
            l1_elem.add(t26.getText());
            l1_elem.add(t27.getText());
            l1_elem.add(t34.getText());
            l1_elem.add(t35.getText());
            l1_elem.add(t36.getText());
            l1_elem.add(t37.getText());

            if((l1_elem.contains("0")) && (l1_elem.contains("1")) && (l1_elem.contains("2")) && (l1_elem.contains("3")) && (l1_elem.contains("4")) && (l1_elem.contains("5")) && 
               (l1_elem.contains("6")) && (l1_elem.contains("7")) && (l1_elem.contains("8")) && (l1_elem.contains("9")) && (l1_elem.contains("A")) && (l1_elem.contains("B")) && 
               (l1_elem.contains("C")) && (l1_elem.contains("D")) && (l1_elem.contains("E")) && (l1_elem.contains("F"))){

                ArrayList<String> l2_elem = new ArrayList<String>();
                l2_elem.add(t08.getText());
                l2_elem.add(t09.getText());
                l2_elem.add(t0a.getText());
                l2_elem.add(t0b.getText());
                l2_elem.add(t18.getText());
                l2_elem.add(t19.getText());
                l2_elem.add(t1a.getText());
                l2_elem.add(t1b.getText());
                l2_elem.add(t28.getText());
                l2_elem.add(t29.getText());
                l2_elem.add(t2a.getText());
                l2_elem.add(t2b.getText());
                l2_elem.add(t38.getText());
                l2_elem.add(t39.getText());
                l2_elem.add(t3a.getText());
                l2_elem.add(t3b.getText());

                if((l2_elem.contains("0")) && (l2_elem.contains("1")) && (l2_elem.contains("2")) && (l2_elem.contains("3")) && (l2_elem.contains("4")) && (l2_elem.contains("5")) && 
                   (l2_elem.contains("6")) && (l2_elem.contains("7")) && (l2_elem.contains("8")) && (l2_elem.contains("9")) && (l2_elem.contains("A")) && (l2_elem.contains("B")) && 
                   (l2_elem.contains("C")) && (l2_elem.contains("D")) && (l2_elem.contains("E")) && (l2_elem.contains("F"))){

                    ArrayList<String> l3_elem = new ArrayList<String>();
                    l3_elem.add(t0c.getText());
                    l3_elem.add(t0d.getText());
                    l3_elem.add(t0e.getText());
                    l3_elem.add(t0f.getText());
                    l3_elem.add(t1c.getText());
                    l3_elem.add(t1d.getText());
                    l3_elem.add(t1e.getText());
                    l3_elem.add(t1f.getText());
                    l3_elem.add(t2c.getText());
                    l3_elem.add(t2d.getText());
                    l3_elem.add(t2e.getText());
                    l3_elem.add(t2f.getText());
                    l3_elem.add(t3c.getText());
                    l3_elem.add(t3d.getText());
                    l3_elem.add(t3e.getText());
                    l3_elem.add(t3f.getText());

                    if((l3_elem.contains("0")) && (l3_elem.contains("1")) && (l3_elem.contains("2")) && (l3_elem.contains("3")) && (l3_elem.contains("4")) && (l3_elem.contains("5")) && 
                       (l3_elem.contains("6")) && (l3_elem.contains("7")) && (l3_elem.contains("8")) && (l3_elem.contains("9")) && (l3_elem.contains("A")) && (l3_elem.contains("B")) && 
                       (l3_elem.contains("C")) && (l3_elem.contains("D")) && (l3_elem.contains("E")) && (l3_elem.contains("F"))){

                        ArrayList<String> l4_elem = new ArrayList<String>();
                        l4_elem.add(t40.getText());
                        l4_elem.add(t41.getText());
                        l4_elem.add(t42.getText());
                        l4_elem.add(t43.getText());
                        l4_elem.add(t50.getText());
                        l4_elem.add(t51.getText());
                        l4_elem.add(t52.getText());
                        l4_elem.add(t53.getText());
                        l4_elem.add(t60.getText());
                        l4_elem.add(t61.getText());
                        l4_elem.add(t62.getText());
                        l4_elem.add(t63.getText());
                        l4_elem.add(t70.getText());
                        l4_elem.add(t71.getText());
                        l4_elem.add(t72.getText());
                        l4_elem.add(t73.getText());

                        if((l4_elem.contains("0")) && (l4_elem.contains("1")) && (l4_elem.contains("2")) && (l4_elem.contains("3")) && (l4_elem.contains("4")) && (l4_elem.contains("5")) && 
                           (l4_elem.contains("6")) && (l4_elem.contains("7")) && (l4_elem.contains("8")) && (l4_elem.contains("9")) && (l4_elem.contains("A")) && (l4_elem.contains("B")) && 
                           (l4_elem.contains("C")) && (l4_elem.contains("D")) && (l4_elem.contains("E")) && (l4_elem.contains("F"))){
                           
                            ArrayList<String> l5_elem = new ArrayList<String>();
                            l5_elem.add(t44.getText());
                            l5_elem.add(t45.getText());
                            l5_elem.add(t46.getText());
                            l5_elem.add(t47.getText());
                            l5_elem.add(t54.getText());
                            l5_elem.add(t55.getText());
                            l5_elem.add(t56.getText());
                            l5_elem.add(t57.getText());
                            l5_elem.add(t64.getText());
                            l5_elem.add(t65.getText());
                            l5_elem.add(t66.getText());
                            l5_elem.add(t67.getText());
                            l5_elem.add(t74.getText());
                            l5_elem.add(t75.getText());
                            l5_elem.add(t76.getText());
                            l5_elem.add(t77.getText());

                            if((l5_elem.contains("0")) && (l5_elem.contains("1")) && (l5_elem.contains("2")) && (l5_elem.contains("3")) && (l5_elem.contains("4")) && (l5_elem.contains("5")) && 
                               (l5_elem.contains("6")) && (l5_elem.contains("7")) && (l5_elem.contains("8")) && (l5_elem.contains("9")) && (l5_elem.contains("A")) && (l5_elem.contains("B")) && 
                               (l5_elem.contains("C")) && (l5_elem.contains("D")) && (l5_elem.contains("E")) && (l5_elem.contains("F"))){

                                ArrayList<String> l6_elem = new ArrayList<String>();
                                l6_elem.add(t48.getText());
                                l6_elem.add(t49.getText());
                                l6_elem.add(t4a.getText());
                                l6_elem.add(t4b.getText());
                                l6_elem.add(t58.getText());
                                l6_elem.add(t59.getText());
                                l6_elem.add(t5a.getText());
                                l6_elem.add(t5b.getText());
                                l6_elem.add(t68.getText());
                                l6_elem.add(t69.getText());
                                l6_elem.add(t6a.getText());
                                l6_elem.add(t6b.getText());
                                l6_elem.add(t78.getText());
                                l6_elem.add(t79.getText());
                                l6_elem.add(t7a.getText());
                                l6_elem.add(t7b.getText());

                                if((l6_elem.contains("0")) && (l6_elem.contains("1")) && (l6_elem.contains("2")) && (l6_elem.contains("3")) && (l6_elem.contains("4")) && (l6_elem.contains("5")) && 
                                   (l6_elem.contains("6")) && (l6_elem.contains("7")) && (l6_elem.contains("8")) && (l6_elem.contains("9")) && (l6_elem.contains("A")) && (l6_elem.contains("B")) && 
                                   (l6_elem.contains("C")) && (l6_elem.contains("D")) && (l6_elem.contains("E")) && (l6_elem.contains("F"))){

                                    ArrayList<String> l7_elem = new ArrayList<String>();
                                    l7_elem.add(t4c.getText());
                                    l7_elem.add(t4d.getText());
                                    l7_elem.add(t4e.getText());
                                    l7_elem.add(t4f.getText());
                                    l7_elem.add(t5c.getText());
                                    l7_elem.add(t5d.getText());
                                    l7_elem.add(t5e.getText());
                                    l7_elem.add(t5f.getText());
                                    l7_elem.add(t6c.getText());
                                    l7_elem.add(t6d.getText());
                                    l7_elem.add(t6e.getText());
                                    l7_elem.add(t6f.getText());
                                    l7_elem.add(t7c.getText());
                                    l7_elem.add(t7d.getText());
                                    l7_elem.add(t7e.getText());
                                    l7_elem.add(t7f.getText());

                                    if((l7_elem.contains("0")) && (l7_elem.contains("1")) && (l7_elem.contains("2")) && (l7_elem.contains("3")) && (l7_elem.contains("4")) && (l7_elem.contains("5")) && 
                                       (l7_elem.contains("6")) && (l7_elem.contains("7")) && (l7_elem.contains("8")) && (l7_elem.contains("9")) && (l7_elem.contains("A")) && (l7_elem.contains("B")) && 
                                       (l7_elem.contains("C")) && (l7_elem.contains("D")) && (l7_elem.contains("E")) && (l7_elem.contains("F"))){

                                        ArrayList<String> l8_elem = new ArrayList<String>();
                                        l8_elem.add(t80.getText());
                                        l8_elem.add(t81.getText());
                                        l8_elem.add(t82.getText());
                                        l8_elem.add(t83.getText());
                                        l8_elem.add(t90.getText());
                                        l8_elem.add(t91.getText());
                                        l8_elem.add(t92.getText());
                                        l8_elem.add(t93.getText());
                                        l8_elem.add(ta0.getText());
                                        l8_elem.add(ta1.getText());
                                        l8_elem.add(ta2.getText());
                                        l8_elem.add(ta3.getText());
                                        l8_elem.add(tb0.getText());
                                        l8_elem.add(tb1.getText());
                                        l8_elem.add(tb2.getText());
                                        l8_elem.add(tb3.getText());

                                        if((l8_elem.contains("0")) && (l8_elem.contains("1")) && (l8_elem.contains("2")) && (l8_elem.contains("3")) && (l8_elem.contains("4")) && (l8_elem.contains("5")) && 
                                           (l8_elem.contains("6")) && (l8_elem.contains("7")) && (l8_elem.contains("8")) && (l8_elem.contains("9")) && (l8_elem.contains("A")) && (l8_elem.contains("B")) && 
                                           (l8_elem.contains("C")) && (l8_elem.contains("D")) && (l8_elem.contains("E")) && (l8_elem.contains("F"))){

                                            ArrayList<String> l9_elem = new ArrayList<String>();
                                            l9_elem.add(t84.getText());
                                            l9_elem.add(t85.getText());
                                            l9_elem.add(t86.getText());
                                            l9_elem.add(t87.getText());
                                            l9_elem.add(t94.getText());
                                            l9_elem.add(t95.getText());
                                            l9_elem.add(t96.getText());
                                            l9_elem.add(t97.getText());
                                            l9_elem.add(ta4.getText());
                                            l9_elem.add(ta5.getText());
                                            l9_elem.add(ta6.getText());
                                            l9_elem.add(ta7.getText());
                                            l9_elem.add(tb4.getText());
                                            l9_elem.add(tb5.getText());
                                            l9_elem.add(tb6.getText());
                                            l9_elem.add(tb7.getText());

                                            if((l9_elem.contains("0")) && (l9_elem.contains("1")) && (l9_elem.contains("2")) && (l9_elem.contains("3")) && (l9_elem.contains("4")) && (l9_elem.contains("5")) && 
                                               (l9_elem.contains("6")) && (l9_elem.contains("7")) && (l9_elem.contains("8")) && (l9_elem.contains("9")) && (l9_elem.contains("A")) && (l9_elem.contains("B")) && 
                                               (l9_elem.contains("C")) && (l9_elem.contains("D")) && (l9_elem.contains("E")) && (l9_elem.contains("F"))){

                                                ArrayList<String> la_elem = new ArrayList<String>();
                                                la_elem.add(t88.getText());
                                                la_elem.add(t89.getText());
                                                la_elem.add(t8a.getText());
                                                la_elem.add(t8b.getText());
                                                la_elem.add(t98.getText());
                                                la_elem.add(t99.getText());
                                                la_elem.add(t9a.getText());
                                                la_elem.add(t9b.getText());
                                                la_elem.add(ta8.getText());
                                                la_elem.add(ta9.getText());
                                                la_elem.add(taa.getText());
                                                la_elem.add(tab.getText());
                                                la_elem.add(tb8.getText());
                                                la_elem.add(tb9.getText());
                                                la_elem.add(tba.getText());
                                                la_elem.add(tbb.getText());

                                                if((la_elem.contains("0")) && (la_elem.contains("1")) && (la_elem.contains("2")) && (la_elem.contains("3")) && (la_elem.contains("4")) && (la_elem.contains("5")) && 
                                                   (la_elem.contains("6")) && (la_elem.contains("7")) && (la_elem.contains("8")) && (la_elem.contains("9")) && (la_elem.contains("A")) && (la_elem.contains("B")) && 
                                                   (la_elem.contains("C")) && (la_elem.contains("D")) && (la_elem.contains("E")) && (la_elem.contains("F"))){

                                                    ArrayList<String> lb_elem = new ArrayList<String>();
                                                    lb_elem.add(t8c.getText());
                                                    lb_elem.add(t8d.getText());
                                                    lb_elem.add(t8e.getText());
                                                    lb_elem.add(t8f.getText());
                                                    lb_elem.add(t9c.getText());
                                                    lb_elem.add(t9d.getText());
                                                    lb_elem.add(t9e.getText());
                                                    lb_elem.add(t9f.getText());
                                                    lb_elem.add(tac.getText());
                                                    lb_elem.add(tad.getText());
                                                    lb_elem.add(tae.getText());
                                                    lb_elem.add(taf.getText());
                                                    lb_elem.add(tbc.getText());
                                                    lb_elem.add(tbd.getText());
                                                    lb_elem.add(tbe.getText());
                                                    lb_elem.add(tbf.getText());

                                                    if((lb_elem.contains("0")) && (lb_elem.contains("1")) && (lb_elem.contains("2")) && (lb_elem.contains("3")) && (lb_elem.contains("4")) && (lb_elem.contains("5")) && 
                                                       (lb_elem.contains("6")) && (lb_elem.contains("7")) && (lb_elem.contains("8")) && (lb_elem.contains("9")) && (lb_elem.contains("A")) && (lb_elem.contains("B")) && 
                                                       (lb_elem.contains("C")) && (lb_elem.contains("D")) && (lb_elem.contains("E")) && (lb_elem.contains("F"))){

                                                        ArrayList<String> lc_elem = new ArrayList<String>();
                                                        lc_elem.add(tc0.getText());
                                                        lc_elem.add(tc1.getText());
                                                        lc_elem.add(tc2.getText());
                                                        lc_elem.add(tc3.getText());
                                                        lc_elem.add(td0.getText());
                                                        lc_elem.add(td1.getText());
                                                        lc_elem.add(td2.getText());
                                                        lc_elem.add(td3.getText());
                                                        lc_elem.add(te0.getText());
                                                        lc_elem.add(te1.getText());
                                                        lc_elem.add(te2.getText());
                                                        lc_elem.add(te3.getText());
                                                        lc_elem.add(tf0.getText());
                                                        lc_elem.add(tf1.getText());
                                                        lc_elem.add(tf2.getText());
                                                        lc_elem.add(tf3.getText());

                                                        if((lc_elem.contains("0")) && (lc_elem.contains("1")) && (lc_elem.contains("2")) && (lc_elem.contains("3")) && (lc_elem.contains("4")) && (lc_elem.contains("5")) && 
                                                           (lc_elem.contains("6")) && (lc_elem.contains("7")) && (lc_elem.contains("8")) && (lc_elem.contains("9")) && (lc_elem.contains("A")) && (lc_elem.contains("B")) && 
                                                           (lc_elem.contains("C")) && (lc_elem.contains("D")) && (lc_elem.contains("E")) && (lc_elem.contains("F"))){

                                                            ArrayList<String> ld_elem = new ArrayList<String>();
                                                            ld_elem.add(tc4.getText());
                                                            ld_elem.add(tc5.getText());
                                                            ld_elem.add(tc6.getText());
                                                            ld_elem.add(tc7.getText());
                                                            ld_elem.add(td4.getText());
                                                            ld_elem.add(td5.getText());
                                                            ld_elem.add(td6.getText());
                                                            ld_elem.add(td7.getText());
                                                            ld_elem.add(te4.getText());
                                                            ld_elem.add(te5.getText());
                                                            ld_elem.add(te6.getText());
                                                            ld_elem.add(te7.getText());
                                                            ld_elem.add(tf4.getText());
                                                            ld_elem.add(tf5.getText());
                                                            ld_elem.add(tf6.getText());
                                                            ld_elem.add(tf7.getText());

                                                            if((ld_elem.contains("0")) && (ld_elem.contains("1")) && (ld_elem.contains("2")) && (ld_elem.contains("3")) && (ld_elem.contains("4")) && (ld_elem.contains("5")) && 
                                                               (ld_elem.contains("6")) && (ld_elem.contains("7")) && (ld_elem.contains("8")) && (ld_elem.contains("9")) && (ld_elem.contains("A")) && (ld_elem.contains("B")) && 
                                                               (ld_elem.contains("C")) && (ld_elem.contains("D")) && (ld_elem.contains("E")) && (ld_elem.contains("F"))){

                                                                ArrayList<String> le_elem = new ArrayList<String>();
                                                                le_elem.add(tc8.getText());
                                                                le_elem.add(tc9.getText());
                                                                le_elem.add(tca.getText());
                                                                le_elem.add(tcb.getText());
                                                                le_elem.add(td8.getText());
                                                                le_elem.add(td9.getText());
                                                                le_elem.add(tda.getText());
                                                                le_elem.add(tdb.getText());
                                                                le_elem.add(te8.getText());
                                                                le_elem.add(te9.getText());
                                                                le_elem.add(tea.getText());
                                                                le_elem.add(teb.getText());
                                                                le_elem.add(tf8.getText());
                                                                le_elem.add(tf9.getText());
                                                                le_elem.add(tfa.getText());
                                                                le_elem.add(tfb.getText());

                                                                if((le_elem.contains("0")) && (le_elem.contains("1")) && (le_elem.contains("2")) && (le_elem.contains("3")) && (le_elem.contains("4")) && (le_elem.contains("5")) && 
                                                                   (le_elem.contains("6")) && (le_elem.contains("7")) && (le_elem.contains("8")) && (le_elem.contains("9")) && (le_elem.contains("A")) && (le_elem.contains("B")) && 
                                                                   (le_elem.contains("C")) && (le_elem.contains("D")) && (le_elem.contains("E")) && (le_elem.contains("F"))){

                                                                    ArrayList<String> lf_elem = new ArrayList<String>();
                                                                    lf_elem.add(tcc.getText());
                                                                    lf_elem.add(tcd.getText());
                                                                    lf_elem.add(tce.getText());
                                                                    lf_elem.add(tcf.getText());
                                                                    lf_elem.add(tdc.getText());
                                                                    lf_elem.add(tdd.getText());
                                                                    lf_elem.add(tde.getText());
                                                                    lf_elem.add(tdf.getText());
                                                                    lf_elem.add(tec.getText());
                                                                    lf_elem.add(ted.getText());
                                                                    lf_elem.add(tee.getText());
                                                                    lf_elem.add(tef.getText());
                                                                    lf_elem.add(tfc.getText());
                                                                    lf_elem.add(tfd.getText());
                                                                    lf_elem.add(tfe.getText());
                                                                    lf_elem.add(tff.getText());

                                                                    if((lf_elem.contains("0")) && (lf_elem.contains("1")) && (lf_elem.contains("2")) && (lf_elem.contains("3")) && (lf_elem.contains("4")) && (lf_elem.contains("5")) && 
                                                                       (lf_elem.contains("6")) && (lf_elem.contains("7")) && (lf_elem.contains("8")) && (lf_elem.contains("9")) && (lf_elem.contains("A")) && (lf_elem.contains("B")) && 
                                                                       (lf_elem.contains("C")) && (lf_elem.contains("D")) && (lf_elem.contains("E")) && (lf_elem.contains("F"))){

                                                                        return true;

                                                                    }
                                                                    else{
                                                                        state_label.setText("Solução Errada!");
                                                                        return false;
                                                                    }

                                                                }
                                                                else{
                                                                    state_label.setText("Solução Errada!");
                                                                    return false;
                                                                }

                                                            }
                                                            else{
                                                                state_label.setText("Solução Errada!");
                                                                return false;
                                                            }

                                                        }
                                                        else{
                                                            state_label.setText("Solução Errada!");
                                                            return false;
                                                        }

                                                    }
                                                    else{
                                                        state_label.setText("Solução Errada!");
                                                        return false;
                                                    }

                                                }
                                                else{
                                                    state_label.setText("Solução Errada!");
                                                    return false;
                                                }

                                            }
                                            else{
                                                state_label.setText("Solução Errada!");
                                                return false;
                                            }

                                        }
                                        else{
                                            state_label.setText("Solução Errada!");
                                            return false;
                                        }

                                    }
                                    else{
                                        state_label.setText("Solução Errada!");
                                        return false;
                                    }

                                }
                                else{
                                    state_label.setText("Solução Errada!");
                                    return false;
                                }

                            }
                            else{
                                state_label.setText("Solução Errada!");
                                return false;
                            }

                        }
                        else{
                            state_label.setText("Solução Errada!");
                            return false;
                        }

                    }
                    else{
                        state_label.setText("Solução Errada!");
                        return false;
                    }

                }
                else{
                    state_label.setText("Solução Errada!");
                    return false;
                }

            }
            else{
                state_label.setText("Solução Errada!");
                return false;
            }     
        }
        else{
            state_label.setText("Solução Errada!");
            return false;
        }
    }
    
    public boolean checkColumn(){
        ArrayList<String> c0_elem = new ArrayList<String>();
        c0_elem.add(t00.getText());
        c0_elem.add(t04.getText());
        c0_elem.add(t08.getText());
        c0_elem.add(t0c.getText());
        c0_elem.add(t40.getText());
        c0_elem.add(t44.getText());
        c0_elem.add(t48.getText());
        c0_elem.add(t4c.getText());
        c0_elem.add(t80.getText());
        c0_elem.add(t84.getText());
        c0_elem.add(t88.getText());
        c0_elem.add(t8c.getText());
        c0_elem.add(tc0.getText());
        c0_elem.add(tc4.getText());
        c0_elem.add(tc8.getText());
        c0_elem.add(tcc.getText());
        
        if((c0_elem.contains("0")) && (c0_elem.contains("1")) && (c0_elem.contains("2")) && (c0_elem.contains("3")) && (c0_elem.contains("4")) && (c0_elem.contains("5")) && 
           (c0_elem.contains("6")) && (c0_elem.contains("7")) && (c0_elem.contains("8")) && (c0_elem.contains("9")) && (c0_elem.contains("A")) && (c0_elem.contains("B")) && 
           (c0_elem.contains("C")) && (c0_elem.contains("D")) && (c0_elem.contains("E")) && (c0_elem.contains("F"))){
            
            ArrayList<String> c1_elem = new ArrayList<String>();
            c1_elem.add(t01.getText());
            c1_elem.add(t05.getText());
            c1_elem.add(t09.getText());
            c1_elem.add(t0d.getText());
            c1_elem.add(t41.getText());
            c1_elem.add(t45.getText());
            c1_elem.add(t49.getText());
            c1_elem.add(t4d.getText());
            c1_elem.add(t81.getText());
            c1_elem.add(t85.getText());
            c1_elem.add(t89.getText());
            c1_elem.add(t8d.getText());
            c1_elem.add(tc1.getText());
            c1_elem.add(tc5.getText());
            c1_elem.add(tc9.getText());
            c1_elem.add(tcd.getText());

            if((c1_elem.contains("0")) && (c1_elem.contains("1")) && (c1_elem.contains("2")) && (c1_elem.contains("3")) && (c1_elem.contains("4")) && (c1_elem.contains("5")) && 
               (c1_elem.contains("6")) && (c1_elem.contains("7")) && (c1_elem.contains("8")) && (c1_elem.contains("9")) && (c1_elem.contains("A")) && (c1_elem.contains("B")) && 
               (c1_elem.contains("C")) && (c1_elem.contains("D")) && (c1_elem.contains("E")) && (c1_elem.contains("F"))){

                ArrayList<String> c2_elem = new ArrayList<String>();
                c2_elem.add(t02.getText());
                c2_elem.add(t06.getText());
                c2_elem.add(t0a.getText());
                c2_elem.add(t0e.getText());
                c2_elem.add(t42.getText());
                c2_elem.add(t46.getText());
                c2_elem.add(t4a.getText());
                c2_elem.add(t4e.getText());
                c2_elem.add(t82.getText());
                c2_elem.add(t86.getText());
                c2_elem.add(t8a.getText());
                c2_elem.add(t8e.getText());
                c2_elem.add(tc2.getText());
                c2_elem.add(tc6.getText());
                c2_elem.add(tca.getText());
                c2_elem.add(tce.getText());

                if((c2_elem.contains("0")) && (c2_elem.contains("1")) && (c2_elem.contains("2")) && (c2_elem.contains("3")) && (c2_elem.contains("4")) && (c2_elem.contains("5")) && 
                   (c2_elem.contains("6")) && (c2_elem.contains("7")) && (c2_elem.contains("8")) && (c2_elem.contains("9")) && (c2_elem.contains("A")) && (c2_elem.contains("B")) && 
                   (c2_elem.contains("C")) && (c2_elem.contains("D")) && (c2_elem.contains("E")) && (c2_elem.contains("F"))){

                    ArrayList<String> c3_elem = new ArrayList<String>();
                    c3_elem.add(t03.getText());
                    c3_elem.add(t07.getText());
                    c3_elem.add(t0b.getText());
                    c3_elem.add(t0f.getText());
                    c3_elem.add(t43.getText());
                    c3_elem.add(t47.getText());
                    c3_elem.add(t4b.getText());
                    c3_elem.add(t4f.getText());
                    c3_elem.add(t83.getText());
                    c3_elem.add(t87.getText());
                    c3_elem.add(t8b.getText());
                    c3_elem.add(t8f.getText());
                    c3_elem.add(tc3.getText());
                    c3_elem.add(tc7.getText());
                    c3_elem.add(tcb.getText());
                    c3_elem.add(tcf.getText());

                    if((c3_elem.contains("0")) && (c3_elem.contains("1")) && (c3_elem.contains("2")) && (c3_elem.contains("3")) && (c3_elem.contains("4")) && (c3_elem.contains("5")) && 
                       (c3_elem.contains("6")) && (c3_elem.contains("7")) && (c3_elem.contains("8")) && (c3_elem.contains("9")) && (c3_elem.contains("A")) && (c3_elem.contains("B")) && 
                       (c3_elem.contains("C")) && (c3_elem.contains("D")) && (c3_elem.contains("E")) && (c3_elem.contains("F"))){

                        ArrayList<String> c4_elem = new ArrayList<String>();
                        c4_elem.add(t10.getText());
                        c4_elem.add(t14.getText());
                        c4_elem.add(t18.getText());
                        c4_elem.add(t1c.getText());
                        c4_elem.add(t50.getText());
                        c4_elem.add(t54.getText());
                        c4_elem.add(t58.getText());
                        c4_elem.add(t5c.getText());
                        c4_elem.add(t90.getText());
                        c4_elem.add(t94.getText());
                        c4_elem.add(t98.getText());
                        c4_elem.add(t9c.getText());
                        c4_elem.add(td0.getText());
                        c4_elem.add(td4.getText());
                        c4_elem.add(td8.getText());
                        c4_elem.add(tdc.getText());

                        if((c4_elem.contains("0")) && (c4_elem.contains("1")) && (c4_elem.contains("2")) && (c4_elem.contains("3")) && (c4_elem.contains("4")) && (c4_elem.contains("5")) && 
                           (c4_elem.contains("6")) && (c4_elem.contains("7")) && (c4_elem.contains("8")) && (c4_elem.contains("9")) && (c4_elem.contains("A")) && (c4_elem.contains("B")) && 
                           (c4_elem.contains("C")) && (c4_elem.contains("D")) && (c4_elem.contains("E")) && (c4_elem.contains("F"))){

                            ArrayList<String> c5_elem = new ArrayList<String>();
                            c5_elem.add(t11.getText());
                            c5_elem.add(t15.getText());
                            c5_elem.add(t19.getText());
                            c5_elem.add(t1d.getText());
                            c5_elem.add(t51.getText());
                            c5_elem.add(t55.getText());
                            c5_elem.add(t59.getText());
                            c5_elem.add(t5d.getText());
                            c5_elem.add(t91.getText());
                            c5_elem.add(t95.getText());
                            c5_elem.add(t99.getText());
                            c5_elem.add(t9d.getText());
                            c5_elem.add(td1.getText());
                            c5_elem.add(td5.getText());
                            c5_elem.add(td9.getText());
                            c5_elem.add(tdd.getText());

                            if((c5_elem.contains("0")) && (c5_elem.contains("1")) && (c5_elem.contains("2")) && (c5_elem.contains("3")) && (c5_elem.contains("4")) && (c5_elem.contains("5")) && 
                               (c5_elem.contains("6")) && (c5_elem.contains("7")) && (c5_elem.contains("8")) && (c5_elem.contains("9")) && (c5_elem.contains("A")) && (c5_elem.contains("B")) && 
                               (c5_elem.contains("C")) && (c5_elem.contains("D")) && (c5_elem.contains("E")) && (c5_elem.contains("F"))){

                                ArrayList<String> c6_elem = new ArrayList<String>();
                                c6_elem.add(t12.getText());
                                c6_elem.add(t16.getText());
                                c6_elem.add(t1a.getText());
                                c6_elem.add(t1e.getText());
                                c6_elem.add(t52.getText());
                                c6_elem.add(t56.getText());
                                c6_elem.add(t5a.getText());
                                c6_elem.add(t5e.getText());
                                c6_elem.add(t92.getText());
                                c6_elem.add(t96.getText());
                                c6_elem.add(t9a.getText());
                                c6_elem.add(t9e.getText());
                                c6_elem.add(td2.getText());
                                c6_elem.add(td6.getText());
                                c6_elem.add(tda.getText());
                                c6_elem.add(tde.getText());

                                if((c6_elem.contains("0")) && (c6_elem.contains("1")) && (c6_elem.contains("2")) && (c6_elem.contains("3")) && (c6_elem.contains("4")) && (c6_elem.contains("5")) && 
                                   (c6_elem.contains("6")) && (c6_elem.contains("7")) && (c6_elem.contains("8")) && (c6_elem.contains("9")) && (c6_elem.contains("A")) && (c6_elem.contains("B")) && 
                                   (c6_elem.contains("C")) && (c6_elem.contains("D")) && (c6_elem.contains("E")) && (c6_elem.contains("F"))){

                                    ArrayList<String> c7_elem = new ArrayList<String>();
                                    c7_elem.add(t13.getText());
                                    c7_elem.add(t17.getText());
                                    c7_elem.add(t1b.getText());
                                    c7_elem.add(t1f.getText());
                                    c7_elem.add(t53.getText());
                                    c7_elem.add(t57.getText());
                                    c7_elem.add(t5b.getText());
                                    c7_elem.add(t5f.getText());
                                    c7_elem.add(t93.getText());
                                    c7_elem.add(t97.getText());
                                    c7_elem.add(t9b.getText());
                                    c7_elem.add(t9f.getText());
                                    c7_elem.add(td3.getText());
                                    c7_elem.add(td7.getText());
                                    c7_elem.add(tdb.getText());
                                    c7_elem.add(tdf.getText());

                                    if((c7_elem.contains("0")) && (c7_elem.contains("1")) && (c7_elem.contains("2")) && (c7_elem.contains("3")) && (c7_elem.contains("4")) && (c7_elem.contains("5")) && 
                                       (c7_elem.contains("6")) && (c7_elem.contains("7")) && (c7_elem.contains("8")) && (c7_elem.contains("9")) && (c7_elem.contains("A")) && (c7_elem.contains("B")) && 
                                       (c7_elem.contains("C")) && (c7_elem.contains("D")) && (c7_elem.contains("E")) && (c7_elem.contains("F"))){

                                        ArrayList<String> c8_elem = new ArrayList<String>();
                                        c8_elem.add(t20.getText());
                                        c8_elem.add(t24.getText());
                                        c8_elem.add(t28.getText());
                                        c8_elem.add(t2c.getText());
                                        c8_elem.add(t60.getText());
                                        c8_elem.add(t64.getText());
                                        c8_elem.add(t68.getText());
                                        c8_elem.add(t6c.getText());
                                        c8_elem.add(ta0.getText());
                                        c8_elem.add(ta4.getText());
                                        c8_elem.add(ta8.getText());
                                        c8_elem.add(tac.getText());
                                        c8_elem.add(te0.getText());
                                        c8_elem.add(te4.getText());
                                        c8_elem.add(te8.getText());
                                        c8_elem.add(tec.getText());

                                        if((c8_elem.contains("0")) && (c8_elem.contains("1")) && (c8_elem.contains("2")) && (c8_elem.contains("3")) && (c8_elem.contains("4")) && (c8_elem.contains("5")) && 
                                           (c8_elem.contains("6")) && (c8_elem.contains("7")) && (c8_elem.contains("8")) && (c8_elem.contains("9")) && (c8_elem.contains("A")) && (c8_elem.contains("B")) && 
                                           (c8_elem.contains("C")) && (c8_elem.contains("D")) && (c8_elem.contains("E")) && (c8_elem.contains("F"))){

                                            ArrayList<String> c9_elem = new ArrayList<String>();
                                            c9_elem.add(t21.getText());
                                            c9_elem.add(t25.getText());
                                            c9_elem.add(t29.getText());
                                            c9_elem.add(t2d.getText());
                                            c9_elem.add(t61.getText());
                                            c9_elem.add(t65.getText());
                                            c9_elem.add(t69.getText());
                                            c9_elem.add(t6d.getText());
                                            c9_elem.add(ta1.getText());
                                            c9_elem.add(ta5.getText());
                                            c9_elem.add(ta9.getText());
                                            c9_elem.add(tad.getText());
                                            c9_elem.add(te1.getText());
                                            c9_elem.add(te5.getText());
                                            c9_elem.add(te9.getText());
                                            c9_elem.add(ted.getText());

                                            if((c9_elem.contains("0")) && (c9_elem.contains("1")) && (c9_elem.contains("2")) && (c9_elem.contains("3")) && (c9_elem.contains("4")) && (c9_elem.contains("5")) && 
                                               (c9_elem.contains("6")) && (c9_elem.contains("7")) && (c9_elem.contains("8")) && (c9_elem.contains("9")) && (c9_elem.contains("A")) && (c9_elem.contains("B")) && 
                                               (c9_elem.contains("C")) && (c9_elem.contains("D")) && (c9_elem.contains("E")) && (c9_elem.contains("F"))){

                                                ArrayList<String> ca_elem = new ArrayList<String>();
                                                ca_elem.add(t22.getText());
                                                ca_elem.add(t26.getText());
                                                ca_elem.add(t2a.getText());
                                                ca_elem.add(t2e.getText());
                                                ca_elem.add(t62.getText());
                                                ca_elem.add(t66.getText());
                                                ca_elem.add(t6a.getText());
                                                ca_elem.add(t6e.getText());
                                                ca_elem.add(ta2.getText());
                                                ca_elem.add(ta6.getText());
                                                ca_elem.add(taa.getText());
                                                ca_elem.add(tae.getText());
                                                ca_elem.add(te2.getText());
                                                ca_elem.add(te6.getText());
                                                ca_elem.add(tea.getText());
                                                ca_elem.add(tee.getText());

                                                if((ca_elem.contains("0")) && (ca_elem.contains("1")) && (ca_elem.contains("2")) && (ca_elem.contains("3")) && (ca_elem.contains("4")) && (ca_elem.contains("5")) && 
                                                   (ca_elem.contains("6")) && (ca_elem.contains("7")) && (ca_elem.contains("8")) && (ca_elem.contains("9")) && (ca_elem.contains("A")) && (ca_elem.contains("B")) && 
                                                   (ca_elem.contains("C")) && (ca_elem.contains("D")) && (ca_elem.contains("E")) && (ca_elem.contains("F"))){

                                                    ArrayList<String> cb_elem = new ArrayList<String>();
                                                    cb_elem.add(t23.getText());
                                                    cb_elem.add(t27.getText());
                                                    cb_elem.add(t2b.getText());
                                                    cb_elem.add(t2f.getText());
                                                    cb_elem.add(t63.getText());
                                                    cb_elem.add(t67.getText());
                                                    cb_elem.add(t6b.getText());
                                                    cb_elem.add(t6f.getText());
                                                    cb_elem.add(ta3.getText());
                                                    cb_elem.add(ta7.getText());
                                                    cb_elem.add(tab.getText());
                                                    cb_elem.add(taf.getText());
                                                    cb_elem.add(te3.getText());
                                                    cb_elem.add(te7.getText());
                                                    cb_elem.add(teb.getText());
                                                    cb_elem.add(tef.getText());

                                                    if((cb_elem.contains("0")) && (cb_elem.contains("1")) && (cb_elem.contains("2")) && (cb_elem.contains("3")) && (cb_elem.contains("4")) && (cb_elem.contains("5")) && 
                                                       (cb_elem.contains("6")) && (cb_elem.contains("7")) && (cb_elem.contains("8")) && (cb_elem.contains("9")) && (cb_elem.contains("A")) && (cb_elem.contains("B")) && 
                                                       (cb_elem.contains("C")) && (cb_elem.contains("D")) && (cb_elem.contains("E")) && (cb_elem.contains("F"))){

                                                        ArrayList<String> cc_elem = new ArrayList<String>();
                                                        cc_elem.add(t30.getText());
                                                        cc_elem.add(t34.getText());
                                                        cc_elem.add(t38.getText());
                                                        cc_elem.add(t3c.getText());
                                                        cc_elem.add(t70.getText());
                                                        cc_elem.add(t74.getText());
                                                        cc_elem.add(t78.getText());
                                                        cc_elem.add(t7c.getText());
                                                        cc_elem.add(tb0.getText());
                                                        cc_elem.add(tb4.getText());
                                                        cc_elem.add(tb8.getText());
                                                        cc_elem.add(tbc.getText());
                                                        cc_elem.add(tf0.getText());
                                                        cc_elem.add(tf4.getText());
                                                        cc_elem.add(tf8.getText());
                                                        cc_elem.add(tfc.getText());

                                                        if((cc_elem.contains("0")) && (cc_elem.contains("1")) && (cc_elem.contains("2")) && (cc_elem.contains("3")) && (cc_elem.contains("4")) && (cc_elem.contains("5")) && 
                                                           (cc_elem.contains("6")) && (cc_elem.contains("7")) && (cc_elem.contains("8")) && (cc_elem.contains("9")) && (cc_elem.contains("A")) && (cc_elem.contains("B")) && 
                                                           (cc_elem.contains("C")) && (cc_elem.contains("D")) && (cc_elem.contains("E")) && (cc_elem.contains("F"))){

                                                            ArrayList<String> cd_elem = new ArrayList<String>();
                                                            cd_elem.add(t31.getText());
                                                            cd_elem.add(t35.getText());
                                                            cd_elem.add(t39.getText());
                                                            cd_elem.add(t3d.getText());
                                                            cd_elem.add(t71.getText());
                                                            cd_elem.add(t75.getText());
                                                            cd_elem.add(t79.getText());
                                                            cd_elem.add(t7d.getText());
                                                            cd_elem.add(tb1.getText());
                                                            cd_elem.add(tb5.getText());
                                                            cd_elem.add(tb9.getText());
                                                            cd_elem.add(tbd.getText());
                                                            cd_elem.add(tf1.getText());
                                                            cd_elem.add(tf5.getText());
                                                            cd_elem.add(tf9.getText());
                                                            cd_elem.add(tfd.getText());

                                                            if((cd_elem.contains("0")) && (cd_elem.contains("1")) && (cd_elem.contains("2")) && (cd_elem.contains("3")) && (cd_elem.contains("4")) && (cd_elem.contains("5")) && 
                                                               (cd_elem.contains("6")) && (cd_elem.contains("7")) && (cd_elem.contains("8")) && (cd_elem.contains("9")) && (cd_elem.contains("A")) && (cd_elem.contains("B")) && 
                                                               (cd_elem.contains("C")) && (cd_elem.contains("D")) && (cd_elem.contains("E")) && (cd_elem.contains("F"))){

                                                                ArrayList<String> ce_elem = new ArrayList<String>();
                                                                ce_elem.add(t32.getText());
                                                                ce_elem.add(t36.getText());
                                                                ce_elem.add(t3a.getText());
                                                                ce_elem.add(t3e.getText());
                                                                ce_elem.add(t72.getText());
                                                                ce_elem.add(t76.getText());
                                                                ce_elem.add(t7a.getText());
                                                                ce_elem.add(t7e.getText());
                                                                ce_elem.add(tb2.getText());
                                                                ce_elem.add(tb6.getText());
                                                                ce_elem.add(tba.getText());
                                                                ce_elem.add(tbe.getText());
                                                                ce_elem.add(tf2.getText());
                                                                ce_elem.add(tf6.getText());
                                                                ce_elem.add(tfa.getText());
                                                                ce_elem.add(tfe.getText());

                                                                if((ce_elem.contains("0")) && (ce_elem.contains("1")) && (ce_elem.contains("2")) && (ce_elem.contains("3")) && (ce_elem.contains("4")) && (ce_elem.contains("5")) && 
                                                                   (ce_elem.contains("6")) && (ce_elem.contains("7")) && (ce_elem.contains("8")) && (ce_elem.contains("9")) && (ce_elem.contains("A")) && (ce_elem.contains("B")) && 
                                                                   (ce_elem.contains("C")) && (ce_elem.contains("D")) && (ce_elem.contains("E")) && (ce_elem.contains("F"))){

                                                                    ArrayList<String> cf_elem = new ArrayList<String>();
                                                                    cf_elem.add(t33.getText());
                                                                    cf_elem.add(t37.getText());
                                                                    cf_elem.add(t3b.getText());
                                                                    cf_elem.add(t3f.getText());
                                                                    cf_elem.add(t73.getText());
                                                                    cf_elem.add(t77.getText());
                                                                    cf_elem.add(t7b.getText());
                                                                    cf_elem.add(t7f.getText());
                                                                    cf_elem.add(tb3.getText());
                                                                    cf_elem.add(tb7.getText());
                                                                    cf_elem.add(tbb.getText());
                                                                    cf_elem.add(tbf.getText());
                                                                    cf_elem.add(tf3.getText());
                                                                    cf_elem.add(tf7.getText());
                                                                    cf_elem.add(tfb.getText());
                                                                    cf_elem.add(tff.getText());

                                                                    if((cf_elem.contains("0")) && (cf_elem.contains("1")) && (cf_elem.contains("2")) && (cf_elem.contains("3")) && (cf_elem.contains("4")) && (cf_elem.contains("5")) && 
                                                                       (cf_elem.contains("6")) && (cf_elem.contains("7")) && (cf_elem.contains("8")) && (cf_elem.contains("9")) && (cf_elem.contains("A")) && (cf_elem.contains("B")) && 
                                                                       (cf_elem.contains("C")) && (cf_elem.contains("D")) && (cf_elem.contains("E")) && (cf_elem.contains("F"))){

                                                                        return true;

                                                                    }
                                                                    else{
                                                                        state_label.setText("Solução Errada!");
                                                                        return false;
                                                                    }

                                                                }
                                                                else{
                                                                    state_label.setText("Solução Errada!");
                                                                    return false;
                                                                }

                                                            }
                                                            else{
                                                                state_label.setText("Solução Errada!");
                                                                return false;
                                                            }

                                                        }
                                                        else{
                                                            state_label.setText("Solução Errada!");
                                                            return false;
                                                        }

                                                    }
                                                    else{
                                                        state_label.setText("Solução Errada!");
                                                        return false;
                                                    }

                                                }
                                                else{
                                                    state_label.setText("Solução Errada!");
                                                    return false;
                                                }

                                            }
                                            else{
                                                state_label.setText("Solução Errada!");
                                                return false;
                                            }

                                        }
                                        else{
                                            state_label.setText("Solução Errada!");
                                            return false;
                                        }

                                    }
                                    else{
                                        state_label.setText("Solução Errada!");
                                        return false;
                                    }

                                }
                                else{
                                    state_label.setText("Solução Errada!");
                                    return false;
                                }

                            }
                            else{
                                state_label.setText("Solução Errada!");
                                return false;
                            }

                        }
                        else{
                            state_label.setText("Solução Errada!");
                            return false;
                        }

                    }
                    else{
                        state_label.setText("Solução Errada!");
                        return false;
                    }

                }
                else{
                    state_label.setText("Solução Errada!");
                    return false;
                }

            }
            else{
                state_label.setText("Solução Errada!");
                return false;
            }
            
        }
        else{
            state_label.setText("Solução Errada!");
            return false;
        }
}
 
    public void checkGame() throws InterruptedException{
        if( checkSquare() && checkLine() && checkColumn() ){
            seconds=0;
            playing=false;
            state_label.setText("Solução Correta, Parabéns!");
            winner.setVisible(true);
            paused=true;
            play.setVisible(false);
            pause.setVisible(false);
            check_go.setVisible(false);
            surrender_go.setVisible(false);
            easy.setVisible(true);
            easy.setDisable(false);
            medium.setVisible(true);
            medium.setDisable(false);
            hard.setVisible(true);
            hard.setDisable(false);
            clearTable();
            blockTable();
            if(facil){
                saveScore(username,"Easy",(300-seconds),(seconds));
            }
            else if(medio){
                saveScore(username,"Medium",(480-seconds),(seconds*2));
            }
            else{
                saveScore(username,"Hard",(600-seconds),(seconds*3));
            }
        }
        else{
           state_label.setText("Solução Errada!");  
           state_label.setText("Solução Errada!");  
           state_label.setText("Solução Errada!");  
           state_label.setText("Solução Errada!");  
           state_label.setText("Solução Errada!");  
        }
        
    }
    
    @FXML
    public void saveScore(String user, String difficulty, int tempo, int pontos) {
        Vector<Score> score = new Vector<Score>();
        score = cursor.readScore(); //Stores all the data from the file in the players vector
        Score points = new Score(user, difficulty, tempo, pontos); //Cerates a new player object, with the username and password inserted by the user
        score.add(points);
                try{
                    cursor.saveScore(score); //write the vector on the file
                //Tratamento de Excepções
                } catch (IOException ex) {
                Logger.getLogger(WelcomeScreenController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(WelcomeScreenController.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
}