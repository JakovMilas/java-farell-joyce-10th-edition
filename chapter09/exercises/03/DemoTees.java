/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 3c

Task:
Write an application that prompts a user for values, creates two objects of each class,
and demonstrates that all the methods work correctly. Save the file as DemoTees.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Scanner;

public class DemoTees
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		TeeShirt tee = new TeeShirt();
		CustomTee custTee = new CustomTee();

		System.out.print("Enter order number >> ");
		tee.setOrderNumber(input.nextInt());
		System.out.print("Enter size (S, M, L, XL, XXL, XXXL) >> ");
		input.nextLine();
		tee.setSize(input.nextLine().toUpperCase());
		System.out.print("Enter color >> ");
		tee.setColor(input.nextLine());

		System.out.print("Enter order number >> ");
		custTee.setOrderNumber(input.nextInt());
		input.nextLine();
		System.out.print("Enter size (S, M, L, XL, XXL, XXXL) >> ");
		custTee.setSize(input.nextLine().toUpperCase());
		System.out.print("Enter color >> ");
		custTee.setColor(input.nextLine());
		System.out.print("Enter slogan for custom t-shirt >> ");
		custTee.setSlogan(input.nextLine());

		System.out.println("\nT-shirt details:");
		System.out.println("Order number: " + tee.getOrderNumber());
		System.out.println("Size: " + tee.getSize());
		System.out.println("Color: " + tee.getColor());
		System.out.println("Price: $" + tee.getPrice());
		
		System.out.println("\nCustom t-shirt details:");
		System.out.println("Order number: " + custTee.getOrderNumber());
		System.out.println("Size: " + custTee.getSize());
		System.out.println("Color: " + custTee.getColor());
		System.out.println("Price: $" + custTee.getPrice());
		System.out.println("Slogan: " + custTee.getSlogan());
	}
}
