package dev.rayssa.app.models.products;

public abstract class HotDrink {

    private final int quantity;
    private final int temperature;
    private final int sugar;

    protected int getQuantity(){
        return quantity;
    }

    protected int getTemperature(){
        return temperature;
    }

    protected int getSugar(){
        return sugar;
    }

    public HotDrink(int quantity, int temperature, int sugar) {
        this.quantity = quantity;
        this.temperature = temperature;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "{" +
                "\"quantity\":" +  this.getQuantity() +
                ", \"temperature\":" + this.getTemperature() +
                ", \"sugar\":" + this.getSugar() +
                "}";
    }
}
