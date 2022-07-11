package dev.rayssa.app.models.machine;
import dev.rayssa.app.models.products.Coffee;
import dev.rayssa.app.models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine {

//    public Coffee makeCoffee(){
//        return new Coffee();
//    };

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }
}
