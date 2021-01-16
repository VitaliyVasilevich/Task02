package by.htp.homework;

import java.util.Random;

public class Task02 {
	public static void main(String[] args) {

	}

	public static void init(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(12);
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 	

	public static void task1(int[] arr) {
		int k = 3;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				sum += arr[i];
			}
		}
		System.out.println("Сумма элементов кратных " + k + ": " + sum);
	}

//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов

	public static int[] task2(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				index++;
			}
		}
		int[] mas = new int[index];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				mas[j] = i;
				j++;
			}
		}
		return mas;
	}

//3. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

	public static void task3(int[] arr) {
		int x = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1] || arr[i] == arr[i - 1]) {
				x += 1;
			}
		}
		if (x == arr.length - 1) {
			System.out.println("Последовательность возрастающаа");
		} else {
			System.out.println("Последовательность не возрастающая");
		}
	}

//4. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. 
//Если таких чисел нет, то вывести сообщение об этом факте.

	public static int[] task4(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				index++;
			}
		}
		if (index == 0) {
			System.out.println("Данной последовательности не существует");
		}
		int[] mas = new int[index];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				mas[j] = arr[i];
				j++;
			}
		}
		return mas;
	}

//5. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

	public static void task5(int[] arr) {
		int maxNum = arr[0];
		int minNum = arr[0];
		int result;
		for (int i = 1; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
			if (minNum > arr[i]) {
				minNum = arr[i];
			}
		}
		result = maxNum - minNum;
		System.out.println("Наименьшая длина числовой оси, содержащая все елементы: " + result);
	}

//6. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. 
//Подсчитать количество замен.

	public static void task6(int[] arr) {
		int Z = 20;
		int amount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > Z) {
				arr[i] = Z;
				amount++;
			}

		}
		System.out.println("Количество замен: " + amount);
	}

//7. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

	public static void task7(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		int index_min = 0;
		int index_max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index_min = i;
			}
			if (arr[i] > max) {
				max = arr[i];
				index_max = i;
			}
		}
		arr[index_min] = max;
		arr[index_max] = min;
	}

//8. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 

	public static void task8(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

//9. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов. 	

	public static void task9(int[] arr) {
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negative++;
			} else if (arr[i] == 0) {
				zero++;
			} else {
				positive++;
			}
		}
		System.out.println("Отрицательных: " + negative + "; Нулевых: " + zero + "; Положительных: " + positive + ".");
	}

//10. 
	public static void task10(int[] arr) {
		int n = arr.length / 2;
		int max = arr[0] + arr[2 * n - 1];
		for (int i = 1; i < n; i++) {
			if (max < (arr[i] + arr[2 * n - i - 1])) {
				max = arr[i] + arr[2 * n - i - 1];
			}
		}
		System.out.println(max);
	}
}
