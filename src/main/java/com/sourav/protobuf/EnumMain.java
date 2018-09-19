package com.sourav.protobuf;

import enumeration.year.EnumerationYear;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Aisa Cup");

        // Build the SimpleMesage first
        EnumerationYear.EnumCricketMatch.Builder builder  = EnumerationYear.EnumCricketMatch.newBuilder();
        // Simple Fields
        builder.setNum(1)
                .setTeamName("India vs Pakistan")
                .setGameSchedule(EnumerationYear.GameSchedule.DEC)
                .build();
        System.out.println(builder.toString());

        // EnumCricketMatch to get
        EnumerationYear.EnumCricketMatch message = builder.build();


        // Write protocol buffers binary to file.
        try {
            FileOutputStream fos = new FileOutputStream("AsiaCup.bin");
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
            FileInputStream fis = new FileInputStream("AsiaCup.bin");
            EnumerationYear.EnumCricketMatch msgFromFile =EnumerationYear.EnumCricketMatch.parseFrom(fis);
            System.out.println(msgFromFile);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
