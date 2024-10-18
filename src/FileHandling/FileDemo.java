package FileHandling;

import java.io.*;

public class FileDemo {
    public void writeData() throws IOException {
        File file=new File("C:\\Users\\ADMIN\\IdeaProjects\\Collections\\StudentInfo.txt");
        // FileOutputStream outputStream = new FileOutputStream(file, true);
        FileOutputStream outputStream=new FileOutputStream(file);
        Student student1=new Student("pravallika",1,670);
        Student student2=new Student("John",2,560);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(student1);
        objectOutputStream.writeObject(student2);


    }
    public void readData() throws IOException,ClassNotFoundException{
        File file=new File("C:\\Users\\ADMIN\\IdeaProjects\\Collections\\StudentInfo.txt");

        FileInputStream inptStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(inptStream);
        Student student1 = (Student) objectInputStream.readObject();
        Student student2 = (Student) objectInputStream.readObject();

        System.out.println(student1);
        System.out.println(student2);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileDemo fileOperations=new FileDemo();
        fileOperations.writeData();
        fileOperations.readData();

    }
}
