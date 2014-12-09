//Justin Himmighoefer
//This program creates nodes for the given planet and then prints
//out the nodes in order.

public class Planets
{
	public static void main(String[] args)
	{
		Node p = new Node("Mercury");
		Node q = p;
		Node r = new Node("Venus");
		q.next = r;
		q = r;
		r = new Node("Earth");
		q.next = r;
		q = r;
		r = new Node("Mars");
		q.next = r;
		q = r;
		r = new Node("Jupiter");
		q.next = r;
                q = r;
		r = new Node("Saturn");
		q.next = r;
		q = r;
		r = new Node("Uranus");
		q.next = r;
                q = r;
		r = new Node("Neptune");
		q.next = r;
                q = r;
		r = new Node("Pluto");
		q.next = r;
                
		System.out.print(p);
	}//end main
}//end class
