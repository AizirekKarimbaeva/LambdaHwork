public class Main {
    public static void main(String[] args) {
      sqrt(16.0) ;
    }
    public static UnaryOperator<Double> sqrt(Double sqrt){
        UnaryOperator<Double> unaryOperator;
        unaryOperator =(num)-> System.out.println(Math.sqrt(num));
       unaryOperator.met(sqrt);
        return unaryOperator;
    }
}