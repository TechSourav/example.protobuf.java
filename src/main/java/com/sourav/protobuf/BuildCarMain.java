package com.sourav.protobuf;

import com.sourav.protobuf.examples.BuildComplexCar;

import java.util.Arrays;

public class BuildCarMain {
    public static void main(String[] args) {
        BuildComplexCar.Accessories carAccessories = makeCar(230,457,true);
        BuildComplexCar.BuildCar.Builder builder = BuildComplexCar.BuildCar.newBuilder();
        // Singular Message field
        builder.setOneAccessory(carAccessories);
        //repeated field
        builder.addMultipleAccessories(makeCar(450,850,true));
        builder.addMultipleAccessories(makeCar(100,200,true));
        builder.addMultipleAccessories(makeCar(200,300,true));
        builder.addMultipleAccessories(makeCar(300,500,true));

        builder.addAllMultipleAccessories(Arrays.asList(makeCar(50,60,true),makeCar(10,30,true)));
        BuildComplexCar.BuildCar finalCars = builder.build();
        System.out.println("My Compay Car: \n" + finalCars.toString());
    }

    private static BuildComplexCar.Accessories makeCar(int ls, int bs, boolean wiper) {
        BuildComplexCar.Accessories.Builder builder = BuildComplexCar.Accessories.newBuilder();
        BuildComplexCar.Accessories accessories =builder.setLegSpace(ls)
                .setBootSpace(bs)
                .setHasWiper(wiper)
                .setGlovBoxType("Cool")
                .build();
        return accessories;
    }
}
