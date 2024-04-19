import java.io.*;

public class Find {
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
			
			if(filesData.contains("atul")) {
				System.out.println("name avilabel");
			}else {
				System.out.println("not avilable");
			}
			 
		}}