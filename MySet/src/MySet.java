import java.util.HashSet;
import java.util.Iterator;

 public class MySet 
 {
	public static void main(String [] args)
	{
	HashSet set1 = new HashSet();
	set1.add(22);
	set1.add(41);
	set1.add(12);

	//System.out.println(set1);
Iterator it1 = set1.iterator();
while(it1.hasNext())
{

System.out.println(it1.next());

}
}
}