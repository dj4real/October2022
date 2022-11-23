package org.fngenergy;

import static java.lang.System.*;

public class MainG_NestedIf {
    public static void main(String[] args) {
        int dayOfTheWeek=10;
    if(dayOfTheWeek==1){
            out.println("Sunday");
    } else if (dayOfTheWeek==2){
        out.println("Monday");
    } else if (dayOfTheWeek==3){ out.println("Tuesday");
    } else if(dayOfTheWeek==4){ out.println("Wednesday");
    } else if (dayOfTheWeek==5){ out.println("Thursday");
    } else if (dayOfTheWeek==6){ out.println("Friday");
    } else if (dayOfTheWeek==7){ out.println("Saturday");
    } else {
            out.println("Please enter value between 1 and 7");}
    }
}
