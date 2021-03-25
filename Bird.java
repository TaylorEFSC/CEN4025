
public class Bird {
	
	
	public int idNumber;
	public String name;
	public String species;
	public char gender;
	public String birthDate;
	public String diet;
	public char canFly;
	public String keeper;
	
	public Bird(int idNumber, String name, String species, char gender, String birthDate, String diet, char canFly, String keeper) {
		this.idNumber = idNumber;
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.birthDate = birthDate;
		this.diet = diet;
		this.canFly = canFly;
		this.keeper = keeper;
	}

	public Bird() {}
	
	public void display() {
		System.out.println("\nID number: " + idNumber);
		System.out.println("Name: " + name);
		System.out.println("Species: " + species);
		System.out.println("Gender: " + gender);
		System.out.println("Birth Date: " + birthDate);
		System.out.println("Diet: " + diet);
		System.out.println("Can fly: " + canFly);
		System.out.println("Keeper: " + keeper + "\n");
	}
	
	// setters and getters
	public void setIdNumber (int idNumber) {
		this.idNumber=idNumber;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setName (String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSpecies (String species) {
		this.species=species;
	}
	public String getSpecies() {
		return species;
	}
	public void setGender (char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;
	}
	public void setBirthDate (String birthDate) {
		this.birthDate=birthDate;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setDiet (String diet) {
		this.diet=diet;
	}
	public String getDiet() {
		return diet;
	}
	public void setCanFly (char canFly) {
		this.canFly=canFly;
	}
	public char getCanFly() {
		return canFly;
	}
	public void setKeeper (String keeper) {
		this.keeper=keeper;
	}
	public String getKeeper() {
		return keeper;
	}
	
	


}
