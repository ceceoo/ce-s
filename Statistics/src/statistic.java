import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class statistic {
private static int line = 0;
public static boolean b = false;

public static void main(String args[]) throws IOException {
	File file = new File("C:\\Users\\10900\\eclipse-workspace3\\KarateChop\\src\\test.java");
    readCode(file);
    System.out.println("number of lines " + line);
}

public static void readCode(File file) throws IOException {
	BufferedReader br = null;
	try {
		br = new BufferedReader(new FileReader(file));
		countLines(br);
		 br.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } 
	
}
public static void countLines(BufferedReader br) throws IOException {
	String s = null;
	while((s = br.readLine())!= null) {
		s=s.trim();
		if(codeLine(s)) {
			line++;
		}
	}
}
public static boolean codeLine(String s) {
	if(singleLineComment(s)||beginLineComment(s)||endLineComment(s)||middleLineComment(s)||blankLine(s)) return false;
	return true;
	
}
public static boolean singleLineComment(String s) {
	if(s.startsWith("//")||(s.startsWith("/*")&&s.endsWith("*/"))) {
		return true;
	}
	return false;
}
public static boolean beginLineComment(String s) {
	if(s.startsWith("/*")&&!s.endsWith("*/")) {
		b = true;
		return true;
	}
	return false;
}
public static boolean endLineComment(String s) {
	if(s.endsWith("*/")) {
		b = false;
		return true;
	}
	return false;
}
public static boolean middleLineComment(String s) {
	if(b) {
		return true;
	}
	return false;
}
public static boolean blankLine(String s) {
	if(s.length()<1) {
		return true;
	}
	return false;
}
}
