package arrays_lecture;


import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args) {
        //dataType varName = value

        int[] nums = new int[3];

//        nums[0] = 1;
//        nums[1] = 20;
//        nums[2] = 42;

//        System.out.println(nums);

//        System.out.println(nums[0]);

//        System.out.println(nums.length);

//        for (int i = 0; i < nums.length ; i++) {
//            System.out.println(nums[i]);
//        }

        Dog d1 = new Dog("Dalmatian", "Domino", 3);
        Dog d2 = new Dog("Chihuahua", "Pickles", 20);
        Dog d3 = new Dog("Rotweiler", "Bruce", 12);
        Dog d4 = new Dog("Yorkie", "Yappy", 1);

        Dog[] dogs = new Dog[4];

        dogs[0] = d1;
        dogs[1] = d2;
        dogs[2] = d3;
        dogs[3] = d4;

//        Arrays.sort(dogs);

//        for (Dog dog : dogs) {
//            System.out.println(dog.getName());
//        }

//        for (int i = 0; i < dogs.length; i++) {
//            System.out.println(dogs[i]);
//        }

        String[] codingLanguages = {"html", "css" ,"javascript", "java"};

//        for (String language : codingLanguages) {
//            System.out.println(language);
//        }

        String[] dogArray = new String[4];

        Arrays.fill(dogArray, "dog");
//        for (String dog: dogArray) {
//            System.out.println(dog);
//        }

        int[] numArray = {145,30,2,68,47,30,-15};

//        Arrays.fill(numArray, 0, 4, 2);

        Arrays.sort(numArray);

        System.out.println(Arrays.toString(numArray));
//        for (int num : numArray) {
//            System.out.println(num);
//        }
        int[] numArray2 = {1,2,3,4,5,6,7};


//        System.out.println(Arrays.equals(numArray2, numArray));

       String[] dogArray2 = Arrays.copyOf(dogArray, 100);
//        for (String dog : dogArray2) {
//            System.out.println(dog);
//        }

//        System.out.println(Arrays.equals(dogArray, dogArray2));

        dogArray[0] = "cat";

//        for (String dog : dogArray) {
//            System.out.println(dog);
//        }
        Arrays.fill(dogArray2, 4, 100, "cat");

        Arrays.sort(dogArray2);

//        for (String dog : dogArray2) {
//            System.out.println(dog);
//        }


    }



}
