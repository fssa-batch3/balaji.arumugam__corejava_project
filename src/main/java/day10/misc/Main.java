package day10.misc;


class Divider{
	
	public static int divisor(int a, int b) throws Exception{
		if(b==0) {
			
			throw new Exception("Divisor cannot be zero");
		}
		
		return a/b;
		
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		
		try {
			int data=	Divider.divisor(10, 0);

			System.out.println(data);
		}
		catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
