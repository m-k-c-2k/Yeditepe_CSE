import java.util.Scanner;

class Customer {
		private static int customerCount = 0;
		private int id;
		private String name;
		private String surname;
		private int age;
		private int postalCode;
		private String email;
		private static Customer[] customers = new Customer[3];
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
		public int getCustomerCount() {
			return customerCount;
		}
		public void inputCustomer(Scanner sc, int index) {
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
			customers[index] = this;
			customerCount++;
		}
		public void displayCustomerInfo() {
			System.out.printf("id:%d\nname:%s\nsurname:%s\nage:%d\npostal code:%d\nemail:%s\n\n", id, name, surname, age, 
					postalCode, email);
		}
		public static Customer[] getCustomers() {
			return customers;
		}
}

class Date {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

class DVD {
	private int id;
	private Date rentDate;
	private String title;
	private String artist;
	private String genre;
	private int length;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}

public class Lab2 {
	public static void main(String[] args) {
		int input = -1;
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		System.out.println("Customer #1");
		c1.inputCustomer(sc, 0);
		System.out.println("\nCustomer #2");
		c2.inputCustomer(sc, 1);
		System.out.println("\nCustomer #3");
		c3.inputCustomer(sc, 2);
		
		while (input != 0) {
			System.out.println();
			for (int i = 1; i < 4; i++) {
				System.out.printf("%d. Display Customer #%d\n", i, i);
			}
			System.out.println("4. Display Number of Customers");
			System.out.println("0. Exit");
			input = sc.nextInt();
			switch (input) {
				case 1:
					c1.displayCustomerInfo();
					break;
				case 2:
					c2.displayCustomerInfo();
					break;
				case 3:
					c3.displayCustomerInfo();
					break;
				case 4:
					System.out.println("Number of customers: " + c1.getCustomerCount());
				default:
					continue;
			}
		}
	}
}
