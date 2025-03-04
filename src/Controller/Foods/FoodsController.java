package Controller.Foods;

import Model.Foods.FoodsModel;
import View.Foods.FoodsView;

import java.util.ArrayList;
import java.util.List;

public class FoodsController {
    private final List<FoodsModel> foodsModelList = new ArrayList<>();

    public void registrationFood(FoodsModel food){
        foodsModelList.add(food);
    }

    public List<FoodsModel> showFood(){
        return foodsModelList;
    }
}
