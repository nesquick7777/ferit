/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV6.zadatak3;

/**
 *
 * @author Bole
 */
public class Riba implements Zivotinja{


    public Riba() {
    }
    
    @Override
    public void kreceSe(){
        System.out.println("Riba: plivam");
    }
    
    @Override
    public void vrsta() {
        System.out.println(this.getClass().toString());
    }
}
