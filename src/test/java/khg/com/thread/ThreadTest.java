package khg.com.thread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ThreadTest {

    @Test
    public void ThreadTest() {

        List<Future> futureList = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            int finalI = i;
            Future future = CommonThreadPool.submit(() -> {
                try {
                    System.out.println(finalI + "    我执行了。。。");
                    Thread.sleep(5000L);
                    System.out.println(finalI + "    我执行完了。。。");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            futureList.add(future);
        }

        //主线程处理其他工作,让子线程异步去执行.
        mainThreadOtherWork();
        System.out.println("now waiting sub thread done.");
        //主线程其他工作完毕,等待子线程的结束, 调用future.get()系列的方法即可。

        try {
            for (Future future : futureList) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void mainThreadOtherWork() {
        System.out.println("主线程开始工作");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程干完了");
    }

}
