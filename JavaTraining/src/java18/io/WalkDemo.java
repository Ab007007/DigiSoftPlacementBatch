package java18.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WalkDemo
{

	public static void main(String[] args) throws IOException
	{
		
		File f = new File("D:\\EclipseWS");
		
		 Stream<Path> fs = Files.walk(f.toPath());
		 fs.forEach(System.out :: println);
		 fs.close();
		 fs = Files.walk(f.toPath());
		 System.out.println(fs.count());
		
	}
}
