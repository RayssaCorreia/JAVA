package dev.rayssa.app.models.machine;
import dev.rayssa.app.models.products.HotDrink;
import dev.rayssa.app.models.products.Tea;

public class TeaMachine implements HotDrinkMachine{

//    public Tae makeTea(){
//        return new Tea();
//    };

    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }
}
