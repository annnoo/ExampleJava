package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    public Label textLabel;
    public TextField textField;

    public TextController tc;


    @FXML
    public void initialize(){
        tc= new TextController(textField.textProperty(), textLabel.textProperty());



    }

}
