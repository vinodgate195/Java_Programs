package Programs;

public class Encapsulation {
	
	private int ssnnumber;
	private String name;
	private int age;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation en =new Encapsulation();
		en.setSsnnumber(123);
		en.setName("vinod");
		en.setAge(28);
		System.out.println(en.getSsnnumber());
		System.out.println(en.getName());
		System.out.println(en.getAge());
	
	}

    public int getSsnnumber() {
		return ssnnumber;
	}

	public void setSsnnumber(int ssnnumber) {
		this.ssnnumber = ssnnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
