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
	public void displayCustomerInfo() {
		System.out.printf("id:%d\nname:%s\nsurname:%s\nage:%d\npostal code:%d\nemail:%s\n\n", id, name, surname, age, 
				postalCode, email);
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
	public DVD(int id, String title, String artist, int length) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.genre = "Other";
		this.length = length;
	}
	public DVD(int id, String title, String artist, String genre, int length) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.length = length;
	}
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
	public void displayDVDInfo() {
		System.out.printf("id:%d\ntitle:%s\nartist:%s\ngenre:%s\nlength(in minutes): %d\n",
				getId(), getTitle(), getArtist(), getGenre(), getLength());
	}
}

public class Lab3 {
	private static int arrLength(Object[] objects) {
		int i = 0;
		for (; i < objects.length; i++) {
			if (objects[i] == null)
				return i;
		}
		return i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer[] customerArray = new Customer[10];
		DVD[] dvdArray = new DVD[10];
		int input = -1;
		while (input != 0) {
			System.out.println("1. Create a new Customer");
			System.out.println("2. Create a new DVD");
			System.out.println("3. Create a new DVD with genre");
			System.out.println("4. Display Customer Information");
			System.out.println("5. Display DVD Information");
			System.out.println("6. Display number of customers.");
			System.out.println("0. Exit");
			input = sc.nextInt();
			switch (input) {
			case 1:
				int numOfCustomers = arrLength(customerArray);
				Customer c = new Customer();
				System.out.print("Enter id: ");
				c.setId(sc.nextInt());
				System.out.print("Enter name: ");
				sc.nextLine();
				c.setName(sc.nextLine());
				System.out.print("Enter surname: ");
				c.setSurname(sc.nextLine());
				System.out.print("Enter age: ");
				c.setAge(sc.nextInt());
				System.out.print("Enter postal code: ");
				c.setPostalCode(sc.nextInt());
				System.out.print("Enter email: ");
				sc.nextLine();
				c.setEmail(sc.nextLine());
				customerArray[numOfCustomers] = c;
				break;
			case 2:
				int id, length;
				String title, artist;
				int numOfDvds = arrLength(dvdArray);
				System.out.print("Enter id: ");
				id = sc.nextInt();
				System.out.print("Enter title: ");
				sc.nextLine();
				title = sc.nextLine();
				System.out.print("Enter artist: ");
				artist = sc.nextLine();
				System.out.print("Enter length: ");
				length = sc.nextInt();
				dvdArray[numOfDvds] = new DVD(id, title, artist, length);
				break;
			case 3:
				String genre;
				numOfDvds = arrLength(dvdArray);
				System.out.print("Enter genre: ");
				sc.nextLine();
				genre = sc.nextLine();
				System.out.print("Enter id: ");
				id = sc.nextInt();
				System.out.print("Enter title: ");
				sc.nextLine();
				title = sc.nextLine();
				System.out.print("Enter artist: ");
				artist = sc.nextLine();
				System.out.print("Enter length: ");
				length = sc.nextInt();
				dvdArray[numOfDvds] = new DVD(id, title, artist, genre, length);
				break;
			case 4:
				int customerId;
				System.out.print("Enter customer id: ");
				customerId = sc.nextInt();
				boolean customerFound = false;
				for (int i = 0; i < arrLength(customerArray); i++) {
					if (customerArray[i].getId() == customerId) {
						customerArray[i].displayCustomerInfo();
						customerFound = true;
						break;
					}
				}
				if (!customerFound) {
					System.out.println("The customer with the given id was not found");
				}
				break;
			case 5:
				int dvdId;
				System.out.print("Enter DVD id: ");
				dvdId = sc.nextInt();
				boolean dvdFound = false;
				for (int i = 0; i < arrLength(dvdArray); i++) {
					if (dvdArray[i].getId() == dvdId) {
						dvdArray[i].displayDVDInfo();
						dvdFound = true;
						break;
					}
				}
				if (!dvdFound) {
					System.out.println("The DVD with the given id was not found");
				}
				break;
			case 6:
				System.out.printf("Number of customers: %d\n", arrLength(customerArray));
				break;
			default:
				break;
			}
		}
	}
}
