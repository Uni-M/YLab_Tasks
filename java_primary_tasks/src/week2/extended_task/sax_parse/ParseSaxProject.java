package week2.extended_task.sax_parse;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class ParseSaxProject {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        UserHandler handler = new UserHandler();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("D:\\JavaProjects\\YLab_Extended_task\\test_files.xml"), handler);

    }
}
