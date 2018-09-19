package com.sourav.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.sourav.protobuf.addressBook.AddressBook;
import com.sourav.protobuf.addressBook.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class MyAddressBookMain {
    public static void main(String[] args) {
        System.out.println("My Address Book..");

        Person.Builder PersonBuilder = Person.newBuilder();

        Person.PhoneNumber.Builder phNumBuilder1 = Person.PhoneNumber.newBuilder();
        phNumBuilder1.setNumber("9632587412")
                .setType(Person.PhoneType.HOME)
                .build();

        Person.PhoneNumber.Builder phNumBuilder2 = Person.PhoneNumber.newBuilder();
        phNumBuilder2.setNumber("8523697412")
                .setType(Person.PhoneType.WORK)
                .build();
        // Create PersonBuilder with Phone Number details
        PersonBuilder.setName("Sourav Kundu")
                .setId(353525)
                .setEmail("sourav.kundu@xyz.com")
                .addAllPhones(Arrays.asList(phNumBuilder1.build(), phNumBuilder2.build()));
        // Add the details to address book
        AddressBook.Builder addressBookBuilder = AddressBook.newBuilder();
        addressBookBuilder.addPeople(PersonBuilder);

        System.out.println(addressBookBuilder.build().toString());
        writeToAndReadFromFile(addressBookBuilder);
        ConvertToJSonAndToProto(addressBookBuilder);
    }

    private static void ConvertToJSonAndToProto(AddressBook.Builder addressBookBuilder) {
        try {
            // to Json
            String jsonString=JsonFormat.printer().print(addressBookBuilder);
            System.out.println("To JSON : \n" + jsonString);
            System.out.println("\n");
            // From Json
            AddressBook.Builder addressBookBuilderNew = AddressBook.newBuilder();
            JsonFormat.parser().merge(jsonString,addressBookBuilderNew);
            System.out.println("FROM JSON : \n" + addressBookBuilderNew.toString());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

    }

    private static void writeToAndReadFromFile(AddressBook.Builder addressBookBuilder) {
        // Write all the details to File
        try {
            FileOutputStream fos = new FileOutputStream("MyAddressBook.bin");
            addressBookBuilder.build().writeTo(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read all the details from File
        try {
            FileInputStream fis = new FileInputStream("MyAddressBook.bin");
            AddressBook addressDetails = AddressBook.parseFrom(fis);
            System.out.println(addressDetails);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


