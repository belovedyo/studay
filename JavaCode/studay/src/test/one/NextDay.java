package test.one;

import java.util.Scanner;

//        1.输入年月日，输出下一天
public class NextDay {
    public static void main(String[] args) {

//        2.输入
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

//      效验输入
        if(month>12||(day<1||day>31)){
            System.out.println("please write right Date!");
            return;
        }


//        3.处理年月日的进位
//        3.1处理month求最大天数（maxDays=>默认2月 maxDays=28天）
        int maxDays = 28;
        switch (month) {
            //小月处理
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            //大月处理
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                maxDays = 31;
                break;
            //二月单独处理
            default:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    maxDays = 29;
                }
        }

//        3.2计算明天日期
        day++;

//        3.3根据day与maxDays，进位年月日
        if (day > maxDays) {
            month++;
            day = 1;
        }
        if (month > 12) {
            year++;
            month = 1;
        }
//        4.输出
        System.out.println(year + "-" + month + "-" + day);

    }
}
