package Model.Person;

import java.util.ArrayList;
import java.util.List;

// Classe Mãe
public class PersonModel {
    // Declaração dos atributos
    private String name     ;
    private String cpf      ;
    private String userName ;
    private String email    ;
    private String cellphone;
    private String passWord ;
    private int id;

    // Declaração de uma lista privada que só irá ser acessada quando o Construtor da classe for acessado!
    // A mesma está como Final para que sua referência não seja alterada, apenas seu conteúdo poderá ser alterado.
    private static final List<PersonModel> personModelList = new ArrayList<>();

    // Inicialização dos atributos
    public PersonModel(String name, String cpf, String userName, String email, String cellphone , String passWord , int id) {
        this.name = name;
        this.cpf = cpf;
        this.userName = userName;
        this.email = email;
        this.cellphone = cellphone;
        this.passWord = passWord;
        this.id = id;
        personModelList.add(this); // Adiciono todos os atributos para a lista
    }

    // Getters e Setters responsáveis por atribuir e exibir os valores de cada atributo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
