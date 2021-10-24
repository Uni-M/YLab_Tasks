package week2.extended_task.sax_parse;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ParseSaxProject {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        UserHandler handler = new UserHandler();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("D:\\JavaProjects\\YLab_Extended_task\\test_files.xml"), handler);

        if (args.length > 0){
            ArrayList<Files> fileList = UserHandler.getFileList();
            for (Files f: fileList){
                if (args.length > 6 && f.getName().contains(args[args.length-1])) {
                    System.out.println(f.getName());
                }
                if (args.length == 6){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
