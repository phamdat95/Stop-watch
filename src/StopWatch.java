import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    private StopWatch(){
        Date date = new Date();
        startTime = date.getTime();
        endTime = date.getTime();
    }

    private long start(){
        Date date = new Date();
        return startTime = date.getTime();
    }

    private long stop(){
        Date date = new Date();
        return endTime = date.getTime();
    }

    private long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++){
            array[i] =(int) Math.floor(Math.random()*100);
        }
        int  temp =  0 ;
        for  ( int  i =  0 ; i <array.length -  1 ; i ++) {
            for  ( int  j =  0 ; j <array.length -  1  - i; j ++) {
                if  (array [j]> array [j +  1 ]) {
                    temp = temp + array [j];
                    array [j] = array [j +  1 ];
                    array [j +  1 ] = temp;
                }
            }
        }
        stopWatch.stop();
        
        System.out.println("Start Time: \n"+stopWatch.startTime + " milisecond");
        System.out.println("End Time: \n" + stopWatch.endTime + " milisecond");
        System.out.println("Time is to operate: \n" + stopWatch.getElapsedTime() + " milisecond");
    }
}
