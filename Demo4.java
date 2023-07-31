public class Demo4 {
    public static void main(String[] args) {
        int year = 2023;
        int month = 12;
        int day = 28;
        int hour = 23;
        int min = 59;
        int second = 59;

        final String COLOR1 = "\u001B[32m" ;
        final String COLOR2 = "\u001B[33m" ;
        final String COLOR3 = "\u001B[34m" ;
        final String COLOR4 = "\u001B[35m" ;
        final String COLOR5 = "\u001B[36m" ;
        final String COLOR6 = "\u001B[37m" ;
        final String RESET = "\u001B[0m" ;

        System.out.printf("%s%d%13$s/%s%d%13$s/%s%d%13$s %s%d%13$s:%s%d%13$s:%s%d%13$s \n", COLOR1,month ,COLOR2, day ,COLOR3, year, COLOR4, hour,COLOR5, min, COLOR6, second, RESET);
   
    }
}
