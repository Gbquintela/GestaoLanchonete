package View.Foods;

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
}
