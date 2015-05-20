package Zadatak1;

public class MathCal {

	public static int GetIntResult(String expression) {
		int sum = 0;
		int num = 0;
		int k = 1;
		int number = -1;
		for (int i = expression.length() - 1; i >= 0; i--) {
			if (expression.charAt(i) != '+' && expression.charAt(i) != '-') {
				if(i == expression.length() - 1) {
					number = Integer.parseInt(Character.toString(expression.charAt(i)));
					num = number;
					k *= 10;
				}
				else if(number != -1 && i == expression.length() - 1) {
					if (Integer.parseInt(Character.toString(expression.charAt(i))) >= 0
							&& Integer.parseInt(Character.toString(expression.charAt(i))) < 10) {
						number = Integer.parseInt(Character.toString(expression
								.charAt(i)));
						num += number * k;
						k *= 10;
					}
				}
			}
			else if (expression.charAt(i) == '+') {
				sum += num;
				num = 0;
			}
			else if(expression.charAt(i) == '-') {
				sum -= num;
				num = 0;
			}
				
		}
		System.out.println(num);
		System.out.println(sum);
		sum += num;
		System.out.println(sum);
		return 0;
	}

	public static void main(String[] args) {
		int expression = GetIntResult("2+3");
		//System.out.println(expression);
	}

}
