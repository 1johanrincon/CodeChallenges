package practice;

public class DayoftheProgrammer {

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1918));
    }

    public static String dayOfProgrammer(int year) {
        // Write your code here
        if(year == 1918 ){
            return "26.09."+year;
        }
        if(year < 1918 && year % 4 == 0){
            return "12.09."+year;
        }
        if(year < 1918 && year % 4 != 0){
            return "13.09."+year;
        }
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return "12.09."+year;
        }
        return "13.09."+year;
    }

}
