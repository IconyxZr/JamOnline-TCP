/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author ASUS
 */
public class Thread2 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Angka dicetak dari Thread 2 = "+i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
