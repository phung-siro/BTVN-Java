package Chuong7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


    class User implements  Serializable{
        private int id;
        private String name;
        private int age;
        public User (int id,String name,int age){
           this.id=id;
           this.name=name;
           this.age=age;
        }
        @Override
        public String toString(){
            return"User [ID=" + id + ", Name=" + name + ", Age=" + age + "]";
        }
    }
    public class Chuong7_Bai2 {
        public static void main(String[] args) {
            User user = new User(1, "Huy", 20);
            String fileName = "user.dat";
            //Ghi doi tuong
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
                oos.writeObject(user);
                System.out.println("Đã lưu thông tin User vào file");
            }catch (IOException e){e.printStackTrace();}
            //Đọc đối tượng
            try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream(fileName))){
                User readUser= (User) ois.readObject();
                System.out.println("Thông tin User đọc được: "+readUser);
            }catch (Exception e){e.printStackTrace();}
        }
}
