/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author hussienalrubaye
 */
public class DrawDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Circle cir= new Circle(25, 25, 50);
        cir.setStroke(Color.RED);
        cir.setStrokeWidth(4);
        cir.setFill(Color.YELLOW);
        
        Line line= new Line(0, 200, 400, 200);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(8);
        
        Rectangle rec= new Rectangle(240, 90, 80, 70);
         rec.setStroke(Color.GREEN);
        rec.setStrokeWidth(8);
        rec.setFill(Color.YELLOWGREEN);
        Group root = new Group();
         root.getChildren().addAll(cir,line,rec);
        
        Scene scene = new Scene(root, 400, 400,Color.SKYBLUE);
        
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
