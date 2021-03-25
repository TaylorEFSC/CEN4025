import java.util.Scanner;

public class ZooDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int maxAnimalNumber = 10;
		
		// declares and allocates memory for object arrays (up to 10 animals of each type)
		Mammal[] mammalArray = new Mammal[maxAnimalNumber];
		int mammalCounter = 0;
		Reptile[] reptileArray = new Reptile[maxAnimalNumber];
		int reptileCounter = 0;
		Bird[] birdArray = new Bird[maxAnimalNumber];
		int birdCounter = 0;
		
		System.out.println("Welcome to the Zoo Information System!");
		
		System.out.println("Would you like to automatically populate this information system with two animals of each type?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int populateChoice = input.nextInt();
		input.nextLine();
		if (populateChoice == 1) {
			mammalArray[0] = new Mammal(1011 , "Laszlo", "Bengal Tiger", 'M' , "04/29/2016" , "Beef and chicken", "Taylor");
			mammalArray[1] = new Mammal(1227 , "Dewey", "Black Bear" , 'M' , "06/09/2009" , "Roots, berries, and fish" , "Taylor");
			mammalCounter = 2;
			reptileArray[0] = new Reptile(2271 , "Mara", "Brazilian Rainbow Boa" , 'F' , "11/21/2003" , "Large mice" , "85-90 F" , "90%" , "Troy" );
			reptileArray[1] = new Reptile(2113 , "Gaston" , "Green Iguana" , 'M' , "10/30/2018" , "Foliage and fruit" , "85-95 F" , "70%" , "Troy");
			reptileCounter = 2;
			birdArray[0] = new Bird(3117 , "Darrow" , "Red-tailed Hawk" , 'M' , "12/12/2012" , "Rats" , 'Y' , "Sam");
			birdArray[1] = new Bird(3002 , "Happy" , "Emporer Penguin" , 'M' , "01/20/2020" , "Fish" , 'N' , "Sam");
			birdCounter = 2;
			
			System.out.println("The information system has been populated.");
		}
		
		
		int mainMenuChoice = 0;
		
		while (mainMenuChoice != 5) {
			
			System.out.println("\nMain menu:");
			System.out.println("1. Add New File");
			System.out.println("2. View File");
			System.out.println("3. Edit File");
			System.out.println("4. Delete File");
			System.out.println("5. Exit");
			mainMenuChoice = input.nextInt();
			input.nextLine();
			
			switch (mainMenuChoice) {
			
			case 1: // create new file
				
				System.out.println("Please select the type of animal to create a new file for.");
				System.out.println("1. Mammal");
				System.out.println("2. Reptile");
				System.out.println("3. Bird");
				int newFileChoice = input.nextInt();
				input.nextLine();
				
				switch (newFileChoice) {
				
				case 1: // create mammal file
					if (mammalCounter == maxAnimalNumber) {
						System.out.println("The maximum number of mammal files has already been reached.");
					}
					else {
					
						mammalArray[mammalCounter] = new Mammal();
						
						// collects user input and sets mammal attributes
						System.out.println("Please enter the mammal's ID number: ");
						mammalArray[mammalCounter].setIdNumber(input.nextInt());
						input.nextLine();
						System.out.println("Please enter the mammal's name: ");
						mammalArray[mammalCounter].setName(input.nextLine());
						System.out.println("Please enter the mammal's species: ");
						mammalArray[mammalCounter].setSpecies(input.nextLine());
						System.out.println("Please enter the mammal's gender (Use M for male, F for female, and U for unknown) :");
						mammalArray[mammalCounter].setGender(input.nextLine().charAt(0));
						System.out.println("Please enter the mammal's birth date (MM/DD/YYYY):");
						mammalArray[mammalCounter].setBirthDate(input.nextLine());
						System.out.println("Please enter the mammal's diet: ");
						mammalArray[mammalCounter].setDiet(input.nextLine());
						System.out.println("Please enter the name of the mammal's keeper: ");
						mammalArray[mammalCounter].setKeeper(input.nextLine());
						
						System.out.println("The following mammal file has successfully been created: \n");
						mammalArray[mammalCounter].display();
						System.out.println("\nYou will now be returned to the main menu. \n");
						
						mammalCounter++;
					}
					break;
				
				case 2: // create reptile file
					if(reptileCounter == maxAnimalNumber) {
						System.out.println("The maximum number of reptile files has already been reached.");
					}
					else {
					
						reptileArray[reptileCounter] = new Reptile();
						
						// collects user input and sets reptile attributes
						System.out.println("Please enter the reptile's ID number: ");
						reptileArray[reptileCounter].setIdNumber(input.nextInt());
						input.nextLine();
						System.out.println("Please enter the reptile's name: ");
						reptileArray[reptileCounter].setName(input.nextLine());
						System.out.println("Please enter the reptile's species: ");
						reptileArray[reptileCounter].setSpecies(input.nextLine());
						System.out.println("Please enter the reptile's gender (Use M for male, F for female, and U for unknown):");
						reptileArray[reptileCounter].setGender(input.nextLine().charAt(0));
						System.out.println("Please enter the reptile's birth date (MM/DD/YYYY):");
						reptileArray[reptileCounter].setBirthDate(input.nextLine());
						System.out.println("Please enter the reptile's diet: ");
						reptileArray[reptileCounter].setDiet(input.nextLine());
						System.out.println("Please enter the desired temperature of the reptile's habitat:");
						reptileArray[reptileCounter].setTemperature(input.nextLine());
						System.out.println("Please enter the desired humidity of the reptile's habitat:");
						reptileArray[reptileCounter].setHumidity(input.nextLine());
						System.out.println("Please enter the name of the reptile's keeper: ");
						reptileArray[reptileCounter].setKeeper(input.nextLine());
						
						System.out.println("The following reptile file has successfully been created: \n");
						reptileArray[reptileCounter].display();
						System.out.println("\nYou will now be returned to the main menu. \n");
						
						reptileCounter++;
					}
					break;
					
				case 3: // create bird file
					if (birdCounter == maxAnimalNumber) {
						System.out.println("The maximum number of bird files has already been reached.");
					}
					else {
					
						birdArray[birdCounter] = new Bird();
						
						// collects user input and sets bird attributes
						System.out.println("Please enter the bird's ID number: ");
						birdArray[birdCounter].setIdNumber(input.nextInt());
						input.nextLine();
						System.out.println("Please enter the bird's name: ");
						birdArray[birdCounter].setName(input.nextLine());
						System.out.println("Please enter the bird's species: ");
						birdArray[birdCounter].setSpecies(input.nextLine());
						System.out.println("Please enter the bird's gender (Use M for male, F for female, and U for unknown) :");
						birdArray[birdCounter].setGender(input.nextLine().charAt(0));
						System.out.println("Please enter the bird's birth date (MM/DD/YYYY):");
						birdArray[birdCounter].setBirthDate(input.nextLine());
						System.out.println("Please enter the bird's diet: ");
						birdArray[birdCounter].setDiet(input.nextLine());
						System.out.println("Please indicate whether or not the bird is capable of flight (Y or N):");
						birdArray[birdCounter].setCanFly(input.nextLine().charAt(0));
						System.out.println("Please enter the name of the bird's keeper: ");
						birdArray[birdCounter].setKeeper(input.nextLine());
						
						System.out.println("The following bird file has successfully been created:");
						birdArray[birdCounter].display();
						System.out.println("You will now be returned to the main menu. \n");
						
						birdCounter++;
					}
					break;
				
				default:
					System.out.println("Invalid entry.");
					break;
					
				}
				
				break;
				
			case 2: // view file
				System.out.println("Please select the category that describes the animal whose file you would like to view: ");
				System.out.println("1. Mammal");
				System.out.println("2. Reptile");
				System.out.println("3. Bird");
				int viewChoice = input.nextInt();
				input.nextLine();
				
				switch(viewChoice) {
				
				case 1: // view mammal file
					if(mammalCounter == 0) {
						System.out.println("There are no mammal files to view.");
					}
					else {
					
						System.out.println("Please select which mammal's file you would like to view: ");
						for (int i = 0; i < mammalCounter; i++) {
							System.out.println( i+1 + ". " + mammalArray[i].getName() + " the " + mammalArray[i].getSpecies());
						}
						mammalArray[input.nextInt() - 1].display();
						input.nextLine();
					}
					break;
					
				case 2: // view reptile file
					if (reptileCounter == 0) {
						System.out.println("There are no reptile files to view.");
					}
					else {
						System.out.println("Please select which reptile's file you would like to view: ");
						for (int i = 0; i < reptileCounter; i++) {
							System.out.println( i+1 + ". " + reptileArray[i].getName() + " the " + reptileArray[i].getSpecies());
						}
						reptileArray[input.nextInt() - 1].display();
						input.nextLine();
					}
					break;
				
				case 3: // view bird file
					if (birdCounter == 0) {
						System.out.println("There are no bird files to view.");
					}
					else {
						System.out.println("Please select which bird's file you would like to view: ");
						for (int i = 0; i < birdCounter; i++) {
							System.out.println( i+1 + ". " + birdArray[i].getName() + " the " + birdArray[i].getSpecies());
						}
						birdArray[input.nextInt() - 1].display();
						input.nextLine();
					}
					break;
				
				default:
					System.out.println("Invalid entry.");
					break;
				}
				break;
				
			case 3: // edit file
				System.out.println("Please select the category that describes the animal whose file you would like to edit: ");
				System.out.println("1. Mammal");
				System.out.println("2. Reptile");
				System.out.println("3. Bird");
				int editChoice = input.nextInt();
				input.nextLine();
				
				switch(editChoice) {
				
				case 1: // edit mammal file
					
					if (mammalCounter == 0) {
						System.out.println("There are no mammal files to edit.");
					}
					else {
						System.out.println("Please select which mammal's file you would like to edit: ");
						for (int i = 0; i < mammalCounter; i++) {
							System.out.println( i+1 + ". " + mammalArray[i].getName() + " the " + mammalArray[i].getSpecies());
						}
						int mammalEditChoice = input.nextInt() - 1;
						input.nextLine();
						
						System.out.println("Current file state:");
						mammalArray[mammalEditChoice].display();
						
						System.out.println("Please select which attribute you would like to change: ");
						System.out.println("1. ID Number ");
						System.out.println("2. Name ");
						System.out.println("3. Species ");
						System.out.println("4. Gender ");
						System.out.println("5. Birthdate ");
						System.out.println("6. Diet ");
						System.out.println("7. Keeper ");
						int mammalFieldChoice = input.nextInt();
						input.nextLine();
						
						System.out.println("Please enter the new attribute: ");
						
						switch(mammalFieldChoice) { // changes chosen attribute
						case 1:
							mammalArray[mammalEditChoice].setIdNumber(input.nextInt());
							input.nextLine();
							break;
						case 2:
							mammalArray[mammalEditChoice].setName(input.nextLine());
							break;
						case 3:
							mammalArray[mammalEditChoice].setSpecies(input.nextLine());
							break;
						case 4:
							mammalArray[mammalEditChoice].setGender(input.nextLine().charAt(0));
							break;
						case 5:
							mammalArray[mammalEditChoice].setBirthDate(input.nextLine());
							break;
						case 6: 
							mammalArray[mammalEditChoice].setDiet(input.nextLine());
							break;
						case 7:
							mammalArray[mammalEditChoice].setKeeper(input.nextLine());
							break;
						default:
							System.out.println("Invalid Entry.");
							break;
						
						}
					}
					break;
					
				case 2: // edit reptile file
					
					if (reptileCounter == 0) {
						System.out.println("There are no reptile files to edit.");
					}
					else {
						System.out.println("Please select which reptile's file you would like to edit: ");
						for (int i = 0; i < reptileCounter; i++) {
							System.out.println( i+1 + ". " + reptileArray[i].getName() + " the " + reptileArray[i].getSpecies());
						}
						int reptileEditChoice = input.nextInt() - 1;
						input.nextLine();
						
						System.out.println("Current file state:");
						reptileArray[reptileEditChoice].display();
						
						System.out.println("Please select which attribute you would like to change: ");
						System.out.println("1. ID Number ");
						System.out.println("2. Name ");
						System.out.println("3. Species ");
						System.out.println("4. Gender ");
						System.out.println("5. Birthdate ");
						System.out.println("6. Diet ");
						System.out.println("7. Temperature ");
						System.out.println("8. Humidity ");
						System.out.println("9. Keeper ");
						int reptileFieldChoice = input.nextInt();
						input.nextLine();
						
						System.out.println("Please enter the new attribute: ");
						
						switch(reptileFieldChoice) { // changes chosen attribute
						case 1:
							reptileArray[reptileEditChoice].setIdNumber(input.nextInt());
							input.nextLine();
							break;
						case 2:
							reptileArray[reptileEditChoice].setName(input.nextLine());
							break;
						case 3:
							reptileArray[reptileEditChoice].setSpecies(input.nextLine());
							break;
						case 4:
							reptileArray[reptileEditChoice].setGender(input.nextLine().charAt(0));
							break;
						case 5:
							reptileArray[reptileEditChoice].setBirthDate(input.nextLine());
							break;
						case 6: 
							reptileArray[reptileEditChoice].setDiet(input.nextLine());
							break;
						case 7:
							reptileArray[reptileEditChoice].setTemperature(input.nextLine());
							break;
						case 8:
							reptileArray[reptileEditChoice].setHumidity(input.nextLine());
						case 9:
							reptileArray[reptileEditChoice].setKeeper(input.nextLine());
							break;
						default:
							System.out.println("Invalid Entry.");
							break;
						}
					}
					break;
				
				case 3: // edit bird file
					
					if (birdCounter == 0) {
						System.out.println("There are no bird files to edit.");
					}
					else {
						System.out.println("Please select which bird's file you would like to edit: ");
						for (int i = 0; i < birdCounter; i++) {
							System.out.println( i+1 + ". " + birdArray[i].getName() + " the " + birdArray[i].getSpecies());
						}
						int birdEditChoice = input.nextInt() - 1;
						input.nextLine();
						
						System.out.println("Current file state:");
						birdArray[birdEditChoice].display();
						
						System.out.println("Please select which attribute you would like to change: ");
						System.out.println("1. ID Number ");
						System.out.println("2. Name ");
						System.out.println("3. Species ");
						System.out.println("4. Gender ");
						System.out.println("5. Birthdate ");
						System.out.println("6. Diet ");
						System.out.println("7. Can Fly");
						System.out.println("8. Keeper ");
						int birdFieldChoice = input.nextInt();
						input.nextLine();
						
						System.out.println("Please enter the new attribute: ");
						
						switch(birdFieldChoice) { // changes chosen attribute
						case 1:
							birdArray[birdEditChoice].setIdNumber(input.nextInt());
							input.nextLine();
							break;
						case 2:
							birdArray[birdEditChoice].setName(input.nextLine());
							break;
						case 3:
							birdArray[birdEditChoice].setSpecies(input.nextLine());
							break;
						case 4:
							birdArray[birdEditChoice].setGender(input.nextLine().charAt(0));
							break;
						case 5:
							birdArray[birdEditChoice].setBirthDate(input.nextLine());
							break;
						case 6: 
							birdArray[birdEditChoice].setDiet(input.nextLine());
							break;
						case 7:
							birdArray[birdEditChoice].setCanFly(input.nextLine().charAt(0));
							break;
						case 8:
							birdArray[birdEditChoice].setKeeper(input.nextLine());
							break;
						default:
							System.out.println("Invalid entry.");
							break;
						}
					}
					break;
				
				default:
					System.out.println("Invalid entry.");
				
				}
				break;
				
			case 4: // delete file
				System.out.println("Please select the category that describes the animal whose file you would like to delete: ");
				System.out.println("1. Mammal");
				System.out.println("2. Reptile");
				System.out.println("3. Bird");
				int deleteChoice = input.nextInt();
				input.nextLine();
				
				switch(deleteChoice) {
				
				case 1: // delete mammal

					if(mammalCounter == 0) {
						System.out.println("There are no mammal files to delete.");
					}
					else {
					
						System.out.println("Please select which mammal's file you would like to delete: ");
						for (int i = 0; i < mammalCounter; i++) {
							System.out.println( i+1 + ". " + mammalArray[i].getName() + " the " + mammalArray[i].getSpecies());
						}
						int mammalDeleteChoice = input.nextInt() - 1;
						input.nextLine();
						
	
						
						if (mammalDeleteChoice + 1 > mammalCounter) {
							System.out.println("Invalid entry.");
						}
						else { // moves up all objects in array after object to be deleted, sets last object to null
							
							System.out.println("File to be deleted:");
							mammalArray[mammalDeleteChoice].display();
							
							for (int i = mammalDeleteChoice; i < mammalCounter - 1; i++) { 
								mammalArray[i] = mammalArray[i+1];
							}
							
							mammalArray[mammalCounter-1] = null;
							mammalCounter--;
							
							System.out.println("File deleted successfully.");			
						}
					}
					break;
					
				case 2: // delete reptile

					if(reptileCounter == 0) {
						System.out.println("There are no reptile files to delete.");
					}
					else {
					
						System.out.println("Please select which reptile's file you would like to delete: ");
						for (int i = 0; i < reptileCounter; i++) {
							System.out.println( i+1 + ". " + reptileArray[i].getName() + " the " + reptileArray[i].getSpecies());
						}
						int reptileDeleteChoice = input.nextInt() - 1;
						input.nextLine();
						
	
						
						if (reptileDeleteChoice + 1 > reptileCounter) {
							System.out.println("Invalid entry.");
						}
						else { // moves up all objects in array after object to be deleted, sets last object to null
							
							System.out.println("File to be deleted:");
							reptileArray[reptileDeleteChoice].display();
							
							for (int i = reptileDeleteChoice; i < reptileCounter - 1; i++) { 
								reptileArray[i] = reptileArray[i+1];
							}
							
							reptileArray[reptileCounter-1] = null;
							reptileCounter--;
							
							System.out.println("File deleted successfully.");			
						}
					}
					break;
					
				case 3: // delete bird
					
					if(birdCounter == 0) {
						System.out.println("There are no bird files to delete.");
					}
					else {
					
						System.out.println("Please select which bird's file you would like to delete: ");
						for (int i = 0; i < birdCounter; i++) {
							System.out.println( i+1 + ". " + birdArray[i].getName() + " the " + birdArray[i].getSpecies());
						}
						int birdDeleteChoice = input.nextInt() - 1;
						input.nextLine();
						
	
						
						if (birdDeleteChoice + 1 > birdCounter) {
							System.out.println("Invalid entry.");
						}
						else { // moves up all objects in array after object to be deleted, sets last object to null
							
							System.out.println("File to be deleted:");
							birdArray[birdDeleteChoice].display();
							
							for (int i = birdDeleteChoice; i < birdCounter - 1; i++) { 
								birdArray[i] = birdArray[i+1];
							}
							
							birdArray[birdCounter-1] = null;
							birdCounter--;
							
							System.out.println("File deleted successfully.");			
						}
					}
					break;

				
				default:
					System.out.println("Invalid entry.");
					break;
				}
				
				break;
				
			case 5: // exit
				System.out.println("Thanks for using this Zoo Information System.\nGoodbye.");
				break;
				
			default:
				System.out.println("Invalid entry.");
				break;
				
			
				
			}
			
		}

	}

}
