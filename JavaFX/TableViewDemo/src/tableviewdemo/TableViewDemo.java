/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableviewdemo;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hussienalrubaye
 */
public class TableViewDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //dein table view
        //1- define data set
        ObservableList<Accounts> accountlist=
                FXCollections.observableArrayList(
                new Accounts("hussein","1234","admin"),
                 new Accounts("jena","adsd","user"),
                  new Accounts("laya","asdasd","QA"),
                   new Accounts("loma","asdasd","tester"),
                    new Accounts("Alex","wewe","Project manager")
                );
        // 2- feine table view
        TableView<Accounts> tvAccouts=
                new TableView<>(accountlist);
        TableColumn<Accounts,String> fUserName=
                new TableColumn<>("User Name");
        fUserName.setCellValueFactory(new PropertyValueFactory<>("UserName"));
        tvAccouts.getColumns().add(fUserName);
        
        TableColumn<Accounts,String> fPassword=
                new TableColumn<>("Password"); //title
        fPassword.setCellValueFactory(new PropertyValueFactory<>("Password"));
        tvAccouts.getColumns().add(fPassword);
        
        TableColumn<Accounts,String> fType=
                new TableColumn<>("Account Type"); //title
        fType.setCellValueFactory(new PropertyValueFactory<>("Type"));
        tvAccouts.getColumns().add(fType);
        tvAccouts.setPrefSize(300, 300);
        
        // access events
        TableView.TableViewSelectionModel<Accounts> tvSelectModule=
                tvAccouts.getSelectionModel();
        tvSelectModule.selectedIndexProperty().
                addListener( new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, 
                    Number oldValue, Number newValue) {
           int index=(int) newValue;
           
                System.out.println("Name:"+
                        accountlist.get(index).getUserName());
                  
            
            }
        }
                
                );
   
        FlowPane root = new FlowPane();
     root.getChildren().add(tvAccouts);
        Scene scene = new Scene(root, 300, 250);
        
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
