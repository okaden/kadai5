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
    	//0から9
    	//String ans[] = {"zero","one","two"};
    	//ここに10以下であることを定義する
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
        return no;
	}

}
