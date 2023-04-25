package main;

import java.util.Scanner;

public class Currency {


	int[] sort(int arr[])
	{
		int [] arrSorted;

		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		arrSorted = arr;
		return arrSorted;

	}

	void printArray(int [] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);
		}

		System.out.println();
	}


	public static void main(String[] args) {

		int sizeOfDenomination;
		int arrCurrencyDenominations[];
		int arrCurrencyNoteCont[];
		int paymentValue;


		Currency currency = new Currency();

		Scanner input = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");

		sizeOfDenomination = input.nextInt();

		arrCurrencyDenominations = new int[sizeOfDenomination];
		arrCurrencyNoteCont = new int[sizeOfDenomination];

		System.out.println("enter the currency denominations value");

		for (int i = 0; i < arrCurrencyDenominations.length; i++) {

			arrCurrencyDenominations[i] = input.nextInt();
		}

		
		arrCurrencyDenominations = currency.sort(arrCurrencyDenominations);
		currency.printArray(arrCurrencyDenominations);

		System.out.println("enter the amount you want to pay");

		paymentValue = input.nextInt();

		for (int i = arrCurrencyDenominations.length -1 ; i >= 0; i--) {
			if (paymentValue >= arrCurrencyDenominations[i]) {
				arrCurrencyNoteCont[i] = paymentValue / arrCurrencyDenominations[i];
				paymentValue = paymentValue - arrCurrencyNoteCont[i] * arrCurrencyDenominations[i];
			}
		}

		for (int i = 0; i < arrCurrencyNoteCont.length; i++) {
			if (arrCurrencyNoteCont[i] != 0) {
				System.out.println(arrCurrencyDenominations[i] + " : " + arrCurrencyNoteCont[i]);  
			}
		}

		input.close();
	}

}
