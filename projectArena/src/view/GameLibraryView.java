/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author S143522 (Elvir Dzeko)
 */
class GameLibraryView {

    private BorderPane arenaframe;
    private int imageSize = 100;
    private String[] gameTitles = {"Assassin's Creed 2", "Othello", "Nicks fantasier"};
 
    GameLibraryView(BorderPane arenaframe) {
        this.arenaframe = arenaframe;

    }

    public void showGameLibrary() {
        GridPane gamesgrid = new GridPane();
        gamesgrid.setHgap(15); //horizontal gap in pixels => that's what you are asking for
        gamesgrid.setVgap(15); //vertical gap in pixels
        gamesgrid.setPadding(new Insets(50, 15, 15, 50)); // top, right, bottom, left: mellanrum för gridens kanter.
        Image i1 = new Image("image/icons/game_othello2.png", imageSize, imageSize, false, false);
        ImageView g1 = new ImageView(i1);
        Image i2 = new Image("image/icons/game_assassinscreed2.png", imageSize, imageSize, false, false);
        ImageView g2 = new ImageView(i2);
        Image i3 = new Image("image/icons/game_pacman2.png", imageSize, imageSize, false, false);
        ImageView g3 = new ImageView(i3);
        
        
           gamesgrid.addRow(0, g1,g2,g3);
//        for(int row = 0; row < 4; row++)
//            for(int col = 0; col < 4; col++)
//                gamesgrid.add(gameView, row, col);
        
//        ListView<Image> gameList = new ListView<>(FXCollections.observableArrayList(gameImage));
//        gameList.setStyle("-fx-padding: 5 50 8 50;");
//        gameList.setPrefSize(400, 400);
//        gameList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
       arenaframe.setCenter(gamesgrid);
      
    }
}