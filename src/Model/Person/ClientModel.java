package Model.Person;

// Classe Filha
public class ClientModel extends PersonModel{
    public ClientModel(String name, String cpf, String userName, String email, String cellphone , String passWord , int id) {
        super(name, cpf, userName, email, cellphone, passWord, id);
    }
}
