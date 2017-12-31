package CTAViews;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView extends View{

    @Override
    public void display(Stage primaryStage){
        super.display(primaryStage);
        TextField username = new TextField();
        TextField apiKey = new TextField();
        username.setPromptText("Username");
        apiKey.setPromptText("API Key");
        Button submit = new Button();

        VBox layout = new VBox(20);
        layout.getChildren().addAll(username,apiKey, submit);
        layout.setAlignment(Pos.CENTER);
        scene = new Scene(layout, 800, 600);

        window.setScene(scene);
        window.show();
    }
}
