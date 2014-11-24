package FirstTasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test255 {

	@Test
	public void task255_Test_1()
	{
		TaskFactory taskFactory = new TaskFactory();
	    Task task255 = taskFactory.getTask("255");
	    String[] input = {"e", "e", "a", "a"};
	    int result = task255.solveProblem(4, input);
	    assertEquals(3, result);
	}

	@Test
	public void task255_Test_2()
	{
		TaskFactory taskFactory = new TaskFactory();
	    Task task255 = taskFactory.getTask("255");
	    String[] input = {"a", "a", "a", "a"};
	    int result = task255.solveProblem(4, input);
	    assertEquals(1, result);
	}
	
	@Test
	public void task255_Test_3()
	{
		TaskFactory taskFactory = new TaskFactory();
	    Task task255 = taskFactory.getTask("255");
	    String[] input = {"e", "e", "e", "e"};
	    int result = task255.solveProblem(4, input);
	    assertEquals(0, result);
	}
	
	@Test
	public void task255_Test_4()
	{
		TaskFactory taskFactory = new TaskFactory();
	    Task task255 = taskFactory.getTask("255");
	    String[] input = {"e", "e", "e", "e", "e", "e", "e", "e", "a", "a"};
	    int result = task255.solveProblem(10, input);
	    assertEquals(9, result);
	}
}
