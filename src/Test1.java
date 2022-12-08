public class Test1 {
	
	public static void main(String[] args) {
	
	    int jumsu = 0; // 점수 입력받기 
        char level = ' '; // 학점 초기화 
      
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
        
        System.out.println("점수 : " + jumsu + "\t학점 : " + level);
    }
}
