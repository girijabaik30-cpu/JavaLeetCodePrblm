public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000; 
        double rate = 5.5;              
         double time = 3;         
        
      
        double interest = (principal * rate * time) / 100;
        
        System.out.println("The Simple Interest is: " + interest);
    }
}