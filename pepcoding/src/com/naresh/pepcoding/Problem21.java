package com.naresh.pepcoding;

import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		 {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				for (int i = 1; i <= n; i++) {
					if(i % 2 != 0) {
						for (int j = 1; j <= (2 * i - 1); j++) {
							if (j % 2 == 0) {

								System.out.print("#");
							} else {
								System.out.print((int) (j / 2) + 1);
							}

						}
					}else {
						for (int j = (2 * i - 1); j >= 1; j--) {
							if (j % 2 == 0) {

								System.out.print("#");
							} else {
								System.out.print((int) (j / 2) + 1);
							}

						}
					}
					System.out.println();

				}

			}
	}

}
	


