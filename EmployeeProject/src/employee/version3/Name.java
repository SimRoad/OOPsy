/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

/**
 *
 * @author user
 */
public class Name {
    private String firstName;
    private String lastName;
    private char midInitial;
    private String suffix;

    public Name() {
    }

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName, char midInitial) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midInitial = midInitial;
    }

    public Name(String firstName, String lastName, char midInitial, String suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midInitial = midInitial;
        this.suffix = suffix;
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

    public char getMidInitial() {
        return midInitial;
    }

    public void setMidInitial(char midInitial) {
        this.midInitial = midInitial;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    
    
    
}
