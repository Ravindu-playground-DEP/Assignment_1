public class Demo_task_c {
    public static void main(String[] args) {
        int num1 = 3966936;
        int num2 = 8336817;

        String city1 = "Los Angeles";
        String city2 = "New";
        String city3 = "York";

        String state1 ="California";        

        final String TITLE = "\033[1;36m";
        final String COLOR1 = "\033[34m";
        final String COLOR2 = "\033[33m";
        final String COLOR3 = "\033[35m";
        final String RESET = "\033[0m";

        System.out.println("+-----------------+-------------+------------+");
        System.out.printf("| %1$sCITY%2$-16s| %1$sSTATE%2$-11s| %1$sPOPULATION%2$s |\n",TITLE , RESET); 
        System.out.println("+-----------------+-------------+------------+");
        System.out.printf("| %6$s%-16s%5$s| %7$s%-12s%5$s|  %4$s%3$,d%5$s |\n", city1, state1, num1,COLOR1, RESET,COLOR2,COLOR3);
        System.out.printf("| %4$s%1$s %2$-12s%6$s| %7$s%1$s %2$-8s%6$s|  %3$s%5$,d%6$s |\n", city2, city3 ,COLOR1, COLOR2 , num2, RESET, COLOR3);
        System.out.println("+-----------------+-------------+------------+");
  
    }
}
