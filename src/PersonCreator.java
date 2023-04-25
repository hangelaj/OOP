public class PersonCreator {

    public static void main(String[] args) {
        Person person01 = new Person("James Peterson", 34, 180, 73.5);
        Person person02 = new Person("Bob Thornley", 25, 171, 68.2);
        Person person03 = new Person("Jemal Hangela", 35, 178, 70.2);
// first person
        System.out.println("The first is Person  details:");
        System.out.println("Name is: " + person01.getName());
        System.out.println("Age is: " + person01.getAge());
        System.out.println("Height is: " + person01.getHeight() + "cm");
        System.out.println("Weight is: " + person01.getWeight() + "lbs");
//first Person details after growing older
        person01.growOlder();
        System.out.println("The first Person details after growing older:");
        System.out.println("Name is: " + person01.getName());
        System.out.println("Age is: " + person01.getAge());
        System.out.println("Height is: " + person01.getHeight() + "cm");
        System.out.println("Weight is: " + person01.getWeight() + "lbs");
// the second person
        System.out.println("The second is Person  details:");
        System.out.println("Name is: " + person02.getName());
        System.out.println("Age is: " + person02.getAge());
        System.out.println("Height is: " + person02.getHeight() + "cm");
        System.out.println("Weight is: " + person02.getWeight() + "lbs");
// the second Person details after growing older
        person02.growOlder();
        System.out.println("The second Person details after growing older:");
        System.out.println("Name is: " + person02.getName());
        System.out.println("Age is: " + person02.getAge());
        System.out.println("Height is: " + person02.getHeight() + "cm");
        System.out.println("Weight is: " + person02.getWeight() + "lbs");
  // the third person
        System.out.println("the third is Person  details:");
        System.out.println("Name is: " + person03.getName());
        System.out.println("Age is: " + person03.getAge());
        System.out.println("Height is: " + person03.getHeight() + "cm");
        System.out.println("Weight is: " + person03.getWeight() + "lbs");
// the third Person details after growing older
        person01.growOlder();
        System.out.println(" The third Person details after growing older:");
        System.out.println("Name is: " + person03.getName());
        System.out.println("Age is: " + person03.getAge());
        System.out.println("Height is: " + person03.getHeight() + "cm");
        System.out.println("Weight is : " + person03.getWeight() + "lbs");
    }

}

