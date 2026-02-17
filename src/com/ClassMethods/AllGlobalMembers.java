package com.ClassMethods;

public class AllGlobalMembers {
	static int value = 3;
	int num = 45;
	void run() {
		System.out.println("Non static run method");
	}
	static void execute() {
		System.out.println("Static execute method");
	}
	public static void main(String[] args) {
		int num = 3;
		System.out.println("Local value : n = " +num);
		System.out.println("==================");
		System.out.println("Global static value : value = " +  AllGlobalMembers.value);
		AllGlobalMembers.execute();
		System.out.println("==================");
		System.out.println("Non ststic value " + num);
		//Object Creation
		AllGlobalMembers object = new AllGlobalMembers();
		object.run();
		System.out.println("Non static num = " + object.num);
	}

}
