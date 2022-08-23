import java.util.Random;
import java.math.*;

public class ComputeMethods {

    public double fToC (double degreesF) {
    double cel;
    cel=(degreesF-32)*(0.55556);
    return(cel);
    }


    public double hypotenuse (double a, double b){
        double c;
        c=Math.sqrt((a*a)+(b*b));


    return(c);
    }


    public int roll(){

        Random rand = new Random();
        int die1 = rand.nextInt(6)+1;
        int die2 = rand.nextInt(6)+1;
        int sum=die1+die2;
        return (sum);
    }

}

