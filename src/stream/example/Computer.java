package stream.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static stream.example.Computer.DeviceOperatingSystem.ANDROID;
import static stream.example.Computer.DeviceOperatingSystem.IOS;

public class Computer {

    public static void main(String[] args) {
        List<Device> list = Arrays.asList(
                new Device("laptop", 16, ANDROID),
                new Device("desktop", 4, IOS),
                new Device("tv", 8,ANDROID),
                new Device("phone", 6, IOS)
        );

        //Imperative approach
        System.out.println("Imperative approach");
        List<Device> iOSdevices = new ArrayList<>();
        for (Device device : list) {
            if (IOS.equals(device.os)){
                iOSdevices.add(device);
            }
        }
        for(Device ios:iOSdevices){
            System.out.println(ios.deviceType+" "+ios.memorySize+" "+ios.os);
        }

        //Declarative approach
        System.out.println("Declarative approach");
        Predicate<Device> devicePredicate = device -> IOS.equals(device.os);
        List<Device> iosMachine = list.stream()
                .filter(devicePredicate)
                .collect(Collectors.toList());

        iosMachine.forEach(System.out::println);
    }


     public static class Device{
        public String deviceType;
        public int memorySize;
        public DeviceOperatingSystem os;

        public Device(){}
        public Device(String deviceType, int memorySize, DeviceOperatingSystem os){
            this.deviceType = deviceType;
            this.memorySize = memorySize;
            this.os = os;
        }

        @Override
         public String toString(){
            return "deviceType = " + deviceType + " memoerySize= "+memorySize+" os= "+os;
        }
    }

    static enum DeviceOperatingSystem{
         ANDROID, IOS
    }
}
