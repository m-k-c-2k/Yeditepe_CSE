import java.util.Scanner;

class Customer {
	private int id;
	private String name;
	private String surname;
	private int age;
	private int postalCode;
	private String email;
	
	public Customer() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void inputCustomer(Scanner sc) {
		System.out.print("Enter id: ");
		setId(sc.nextInt());
		System.out.print("Enter name: ");
		sc.nextLine();
		setName(sc.nextLine());
		System.out.print("Enter surname: ");
		setSurname(sc.nextLine());
		System.out.print("Enter age: ");
		setAge(sc.nextInt());
		System.out.print("Enter postal code: ");
		setPostalCode(sc.nextInt());
		System.out.print("Enter email: ");
		sc.nextLine();
		setEmail(sc.nextLine());
	}
	public void displayInfo() {
		System.out.printf("id:%d\nname:%s\nsurname:%s\nage:%d\npostal code:%d\nemail:%s\n\n", id, name, surname, age, 
				postalCode, email);
	}
}

public class Lab1 {
	public static void main(String[] args) {
		int input = -1;
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		System.out.println("Customer #1");
		c1.inputCustomer(sc);
		System.out.println("\nCustomer #2");
		c2.inputCustomer(sc);
		System.out.println("\nCustomer #3");
		c3.inputCustomer(sc);
		while (input != 0) {
			System.out.println();
			for (int i = 1; i < 4; i++) {
				System.out.printf("%d. Display Customer #%d\n", i, i);
			}
			System.out.println("0. Exit");
			input = sc.nextInt();
			switch (input) {
				case 1:
					c1.displayInfo();
					break;
				case 2:
					c2.displayInfo();
					break;
				case 3:
					c3.displayInfo();
					break;
				default:
					continue;
			}
		}
	}
}
