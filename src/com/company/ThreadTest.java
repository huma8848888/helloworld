package com.company;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadTest {
    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public synchronized void offer(Integer num){
        queue.add(num);
    }

    public synchronized Integer get(){
        if(!queue.isEmpty()){
            return queue.poll();
        } else {
            try{
                Thread.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            } finally {
                return null;
            }
        }
    }
}
