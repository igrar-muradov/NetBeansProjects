/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lombok.SneakyThrows;
import main.thread.MyCallable;
import main.thread.MyCustomThreadFactory;
import main.thread.MyRunnable;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("run/...");
        ExecutorService service = Executors.newSingleThreadExecutor();
        MyCallable[] arr = new MyCallable[3];
        arr[0] = new MyCallable(1);
        arr[1] = new MyCallable(2);
        arr[2] = new MyCallable(3);
        
        List<Future<Object>> list = service.invokeAll(Arrays.asList(arr));
        Future f = list.get(0);
        
        service.shutdown();
        service.awaitTermination(6, TimeUnit.SECONDS);
        System.out.println("terminated");
        


    }

    
    
//  Executor service-in newSingleThreadExcecutor-u Threadleri novbe ile run eleme komek edir
//  yeni bir thread ishini bitirdikden sonra digeri ishe dushur
//  Bunu t1.start(); t1.join(); t2.start(); ile de ede bilerik
//  Executor srvis geriye Future qaytarir. yeni threadin statsu barede melumat ala bilersen
//  f.isDone();
    private static void singleThreadExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future f = service.submit(new MyRunnable(1));
        service.submit(new MyRunnable(2));
        service.submit(new MyRunnable(3));
    }

//  Maximum Thread sayini teyin edir    
    private static void fixedThreadPool() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable(i));
        }
    }
    @SneakyThrows
    private static void otherThreadPools(){
        // Ashagidaki 2 setir tam duzgun deyil. Chunki newCashedThreadPool verdiyimiz parametrleri ignore eleyir        
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(10, 15, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
        ExecutorService service1 = Executors.newCachedThreadPool(tpe.getThreadFactory());
        //Threadlar kill olsa da, service achiq qalir. onu sondumek lazimdi. proyektin baglanmasi uchun
        service1.shutdown();
        //5 saniye erzinde yeni thread yaramaga qoymur, gozleyir
        service1.awaitTermination(5, TimeUnit.SECONDS);
        
// Duzgun qayda ile Custom Thread Pool yaratmaq
        ExecutorService service2 = new ThreadPoolExecutor(10, 15, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));

//Default Thread Pool Factory vasitesile Thread Pool yaratmaq
        ExecutorService service3 = Executors.newCachedThreadPool();

//Default Thread Pool Factory vasitesile Thread Pool yaratmaq
        ExecutorService service4 = Executors.newCachedThreadPool(Executors.defaultThreadFactory());

//Custom Thread Pool Factory vasitesile Thread Pool yaratmaq
        ExecutorService service5 = Executors.newCachedThreadPool(MyCustomThreadFactory.customThreadFactory());

// Schedule thread. meselen 2 sanye sonra ishle
    }
    
    public static void ScheduledThreadPool(){
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);
        ScheduledFuture sf =ex.schedule(new MyRunnable(1), 2, TimeUnit.SECONDS);
        ex.shutdown();
    }

}
