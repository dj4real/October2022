package Java8.lambda_package;

public interface Drawable {
    void draw ();
    public class LambdaExpressionExample{
        public static void main(String[] args) {
            int length=10;
            //Implementing an interface without using Lambda expression
            Drawable drawable = new Drawable() {
                @Override
                public void draw() {
                    System.out.println("Length without Lambda is :" + length);
                }
            };
            drawable.draw();
            //implementing an interface with lambda expressions
            Drawable  drawable2=()-> {
                System.out.println("Length using Lambda is :" + length);
            };
            drawable2.draw();
        }
    }
}
