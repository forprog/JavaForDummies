import static java.lang.System.out;

import java.util.Locale;

public class PrintfTest {
	public static void main(String args[]) {
		out.printf("%s%d%s", ">>",7,"<<\n");
		out.printf("%s%8d%s", ">>",7,"<<\n");
		out.printf("%s%-8d%s", ">>",7,"<<\n");
		out.printf("%s%08d%s", ">>",7,"<<\n");
		out.printf("%s%+d%s", ">>",7,"<<\n");
		out.printf("%s%+d%s", ">>",-7,"<<\n");
		out.printf("%s%(d%s", ">>",-7,"<<\n");
		out.printf(Locale.US,"%s%10.5f%s", ">>",7.0,"<<\n");
		out.printf("%s%S%s", ">>","Hello","<<\n");
		out.printf("%s%s%s", ">>",'x',"<<\n");
		out.printf("%s%S%s", ">>",'x',"<<\n");
	}
}

