/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoygame;

import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hussienalrubaye
 */
public class TicTacToyGame extends Application {
    Button btn1 = new Button();
    Button btn2 = new Button();
    Button btn3 = new Button();
    Button btn4 = new Button();
    Button btn5 = new Button();
    Button btn6 = new Button();
    Button btn7 = new Button();
    Button btn8 = new Button();
    Button btn9 = new Button();
    @Override
    public void start(Stage primaryStage) {

        btn1.setText(" ");
        btn1.setOnAction( event->{
          PlayGame(1,btn1);
        });
        

        btn2.setText(" ");
        btn2.setOnAction( event->{
          PlayGame(2,btn2);
        });
        
 
        btn3.setText(" ");
        btn3.setOnAction( event->{
          PlayGame(3,btn3);
        });
        
        
 
        btn4.setText(" ");
        btn4.setOnAction( event->{
          PlayGame(4,btn4);
        });
        
 
        btn5.setText(" ");
        btn5.setOnAction( event->{
          PlayGame(5,btn5);
        });
        
    
        btn6.setText(" ");
        btn6.setOnAction( event->{
          PlayGame(6,btn6);
        });
        
 
        btn7.setText(" ");
        btn7.setOnAction( event->{
          PlayGame(7,btn7);
        });
        
 
        btn8.setText(" ");
        btn8.setOnAction( event->{
          PlayGame(8,btn8);
        });
        
 
        btn9.setText(" ");
        btn9.setOnAction( event->{
          PlayGame(9,btn9);
        });
        
        GridPane grid= new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding( new Insets(25,25,25,25));
        
        grid.add(btn1, 0, 0);
        grid.add(btn2, 1, 0);
        grid.add(btn3, 2, 0);
        grid.add(btn4, 0, 1);
        grid.add(btn5, 1, 1);
        grid.add(btn6, 2, 1);
        grid.add(btn7, 0, 2);
        grid.add(btn8, 1, 2);
        grid.add(btn9, 2, 2);
      
        
        
       
        Scene scene = new Scene(grid, 400, 400);
        scene.getStylesheets()
                .add(TicTacToyGame.class.getResource("style.css").toExternalForm());
        primaryStage.setTitle("Tic Tac Toy Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    ArrayList<Integer> Player1= new ArrayList<Integer>();
    ArrayList<Integer> Player2= new ArrayList<Integer>();
    int ActivePlayer=1;
    void PlayGame(int CellId, Button SelectedButton){
            System.out.println("CellId:"+ CellId);
           if(ActivePlayer==1){
            SelectedButton.setText("X");
            Player1.add(CellId);
            ActivePlayer=2;
            AutoPlayer();
           }
           else if(ActivePlayer==2){
            SelectedButton.setText("O");
            Player2.add(CellId);
            ActivePlayer=1;
           }
           
           SelectedButton.setDisable(true);
          
           CheckWinner();
 
    }
    
    void CheckWinner(){
      int Winner=-1;
      if( Player1.contains(1) && Player1.contains(2) && Player1.contains(3)){
          Winner=1;
      }
       if( Player2.contains(1) && Player2.contains(2) && Player2.contains(3)){
          Winner=2;
      }
      
      if( Player1.contains(4) && Player1.contains(5) && Player1.contains(6)){
          Winner=1;
      }
       if( Player2.contains(4) && Player2.contains(5) && Player2.contains(6)){
          Winner=2;
      }
       
       
      if( Player1.contains(7) && Player1.contains(8) && Player1.contains(9)){
          Winner=1;
      }
       if( Player2.contains(7) && Player2.contains(8) && Player2.contains(9)){
          Winner=2;
      }
      
       //Columns
       
      if( Player1.contains(1) && Player1.contains(4) && Player1.contains(7)){
          Winner=1;
      }
       if( Player2.contains(1) && Player2.contains(4) && Player2.contains(7)){
          Winner=2;
      }
       
      if( Player1.contains(2) && Player1.contains(5) && Player1.contains(8)){
          Winner=1;
      }
       if( Player2.contains(2) && Player2.contains(5) && Player2.contains(8)){
          Winner=2;
      }
       
        if( Player1.contains(3) && Player1.contains(6) && Player1.contains(9)){
          Winner=1;
      }
       if( Player2.contains(3) && Player2.contains(6) && Player2.contains(9)){
          Winner=2;
      }
       
       
    //show Winner message  
       if (Winner !=-1){
           
           String MSG="";
           if(Winner==1){
               MSG="Player 1 is the winner";
           }
           if(Winner==2){
               MSG="Player 2 is the winner";
           }
           //Alert Dilaog
           
           Alert alert= new Alert(Alert.AlertType.INFORMATION);
           alert.setTitle("Game info");
           alert.setContentText(MSG);
           alert.setHeaderText("Playing info");
           alert.show();
           
       }
       
    }
    void AutoPlayer(){
        ArrayList<Integer> EmptyCells= new  ArrayList<Integer>();
        
        for(int cell=1;cell<10;cell++){
           
            if ( !( Player1.contains(cell) || Player2.contains(cell))){
              EmptyCells.add(cell);
            }   
        }
        
        Random r= new Random();
        int RandIndex=r.nextInt(EmptyCells.size()-0)+0;
        int CellId=EmptyCells.get(RandIndex);
        Button SelectedButton;
        
        switch(CellId){
            case 1:
               SelectedButton=btn1; 
               break;
            case 2:
               SelectedButton=btn2; 
               break;
            case 3:
               SelectedButton=btn3; 
               break;
            case 4:
               SelectedButton=btn4; 
               break;
            case 5:
               SelectedButton=btn5; 
               break;
            case 6:
               SelectedButton=btn6; 
               break;
            case 7:
               SelectedButton=btn7; 
               break;
            case 8:
               SelectedButton=btn8; 
               break;
            case 9:
               SelectedButton=btn9; 
               break;
               default:
                   SelectedButton=btn1;
        }
        
        PlayGame(CellId,  SelectedButton);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
