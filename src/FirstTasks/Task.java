package FirstTasks;

import java.util.ArrayList;

public interface Task
{
	ArrayList<Integer> solveProblem();
	
	ArrayList<Integer> solveProblem(int n, int m);

	int solveProblem(int n, String[] symbols);
}
