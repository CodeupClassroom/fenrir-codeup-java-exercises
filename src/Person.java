public class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello there %s!%n", this.name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person kevinPowell = new Person("Kevin Powell");

        kevinPowell.sayHello();
    }
}
