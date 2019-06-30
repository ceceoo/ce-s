import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class statistic {
private static int line = 0;
private static int comment=0;

public static void main(String args[]) throws IOException {
	File file = new File("C:\\Users\\10900\\eclipse-workspace3\\KarateChop\\src\\test.java");
    countLines(file);
    System.out.println("number of lines " + line);
    System.out.println("number of comments " + comment);
}

public static void countLines(File file) throws IOException {
	BufferedReader br = null;
	String s = null;
	try {
		br = new BufferedReader(new FileReader(file));
		boolean b = false;
		 while((s = br.readLine())  != null) {
			 s=s.trim();
			 if(s.startsWith("//")) {
				 comment++;
			 }
			 else if(s.startsWith("/*")&&s.endsWith("*/")) {
				 comment++;
			 }
			 else if(s.startsWith("/*")&&!s.endsWith("*/")) {
				 comment++;
				 b = true;
			 }
			 else if(s.endsWith("*/")){
				 comment++;
				 b = false;
			 }
			 else if(b) {
				 comment++;
			 }
			 else if(s.length()<1) {
				 
			 }
			 else line++;
		 }
		 br.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
	}
	
}
}
