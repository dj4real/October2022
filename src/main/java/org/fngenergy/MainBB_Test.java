package org.fngenergy;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

public class MainBB_Test {
     @Test
    public  void runTest() {
        //Logical Operators
        //Logical AND &&
        int a = 20;
        System.out.println(a<21 && a<28);

        //Logical OR ||
        int b = 5;
        System.out.println(b>5 || b>4);

        //Logical NOT !
        int c = 20;
        System.out.println(!(c<21 && c<28));

    }
}
