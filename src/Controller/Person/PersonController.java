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
    private Button buttonRegister1, buttonLogin;

    @FXML
    private TextField username, name, cpf, email, cellphone;

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
    public void registerClient() throws IOException {
        // Troca para a tela de registro
        Stage stage = (Stage) buttonRegister1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/Person/register.fxml"))));
        stage.setTitle("Registre-se");

        // Adiciona novo cliente à lista
        if (!name.getText().isEmpty() && !username.getText().isEmpty() && !cpf.getText().isEmpty() && !password.getText().isEmpty() && !email.getText().isEmpty() && !cellphone.getText().isEmpty()) {
            int id = clientModelList.size() + 1;
            clientModelList.add(new ClientModel(name.getText(), cpf.getText(), username.getText(), email.getText(), cellphone.getText(), password.getText(), id));
        }
    }
}
