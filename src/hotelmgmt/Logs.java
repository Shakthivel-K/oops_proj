package hotelmgmt;
import java.io.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class Logs {
	
	public  void LogMsg(String s)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		
		try {
			
			FileWriter fout =new FileWriter("E:/19oops/oops_proj/logs.txt");
			fout.write(dtf.format(now)+":"+s);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("vawegre");
			System.out.println(e+"Ho");
			e.printStackTrace();
		}

	}
	/* TEST CODE
	public static void main (String[] args)
	{
		System.out.println("@Main");
		Logs l=new Logs();
		l.LogMsg("Hello this is first msg");
	}
	*/

}
