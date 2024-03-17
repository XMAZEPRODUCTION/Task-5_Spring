package web.model;

public class Car {
    String model;
    String color;
    int serials;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerials() {
        return serials;
    }

    public void setSerials(int serials) {
        this.serials = serials;
    }

    public Car(String model, String color, int serials) {
        this.model = model;
        this.color = color;
        this.serials = serials;
    }
}
