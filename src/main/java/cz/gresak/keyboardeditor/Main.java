package cz.gresak.keyboardeditor;

import cz.gresak.keyboardeditor.service.ServiceLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ServiceLoader.register(getHostServices());
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/editor.fxml")));
        primaryStage.setTitle("*NIX Keyboard Editor");
        primaryStage.setScene(new Scene(root, 1200, 500));
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(400);
        primaryStage.show();
    }
}
