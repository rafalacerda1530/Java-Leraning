public class typesVariables {
    public static void main(String[] args) throws Exception {
        final int teste = 150;

        teste = 2000; /* Final variables cannot be changed */

        short number1 = 1;
        int normalNumber = 150;
        short number2 = normalNumber; /* Cannot use int inside short, can be used a cast (Short) */
    }
}
