import java.util.*;
public class TestList {
	
	public static void main(String args[])
	{
	List <Account> lst=getdata();
	display(lst);

	

}
	public static List<Account> getdata(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Account number, Name,Balance");
		
		Account a1=new Account(sc.nextInt(),sc.next(),sc.nextInt());
		Account a2=new Account(sc.nextInt(),sc.next(),sc.nextInt());
		Account a3=new Account(sc.nextInt(),sc.next(),sc.nextInt());
		
		List<Account> lst=new LinkedList<Account>();
		lst.add(a1);
		lst.add(a2);
		lst.add(a3);
		
	return lst;
	}
	
	public static void display(List<Account> lst)
	{		
		
		for(Account a:lst)
		{
			System.out.println(a.getAccno()+"\t"+a.getName()+"\t"+a.getAccbal());
		}
	}
}