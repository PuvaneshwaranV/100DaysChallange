import java.io.File;
class Delete 
{
	public static void main(String[] args) 
	{
   		 File file = new File("JavaFile.java");
   		 boolean value = file.delete();
    		 if(value) 
		 {
      			System.out.println("JavaFile.java is successfully deleted.");
    		 }
    		 else 
		 {
      			System.out.println("File doesn't exit");
    		 }
  	 }
}