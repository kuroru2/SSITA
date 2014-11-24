package FirstTasks;

public class TaskFactory
{
	   public Task getTask(String taskNumber){
	      if(taskNumber == null){
	         return null;
	      }		
	      if(taskNumber.equals("255")){
	         return new Task255();
	      } else if(taskNumber.equalsIgnoreCase("329")){
	         return new Task329();
	      } else if(taskNumber.equalsIgnoreCase("562")){
	         return new Task562();
	      }
	      return null;
	   }
}
