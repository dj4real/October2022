package Java8.lambda_package;

public class LambdaExpressionWithSingleParam {
    public static void main(String[] args) {
        // Lambda expression with single param
        Greatable2 greatable2 = (name)->{
            return " hello,"+name;
        };
        System.out.println(greatable2.great("Deji"));
    }
}
