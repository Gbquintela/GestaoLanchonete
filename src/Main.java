import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            // Carrega o arquivo FXML
            Parent root = FXMLLoader.load(getClass().getResource("/View/Person/login.fxml"));

            // Configura a cena
            Scene scene = new Scene(root, 1039, 559);

            // Configura a janela
            primaryStage.setTitle("Lanchonete dos amigos");
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args){
            launch(args);
        }
    }
