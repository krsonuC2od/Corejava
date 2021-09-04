package sonu.com.Encapsulation;

public class RunEncap {
	public static void main(String args[]) {
		EncapTest encap = new EncapTest();
		encap.setid(1);
		encap.setname("sonu");
		encap.setage(20);
		System.out.print("Id :"+encap.getid()+ " " +"Name :"+encap.getname()+ " " +"Age"+encap.getage());
		
		
	}

}
