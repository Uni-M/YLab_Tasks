package week2.extended_task.sax_parse;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.File;
import java.io.IOException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParseSaxProject {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        UserHandler handler = new UserHandler();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("D:\\JavaProjects\\YLab_Extended_task\\test_files.xml"), handler);

        printInfo(args);
    }



    private static void printInfo(String[] args){

        for (Files f : UserHandler.getFileList()) {
            String input = f.getName();
            String mArgument = args[args.length-1];


            if(args[args.length-2].equals("-s") || args[args.length-2].equals("-S")){   //if before the last argument the characters -s or -S are looking for a substring

                if (mArgument.contains("*.")) {            //if argument contains "*." find look for files with the specified extension
                    String extension = mArgument.substring(2, mArgument.length()-1);
                    final Pattern pattern = Pattern.compile(extension, Pattern.DOTALL);
                    Matcher matcher = pattern.matcher(input);
                    if (matcher.find()) {
                        System.out.println(input);
                    }

                }else if (input.contains(args[args.length-1])){    //look if argument contains part if string or name of file
                    System.out.println(input);

                }else {         //look if argument is regular expression
                    String regex = mArgument.substring(1, mArgument.length()-1);
                    final Pattern pattern = Pattern.compile(regex,Pattern.DOTALL);
                    //final Pattern pattern = Pattern.compile(".*?[a-z]{4}-\d+\.[a-z]+",Pattern.DOTALL);
                    Matcher matcher = pattern.matcher(input);
                    while (matcher.find()) {
                        System.out.println(input);
                    }
                }
            }else {         //print all files
                System.out.println(input);
            }
        }
    }
}
