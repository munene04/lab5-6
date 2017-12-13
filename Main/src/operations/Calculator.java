/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operations;

/**
 *
 * @author Evans Munene
 */
// Inheritance where Calculator class inherits attributes of the Arithmetic class
public class Calculator extends Arithmetic{
    public int sub;
    

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getSub() {
        return sub;
    }
 //polymorphism in override   
    @Override
    public int difference(){
        if (getFirstnumber()> getSecondnumber()){
            sub = getFirstnumber() - getSecondnumber();
            return sub;
        }
      return sub; 
      
     
    }
    //method overloading
   public int difference(int amount){
       amount = getFirstnumber() + getSecondnumber();
       return amount;
   } 
}
