package lecture37;

public class Person {
	// if private then use getters and setters
	private String name;

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
		try {
			if (age < 0) {

				throw new RuntimeException("Throw an exception");
			}
			this.age = age;
		} catch (Exception e) {
//				e.printStackTrace();
			System.out.println(e);
		} finally {
			System.out.println("always execute");
		}
	}

	private int age;
}
