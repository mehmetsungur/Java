package serialization;

import java.io.*;

public class SeriANDDeSeri {
    public static void main(String[] args) {
        //writeObject();
        readObject();
    }

    public static void writeObject(){
        User user1 = new User(1L,"A","1");
        User user2 = new User(2L,"B","12");
        User user3 = new User(3L,"C","123");
        User user4 = new User(4L,"D","1234");
        User user5 = new User(5L,"E","12345");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("user.txt");
            //objects
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(user1);
            objectOutputStream.writeObject(user2);
            objectOutputStream.writeObject(user3);
            objectOutputStream.writeObject(user4);
            objectOutputStream.writeObject(user5);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readObject() {
        try (FileInputStream fis = new FileInputStream("user.txt");
             ObjectInputStream input = new ObjectInputStream(fis)) {

            while (true) {
                try {
                    User user = (User) input.readObject();
                    System.out.println(user);
                } catch (EOFException e) {
                    break; // dosyanın sonuna ulaşıldı
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
