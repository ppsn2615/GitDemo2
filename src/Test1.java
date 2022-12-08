public class Test1 {
	
	public static void main(String[] args) {
	
	    int jumsu = 0; // ���� �Է¹ޱ� 
        char level = ' '; // ���� �ʱ�ȭ 
      
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
        
        System.out.println("���� : " + jumsu + "\t���� : " + level);
    }
}
