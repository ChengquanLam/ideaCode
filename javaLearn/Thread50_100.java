package javaLearn;
public class Thread50_100 {

    private static boolean bShouldMain = false;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		new Thread(){
		    @Override
		public void run()
		{
			for(int i=0;i<50;i++)
			{
				for(int j=0;j<10;j++)
				{
					System.out.println("i=" + i + ",j=" + j);
				}
			}
		}

	}.start();


        //final String str = new String("");

        new Thread(
                new Runnable()
                {   @Override
                    public void run()
                    {
                        for(int i=0;i<50;i++)
                        {
                            synchronized (Thread50_100.class) {
                                if(bShouldMain)
                                {
                                    try {
                                        Thread50_100.class.wait();}
                                    catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                for(int j=0;j<10;j++)
                                {
                                    System.out.println(
                                            Thread.currentThread().getName() +
                                                    "i=" + i + ",j=" + j);
                                }
                                bShouldMain = true;
                                Thread50_100.class.notify();
                            }
                        }
                    }
                }
        ).start();

        for(int i=0;i<50;i++)
        {
            synchronized (Thread50_100.class) {
                if(!bShouldMain)
                {
                    try {
                        Thread50_100.class.wait();}
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for(int j=0;j<5;j++)
                {
                    System.out.println(
                            Thread.currentThread().getName() +
                                    "i=" + i + ",j=" + j);
                }
                bShouldMain = false;
                Thread50_100.class.notify();
            }
        }
    }

}
