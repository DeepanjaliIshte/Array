import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SentanceArray {
	public static void main(String[] args) throws IOException {
	File file= new File("C:\\New folder\\sample.txt");
	FileReader fr=new FileReader(file);
	int d;
	int count=0;
	StringBuffer sb=new StringBuffer();
	while ((d=fr.read())!=-1) {
		sb.append((char)d);
		}
	System.out.println(sb);
		String filesData=new String(sb); 
	
		
		String files[]=filesData.split(",");
		 
		for(int i=0; i<=files.length; i++)
		{ 
		
			System.out.println(i);
			count++;
			
		}  
		System.out.println("sentance "+ count);
		}
	
		}