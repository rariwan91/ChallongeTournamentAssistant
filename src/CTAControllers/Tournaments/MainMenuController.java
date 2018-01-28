package CTAControllers.Tournaments;

import CTAControllers.ChallongeController;
import Constants.ViewConstants;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController extends ChallongeController {
    @FXML
    private Button indexButton;

    @FXML
    protected void handleIndexButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ViewConstants.Tournaments_Index_View));

        IndexController controller = new IndexController(userModel);
        loader.setController(controller);

        Stage stage = (Stage) indexButton.getScene().getWindow();
        stage.setScene(new Scene((Pane) loader.load()));

        stage.show();
    }
}
