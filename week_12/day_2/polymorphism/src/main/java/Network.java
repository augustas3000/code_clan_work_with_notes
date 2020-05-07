import javax.swing.*;
import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
//    private ArrayList<Printer> devicesPrinter;

    public Network(String name){
//        single array list that will take in devices
        this.devices = new ArrayList<IConnect>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

//    diff parameter types, JAVA allows - method overloading


    public void connect(IConnect device){
        devices.add(device);
    }


    public void disconnectAll(){
        devices.clear();
//        devicesPrinter.clear();
    }
}