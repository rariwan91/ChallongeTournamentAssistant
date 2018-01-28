package CTAControllers.Login;

import CTAControllers.ChallongeController;
import CTAModels.UserModel;
import Constants.ViewConstants;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController extends ChallongeController {
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField apiKeyTextField;
    @FXML
    private Button loginButton;
    @FXML
    private Label errorLabel;

    @FXML
    protected void handleLoginButtonAction(ActionEvent event) throws IOException {
        String errorText = "";

        if (usernameTextField.getText().trim().isEmpty()) {
            errorText = "Username required.";

            if (apiKeyTextField.getText().trim().isEmpty()) {
                errorText += " API Key required.";
            }

            errorLabel.setText(errorText);
            errorLabel.setVisible(true);

            return;
        }

        if (apiKeyTextField.getText().trim().isEmpty()) {
            errorText += " API Key required.";

            errorLabel.setText(errorText);
            errorLabel.setVisible(true);

            return;
        }

        errorLabel.setText("");
        errorLabel.setVisible(false);

        String username = usernameTextField.getText();
        String apiKey = apiKeyTextField.getText();

        setUserModel(new UserModel(username, apiKey));
        Stage stage = (Stage) loginButton.getScene().getWindow();
        loadViewAndPassUser(ViewConstants.Tournaments_Main_Menu_View, stage);
    }
}
