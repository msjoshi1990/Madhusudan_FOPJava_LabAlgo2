package main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int sizeOfTransactonArray;
		int numberOfTarget;

		int transcationArray[];

		Scanner input = new Scanner(System.in);

		System.out.println("enter the size of transaction array");

		if (input.hasNextInt()) {
			sizeOfTransactonArray = input.nextInt();

			if (sizeOfTransactonArray > 0) {

				transcationArray = new int[sizeOfTransactonArray];

				System.out.println("enter the values of array");

				for (int i = 0; i < transcationArray.length; i++) {

					if (input.hasNextInt()) {
						transcationArray[i] = input.nextInt();
					} else {
						System.out.println("Please enter a valid transaction");
					}
				}

				System.out.println("enter the total no of targets that needs to be achieved");

				if (input.hasNextInt()) {

					numberOfTarget = input.nextInt();

					for (int i = 0; i < numberOfTarget; i++) {

						System.out.println("enter the value of target");

						int targetValue = input.nextInt();

						int sum = 0;

						for (int j = 0; j < transcationArray.length; j++) {

							sum += sum + transcationArray[j];

							if (sum > targetValue) {

								int index = j + 1;
								System.out.println("Target achieved after " + index + " transactions");
								break;
							}
						}
					}
				} else {
					System.out.println("Please enter a valid input");
				}

			} else {
				System.out.println("Please enter a valid input");
			}

		} else {
			System.out.println(input.nextInt() + " is valid transaction");
		}

		input.close();

	}
}

