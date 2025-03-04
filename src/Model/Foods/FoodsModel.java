package Model.Foods;

import java.util.ArrayList;
import java.util.List;

// Classe Mãe
public class FoodsModel {
    // Declarando os atributos
    private String name;
    private String description;
    private String ingredients;
    private double price;

    // Declaração de uma lista privada que só irá ser acessada quando o Construtor da classe for acessado!
    // A mesma está como Final para que sua referência não seja alterada, apenas seu conteúdo poderá ser alterado.
    private static final List<FoodsModel> foodsModelList = new ArrayList<>();

    // Inicialização dos atributos
    public FoodsModel(String name, String description, String ingredients, double price) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.price = price;
        foodsModelList.add(this); // Adiciono todos os atributos para a lista
    }

    // Getters e Setters responsáveis por atribuir e exibir os valores de cada atributo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }
}
