import java.io.ByteArrayInputStream;

import java.util.*;
public class FileStdOP {
	public static void main(String[] args) {
		String obj = "abc";
		byte b[] = obj.getBytes();
		ByteArrayInputStream obj1 = new ByteArrayInputStream(b);
		
		for(int i=0 ; i<2 ; ++i) {
			int c;
			while((c=obj1.read())!=-1) {
				if(i==0) {
					System.out.println(Character.toUpperCase((char)c));
				}
			}
		}
	}
}
