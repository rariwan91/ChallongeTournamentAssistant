package CTAControllers;

import Constants.ViewConstants;
import Initialization.Startup;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Startup.initialize();
        Parent root = FXMLLoader.load(getClass().getResource(ViewConstants.Login_View));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
