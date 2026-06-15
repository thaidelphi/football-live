package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.n;
import java.util.Set;
import java.util.TreeSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a  reason: collision with root package name */
    private final String f9929a;

    /* renamed from: b  reason: collision with root package name */
    private String f9930b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f9931c = new TreeSet();

    /* renamed from: d  reason: collision with root package name */
    private int f9932d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f9933e = 256;

    /* renamed from: f  reason: collision with root package name */
    private int f9934f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f9929a = str;
    }

    public void addFixedPosition(int i10) {
        this.f9931c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f9929a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f9931c;
    }

    public int getMaxAdCount() {
        return this.f9933e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f9934f;
    }

    public String getPlacement() {
        return this.f9930b;
    }

    public int getRepeatingInterval() {
        return this.f9932d;
    }

    public boolean hasValidPositioning() {
        return !this.f9931c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f9932d >= 2;
    }

    public void resetFixedPositions() {
        this.f9931c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f9933e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f9934f = i10;
    }

    public void setPlacement(String str) {
        this.f9930b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f9932d = i10;
            n.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f9932d = 0;
        n.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f9929a + "', fixedPositions=" + this.f9931c + ", repeatingInterval=" + this.f9932d + ", maxAdCount=" + this.f9933e + ", maxPreloadedAdCount=" + this.f9934f + '}';
    }
}
