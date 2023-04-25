public class FruitTest {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", "Red", "Sweet", 100, 3, true, 0.5);
        System.out.println(apple.getName()); // Output: Apple
        System.out.println(apple.getColor()); // Output: Red
        System.out.println(apple.getTaste()); // Output: Sweet
        System.out.println(apple.isOrganic()); // Output: true
        System.out.println(apple.getPrice()); // Output: 0.5
        apple.setName("Green Apple");
        System.out.println(apple.getName()); // Output: Green Apple

        Fruit Banana = new Fruit("Banana", "Yellow", "Sweet", 100, 3, true, 0.8);
        System.out.println(Banana.getName()); // Output: Banana
        System.out.println(Banana.getColor()); // Output: Red
        System.out.println(Banana.getTaste()); // Output: Sweet
        System.out.println(Banana.isOrganic()); // Output: true
        System.out.println(Banana.getPrice()); // Output: 0.8
        Banana.setName("Yellow Banana");
        System.out.println(Banana.getName()); // Output: Yellow Banana
    }
}