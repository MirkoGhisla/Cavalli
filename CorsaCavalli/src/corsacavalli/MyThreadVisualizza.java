/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsacavalli;

/**
 *
 * @author Mirko Ghislanzoni
 */
public class MyThreadVisualizza extends Thread {
    private DatiCondivisi d;

    
    public MyThreadVisualizza(DatiCondivisi d){
        this.d=d;
    }
    
    @Override
    public void run(){
      d.visualizza();
    }
}
