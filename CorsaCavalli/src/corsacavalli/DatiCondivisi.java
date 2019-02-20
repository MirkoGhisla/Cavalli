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
public class DatiCondivisi {
    private String[] v;
    private int numEl;
    
    public DatiCondivisi(){
        v=new String[250];
        numEl = 0;
    }
    
    synchronized public void push(String s){
        if (numEl<250){
            v[numEl] = s;
            numEl++;        
        }
    }
    
    synchronized public void visualizza(){
        for (int i=0; i<250; i++){
            System.out.println(v[i]);
        }
    }
}
