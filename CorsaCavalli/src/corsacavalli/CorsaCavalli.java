/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsacavalli;

/**
 *
 * @author ghislanzoni_mirko
 */
public class CorsaCavalli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThreadCavalli th1 = new MyThreadCavalli( "Clop1");
        MyThreadCavalli th2 = new MyThreadCavalli( "Clop2");
        MyThreadCavalli th3 = new MyThreadCavalli( "Clop3");
        MyThreadCavalli th4 = new MyThreadCavalli("Clop4");
        MyThreadCavalli th5 = new MyThreadCavalli("Clop5");

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();

        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();

        } catch (InterruptedException e) {
        }

    }

}
