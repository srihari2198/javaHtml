public class Student {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
   public static void main(String[] args){
	Student s = new Student();
	s.setName("tom");
	System.out.println(s.getName());
   }
}