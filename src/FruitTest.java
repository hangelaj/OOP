public class FruitTest {
    public static void main(String[] args) {
        // first fruit Apple
        Fruit apple = new Fruit(" The first fruit is Apple", " The colour is Red", " The taste is Sweet",  100, 3, true, 1.5);
        System.out.println(apple.getName()); // Output: Apple
        System.out.println(apple.getColor()); // Output: Red
        System.out.println(apple.getTaste()); // Output: Sweet
        System.out.println(apple.isOrganic()); // Output: true
        System.out.println(apple.getPrice()); // Output: 0.5
        apple.setName("Green Apple");
        System.out.println(apple.getName()); // Output: Green Apple
// second fruit Banana
        Fruit Banana = new Fruit(" The second fruit is Banana", "The colour is Yellow", " The taste is Sweet", 200, 3, true, 1.8);
        System.out.println(Banana.getName()); // Output: Banana
        System.out.println(Banana.getColor()); // Output: Red
        System.out.println(Banana.getTaste()); // Output: Sweet
        System.out.println(Banana.isOrganic()); // Output: true
        System.out.println(Banana.getPrice()); // Output: 0.8
        Banana.setName("Yellow Banana");
        System.out.println(Banana.getName()); // Output: Yellow Banana
// third fruit Strawberry
        Fruit Strawberry = new Fruit("The third fruit is Strawberry", " The colour is Red", " The taste is Sweet", 150, 3, true, 2.00);
        System.out.println(Strawberry.getName()); // Output: Strawberry
        System.out.println(Strawberry.getColor()); // Output: Red
        System.out.println(Strawberry.getTaste()); // Output: Sweet
        System.out.println(Strawberry.isOrganic()); // Output: true
        System.out.println(Strawberry.getPrice()); // Output: 0.8
        Banana.setName("Red Strawberry");
        System.out.println(Banana.getName()); // Output: Red Strawberry
    }
}