package dev.rayssa.app.models.machine;

import dev.rayssa.app.models.products.Chocolate;
import dev.rayssa.app.models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine{
    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }
}
