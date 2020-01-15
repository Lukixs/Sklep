/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market.view;

import java.io.IOException;
import market.Main;

/**
 * FXML Controller class
 *
 * @author Luki
 */
public class MainViewController{
    
    Main main;
    
    public void goHome() throws IOException{
        main.showMainItems();
    } 
    
}
