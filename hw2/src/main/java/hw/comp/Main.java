package hw.comp;

import hw.comp.components.*;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[6];
        computers[0] = new PC("some maker", "some model", new CPU("some cpu") , new RAM("some ram"), new HDD("some hdd"), new GPU("some gpu"));
        computers[1] = new Laptop("some maker", "some model", new CPU("some cpu") , new RAM("some ram"), new HDD("some hdd"), new Monitor("some monitor"), new Keyboard("some keyboard"));
        computers[2] = new Netbook("some maker", "some model", new CPU("some cpu") , new RAM("some ram"), new HDD("some hdd"), new Monitor("some monitor"), new Keyboard("some keyboard"));
        computers[3] = new Monoblock("some maker", "some model", new CPU("some cpu") , new RAM("some ram"), new HDD("some hdd"), new Monitor("some monitor"));
        computers[4] = new Nettop("some maker", "some model", new CPU("some cpu") , new RAM("some ram"), new HDD("some hdd"));
        computers[5] = new Server("some maker", "some model", new CPU("some cpu") , new RAM("some ram"), new HDD("some hdd"));

        for (Computer computer : computers){
            System.out.println(computer.turnOn());
            System.out.println(computer.connect());
            System.out.println(computer.turnOff());
            System.out.println();
        }
    }
}
