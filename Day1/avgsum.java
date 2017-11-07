import java.util.*; 
class Avg{
	public void getDetails(int... args){
		int total = 0;
		for(int arg:args){
			total+=arg;
		}
		System.out.println("total = " + total);
		System.out.println("average = " + (total / args.length));
	}
}

// 
class TestAvg{
	public static void main(String args[]){
		Avg avg = new Avg();
		System.out.println("How many numbers?");
		int x = new Scanner(System.in).nextInt();
		if(x >= 2){
			int rgs[] = new int[x];
			for (int i = 0; i < x; i += 1) {
				rgs[i] = new Scanner(System.in).nextInt();
			}
			avg.getDetails(rgs);
		}
		else System.out.println("Minimum two args required.");
		//avg.getDetails(1,2,3,4,5,6,7,8,9,10,11,12);
	}
}