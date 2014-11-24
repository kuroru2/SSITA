package FirstTasks;

import static org.junit.Assert.*; 
import java.util.ArrayList;
import org.junit.Test;

public class Test562 {

	@Test
	public void task562_Test_1() {
		TaskFactory taskFactory = new TaskFactory();
	    Task task255 = taskFactory.getTask("562");
	    ArrayList<Integer> expectedResult = new ArrayList<Integer>();
	    expectedResult.add(153);
	    expectedResult.add(370);
	    expectedResult.add(371);
	    expectedResult.add(407);
	    expectedResult.add(1634);
	    expectedResult.add(8208);
	    expectedResult.add(9474);
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    result = task255.solveProblem();
	    assertEquals(expectedResult, result);
	}

}
