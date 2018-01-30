package CTAControllers.Tournaments;

import CTAControllers.ChallongeController;
import CTAModels.ChallongeApiResponse;
import CTAModels.Tournaments.Tournament;
import CTAModels.UserModel;
import Constants.ViewConstants;
import Repositories.TournamentRepository;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * I purposefully didn't specify a controller in the fxml file so that I could
 * create a constructor method for passing in a UserModel so that initialize
 * can properly use the user data.
 */
public class IndexController extends ChallongeController implements Initializable {

    @FXML
    private ListView<Tournament> tournamentsListView;

    @FXML
    private Button backButton;

    IndexController(UserModel userModel) {
        setUserModel(userModel);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TournamentRepository repository = new TournamentRepository(userModel.getUsername(), userModel.getApiKey());
        ChallongeApiResponse<Tournament[]> response = repository.index();

        tournamentsListView.setItems(FXCollections.observableArrayList(response.value()));
        tournamentsListView.setCellFactory(p -> new TournamentCell());
    }

    @FXML
    protected void handleBackButtonAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) backButton.getScene().getWindow();
        loadViewAndPassUser(ViewConstants.Tournaments_Main_Menu_View, stage);
    }

    private void loadSpecificTournament(Button button, String tournamentName, String tournamentUrlName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ViewConstants.Tournaments_Show_View));

        ShowController controller = new ShowController(userModel, tournamentName, tournamentUrlName);
        loader.setController(controller);

        Stage stage = (Stage) button.getScene().getWindow();
        stage.setScene(new Scene(loader.load()));

        stage.show();
    }

    /**
     * Used to setup a custom layout for each Tournament item in
     * the returned array. It'll say the tournaments name and have
     * a button to look at the tournament in more detail.
     */
    class TournamentCell extends ListCell<Tournament> {
        HBox hbox = new HBox();
        Label label = new Label("(empty)");
        Pane pane = new Pane();
        Button button = new Button("View");
        Tournament lastItem;

        TournamentCell() {
            super();
            hbox.getChildren().addAll(label, pane, button);
            HBox.setHgrow(pane, Priority.ALWAYS);
            button.setOnAction(event -> {
                try {
                    String buttonId = button.getId();
                    int index = Integer.parseInt(buttonId);
                    Tournament selectedTournament = tournamentsListView.getItems().get(index);

                    String urlName = selectedTournament.getTournament().getUrl();
                    String name = selectedTournament.getTournament().getName();
                    loadSpecificTournament(button, name, urlName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        @Override
        protected void updateItem(Tournament item, boolean empty) {
            super.updateItem(item, empty);
            setText(null);  // No text in label of super class
            if (empty) {
                lastItem = null;
                setGraphic(null);
            } else {
                lastItem = item;
                label.setText(item.getTournament().getName());

                int tournamentIndex = tournamentsListView.getItems().indexOf(item);

                String buttonId = Integer.toString(tournamentIndex);
                button.setId(buttonId);
                setGraphic(hbox);
            }
        }
    }
}
