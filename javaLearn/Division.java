package javaLearn;

public class Division {
    public static  void main(String[] args){
        String s = "sdfsdxc sdfsdfcx;xdsdf,sdf;sd,fsdfsd,fsdfl,sd,fsdf";
        System.out.println("原来的字符长度是："+s.length());
        String[]  s1 = s.split(";|,");
        for(int i=0;i<s1.length;i++){
            System.out.println(s1[i]);

        }System.out.println("分行后的字符串数组的长度是："+s1.length);
    }
}
