

package operations;


public class Arithmetic {
    
//constructor
    public Arithmetic(){
        
        this.firstnumber = 10;
        this.secondnumber = 5;
    }
    
    //constructor
    public Arithmetic (int first, int second){
        
        //overloading
        this.firstnumber=first;
        this.secondnumber = second;
    }
   //Encapsulation process
    
    //data members
    private int firstnumber,secondnumber;
    
   //getter 
    public int getFirstnumber() {
        return firstnumber;
    }
//getter
    public int getSecondnumber() {
        return secondnumber;
    }
        
    
    
//setter
    public void setFirstnumber(int firstnumber) {
        this.firstnumber = firstnumber;
    }
    
//setter
    public void setSecondnumber(int secondnumber) {
        this.secondnumber = secondnumber;
    }
    
    public int sum(){
        return firstnumber+secondnumber;
        
    }
    
    public int difference(){
         return firstnumber-secondnumber;
        
    }
    
    public int product(){
         return firstnumber*secondnumber;
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
