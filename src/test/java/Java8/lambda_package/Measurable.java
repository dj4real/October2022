package Java8.lambda_package;

public interface Measurable {
    int measure(int x,int y,int z);
}
class LambdaExpressionMultipleParams{
    public static void main(String[] args) {
        //Multiple prarms in Lambda expression
       Measurable area = (x,y,z)->(x*y*z);
        System.out.println(area.measure( 5,10 ,34));
//Multiple prarms with data type  in Lambda expression
        Measurable area2 = (int p, int q,int r)->(p*10*q*q);
        System.out.println(area2.measure( 5,4,6));
    }
}
