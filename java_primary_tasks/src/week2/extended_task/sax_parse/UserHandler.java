package week2.extended_task.sax_parse;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class UserHandler extends DefaultHandler {


    // List to hold File objects
    private static ArrayList<Files> fileList = new ArrayList<>();

    private static ArrayList<String> fileInDirectory = new ArrayList<>();

    private static String currentValue = "";


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        if (qName.equalsIgnoreCase("child")) {
            if (attributes.getValue("is-file").equals("true")){
                Files.setIsFile(true);
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName){

        if (qName.equalsIgnoreCase("name")) {
            if (!currentValue.equals("/")){
                fileInDirectory.add(currentValue);

            }
            currentValue = "";

        }

        if (qName.equalsIgnoreCase("child")) {
            if (Files.getIsFile() == true){
                Files files = new Files();
                String fname = "";
                for (int i = 0; i < fileInDirectory.size(); i++){
                    fname += "/";
                    fname += fileInDirectory.get(i);
                }
                files.setName(fname);
                fileList.add(files);

                Files.setIsFile(false);
                fileInDirectory.remove(fileInDirectory.size()-1);

            }
        }

        if (qName.equalsIgnoreCase("children")) {

            if (fileInDirectory.size() > 0){
                fileInDirectory.remove(fileInDirectory.size()-1);
            }
        }


    }

    @Override
    public void characters(char[] ch, int start, int length) {
        currentValue += new String(ch, start, length).trim();
    }

    public static ArrayList<Files> getFileList(){
        return fileList;
    }
}
