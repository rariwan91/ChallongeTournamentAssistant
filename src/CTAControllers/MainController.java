package CTAControllers;

import CTAViews.LoginView;
import RESTCommunicator.RESTCommunicator;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainController extends Application{

    private RESTCommunicator com;
    private LoginView login;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        com = new RESTCommunicator();
        login = new LoginView();
        login.display(primaryStage);
    }
}
