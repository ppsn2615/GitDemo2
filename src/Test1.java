public class Test1 {
	
	public static void main(String[] args) {
	
	    int jumsu = 0; 
        char level = ' '; 
      
        if(jumsu >= 90){
            level = 'A';
        }
        else if(jumsu >= 80){
            level = 'B';
        }
        else if(jumsu >= 70){
           level = 'C';
        }
        else if(jumsu >= 60){
           level = 'D';
        }
        else{
           level = 'F'; 
        }
        
        System.out.println("jumsu: " + jumsu + " level : " + level);
    }
}
