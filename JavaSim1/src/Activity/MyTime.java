/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity;

/**
 *
 * @author User
 */
public class MyTime {

    private int hours;
    private int minutes;
    private int seconds;
    private boolean meredian;

    public MyTime() {
        
    }
    
    public MyTime(int hours, int minutes, int seconds, boolean meredian) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
        this.meredian = meredian;
    }

    public void setHours(int hours) {
        if (hours <= 12 && hours >= 1) {
            this.hours = hours;
        } else if(hours > 12){
            this.advanceTime((60 * 60) *hours); 
        }
    }

    public void setMinutes(int minutes) {
        if (minutes < 60 && minutes >= 1) {
            this.minutes = minutes;
        } else if(minutes >= 60){
            this.advanceTime(60 * minutes);
        }
    }

    public void setSeconds(int seconds) {
        if (seconds < 60 && seconds >= 1) {
            this.seconds = seconds;
        } else if(seconds >= 60){
            this.advanceTime(seconds);
        }
    }

    public void setMeredian(boolean meredian) {
        this.meredian = meredian;
    }

    public int getHours() {
        return hours;
    }

    public int getMin() {
        return minutes;
    }

    public int getSec() {
        return seconds;
    }

    public String getMeredian() {
        return meredian ? "AM" : "PM";
    }

    public void advanceTime(int seconds) {
        int newTime = this.seconds + seconds;
        if (newTime > 59) {
            this.minutes += newTime / 60;
            this.seconds = newTime % 60;
            if (this.minutes > 59) {
                newTime = this.minutes / 60;
                this.minutes = this.minutes % 60;
                
                for(;newTime > 12; newTime -= 12){
                    if(this.meredian == true) {
                        this.meredian = false;
                    } else {
                        this.meredian = true;
                    }
                }
                
//                this.hours += newTime;
                
                if(this.hours != 12 && (this.hours + newTime) >= 12){
                    if(this.meredian == true) {
                        this.meredian = false;
                    } else {
                        this.meredian = true;
                    }
                }
                
                this.hours += newTime;
                
                if(this.hours > 12){
                    this.hours -= 12;
                }
            }
        } else {
            this.seconds = newTime;
        }
    }

    public void tickBySecond() {
        this.advanceTime(1);
    }
    
    public void tickByMinute() {
        this.advanceTime(60);
    }
    
    public void tickByHour() {
        this.advanceTime(60*60);
    }
    
    public void displayTime12(){
        System.out.println(String.format("%d:%d:%d %s", this.hours, this.minutes, this.seconds, this.getMeredian()));
    }
    
    public void displayTime24(){
        int hours = this.hours;
        
        if(this.meredian == false && hours != 12){
            hours += 12;
        }
        
        if(this.meredian == true && hours == 12){
            hours = 0;
        }
        
        System.out.println(String.format("%d:%d:%d", hours, this.minutes, this.seconds));
    }
    
    @Override
    public String toString(){
        return String.format("%d:%d:%d %s", this.hours, this.minutes, this.seconds, this.getMeredian());
    }

}
