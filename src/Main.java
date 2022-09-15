import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println( sqrt(4));
    }
   public static double sqrt(double t){
        UnaryOperator <Double>method= (a) -> Math.sqrt(a) ;
        return method.apply(t);
    }
}
