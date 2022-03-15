/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionrun;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.ViewManager;
/**
 *
 * @author celta
 */
public class ExceptionRun extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            ViewManager manager= new ViewManager();
            primaryStage = manager.getMainStage();
            primaryStage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
