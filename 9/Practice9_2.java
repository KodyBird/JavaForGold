import java.nio.file.*;

public class Practice9_2 {
    public static void main(String[] args) {
	//	Path path = Paths.get("./src");
	Path path = Paths.get("src");
	System.out.println(path.getFileName());
	System.out.println(path.normalize());
	System.out.println(path.toAbsolutePath());
    }
}