package sonu.com.abstractJava;

public class SubUser extends SuperUser{
	SubUser(int id){
		super(id);
	}
	public static void main(String args []) {
		SubUser s = new SubUser(1);
		s.getid();
	}
}