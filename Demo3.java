public class Demo3 {
    public static void main(String[] args) {
        int code = 123;
        int second_part = 456;
        int last_part = 7890;

        final String COLOR = "\033[32m" ; 
        final String RESET = "\033[0m" ;

        System.out.printf("(%s%d%s) %03d-%04d \n",COLOR,code,RESET,second_part,last_part);
    }
}
