public class TestClass {

    public static void main(String args[]) {
        ComputeMethods meth = new ComputeMethods();


        System.out.println("Temp in Celsius is: "+meth.fToC(89)+"C");


        System.out.println("Hypotenuse = "+meth.hypotenuse(4.0,3.0));
        System.out.println("Sum of two Dice Rolls: "+meth.roll());
        //Create an instance of ComputeMethods,
        //invoke the 3 methods and display their results

    }
}
