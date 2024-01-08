package pet_1111410053;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puppy mydog=new Puppy("皮皮");
		Puppy mycat=new Puppy("kitty","cat","Gray");
		double Totle;
		Totle=mydog.check(0,1);
		System.out.printf("總金額%8.2f%n%n",Totle);
		Totle=mycat.check(0,1,3);
		System.out.printf("總金額%8.2f%n%n",Totle);
	}

}
