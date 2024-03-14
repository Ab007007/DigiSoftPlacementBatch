package java18;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Test
{
	public static void main(String[] args) throws IOException
	{

		File f = new File("src");

		Stream<Path> s = Files.walk(f.toPath());

		s.forEach(System.out::println);
	}
}
