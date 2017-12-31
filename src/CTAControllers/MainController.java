package CTAControllers;

import CTAModels.UserModel;
import CTAViews.View;
import CTAViews.LoginView;
import RESTCommunicator.RESTCommunicator;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainController extends Application{

    private RESTCommunicator com;
    private View currentView;
    private UserModel user;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        com = new RESTCommunicator();
        currentView = new LoginView();
        currentView.setController(this);
        currentView.display(primaryStage);
    }

    public void updateCurrentView(View view) {
        this.currentView = view;
    }

    public void setUser(UserModel user){
        this.user = user;
    }

    public UserModel getUser(){
        return this.user;
    }

    public void onLoginSubmit(String username, String apiKey){
        this.getUser().setUsername(username);
        this.getUser().setApiKey(apiKey);

    }
}
