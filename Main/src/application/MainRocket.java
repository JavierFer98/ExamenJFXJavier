package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * @author Javier
 * @see ControladorRocket
 */
public class MainRocket extends Application {


    @Override

    public void start(Stage primaryStage) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("Urano.fxml"));
                

                try {

                           AnchorPane panelPrincipal = loader.load();

                           primaryStage.setScene(new Scene(panelPrincipal));

                           primaryStage.setTitle("Let me in");

                           primaryStage.show();

                          

                } catch (IOException e) {

                           e.printStackTrace();

                }

    }

   

    public static void main(String[] args) {

                launch(args);

    }

}
