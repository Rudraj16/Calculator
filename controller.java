package yourpackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label resultLabel;

    // Reference to your Excel class
    private Excel excel = new Excel();

    @FXML
    private void calculateTotal(ActionEvent event) {
        // Implement logic using excel.calculateTotal and update resultLabel
    }

    @FXML
    private void calculateAverage(ActionEvent event) {
        // Implement logic using excel.calculateAverage and update resultLabel
    }

    @FXML
    private void calculateMaximum(ActionEvent event) {
        // Implement logic using excel.calculateMaximum and update resultLabel
    }

    @FXML
    private void calculateMinimum(ActionEvent event) {
        // Implement logic using excel.calculateMinimum and update resultLabel
    }
}
