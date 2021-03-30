/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garments.management.system;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 * FXML Controller class
 *
 * @author User
 */

public class MakeOrderController implements Initializable {

    @FXML
    private ComboBox<String> combo1;

    @FXML
    private ComboBox<String> combo2;

    @FXML
    private ComboBox<String> combo3;
    
     @FXML
    private ComboBox<Integer> combo4;

    ObservableList<String> list1, list2,list3;
    ObservableList<Integer> list4;
    

    /**
     * Initializes the controller class.
     * 
     */
    @FXML
    private ImageView imageview1;
     private FileChooser filechooser = new FileChooser();

    public MakeOrderController() {
        this.list1 = FXCollections.observableArrayList("Full-Shirt","Half-Shirt","Polo t-shirt");
        this.list2 = FXCollections.observableArrayList("S","M","L","XL");
        this.list3 = FXCollections.observableArrayList("Black","White","Red","Blue");
        this.list4 = FXCollections.observableArrayList(100,200,300,400);
    }
    

    
    @FXML
    void Select(ActionEvent event) {
        
        String s= combo1.getSelectionModel().getSelectedItem();
        if(s.equals("Full-Shirt"))
        {
             try {
            File infile = filechooser.showOpenDialog(null);
            Image img = SwingFXUtils.toFXImage(ImageIO.read(infile), null);
            imageview1.setImage(img);
        } catch (IOException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        combo1.setItems(list1);
        combo2.setItems(list2);
        combo3.setItems(list3);
        combo4.setItems(list4);
        
       
       
    }  
    
    @FXML
      private void gotomyorderspage(ActionEvent event) throws IOException {
         Parent employee_page_parent = FXMLLoader.load(getClass().getResource("MyOrders.fxml"));
        Scene  employee_page_scene = new Scene(employee_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(employee_page_scene);
        app_stage.show();
    }

    @FXML
    private void gotouserprofilepage(ActionEvent event) throws IOException {
         Parent employee_page_parent = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Scene  employee_page_scene = new Scene(employee_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(employee_page_scene);
        app_stage.show();
    }

    @FXML
    private void gotomycartpage(ActionEvent event) throws IOException {
         Parent employee_page_parent = FXMLLoader.load(getClass().getResource("MyCart.fxml"));
        Scene  employee_page_scene = new Scene(employee_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(employee_page_scene);
        app_stage.show();
    }

    @FXML
    private void gotodashboardpage(ActionEvent event) throws IOException {
         Parent employee_page_parent = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
        Scene  employee_page_scene = new Scene(employee_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(employee_page_scene);
        app_stage.show();
        
        
    }

    @FXML
    private void Select(MouseEvent event) {
    }
    
    
    
    
    
}
