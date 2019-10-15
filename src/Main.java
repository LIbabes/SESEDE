import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int ROW_INDEX = 1;
    Stage window;
    Button login;
    Button guest;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        window = primaryStage;
        window.setTitle("MediaCenter");
        login = new Button("Login");
        GridPane.setConstraints(login, 0, 0);
        guest = new Button("Guest");
        GridPane.setConstraints(guest, 0, ROW_INDEX);

        login.setOnAction(e -> Login.display("Login", "Insira dados"));
        guest.setOnAction(e-> window.close());


        StackPane layout = new StackPane();
        layout.getChildren().addAll(guest , login);


        grid.getChildren().addAll(guest, login);
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.setMaximized(true);
        window.show();
        window.show();
    }

}