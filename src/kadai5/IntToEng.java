package kadai5;
import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("数字を入れてください");		
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
    	String no ="";
    	String no2="";
    	
    	//0から9
    	//String ans[] = {"zero","one","two"};
    	//ここに10以下であることを定義する
    	
    
    	//10~19
    	if(n==10){
    		no="ten";
    	}else if(n==11){
    		no="eleven";
    	}else if(n==12){
    		no="twelve";
    	}else if(n==13){
    		no="thirteen";
    	}else if(n==14){
    		no="fourteen";
    	}else if(n==15){
    		no="fifteen";
    	}else if(n==16){
    		no="sixteen";
    	}else if(n==17){
    		no="seventeen";
    	}else if(n==18){
    		no="eighteen";
    	}else if(n==19){
    		no="nineteen";
       	}
    	
    	//2桁の取り扱い
    	if(n>=20){
    		if(n/10==2){
    			no2="twenty";
    			n=n-20;
    		}   
    		if(n/10==3){
    			no2="thirty";
    			n=n-30;
    		}  
    		if(n/10==4){
    			no2="fourty";
    			n=n-40;
    		}  
    		if(n/10==5){
    			no2="fifty";
    			n=n-50;
    		}  
    		if(n/10==6){
    			no2="sixty";
    			n=n-60;
    		}  
    		if(n/10==7){
    			no2="seventy";
    			n=n-70;
    		}  
    		if(n/10==8){
    			no2="eighty";
    			n=n-80;
    		}  
    		if(n/10==9){
    			no2="ninety";
    			n=n-90;
    		}  
    	}
    		
    		//1桁目
    		if(n==0){
        		no="zero";
        	}else if(n==1){
        		no="one";
        	}else if(n==2){
        		no="two";
        	}else if(n==3){
        		no="three";
        	}else if(n==4){
        		no="four";
        	}else if(n==5){
        		no="five";
        	}else if(n==6){
        		no="six";
        	}else if(n==7){
        		no="seven";
        	}else if(n==8){
        		no="eight";
        	}else if(n==9){
        		no="nine";
        	}
    		
    	String number= no2 + no;
        return number;
	}

}
