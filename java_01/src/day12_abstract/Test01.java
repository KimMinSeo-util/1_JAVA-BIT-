package day12_abstract;

public class Test01 {
	public static void main(String[] args) {
		Animal[]   a = {
		              new Dog("시베리안허스키", "케리"),
		              new Fish("구피"),
		              new Fish("Fish","구피")
		        };
		
		for(Animal data :a) {
			System.out.println(data);
			System.out.println(data.toString());
			data.breath();
		}

		System.out.println(ssss("java programing"));
	}
	
	public static String ssss(String d) {
		String result="";
		for(int i=d.length()-1;i>=0 ;i--) {
			result += d.charAt(i);
		}
		return result;
	}
}
