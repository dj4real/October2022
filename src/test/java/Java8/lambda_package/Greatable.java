package Java8.lambda_package;

public interface Greatable {
    String hello();
    class LambdaExpressionNoParam{
        public static void main(String[] args) {
            //Lambda expression with no parameter
            Greatable s = ()-> {return "Hello World";};
            System.out.println(s.hello());
        }
    }
}
