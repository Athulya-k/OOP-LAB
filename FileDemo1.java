import java.io.File;

class FileDemo1 {
  public static void main(String[] args) {

    
    File file = new File("/Documents/MCA 1st sem");

    
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}