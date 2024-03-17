package java18.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo
{

	public static void main(String[] args) throws IOException
	{
		
		File f = new File("D:\\\\");
		
		 Stream<Path> fs = Files.list(f.toPath());
		 
		// fs.forEach(System.out :: println);
		List<Path> onlyTempFile = fs.filter(path -> (path.toString().contains("temp"))).collect(Collectors.toList());
		
		onlyTempFile.forEach(System.out :: println );
			
	}
}
