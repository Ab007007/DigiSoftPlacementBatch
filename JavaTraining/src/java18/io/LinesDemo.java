package java18.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinesDemo
{

	public static void main(String[] args) throws IOException
	{
		String path = "D:\\EclipseWS\\JavaTraining\\src\\java18\\stream\\FiltersInStream.java";
		Files.lines(new File(path).toPath()).forEach(System.out::println);
		
		
		System.out.println("************ Pringint only imports *********************");
		Files.lines(new File(path).toPath()).filter(line -> (line.contains("import")))
		.collect(Collectors.toList()).forEach(System.out :: println);
	
		System.out.println("************ Pringint only System *********************");
		Files.lines(new File(path).toPath()).filter(line -> (line.contains("System")))
		.collect(Collectors.toList()).forEach(System.out :: println);

	}
}
