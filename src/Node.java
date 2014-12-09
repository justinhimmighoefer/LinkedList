
public class Node
{
	public String data, n="";
	public Node next;
	
	public Node()
	{
		data = "";
		next = null;
	}//end Node
	
	public Node(String s)
	{
		data = s;
		next = null;
	}//end Node(s)
	
	public String toString()
	{
		return data + " " + next;
	}//end toString
}//end class
