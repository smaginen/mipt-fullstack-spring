package com.mipt.fullstackspring.my_spring;

import lombok.Data;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;


@Data
public class Elf {
    @InjectRandom(min = 7,max =12)
    private int power;
    @InjectRandom(min = 10,max =20)
    private int speed;







}
