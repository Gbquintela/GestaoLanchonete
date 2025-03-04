package View.Foods;

import Model.Foods.FoodsModel;
import Model.Foods.SnacksModel;

import java.util.List;
import java.util.Scanner;

public class FoodsView {
    private Scanner sc = new Scanner(System.in);

    public int showMenu(){
        System.out.print("""
                --------------- Registering Food ---------------
                1 - Snacks
                2 - Drinks
                3 - Desserts
                0 - Back
                """);
        return sc.nextInt();
    }

    public SnacksModel registerSnacks(){
        sc.nextLine(); // Limpa o buffer, evitando erro!
        System.out.print("Name Snack: ");
        String name = sc.nextLine();
        System.out.print("Description Snack: ");
        String description = sc.nextLine();
        System.out.print("Ingredients: ");
        String ingredients = sc.nextLine();
        System.out.print("Price Snack: ");
        double price = sc.nextDouble();

        return new SnacksModel(name, description, ingredients, price);
    }
}
