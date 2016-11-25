/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author S143534
 */
public class StartView {

    protected BorderPane pane;
    protected Stage stage;
    protected Scene scene;
    int height = 600, width = 800;
    public StartView() {
 
        this.stage = new Stage();
        pane = new BorderPane();
        this.scene = new Scene(pane, width, height);

    }

    public void displayStartView(){
        startDesign();
        stage.setTitle("StartView");
        stage.setScene(scene);
        stage.show();
    }
  public void startDesign(){
    
            Background background = new Background(new BackgroundImage(
                new Image("image/lightTheme3.jpg"),
                BackgroundRepeat.SPACE,
                BackgroundRepeat.SPACE,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT));
        pane.setBackground(background);

    }

}