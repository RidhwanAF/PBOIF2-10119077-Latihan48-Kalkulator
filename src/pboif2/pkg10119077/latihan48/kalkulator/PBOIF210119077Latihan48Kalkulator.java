/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan48.kalkulator;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Kalkulator
 */
public class PBOIF210119077Latihan48Kalkulator {

    
    public static void main(String[] args) {
        Kalkulator objKalkulator = new Kalkulator();
        
        objKalkulator.setValue1(7);
        System.out.println("VALUE 1 = "+objKalkulator.getValue1());
        objKalkulator.setValue2(5);
        System.out.println("VALUE 2 = "+objKalkulator.getValue2());
        objKalkulator.setNameProject();
        objKalkulator.setNoteProject();
        System.out.println("Result Add is = "+objKalkulator.add(objKalkulator.getValue1(), objKalkulator.getValue2()));
        System.out.println("Result Minus is = "+objKalkulator.minus(objKalkulator.getValue1(), objKalkulator.getValue2()));
        System.out.println("Result Multiple is = "+objKalkulator.multiplication(objKalkulator.getValue1(), objKalkulator.getValue2()));
        System.out.println("Result Division is = "+objKalkulator.division(objKalkulator.getValue1(), objKalkulator.getValue2()));
    }
    
}
