public class Demo_task_b {
    public static void main(String[] args) {
        int age1 = 24;
        String name1 = "Alice";

        int age2 = 30;
        String name2 = "Bob";

        final String TITLE = "\033[1;34m";
        final String COLOR1 = "\033[35m";
        final String COLOR2 = "\033[32m";
        final String RESET = "\033[0m";

        System.out.println("\n+-------------+-----+");
        System.out.printf("| %1$sNAME%2$-12s| %1$5sAGE%2$s |",TITLE , RESET); 
        System.out.println("\n+-------------+-----+");
        System.out.printf("| %4$s%-12s%5$s|  %3$s%d%5$s |\n" ,name1, age1, COLOR1, COLOR2,RESET);
        System.out.printf("| %4$s%-12s%5$s|  %3$s%d%5$s |\n" ,name2, age2, COLOR1, COLOR2,RESET);
        System.out.println("+-------------+-----+");
    }
}
