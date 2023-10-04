package arrays_lecture;

public class Dog {
    private String breed;

    private String name;

    private int age;

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed () {
        return this.breed;
    }

    public String getName () {
        return this.name;
    }
    public int getAge () {
        return this.age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
