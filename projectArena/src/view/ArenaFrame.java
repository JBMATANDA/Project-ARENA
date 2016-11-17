/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Elvir
 */
public class ArenaFrame {

    Stage stage;
    BorderPane arenaframe;
    Scene scene;
    MenuBar menubar;
    GameLibraryView library;


    public ArenaFrame() {
        stage = new Stage();
        arenaframe = new BorderPane();
        scene = new Scene(arenaframe, 800, 600);
        menubar = new MenuBar();
        library  = new GameLibraryView(arenaframe);
        AdvertisementView adView = new AdvertisementView(arenaframe);
        adView.setAdvertisement("image/VisitorAd.gif"); // sätter reklambilden
    }

    public void displayArena() {

        arenaStyle();
        setupMenu(); //anropar inställningarna för menyn
        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();
    }

    private void arenaStyle() {

        Background background = new Background(new BackgroundImage(
                new Image("image/lightTheme2.jpg"),
                BackgroundRepeat.SPACE,
                BackgroundRepeat.SPACE,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT));

        arenaframe.setBackground(background);
    }

    private void setupMenu() {
        arenaframe.setTop(menubar);

        menubar.setStyle(
                "-fx-padding: 5 50 8 50;"
                + "-fx-background-color: rgba(255, 255, 255, 0.5);"
                + "-fx-effect: dropshadow(gaussian, Black, 50, 0, 0, 0);"
                + "-fx-background-insets: 50;");
        
        Menu userAccountMenu = new Menu("Account");
        Menu gamesMenu = new Menu("Library");
        Menu homeMenu = new Menu("Home");
       
        /* skapar och sätter in items i gamesMenu. */
        MenuItem shopItem = new MenuItem("Shop");
        MenuItem gamesItem = new MenuItem("Games");     
        gamesMenu.getItems().addAll(shopItem, gamesItem);
        
        /* skapar och sätter in items i homeMenu. */
        MenuItem homeItem = new MenuItem("Go to home");
        homeMenu.getItems().addAll(homeItem);
        
        gamesItem.setOnAction(event -> library.showGameLibrary());
        shopItem.setOnAction(event -> System.out.println("SHOP"));
        homeItem.setOnAction(event -> System.out.println("Welcome home!"));

        menubar.getMenus().addAll(homeMenu, gamesMenu, userAccountMenu);
    }
}