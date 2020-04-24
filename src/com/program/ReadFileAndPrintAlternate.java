package com.program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileAndPrintAlternate {
	static int j=1;
	public static void main(String[] args) throws IOException {
		try (Stream<String> stream = Files.lines(Paths.get("ReadFileAndPrintAlternate.java"))) {
			
		    stream.forEach(i->{
		    	if(j%2!=0)System.out.println(i);
		    	j++;
		    }  );
		    }
}
}

/*
 * OUTPUT package com.program; import java.io.IOException; import
 * java.nio.file.Paths;
 * 
 * public static void main(String[] args) throws IOException {
 * stream.forEach(System.out::println); } try (Stream<String> stream =
 * Files.lines(Paths.get(fileName))) { } }
 */
