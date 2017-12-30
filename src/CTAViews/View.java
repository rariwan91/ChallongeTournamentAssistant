package CTAViews;

import CTAControllers.MainController;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {

    private MainController controller;
    private Stage window;
    private Scene scene;

    public void display(Stage primaryStage){
        primaryStage.setTitle("Challonge Tournament Assistant");
        window = primaryStage;
        //override by children class to display necessary view elements
    }
}
