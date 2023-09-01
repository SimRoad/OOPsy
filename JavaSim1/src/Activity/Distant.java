/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity;

/**
 *
 * @author user
 */
public class Distant {
        public static void main(String[] args) {
        MyTime Clock = new MyTime();
        Clock.setHours(11); Clock.setMinutes(59); Clock.setSeconds(35); Clock.setMeredian(true);
        
        Clock.advanceTime(40);
        Clock.displayTime12();
        Clock.displayTime24();
    }
}
