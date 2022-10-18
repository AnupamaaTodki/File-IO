package com.javafileio;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class FileTest {

	@Test
	public void givenFilePathWhenCheckedThenPrintFile() throws IOException {
		// check file exist
		Path filePath = Paths.get("C:\\Users\\dell");
		Assert.assertTrue(Files.exists(filePath));

		
		// Delete file and check file not exist
//		if (Files.exists(filePath)) {
//		Files.delete(filePath);
//		}
//		Assert.assertTrue(Files.notExists(filePath));

		//Create directory
		Path path = Paths.get("c:\\Users\\dell\\demo\\");
		if (Files.exists(path)) {
			Files.delete(path);
		}
		Files.createDirectory(path);
		Assert.assertTrue(Files.exists(path));
		
		//List file, Directory as well as file with extension
		Files.list(filePath).filter(Files::isRegularFile).forEach(System.out::println);	
		System.out.println("*********Directories***********");
		Files.newDirectoryStream(filePath).forEach(System.out::println);
		System.out.println("*********Files with extension***********");
		Files.newDirectoryStream(filePath, pathh -> path.toFile().isFile() &&
		 path.toString().startsWith("s")).forEach(System.out::println);
	}
}
