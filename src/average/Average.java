/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author natha
 */
public class Average extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    @Override
    public void start(Stage stage)
    {
        GridPane pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(5);
        Label l1 = new Label("Enter number 1:");
        Label l2 = new Label("Enter number 2:");
        Label l3 = new Label("Enter number 3:");
        Label lSum = new Label("Sum:");
        Label lAns = new Label();
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        Button calc = new Button("Calculate Average");
        
        calc.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e) {
                lSum.setText(Double.parseDouble(t1.getText() + (Double.parseDouble(t2.getText()+ (Double.parseDouble(t3.getText())/3))            }
            
        });
        
        pane.add(l1, 0, 0);
        pane.add(t1, 1, 0);
        pane.add(l2, 0, 1);
        pane.add(t2, 1, 1);
        pane.add(l3, 1, 2);
        pane.add(t3, 2, 2);
        pane.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Average of 3 Numbers");
        stage.show();
        //
        
        
    }
    
}
