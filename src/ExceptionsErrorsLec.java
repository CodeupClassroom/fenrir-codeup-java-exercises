public class ExceptionsErrorsLec {

    public static void main(String[] args) throws Exception {

        //Errors = not really our capability to deal with

        //Exceptions we can work with - we can look at CHECKING for them (while compiling) or attempt to provide structures to find them during runtime (try - catch block)

        //We've seen exceptions before

        //Usually have a helpful message that contextualized WHAT and WHERE

//        int[] nums = {777, 222, 0};
//        System.out.println(nums[3]);

//        You can tell Java to THROW an exception
        //That will render code after that Exception to be unreachable


        //First: Try some code. . something BAD might happen
        try {
            System.out.println("I did hydrate - WITH COFFEE");
            //Throwing
//            throw new Exception("Message in exception - hydrate plz");


                int[] nums = {777, 222, 0};
                System.out.println(nums[3]);


        } //Okay: First, look for this SPECIFIC bad thing to happen: [provide ways to deal with that]
        catch (ArrayIndexOutOfBoundsException exceptionObject){
            exceptionObject.printStackTrace();
            System.out.println("We have triggered this ArrayIndexOutOfBoundsException");

//       //Call method to deal with ArrayProblem - I do not want to see the stack trace
        } //Second catch: if ANY bad thing happens, do this.. instead:
        catch (Exception exceptionObject){
            System.out.println("Exceptions! Generic message here");
            System.out.println("This is the getMessage() metthod: " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } finally {
            System.out.println("Always do things in this area");
        }


//









    }

}
