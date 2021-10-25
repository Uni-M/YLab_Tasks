package week2.extended_task.sax_parse;

public class Files {

    //XML attribute (~~ is-file="true")
    private static boolean isFile = false;

    //XML element (~~ file-776194140.xml)
    private String Name;

    public static boolean getIsFile() {
        return isFile;
    }
    public static void setIsFile(boolean is_file) {
        isFile = is_file;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return this.Name;
    }
}