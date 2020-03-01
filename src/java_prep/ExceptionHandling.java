package java_prep;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=check();
		System.out.println("main "+i);
		String str = new String("abc");
		String str1 = "abc";
		String str2="abc";
		str=str.intern();
		System.out.println("string "+str.equals(str1));
		System.out.println("string 1"+ (str==str1));
		System.out.println("string 1"+ (str2==str1));
		System.out.println("string 2 "+str.hashCode()+"--->" +str1.hashCode()+" hash "+str2.hashCode());
		boolean b=str1==str2;
		System.out.println("string b "+b);
		b=str==str1;
		System.out.println("string b "+b);
		b=str==str2;
		System.out.println("string b "+b);
		str2=null;
		System.out.println("string b "+str1);
		char abc='c';
				System.out.println("string abc "+abc);
		//System.out.println("string 3"+str==str2);
	}

	public static int  check() {
		try {
			int a=4+5;
			return a;
		} finally {
			System.out.println("finally");
			return 4;
		}

	}
}
