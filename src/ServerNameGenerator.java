public class ServerNameGenerator {
    public static String[] adjArray = {"cool", "calm", "generous", "spicy", "gargantuan", "questionable", "diminutive", "texan", "colorful", "grumpy"};
    public static String[] nounArray = {"truck", "cat", "dog", "tower", "player", "aardvark", "raven", "planet", "tile", "satellite"};

    public static String returnWord(String[] inputArr){
      int ranNum =  (int)(Math.random() * (9) + 0);

      return inputArr[ranNum];
    }


    public static void main(String[] args) {

        System.out.printf("Your new server name is: %s-%s", ServerNameGenerator.returnWord(ServerNameGenerator.adjArray), ServerNameGenerator.returnWord(ServerNameGenerator.nounArray));
    }
}
