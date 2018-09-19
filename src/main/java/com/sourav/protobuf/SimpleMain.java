package com.sourav.protobuf;

import example.simple.SimpleMessge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Build the SimpleMesage first
        SimpleMessge.SimpleMessage.Builder builder  =SimpleMessge.SimpleMessage.newBuilder();
        // Simple Fields
        builder.setCount(1)
                .setMessage("My first protobuf")
                .build();
        //Repeated Fields
        builder.addAllSampleList(Arrays.asList(1,2,4,5));
        System.out.println(builder.toString());

        // SimpleMessage to get
        SimpleMessge.SimpleMessage message = builder.build();


        // Write protocol buffers binary to file.
        try {
            FileOutputStream fos = new FileOutputStream("SimpleMessageFile.bin");
            message.writeTo(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // send as byte array
        byte[] bytes = message.toByteArray();

        // Reading protocol buffers binary from file.
        try {
            System.out.println("......Reading from file......");
            FileInputStream fis = new FileInputStream("SimpleMessageFile.bin");
            SimpleMessge.SimpleMessage msgFromFile =SimpleMessge.SimpleMessage.parseFrom(fis);
            System.out.println(msgFromFile);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
