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
public class JamThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread a = new Thread(new Thread1());
//        a.start();
        a.run();
        Thread2 b = new Thread2();
//        b.start();
        b.run();
    }
    
}
