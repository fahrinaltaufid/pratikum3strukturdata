/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrinaltaufid_praktik1;

import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Fahrinaltaufid_praktik1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Creating an empty Stack
Stack<String> STACK = new Stack<String>();
// Use push() to add elements into the Stack
STACK.push("Minggu");
STACK.push("Senin");
STACK.push("Selasa");
STACK.push("Rabu");
STACK.push("Kamis");
// Displaying the Stack
System.out.println("Stack Awal: " + STACK);
// Pushing elements into the stack
STACK.push("Jumat");
STACK.push("Sabtu");
// Displaying the final Stack
System.out.println("Updata Stack: " + STACK);
}
}
    
    

