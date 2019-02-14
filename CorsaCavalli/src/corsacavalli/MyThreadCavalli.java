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
public class MyThreadCavalli extends Thread{

    private String cloppete;
    
    public MyThreadCavalli( String cloppete){
        this.cloppete=cloppete;
    }
    
    @Override
    public void run(){
        for (int i=0; i<=50;i++){
            
            System.out.println(cloppete);
            
        }
    }
}
