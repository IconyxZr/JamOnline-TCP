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
public class Thread1 implements Runnable{

    int angka;
    public void Thread1(int angka){
        this.angka=angka;
    }
    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i = 1;i<=10;i++){
            System.out.println("Angka dari Thread 1 = "+i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
    
}
