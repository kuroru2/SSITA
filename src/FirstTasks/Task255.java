package FirstTasks;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Task255 implements Task
{
	@Override
	public int solveProblem(int n, String[] symbols)
	{
		if (n < 0)
		{
			throw new InputMismatchException("Error. Incorrect value given.");
		}
		int result = 0;
		for (int j = 0; j < n-1; j++)
		{
			if ((symbols[j].equals("a")) && (symbols[j+1].equals("a")))
			{
				result = j+1;
				break;
			}
		}
		return result;
	}

	@Override
	public ArrayList<Integer> solveProblem()
	{
		return null;
		
	}

	@Override
	public ArrayList<Integer> solveProblem(int n, int m)
	{
		return null;

	}
}
