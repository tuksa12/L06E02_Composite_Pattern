package de.tum.in.ase.eist;

import java.util.Arrays;

public abstract class Employee {

	private final String name;

	public Employee(String name) {
		this.name = name;
	}

	/**
	 * Prints the employee hierarchy of all employees supervised by this one
	 *
	 * @param level current hierarchy level of this employee
	 */
	public abstract void list(int level);

	/**
	 * Prints the employees name with a prefix to visualize the hierarchy level
	 *
	 * @param level current hierarchy level of this employee
	 */
	public void printName(int level) {
		System.out.println(getLevelPrefix(level) + getName());
	}

	public String getName() {
		return name;
	}

	/**
	 * @param level current hierarchy level of this employee
	 * @return a prefix visualizing the current hierarchy level
	 */
	private String getLevelPrefix(int level) {
		char[] charArray = new char[level];
		Arrays.fill(charArray, '-');
		return new String(charArray);
	}
}
