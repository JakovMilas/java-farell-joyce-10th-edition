/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 11a

Task:
Serendipity Gifts accepts user orders for its products interactively. Users might make the following errors
as they enter data:
 - The item number ordered is not numeric, too low (less than 0), or too high (more than 9999).
 - The quantity is not numeric, too low (less than 1), or too high (more than 12).
 - The item number is not a currently valid item.
Although the company might expand in the future, its current inventory consists of the items listed in table:
 
ITEM NUMBER  | PRICE($)
-------------|----------
 111         | 0.89
 222         | 1.47
 333         | 2.43
 4444        | 5.99

Create a class that stores an array of usable error messages; save the file as OrderMessages.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class OrderMessages
{
	public static final String[] MESSAGES = {"The item number emtered is not numeric.",
						 "The item number entered is too low.",
						 "The intem number entered is too high.",
						 "The quantity entered is not numeric.",
						 "The quantity number entered is too low.",
						 "The quantity number entered is to high.",
						 "The item number is not currently valid item"};
}
