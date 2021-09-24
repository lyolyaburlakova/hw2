package hw.comp;

import hw.comp.components.*;

public class Laptop extends ComputerImpl{
    Keyboard keyboard;
    Monitor monitor;

    public Laptop(String maker, String model, CPU cpu, RAM ram, HDD hdd, Monitor monitor, Keyboard keyboard) {
        super(maker, model, cpu, ram, hdd);
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
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
                ", keyboard = " + keyboard.getKeyboardModel() +
                '}';
    }
}
