import java.io.*;
import java.util.*;
public class RemoveText {
// main method.
public static void main(String[] args) {
  
// Checking for invalid command line entry.
if (args.length != 2) {
System.out.println("Usage: java RemoveText <string to remove> <fileName>");
System.exit(0);
}
File sourceFile = new File(args[1]);
  
// Checking the existence of the file.
if (!sourceFile.exists()) {
System.out
.println("Source file does not exist. Program will exit. ");
System.exit(0);
}
  
File tempFile = new File( "D:\\tempfile.txt" );
// Creating the Scanner object.
Scanner input = null;
try {
input = new Scanner(sourceFile);
} catch (FileNotFoundException e) {
// this will never be executed as we have already checked that file exists
}
// Creating the PrintWriter object.
PrintWriter output = null;
try {
output = new PrintWriter(tempFile);
} catch (FileNotFoundException e) {
// if file doesn't exist it creates the file
e.printStackTrace();
}
  
while (input.hasNextLine()) {
String s1 = input.nextLine();
// Removing the text.
String s2 = s1.replaceAll(args[0], "");
output.println(s2);
}
output.flush();
input.close(); // Closing the stream.
output.close(); // Closing the stream.
sourceFile.delete(); // Deleting the original file.
  
tempFile.renameTo(sourceFile);
  
// Renaming the temp file.
tempFile.delete(); // Deleting the temp file.
}
}