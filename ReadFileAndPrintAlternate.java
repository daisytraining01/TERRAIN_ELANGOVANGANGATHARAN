package com.program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileAndPrintAlternate {
	public static void main(String[] args) throws IOException {
		try (Stream<String> stream = Files.lines(Paths.get("filedemo.java"))) {
		    stream.forEach(System.out::println);
		}
	}

	try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
	    stream.forEach(System.out::println);
	}

}
