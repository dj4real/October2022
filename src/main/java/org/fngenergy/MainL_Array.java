package org.fngenergy;

public class MainL_Array {
    public static void main(String[] args) {
        String[] languages = {"English", "French", "Spanish", "Russian", "Yoruba", "Hausa", "Igbo"};
        System.out.println(languages.length);
        String[] Cities = {"Abuja", "Lagos", "Ibadan", "Kano", "Aba", "Port-Harcourt"};

        //Using try catch to handle exceptions
        try {
            System.out.println(languages[7]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(languages[2]);
        System.out.println(languages[6]);

        System.out.println(Cities[1]);
        System.out.println(Cities[5]);
        try {
            System.out.println(Cities[6]);
        } catch (Exception e) {
            System.out.println(e);

        for (String B : languages) {
            System.out.println(B);}

            int[] myNum = {5, 10, 15, 20, 25};
            System.out.println(myNum.length);
            for (int c : myNum) {
                System.out.println(c);                }
        }


        }


    }
