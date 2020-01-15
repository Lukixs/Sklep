 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Luki
 */
public class Main extends Application {
    
    private Stage primaryStage;
    private static BorderPane mainLayout;
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Market App");
        
        showMainView();
        showMainItems();
    }
    
    private void showMainView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void showMainItems() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);
    }
    
    public static void showAuctionScene() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("auction/Auction.fxml"));
        BorderPane auction = loader.load();
        mainLayout.setCenter(auction);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
