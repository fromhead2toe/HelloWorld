
public class HelloWorld {

	
		static int cal(String s){
			String[] temp = s.split(" ");
			int num1=Integer.parseInt(temp[0]);
			int num2=Integer.parseInt(temp[2]);

			
			switch(temp[1]){
			case"+": return num1+num2;
			case"-": return num1-num2;
			}
			
			return 0;

	}
	public static void main(String[] args) {
		//System.out.println("Hello World"); 
		//push test test
		//String a = "bpple";
		//String b = "banana";
		//System.out.println(a.compareTo(b));
		//System.out.println(a.charAt(4));
		
		
	//String i = "3";
	//int q =3;
	
	//int temp =Integer.parseInt(i);
	/*	int lenth = args.length();
		for(int i=0;i<lenth;i++){
			char ch = args.charAt(i);
			if(Character.isUpperCase(ch)){
				System.out.println(ch);
				args.
			}
		}*/
		
	System.out.println(cal("2 - 3"));
	
	
	}
}	



