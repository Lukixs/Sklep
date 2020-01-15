/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market.view;

import java.io.IOException;
import javafx.fxml.FXML;
import market.Main;

/**
 *
 * @author Luki
 */
public class MainItemsController {
    
    private Main main;
    
    @FXML
    private void goAuction() throws IOException{
        main.showAuctionScene();
    }
    
}
