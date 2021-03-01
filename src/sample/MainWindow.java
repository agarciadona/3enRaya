package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainWindow implements Initializable {
    @FXML private Button btn00;
    @FXML private MenuItem menuItemTheme;
    @FXML private MenuItem menuItemAbout;
    @FXML private GridPane grid0;
    @FXML private VBox vbox0;

    private Scene scene;
    private Stage stage;


    public void click(ActionEvent actionEvent) {
        Button bt = (Button) actionEvent.getSource();
        bt.setText("X");
        System.out.println("click");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void mclick(MouseEvent mouseEvent) {
    }

    public void clickButton(ActionEvent actionEvent) {
        Button b = (Button) actionEvent.getSource();
        b.setText("X");

    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setStage(Stage primaryStage) {
        this.stage = primaryStage;
    }

    public void clickClose(ActionEvent actionEvent) {
        stage.close();
    }

    public void clickmenuItemTheme(ActionEvent actionEvent) {
        String mode;
        scene.getStylesheets().clear();
        if(menuItemTheme.getText().equals("Dark")) {
            scene.getStylesheets().add("css/Dark.css");
            mode = "Light";
        }else {
            scene.getStylesheets().add("css/Light.css");
            mode = "Dark";
        }
        menuItemTheme.setText(mode);
    }
/*
    public void clickMenuItemAbout(ActionEvent actionEvent) throws IOException {
        if(menuItemAbout.getText().equals("About")) {
            vbox0.getChildren().remove(grid0);
            VBox temp = FXMLLoader.load(getClass().getResource("/fxml/About.fxml"));
            vbox0.getChildren().add(temp);
            menuItemAbout.setText("Joc");
        }else {
            vbox0.getChildren().remove(1);
            vbox0.getChildren().add(grid0);
            menuItemAbout.setText("About");
        }
    }

 */
}