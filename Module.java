package sample;

import java.io.*;
import java.nio.CharBuffer;

public class Module {
    public void reg(String login, String password) throws IOException {
        File fileData = new File("C:\\java_42\\1\\Registration.txt");
        fileData.createNewFile();
        FileWriter fw = new FileWriter(fileData);
        fw.write("Логин:  " + login + "\n" + "Пароль: " +password);
        fw.close();
    }

    public void sign(String login, String password) throws IOException {
        FileReader fr = new FileReader("C:\\java_42\\1\\Registration.txt");
        while (login != null && password != null){
            fr.read();
            fr.close();
        }
    }
}
