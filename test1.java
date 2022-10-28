public class Test1 {
	public static void main(String[] args){
		for (int i=1;i<=6;i++){
			for (int k=5;k>=0; k--){
				if(k > i)
					System.out.print("*");
				else
					System.out.print("%d,k");
			}
			System.out.printen("");
		}
	}
}