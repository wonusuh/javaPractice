package 이차원반복문;

public class _03삼각형그리기 {
	public static void main(String[] args) {
		// 가로i 세로k
//		1
//			#	i=0 k=0
//			##	i=1 k=0 k=1
//			###	i=2 k=0 k=2
		for (int i = 0; i < 3; i += 1) {
			for (int k = 0; k <= i; k += 1) {
				System.out.print("#");
			}
			System.out.println();
		}

		System.out.println("==========");

//		2
//			###
//			##
//			#
		for (int i = 3; i >= 0; i -= 1) {
			for (int k = 0; k < i; k += 1) {
				System.out.print("#");
			}
			System.out.println();
		}
//		3
//			@##
//			@@#
//			@@@

//		4
//			  #
//			 ###
//			#####
	}
}
