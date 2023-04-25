public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void growOlder() {
        this.setAge(this.getAge() + 1);
        this.setHeight(this.getHeight() - 1);
        this.setWeight(this.getWeight() - 0.5);
    }
}
