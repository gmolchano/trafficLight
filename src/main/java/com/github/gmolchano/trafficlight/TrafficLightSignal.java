package com.github.gmolchano.trafficlight;

import java.util.Scanner;

public class TrafficLightSignal {
    /**
     * Application entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        TrafficLightSignal main = new TrafficLightSignal();
        main.start();
    }

    /**
     * Application start.
     */
    private void start() {
        Scanner scanner = new Scanner(System.in);
        TrafficLight trafficLight = new TrafficLight();
        TrafficLightHandler handler = new TrafficLightHandler();
        trafficLight.setSignals(handler.inputSignalsTime(trafficLight.getSignals()));
        trafficLight.light();
    }
}
