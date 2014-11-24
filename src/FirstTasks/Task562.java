package FirstTasks;

import java.util.ArrayList;

public class Task562 implements Task
{
	@Override
	public ArrayList<Integer> solveProblem()
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
	    for (int i = 10; i < 10000; i++)
	    {
	 	    int inputNumber = i;
	   	    boolean result = isArmstrong(inputNumber);
	   	    if (result)
	   	    {
	   	 	    output.add(inputNumber);
	   	    }
        }
		return output;
	}
	
	public static boolean isArmstrong(int input) {
		String inputAsString = input + "";
	    int numberOfDigits = inputAsString.length();
	    int copyInput = input;
	    int sum = 0;
	    while (copyInput != 0) {
	        int lastDigit = copyInput % 10;
	        sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
	        copyInput = copyInput / 10;
	    }
	    if (sum == input) {
	        return true;
	    } else {
	        return false;
	    }
	}

	@Override
	public ArrayList<Integer> solveProblem(int n, int m)
	{
		return null;

	}

	@Override
	public int solveProblem(int n, String[] symbols)
	{
		return n;

	}
}
