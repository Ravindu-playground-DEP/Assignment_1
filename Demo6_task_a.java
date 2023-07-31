public class Demo6_task_a{
    public static void main(String[] args) {
         /*System.out.println("[   50%   ]");*/
        
         int myInt1 = 5;
         int myInt2 = 0;
 
         final String RED_BACKGROUND = "\u001B[41m";
         final String GREEN_BACKGROUND = "\u001B[42m";
         final String RESET = "\u001B[0m";
 
         System.out.printf("%s[%5d%5$s%s%d%%   ]%5$s \n",RED_BACKGROUND , myInt1 ,GREEN_BACKGROUND, myInt2, RESET ); 
    }
}
