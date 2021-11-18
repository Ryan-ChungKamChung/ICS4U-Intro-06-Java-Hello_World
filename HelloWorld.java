/*
 * The HelloWorld program displays "Hello, World!" whenever run.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-09-17
 */

/**
* This is the standard "Hello, World!" program.
*/
final class HelloWorld {

    /**
    * Prevents instantiation.
    * Throw an exception IllegalStateException when called.
    *
    * @throws IllegalStateException
    *
    */
    private HelloWorld() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Prints "Hello, World!".
     *
     * @param args No args will be used.
     * */
    public static void main(final String[] args) {

        System.out.println("Hello, World!");

        System.out.println("\nDone.");
    }

}

