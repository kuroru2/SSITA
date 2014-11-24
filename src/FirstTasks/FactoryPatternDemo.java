package FirstTasks;

public class FactoryPatternDemo
{
	public static void main(String[] args)
	{
	      TaskFactory taskFactory = new TaskFactory();

	      //get an object of Task 255 class and solve respective problem
	      Task task255 = taskFactory.getTask("255");
	      String[] input = {"e", "e", "a", "a"};
	      task255.solveProblem(4, input);

	      //get an object of Task 255 class and solve respective problem
	      Task task329 = taskFactory.getTask("329");
	      task329.solveProblem(500, 14);

	      //get an object of Task 255 class and solve respective problem
	      Task task562 = taskFactory.getTask("562");
	      task562.solveProblem();
	}
}
