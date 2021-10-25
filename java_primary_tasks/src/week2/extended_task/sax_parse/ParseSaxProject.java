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
        if (args.length > 0) {
            for (Files f : UserHandler.getFileList()) {
                String input = f.getName();

                String regex;
                String mArgument = args[args.length-1];

                if(args[args.length-2].equals("-s") || args[args.length-2].equals("-S")){
                    if (mArgument.contains("*.")) {
                        regex = mArgument.substring(2, mArgument.length()-1);
                        final Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
                        Matcher matcher = pattern.matcher(input);
                        if (matcher.find()) {
                            System.out.println(input);
                        }
                    }else if (input.contains(args[args.length-1])){
                        System.out.println(input);
                    }else {
                        regex = mArgument.substring(1, mArgument.length()-1);
                        final Pattern pattern = Pattern.compile(regex,Pattern.DOTALL);
                        //final Pattern pattern = Pattern.compile(".*?[a-z]{4}-\d+\.[a-z]+",Pattern.DOTALL);
                        Matcher matcher = pattern.matcher(input);
                        while (matcher.find()) {
                            System.out.println(input);
                        }
                    }
                }else {
                    System.out.println(input);
                }
            }
        }
    }
}
