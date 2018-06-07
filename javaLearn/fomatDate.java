
package javaLearn;

import java.util.Date;
import java.util.Locale;

public class fomatDate {
    public static void main(String[] args){
        Date today = new Date();
        String a = String.format(Locale.US,"%tb",today);

        System.out.println("格式化后的字符串为月份的英文缩写"+a);
    }
}
