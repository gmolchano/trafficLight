package com.github.gmolchano.trafficlight;

public class Signal implements Lightable {
    private SignalColor color;
    private int lightingTime;
    private boolean isLighted;

    public Signal(SignalColor color, int lightingTime) {
        this.color = color;
        this.lightingTime = lightingTime;
    }

    public SignalColor getColor() {
        return color;
    }

    public void setColor(SignalColor color) {
        this.color = color;
    }

    public boolean isLighted() {
        return isLighted;
    }

    public void setLighted(boolean lighted) {
        if (!isLighted && lighted) {
            System.out.println("The " + color.name() + " light is on...");
        } else if (isLighted && !lighted) {
            System.out.println("The " + color.name() + " is off.");
        }
        isLighted = lighted;
    }

    public int getLightingTime() {
        return lightingTime;
    }

    public void setLightingTime(int lightingTime) {
        this.lightingTime = lightingTime;
    }

    /**
     * Signal lighting suspends the main thread for certain (lightingTime) milliseconds.
     */
    public void light() {
        setLighted(true);
        try {
            Thread.sleep(lightingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setLighted(false);
    }
}
