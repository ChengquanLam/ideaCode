package javaLearn;


    public class xiancheng
    {
        private int j;
        public static void main(String[] args){
            xiancheng tt=new xiancheng();
            Inc inc=tt.new Inc();
            Dec dec=tt.new Dec();
            for(int i=0;i<2;i++){
                Thread t=new Thread(inc);
                t.start();
                t=new Thread(dec);
                t.start();
            }
        }
        private synchronized void inc(){
            j++;
            System.out.println(Thread.currentThread().getName()+"-inc:"+j);
        }
        private synchronized void dec(){
            j--;
            System.out.println(Thread.currentThread().getName()+"-dec:"+j);
        }
        class Inc implements Runnable{
            @Override
            //加override注解可以判断是否覆盖成功
            //ctrl+d  复制当前行
            public void run(){
                for(int i=0;i<100;i++){
                    inc();
                }
            }
        }
        class Dec implements Runnable{
            @Override
            public void run(){
                for(int i=0;i<100;i++){
                    dec();
                }
            }
        }
    }

