package org.fngenergy;

public class MainO_DefaultConstructor {
    int num;
    int juc=45;
    int y= num+juc+50;


    public static void main(String args[]) {
        System.out.println(new MainO_DefaultConstructor().num);
        System.out.println(new MainO_DefaultConstructor().y+5);
    } //Outputs 0


}
