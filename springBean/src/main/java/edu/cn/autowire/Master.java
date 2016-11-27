package edu.cn.autowire;

public class Master {

	private String name;
	private Dog dog;
	
	/*public Master(Dog dog){
		System.out.println("调用Master构造函数Master(Dog dog)");
		this.dog=dog;
	}*/
	
	public Master() {
		super();
	}

	public Master(String name, Dog dog) {
		super();
		this.name = name;
		this.dog = dog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
