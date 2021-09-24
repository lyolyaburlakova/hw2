package hw.comp;

import hw.comp.components.CPU;
import hw.comp.components.GPU;
import hw.comp.components.HDD;
import hw.comp.components.RAM;

public class PC extends ComputerImpl{
    GPU gpu;

    public PC(String maker, String model, CPU cpu, RAM ram, HDD hdd, GPU gpu) {
        super(maker, model, cpu, ram, hdd);
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return '{' +
                "maker = " + getMaker() +
                ", model = " + getModel() +
                ", cpu = " + cpu.getCPUModel() +
                ", ram = " + ram.getRAMModel() +
                ", hdd = " + hdd.getHDDModel() +
                ", gpu = " + gpu.getGPUModel() +
                '}';
    }
}

