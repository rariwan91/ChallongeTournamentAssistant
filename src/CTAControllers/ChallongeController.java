package CTAControllers;

import CTAModels.UserModel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ChallongeController {
    protected UserModel userModel;

    protected void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    protected void loadViewAndPassUser(String view, Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(view));
        stage.setScene(new Scene((Pane) loader.load()));

        ChallongeController controller = loader.getController();
        controller.setUserModel(userModel);

        stage.show();
    }
}
