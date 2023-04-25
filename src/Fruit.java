public class Fruit {
    private String name;
    private String color;
    private String taste;
    private int weight;
    private int size;
    private boolean isOrganic;
    private double price;

    public Fruit(String name, String color, String taste, int weight, int size, boolean isOrganic, double price) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.weight = weight;
        this.size = size;
        this.isOrganic = isOrganic;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDelicious() {
        return true; // Just for the sake of example
    }
}