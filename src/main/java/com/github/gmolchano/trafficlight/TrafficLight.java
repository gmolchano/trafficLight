package com.github.gmolchano.trafficlight;

import java.util.LinkedList;
import java.util.List;

public class TrafficLight implements Lightable {
    private List<Signal> signals = new LinkedList<Signal>();

    {
        signals.add(new Signal(SignalColor.RED, 3000));
        signals.add(new Signal(SignalColor.YELLOW, 1000));
        signals.add(new Signal(SignalColor.GREEN, 2000));
    }

    public TrafficLight() {
    }

    public TrafficLight(List<Signal> signals) {
        this.signals = signals;
    }

    /**
     * Lighting of Traffic Light is alternate lighting of all signals.
     */
    public void light() {
        for (Signal signal : signals) {
            signal.light();
        }
    }

    public List<Signal> getSignals() {
        return signals;
    }

    public void setSignals(List<Signal> signals) {
        this.signals = signals;
    }
}
