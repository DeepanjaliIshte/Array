import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;

public class FlieArray {

	public static void main(String[] args) throws IOException {
File file= new File("C:\\New folder\\sample.txt");
FileReader fr=new FileReader(file);
int d;
StringBuffer sb=new StringBuffer();
while ((d=fr.read())!=-1) {
	sb.append((char)d);
	}
	System.out.println(sb);
	
	String filesData=new String(sb); 
	System.out.println("Count..................");
	int length=filesData.length();
	String files[]=filesData.split(" ");
	for(int i=0; i<files.length; i++)
	{
		System.out.println(i);
		
	}
	System.out.println(length);
	
	}


		
		
	}


