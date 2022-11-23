package org.fngenergy;

public class MainE {
    public int max(int x , int y){
        if (x > y)
            return x ;
        else return y;
    }
    public int additionMethod(int x, int y) {return(x+y);}
    private int subtractionMethod(int x, int y) {return(x-y);}
    private int divisionMethod(int x, int y) {return(x*y);}
    private int multiplicationMethod(int x, int y) {return(x/y);}


    public static void main(String[] args) {
        MainE mainE = new MainE();
        System.out.println(mainE.max(100,20));
        System.out.println(mainE.additionMethod(100,20));
        System.out.println(mainE.subtractionMethod(100,20));
        System.out.println(mainE.multiplicationMethod(100,20));
        System.out.println(mainE.divisionMethod(100,20));

    }
}
