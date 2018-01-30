package CTAControllers.Tournaments;

import CTAControllers.ChallongeController;
import CTAModels.ChallongeApiResponse;
import CTAModels.Tournaments.Tournament;
import CTAModels.UserModel;
import Constants.ViewConstants;
import Repositories.TournamentRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * I purposefully didn't specify a controller in the fxml file so that I could
 * create a constructor method for passing in a UserModel and tournamentName so
 * that initialize can properly use the user data and the tournament name data.
 */
public class ShowController extends ChallongeController implements Initializable {

    @FXML
    private TextArea tournamentTextField;

    @FXML
    private Button backButton;

    @FXML
    private Label tournamentLabel;

    private String tournamentName;

    private String tournamentUrlName;

    ShowController(UserModel userModel, String tournamentName, String tournamentUrlName) {
        setUserModel(userModel);
        this.tournamentName = tournamentName;
        this.tournamentUrlName = tournamentUrlName;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TournamentRepository repository = new TournamentRepository(userModel.getUsername(), userModel.getApiKey());
        ChallongeApiResponse<Tournament> response = repository.show(tournamentUrlName);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(response.value());

        tournamentTextField.setText(json);
        tournamentLabel.setText(tournamentLabel.getText() + " " + tournamentName);
    }

    @FXML
    protected void handleBackButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ViewConstants.Tournaments_Index_View));

        IndexController controller = new IndexController(userModel);
        loader.setController(controller);

        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(new Scene(loader.load()));

        stage.show();
    }
}
