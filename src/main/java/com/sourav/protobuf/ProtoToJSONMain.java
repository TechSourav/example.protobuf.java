package com.sourav.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.SimpleMessge;

import java.util.Arrays;

public class ProtoToJSONMain {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        // Build the SimpleMesage first
        SimpleMessge.SimpleMessage.Builder builder  =SimpleMessge.SimpleMessage.newBuilder();
        // Simple Fields
        builder.setCount(1)
                .setMessage("My first protobuf")
                .build();
        //Repeated Fields
        builder.addAllSampleList(Arrays.asList(1,2,4,5));
        System.out.println(builder.toString());

        // Print this as JSON
        String jsonString = JsonFormat.printer()
                .includingDefaultValueFields()
                .print(builder);
        System.out.println("JSON string: \n "+ jsonString);

        // print JSON into protobuf
        SimpleMessge.SimpleMessage.Builder builder2  =SimpleMessge.SimpleMessage.newBuilder();
        JsonFormat.parser()
                .ignoringUnknownFields()
                .merge(jsonString,builder2);
        System.out.println("JSON to Protobuf:: \n" + builder2.toString());
    }
}
