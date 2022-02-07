/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filtre;


public class SpinnerException extends Exception{
    private int i;
    public SpinnerException(String message,int i) {
        super(message);
        this.i=i;
    }
}
