/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hussienalrubaye
 */
public class Imageviewdemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Image pic= new Image("imageviewdemo/hussein.jpg");
        ImageView ivPic= new ImageView(pic);
        ivPic.setFitHeight(300);
        ivPic.setFitWidth(300);
        BorderPane pane= new BorderPane();
        pane.setCenter(ivPic);
        
        
        Scene scene = new Scene(pane, 300, 400);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
