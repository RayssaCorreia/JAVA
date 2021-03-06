package dev.rayssa.app.models.products;

public abstract class HotDrink {

    private Integer quantity;
    private Integer temperature;
    private Integer sugar;

    private HotDrink(){
    }

    public HotDrink(HotDrink.DefaultDrink defaultDrink) {
        this.quantity = defaultDrink.getQuantity();
        this.temperature = defaultDrink.getTemperature();
        this.sugar = defaultDrink.getSugar();
    }

    public static class DefaultDrink extends HotDrink {
        public  DefaultDrink (int quantity, int temperature, int sugar){
            setQuantity(quantity);
            setTemperature(temperature);
            setSugar(sugar);
        }

    }

    protected Integer getQuantity(){
        return quantity;
    }

    protected Integer getTemperature(){
        return temperature;
    }

    protected Integer getSugar(){
        return sugar;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public void setSugar(Integer sugar) {
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
