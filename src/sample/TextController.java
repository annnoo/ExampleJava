package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

import java.util.ArrayList;
import java.util.List;


public class TextController {
   public StringProperty input = new SimpleStringProperty();
    public StringProperty output = new SimpleStringProperty();


    public TextController(StringProperty in, StringProperty out){
        input.bind(in);


        input.addListener((observable, oldValue, newValue) -> output.setValue("NAME:" +input.getValue()) );
        out.bind(output);




    }

    public StringProperty getOut(){
        return output;
    }
}
