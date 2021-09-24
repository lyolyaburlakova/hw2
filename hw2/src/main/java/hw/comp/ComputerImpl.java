package hw.comp;

import hw.comp.components.CPU;
import hw.comp.components.HDD;
import hw.comp.components.RAM;

public abstract class ComputerImpl implements Computer{
    private String maker;
    private String model;
    CPU cpu;
    RAM ram;
    HDD hdd;

    public ComputerImpl(String maker, String model, CPU cpu, RAM ram, HDD hdd) {
        this.maker = maker;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+toString();
    }
    public String getMaker() {
        return maker;
    }
    public String getModel() {
        return model;
    }
    public CPU getCpu() {
        return cpu;
    }
    public RAM getRam() {
        return ram;
    }
    public HDD getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return '{' +
                "maker = " + getMaker()  +
                ", model = " + getModel() +
                ", cpu = " + cpu.getCPUModel() +
                ", ram = " + ram.getRAMModel() +
                ", hdd = " + hdd.getHDDModel() +
                '}';
    }
}
