package hw.comp;

import hw.comp.components.CPU;
import hw.comp.components.HDD;
import hw.comp.components.RAM;

public class Server extends ComputerImpl{

    public Server(String maker, String model, CPU cpu, RAM ram, HDD hdd) {
        super(maker, model, cpu, ram, hdd);
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

