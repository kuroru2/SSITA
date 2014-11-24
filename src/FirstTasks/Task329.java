package FirstTasks;

import java.util.ArrayList; 
import java.util.List;
import java.util.InputMismatchException;

public class Task329 implements Task
{
	@Override
	public ArrayList<Integer> solveProblem(int n, int m)
	{

		ArrayList<Integer> output = new ArrayList<Integer>();
		int counter = 0;	
		if (n < 0)
		{
			throw new InputMismatchException("Error. Incorrect value given.");
		}
		if (m < 0)
		{
			throw new InputMismatchException("Error. Incorrect value given.");
		}
		for (int g = 0; g < n; g++)
		{
			String f = "" + g;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < f.length(); i++)
			{
				char x = f.charAt(i);
				int y = Character.getNumericValue(x);
				list.add(y);
			}
			int k = 0;
			for (int j = 0; j < list.size(); j++)
			{
				k += Math.pow(2, list.get(j));
			}
			if (k == m)
			{
				counter ++;
				output.add(g);
			}
		}
		if (counter == 0)
		{
			return null;
		}
		return output;
	}

	@Override
	public ArrayList<Integer> solveProblem()
	{
		return null;

	}

	@Override
	public int solveProblem(int n, String[] symbols)
	{
		return 0;

	}
}
