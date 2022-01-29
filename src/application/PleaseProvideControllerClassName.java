package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PleaseProvideControllerClassName {

    @FXML
    private Button btn;

    @FXML
    private TextField txtfld;

    @FXML
    void hello(ActionEvent event) {
    	txtfld.setText("Hello World");

    }

}
