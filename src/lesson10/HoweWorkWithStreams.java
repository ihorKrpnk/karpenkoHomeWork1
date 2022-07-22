package lesson10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static lesson10.ComputerCollection.computersList;

public class HoweWorkWithStreams {

    public static void main(String[] args) {

        List<Computer> computerList = computersList();
        computerList.stream().count();

        //1
        List<Computer> computersWindows = computersList().stream()
                .filter(comp -> comp.getOS().contains("Windows")).toList();
        System.out.println(computersWindows);
        //2
        List<Computer> twoComputersSsd = computersList().stream()
                .filter(compSsd -> compSsd.getStorage().getStorageType().contains("SSD")).limit(2).toList();
        System.out.println(twoComputersSsd);
        //3
        List<Double> prices = computersList().stream()
                .map(Computer::getPrice).toList();
        System.out.println(prices);
        //4
        double sortedPrice = computersList().stream()
                .map(Computer::getPrice)
                .sorted()
                .skip(2)
                .findFirst()
                .get();
        System.out.println(sortedPrice);
        //5
        Map<Integer, Computer> mapId = computersList().stream()
                .collect(Collectors.toMap(Computer::getId, computer -> computer));
        System.out.println(mapId);
        //6
        boolean dosNotMatch = computersList().stream()
                .noneMatch(pcDos -> pcDos.getOS().contains("DOS"));
        System.out.println(dosNotMatch);
        //7
        boolean macOsAnyMatch = computersList().stream()
                .anyMatch(pcMac -> pcMac.getOS().contains("MacOS"));
        System.out.println(macOsAnyMatch);
    }
}