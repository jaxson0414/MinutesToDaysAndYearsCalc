/* convert given minutes to years and days. print output as XX min = YY y and ZZ d . create method as printYearsAndDays with parameter long named minutes. return -1 if minutes is less than 0.
EXAMPLES OF INPUT/OUTPUT:

printYearsAndDays(525600); should print "525600 min = 1 y and 0 d"
printYearsAndDays(1051200); should print "1051200 min = 2 y and 0 d"
printYearsAndDays(561600); should print "561600 min = 1 y and 25 d"
*/
public class programme {
    public static long printYearsAndDays (long minutes){
        if(minutes<0) {
            return -1;
        }else {
            long days = minutes/ 1440;
            long years = days/ 365;
            long remainingDays = days% 365;
            System.out.println(minutes + " min = " + years + "y and " + remainingDays + " d");
            return 1;
            }

    }

    public static void main(String[] args) {
        printYearsAndDays(908000);
    }
}
