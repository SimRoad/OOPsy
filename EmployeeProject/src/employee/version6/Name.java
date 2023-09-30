/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;


/**
 *
 * @author user
 */
public class Name {
    private String firstName;
    private String midName;
    private String lastName;
    private String[] suffix = {""};

    public Name() {
        this.firstName = "Jane";
        this.lastName = "Dane";
        this.midName = " ";
    }

    public Name(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
        this.midName = " ";
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = " ";
    }

    public Name(String firstName, String midInitial, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = midInitial;
    }
    

    public Name(String firstName, String midInitial, String lastName, String ...suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = midInitial;
        this.suffix = suffix;
    }
    
    public Name(Name name){
        this.firstName = name.firstName;
        this.lastName = name.lastName;
        this.midName = name.midName;
        this.suffix = name.suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getSuffix() {
        String sufString = "";
        for(int x = 0; x < suffix.length; x++){
            sufString += (x + 1 != suffix.length) ? suffix[x] + " " : suffix[x];
        }
        
        return sufString;
    }

    public void setSuffix(String[] suffix) {
        this.suffix = suffix;
    }


    @Override
    public String toString() {
        String middle = midName == " " ? "" : midName.charAt(0) + ". ";
        return firstName + " " + middle + lastName + " "+ this.getSuffix();
    }
    
}
