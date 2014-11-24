package FirstTasks;

import static org.junit.Assert.*; 

import java.util.ArrayList;

import org.junit.Test;

public class Test329 {

	@Test
	public void task329_Test_1()
	{
		TaskFactory taskFactory = new TaskFactory();
	    Task task329 = taskFactory.getTask("329");
	    ArrayList<Integer> expectedResult = new ArrayList<Integer>();
	    expectedResult.add(123);
	    expectedResult.add(132);
	    expectedResult.add(213);
	    expectedResult.add(231);
	    expectedResult.add(312);
	    expectedResult.add(321);
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    result = task329.solveProblem(600,14);
	    assertEquals(expectedResult, result);
	}
	
	@Test
	public void task329_Test_2()
	{
		TaskFactory taskFactory = new TaskFactory();
	    Task task329 = taskFactory.getTask("329");
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    result = task329.solveProblem(10,150);
	    assertEquals(null, result);
	}

}
