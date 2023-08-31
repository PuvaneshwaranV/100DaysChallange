import java.util.*;
class list
{
	public static void main(String[] args)
	{
		List<Integer> even =new ArrayList<>();
		even.add(2);
		even.add(4);
		even.add(6);
		System.out.println("First List" + even);
		List<Integer> odd =new ArrayList<>();
		odd.add(1);
		odd.add(3);
		odd.add(5);
		System.out.println("Second List" + odd);
		List<Integer> Num =new ArrayList<>();
		Num.addAll(even);
		Num.addAll(odd);
		System.out.println("Merged List" + Num);
	}
}
