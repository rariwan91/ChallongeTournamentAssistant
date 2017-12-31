package CTAViews;

import CTAControllers.MainController;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {

    private MainController controller;
    protected Stage window;
    protected Scene scene;

    public void setController(MainController controller){
        this.controller = controller;
    }
    public MainController getController() {
        return this.controller;
    }

    public void display(Stage primaryStage){
        primaryStage.setTitle("Challonge Tournament Assistant");
        window = primaryStage;
        //override by children class to display necessary view elements
    }
}
