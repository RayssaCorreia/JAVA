package modelos;

public class ImagemHandler {

    private int myValue;
    private double myDoubleValue;


    public ImagemHandler() {
    }

    public ImagemHandler(int myValue, double myDoubleValue) {
        this.myValue = myValue;
        this.myDoubleValue = myDoubleValue;
    }


    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public double getMyDoubleValue() {
        return myDoubleValue;
    }
//
    public void setMyDoubleValue(double myDoubleValue) {
        this.myDoubleValue = myDoubleValue;
    }
}

