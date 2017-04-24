package com.github.gmolchano.trafficlight;

import java.util.List;
import java.util.Scanner;

public class TrafficLightHandler {
    /**
     * Manual data entry.
     *
     * @param signals - List<Signal> with certain signal colors.
     * @return List<Signal> - result list with certain work time corresponding to each color.
     */
    public List<Signal> inputSignalsTime(List<Signal> signals) {
        int signalsSize = signals.size();
        if (signalsSize > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the lighting time of signals (seconds), please");
            for (Signal signal : signals) {
                do {
                    System.out.print(signal.getColor() + ": ");
                    if (scanner.hasNextInt()) {
                        int time = scanner.nextInt() * 1000;
                        if (time >= 0) {
                            signal.setLightingTime(time);
                            break;
                        } else {
                            System.out.println("Input positive integer, please");
                        }
                    } else {
                        System.out.println("Input integer, please");
                        scanner.next();
                    }
                } while (true);
            }
        }
        return signals;
    }
}
