package Controller.Person;

import Model.Person.AdministratorModel;
import Model.Person.ClientModel;
import Model.Person.EmployeeModel;
import Model.Person.PersonModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonController {
    @FXML
    private Button buttonRegister1, buttonLogin, buttonSaveRegister;

    @FXML
    private TextField name, username, cpf, email, cellphone;

    @FXML
    private PasswordField password;

    private final List<AdministratorModel> administratorModelList = new ArrayList<>();
    private final List<EmployeeModel> employeeModelList = new ArrayList<>();
    private final List<ClientModel> clientModelList = new ArrayList<>();
    private final List<PersonModel> personModelList = new ArrayList<>();

    @FXML
    public void loginUser(ActionEvent event) {
        String userName = username.getText();
        String passwordField = password.getText();

        for (AdministratorModel adm : administratorModelList) {
            if (adm instanceof AdministratorModel) {
                if (adm.getUserName().equals(userName) && adm.getPassWord().equals(passwordField)) {
                    System.out.println("Login Successfully!");
                }
            }
        }
        for (EmployeeModel employee : employeeModelList) {
            if (employee instanceof EmployeeModel) {
                if (employee.getUserName().equals(userName) && employee.getPassWord().equals(passwordField)) {
                    System.out.println("Login Successfully!");
                }
            }
        }
        for (ClientModel client : clientModelList) {
            if (client instanceof ClientModel) {
                if (client.getUserName().equals(userName) && client.getPassWord().equals(passwordField)) {
                    System.out.println("Login Successfully!");
                }
            }
        }
        System.out.println("Login falhou. Usuário ou senha incorretos.");
    }

    @FXML
    public void changeToRegisterScreen(ActionEvent event) {
        try {
            // Carrega o arquivo FXML da tela de registro
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Person/register.fxml"));
            Parent root = loader.load();

            // Obtém o Stage atual a partir do botão clicado
            Stage stage = (Stage) buttonRegister1.getScene().getWindow();

            // Define a nova cena no Stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Registre-se");

            // Exibe a nova cena
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao carregar a tela de registro: " + e.getMessage());
        }
    }

    @FXML
    public boolean registerClient() {
        // Adiciona novo cliente à lista
        String nameField = name.getText();
        String cpfField = cpf.getText();
        String passwordField = password.getText();
        String emailField = email.getText();
        String cellphoneField = cellphone.getText();
        String usernameField = username.getText();

        // Valida se os campos estão preenchidos
        if (nameField.isEmpty() || usernameField.isEmpty() || cpfField.isEmpty() || passwordField.isEmpty() || emailField.isEmpty() || cellphoneField.isEmpty()) {
            System.out.println("Todos os campos devem ser preenchidos.");
            return false;
        }

        // Adiciona o cliente à lista
        int id = clientModelList.size() + 1;
        clientModelList.add(new ClientModel(nameField, cpfField, passwordField, emailField, cellphoneField, usernameField, id));
        personModelList.addAll(clientModelList);

        System.out.println("Cliente registrado com sucesso!");
        return true;
    }

    @FXML
    public void executeRegister() {
        if (registerClient()) {
            try {
                // Carrega o arquivo FXML da tela de login
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Person/login.fxml"));
                Parent root = loader.load();

                // Obtém o Stage atual a partir do botão clicado
                Stage stage = (Stage) buttonSaveRegister.getScene().getWindow();

                // Define a nova cena no Stage
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Login");

                // Exibe a nova cena
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Erro ao carregar a tela de login: " + e.getMessage());
            }
        }
    }
}
