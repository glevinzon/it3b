class Dog extends Animal {
	private String name;
	public int age;
	public String house;
	
	public void setName(String nameIn){
		this.name = nameIn;
	}
	
	public String getName(){
		return name;
	}
	
	public int getLegs(){
		return 4;
	}
	
	public int getHands(){
		return 0;
	}
}