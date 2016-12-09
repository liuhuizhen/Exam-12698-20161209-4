import java.util.ArrayList;


public class PrintNum {

	public static void main(String[] args) {
			int sum=0;
			ArrayList<Integer> list=new ArrayList<Integer>();
			for (int i = 101; i < 200; i++) {
				if(isPrime(i)) {
					sum++;
					list.add(i);
				}
			}
			System.out.print("101到200之间一共有"+sum+"个素数");
			System.out.print(",分别是:");
			for(int temp:list){
				System.out.print(temp+" ");
			}
		}	
		public static boolean isPrime(int a){
			int temp=(int)Math.sqrt(a)+1;
			if(a%2==0) return false;
			else{
				for(int i=3;i<temp;i++){
					if(a%i==0) return false;
				}
			}
			return true;
		}


}
