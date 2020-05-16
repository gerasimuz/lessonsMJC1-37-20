package edu.academy;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\JAVA\\IO\\src\\edu\\academy\\dataOut.txt")));
        out.writeInt(1000);
        out.writeInt(12);
        out.writeLong(10L);
        out.writeUTF("Hello world");
        out.flush();
        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\JAVA\\IO\\src\\edu\\academy\\dataOut.txt")));
        System.out.println(in.readInt());
        System.out.println(in.readInt());
        System.out.println(in.readLong());
        System.out.println(in.readUTF());


    }
}
