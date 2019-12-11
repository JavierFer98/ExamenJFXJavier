package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControladorRocket {

	@FXML
	private Pane pane1;

	@FXML
	private Pane pane2;

	@FXML
	private Pane pane3;

	@FXML
	private Label countLabel;
           @FXML

           private AnchorPane ventanaPrincipal;
           @FXML
           private AnchorPane ventanaSecundaria;
          

           @FXML

           private Button boton;
           @FXML
           private Pane pane;
          

          

          

           

        	   public void initialize() {

                   fadeIn();

       }        

           

          

          

           /**

           * Metodo void que carga la segunda ventana de la aplicación

           * @return no tiene retorno

           */

           public void openStage() {

                       FXMLLoader loader = new FXMLLoader(getClass().getResource("Mars.fxml"));

                       try {

                                  ventanaSecundaria = loader.load();

                                  Stage st = new Stage();

                                  st.setScene(new Scene(ventanaSecundaria));

                                  st.centerOnScreen();

                                  st.show();

                                  closeApp();

                                 

                       } catch (IOException e) {

                                  e.printStackTrace();

                       }

           }

          

           /**

           * Metodo void que cierra el stage de la primera ventana de la aplicación

           * @return no tiene retorno

           */

           public void closeApp() {

                       Stage st = (Stage) ventanaPrincipal.getScene().getWindow();

                       st.close();

           }
           public void fadeIn() {

               FadeTransition fade = new FadeTransition(Duration.seconds(5), pane);

               fade.setFromValue(0);

               fade.setToValue(1);

              fade.play();

   }
           public void translateAnimation(double duration, Node node, double byX) {

       		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(duration), node);
       		translateTransition.setByX(byX);
       		translateTransition.play();

       	}

       	public void initialize2() {
       		translateAnimation(0.5, pane2, 600);
       		translateAnimation(0.5, pane3, 600);
       	}

       	int showSlide = 0;

       	@FXML
       	void nextAction() {

       		if (showSlide == 0) {
       			translateAnimation(0.5, pane2, -600);
       			showSlide++; 
       		} else if (showSlide == 1) {

       			translateAnimation(0.5, pane3, -600);
       			showSlide++; 

       		} else {
       			System.out.println("No more slides");
       		}

       	}

       	@FXML
       	void backAction() {

       		if (showSlide == 0) {
       			System.out.println("No more slides");
       		} else if (showSlide == 1) {
       			translateAnimation(0.5, pane2, 600);
       			showSlide--; // showSlide=0
       		} else if (showSlide == 2) {
       			translateAnimation(0.5, pane3, 600);
       			showSlide--; // showSlide=1
       		}

       	}

       }


