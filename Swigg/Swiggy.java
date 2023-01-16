package Swigg;

import java.util.Scanner;

public class Swiggy extends Login {
//	Login login = new Login();

	public static void main(String... args) {
		Login login = new Login();

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("\nWelcome to swiggy\n\n1.SignUp \n2.LogIn \n3.Exit \nChoose Any Option\n--------------------------------------------------");
			switch (sc.nextInt()) {
			case 1: {
				login.signUp();
			}
				break;
			case 2: {
				login.logIn();
			}
				break;
			case 3: {
				flag = false;
				System.out.println("Thank you for using appilcation");
			}
			}
		}
	}

}

class Login extends HomePage {
	Scanner scanner = new Scanner(System.in);
	HomePage homePage2 = new HomePage();
	Double phoneNumber;
	int password;
	String name;
	String email;

	void signUp() {
		System.out.println("Enter Your Name");
		name = scanner.next();
		System.out.println("Enter Password");
		password = scanner.nextInt();
		System.out.println("Enter Your Email");
		email = scanner.next();
		System.out.println("Enter Your PhoneNumber");
		phoneNumber = scanner.nextDouble();
		System.out.println("SignUp completed");
	}

	void logIn() {
		String name1;
		int pwd;
		System.out.println("Please Enter Your Name");
		name1 = scanner.next();
		System.out.println("Please Enter The Password");
		pwd = scanner.nextInt();
		if (name1.equals(name) && pwd == password) {
			System.out.println("Login is Successful");
			homePage2.homePage();
		} else {
			System.out.println("Please Enter The valid details");
		}
	}
}

class HomePage {
	Scanner scanner = new Scanner(System.in);
	// String hotelName;
	int price;
//	String location;
	boolean flag = true;
	
	void homePage(){
		while(flag) {
		System.out.println("1.FoodSection\n2.InstaMart\n3.Total_Amount\n4.Exit");
		switch (scanner.nextInt()) {
		case 1: {
			food();
		}break;
		case 2:{
			instamart();
		}break;
		case 3:{
			System.out.println("The total bill value " + price);
		}break;
		case 4:{
			flag = false;
		}break;
		default:{
			System.out.println("Enter the valid details");
		}
		}
		}
	}

	
		void food(){
			while(flag){
				System.out.println("1.HotelMayura\n2.Ayodhya_Grand\n3.Dominos\n4.KFC\n5.Rolls_Kitchen\n6.Back");
				switch(scanner.nextInt()){
				case 1:{
					//System.out.println("1.Dose - rs60\n2.Puri - rs30\n3.vade - rs20\n4.Idly - rs30");
					while(flag){
					System.out.println("1.Dose - rs60\n2.Puri - rs30\n3.vade - rs20\n4.Idly - rs30");
					switch(scanner.nextInt()){
							case 1:{
								this.price = this.price + 60;
							}break;
							case 2:{
								this.price = this.price + 30;
							}break;
							case 3:{
								this.price = this.price + 20;
							}break;
							case 4:{
								this.price = this.price + 30;
							}break;
							case 5:{
								homePage();
							}break;
							default:
								System.out.println("Invalid entry");
							
						}
					}
					}break;
				
				case 2:{
					System.out.println("1.Dose - rs60\n2.Puri - rs30\n3.Vade - rs20\n4.Idly - rs30");
					while(flag){
					switch(scanner.nextInt()){
					
					case 1:{
						this.price = price + 60;
					}break;
					case 2:{
						this.price = price + 30;
					}break;
					case 3:{
						this.price = price + 20;
					}break;
					case 4:{
						this.price = price + 30;
					}break;
					case 5:{
						System.out.println("Back");
					}break;
					default:
						System.out.println("Invalid entry");
					}
					}
				}break;
				
				case 3:{
					while(flag){
					System.out.println("1.Paneer_Pizza - Rs 100\n2.Onion_Pizza - Rs 80\n3.Tomato_Pizza - Rs 60\n4.Garlic_bread - Rs 120\n5.Veg-parcel - Rs 45");
					switch(scanner.nextInt()){
					case 1:{
						this.price = price + 100;
					}break;
					case 2:{
						this.price = price + 80;
					}break;
					case 3:{
						this.price = price + 60;
					}break;
					case 4:{
						this.price = price + 120;
					}break;
					case 5:{
						this.price = price + 45;
					}break;
					default:
						System.out.println("Invalid entry");
					}
				  }
				}break;
				
				case 4:{
					while(flag){
					System.out.println("1.Mingles_Bucket - Rs390\n2.Zinger_Burger - Rs180\n3.Fries - Rs110\n4.Paneer_Burger - Rs120\nVeg_Combo - Rs540");
					switch(scanner.nextInt()){
					case 1:{
						this.price = price + 390;
					}break;
					case 2:{
						this.price = price + 180;
					}break;
					case 3:{
						this.price = price + 110;
					}break;
					case 4:{
						this.price = price + 120;
					}break;
					case 5:{
						this.price = price + 540;
					}break;
					default:
						System.out.println("Invalid entry");
					}
					}
				}break;
				
				case 5:{
					while(flag){
					System.out.println("1.Veg_Roll - Rs80\n2.Paneer_Roll - Rs110\n3.Chicken_Roll - Rs150\n4.Fries - Rs120\n5.Egg - Rs10");
					switch(scanner.nextInt()){
					case 1:{
						this.price = price + 80;
					}break;
					case 2:{
						this.price = price + 110;
					}break;
					case 3:{
						this.price = price + 150;
					}break;
					case 4:{
						this.price = price + 120;
					}break;
					case 5:{
						this.price = price + 10;
					}break;
					default:
						System.out.println("Invalid entry");
					}
					}
				}break;
				case 6:{
					homePage();
				}
			   }
			}
		}
		
