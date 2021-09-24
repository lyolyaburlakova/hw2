package hw.comp;

import hw.comp.components.CPU;
import hw.comp.components.HDD;
import hw.comp.components.Monitor;
import hw.comp.components.RAM;

public class Monoblock extends ComputerImpl{
    Monitor monitor;

    public Monoblock(String maker, String model, CPU cpu, RAM ram, HDD hdd, Monitor monitor) {
        super(maker, model, cpu, ram, hdd);
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return '{' +
                "maker = " + getMaker()  +
                ", model = " + getModel() +
                ", cpu = " + cpu.getCPUModel() +
                ", ram = " + ram.getRAMModel() +
                ", hdd = " + hdd.getHDDModel() +
                ", monitor = " + monitor.getMonitorModel() +
                '}';
    }

}

