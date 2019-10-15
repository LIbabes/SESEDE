import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.awt.*;

public class Login {



    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); //abre janela fora


            window.setTitle("Login");

            //GridPane with 10px padding around edge
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10));
            grid.setVgap(8);
            grid.setHgap(10);

            //Name Label - constrains use (child, column, row)
            Label nameLabel = new Label("Username:");
            GridPane.setConstraints(nameLabel, 0, 0);

            //Name Input
            javafx.scene.control.TextField nameInput = new javafx.scene.control.TextField("");
            GridPane.setConstraints(nameInput, 1, 0);

            //Password Label
            Label passLabel = new Label("Password:");
            GridPane.setConstraints(passLabel, 0, 1);

            //Password Input
            javafx.scene.control.TextField passInput = new TextField();
            passInput.setPromptText("password");
            GridPane.setConstraints(passInput, 1, 1);

            //Login
            Button loginButton = new Button("Log In");
            GridPane.setConstraints(loginButton, 1, 2);

            //Add everything to grid
            grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

            Scene scene = new Scene(grid);
            window.setScene(scene);
            window.setMaximized(true);
            window.show();

        window.setScene(scene);
        window.showAndWait();
    }
}