	 void instamart() {
		 System.out.println("1.InstaMart_01\n2.InstaMart_02\n3.InstaMart_03\n4.InstaMart_04\n5.Back");
		 while(flag) 
		 {
			switch(scanner.nextInt()){
			case 1: {
				System.out.println("1.Biscuts - Rs 10\n2.chips - Rs10\n3.Soft_Drinks - Rs50\n4.Cake - Rs120\n5.Fruits - Rs100");
				switch(scanner.nextInt()){
				case 1:{
					this.price = price + 10;
				}break;
				case 2:{
					this.price = price + 10;
				}break;
				case 3:{
					this.price = price + 50;
				}break;
				case 4:{
					this.price = price + 120;
				}break;
				case 5:{
					this.price = price + 100;
				}break;
				default:
					System.out.println("Invalid entry");
				}	
			}break;
			
			case 2: {
				System.out.println("1.Biscuts - Rs 10\n2.chips - Rs10\n3.Soft_Drinks - Rs50\n4.Cake - Rs120\n5.Fruits - Rs100");
				switch(scanner.nextInt()){
				case 1:{
					this.price = price + 10;
				}break;
				case 2:{
					this.price = price + 10;
				}break;
				case 3:{
					this.price = price + 50;
				}break;
				case 4:{
					this.price = price + 120;
				}break;
				case 5:{
					this.price = price + 100;
				}break;
				default:
					System.out.println("Invalid entry");
				}	
			}break;
			
			case 3: {
				System.out.println("1.Biscuts - Rs 10\n2.chips - Rs10\n3.Soft_Drinks - Rs50\n4.Cake - Rs120\n5.Fruits - Rs100");
				switch(scanner.nextInt()){
				case 1:{
					this.price = price + 10;
				}break;
				case 2:{
					this.price = price + 10;
				}break;
				case 3:{
					this.price = price + 50;
				}break;
				case 4:{
					this.price = price + 120;
				}break;
				case 5:{
					this.price = price + 100;
				}break;
				default:
					System.out.println("Invalid entry");
				}break;}
			
			case 4: {
				System.out.println("1.Biscuts - Rs 10\n2.chips - Rs10\n3.Soft_Drinks - Rs50\n4.Cake - Rs120\n5.Fruits - Rs100");
				switch(scanner.nextInt()){
				case 1:{
					this.price = price + 10;
				}break;
				case 2:{
					this.price = price + 10;
				}break;
				case 3:{
					this.price = price + 50;
				}break;
				case 4:{
					this.price = price + 120;
				}break;
				case 5:{
					this.price = price + 100;
				}break;
				default:
					System.out.println("Invalid entry");
				}	
			}break;
			
			case 5: {
				System.out.println("1.Biscuts - Rs 10\n2.chips - Rs10\n3.Soft_Drinks - Rs50\n4.Cake - Rs120\n5.Fruits - Rs100");
				switch(scanner.nextInt()){
				case 1:{
					this.price = price + 10;
				}break;
				case 2:{
					this.price = price + 10;
				}break;
				case 3:{
					this.price = price + 50;
				}break;
				case 4:{
					this.price = price + 120;
				}break;
				case 5:{
					this.price = price + 100;
				}break;
				default:
					System.out.println("Invalid entry");
				}	
			}break;
			default:
				System.out.println("Invalid entry");
			}break;
		 }
	 }
	}