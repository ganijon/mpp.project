

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class OverdueController  {

     @FXML
    private void handleSubmitAction(ActionEvent e) {
        // todo: checkout logic
        Views.showHome(stage, this);
    }

    @FXML
    private void handleCancelAction(ActionEvent e) {
        Views.showHome(stage, this);
    }
    
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    private Stage stage;
}
