package com.rudra.test;

public class CodingContest {

	public static void main(String[] args) {
		int[] input2 = { 1 };
		int[] input3 = { 1 };
		int[] input4 = { 10 };

		DistributingMedals(1, input2, input3, input4, 2);

	}

	public static int DistributingMedals(int input1, int[] input2,
			int[] input3, int[] input4, int input5) {
		// Write code here
		int j = 0;
		
		if (input1 != 0 && input2 != null && input2.length != 0
				&& input3 != null && input3.length != 0 && input4 != null
				&& input4.length != 0) {

			Integer inp2 = input2[0];
			Integer inp3 = input3[0];
			Integer inp4 = input4[0];
			
			Integer inp6 = inp4 - inp3 + 1;
			Integer inp7 = 0;
			boolean check = false;
			if (inp3 != 1) {
				inp7 = input5 + inp3;
				j = inp3;
			} else {
				inp7 = input5;
			}
			for (int i = 0; i < input1; i++) {
				if (inp6 != 0) {
					for (int k = 1; k <= inp3; k++) {
						if (!check) {
							inp6 = inp6 - 1;
							if (inp6 != 0) {
								j++;

								if (j > inp7) {
									check = true;
									
									return j;
								}
							}
						}
					}
				}
			}
			if (!check) {
				j = -1;
				
				return j;
			}

		}

		return j;
	}

}
