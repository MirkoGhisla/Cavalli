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
public class MyThreadCavalli extends Thread{

    private DatiCondivisi d;
    private String cloppete;
    
    public MyThreadCavalli(String cloppete, DatiCondivisi d){
        this.cloppete=cloppete;
        this.d=d;
    }
    
    @Override
    public void run(){
        for (int i=0; i<=50;i++){
            d.push(cloppete);
        }
    }
}
