package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o2 {

    /* renamed from: a  reason: collision with root package name */
    private final c4 f8056a = new c4();

    /* renamed from: b  reason: collision with root package name */
    private final TreeSet f8057b = new TreeSet();

    /* renamed from: c  reason: collision with root package name */
    private final Map f8058c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private int f8059d;

    /* renamed from: e  reason: collision with root package name */
    private int f8060e;

    public o2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.n.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f8056a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f8056a.isEmpty()) {
            this.f8056a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = ((Integer) this.f8056a.a()).intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.f8056a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            }
            this.f8056a.add(Integer.valueOf(intValue));
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f8057b);
    }

    public int c() {
        int i10 = this.f8059d;
        if (i10 != -1 && this.f8060e != -1) {
            while (i10 <= this.f8060e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public Collection e(int i10) {
        return new TreeSet((SortedSet) this.f8057b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int b10 = this.f8056a.b(Integer.valueOf(i10));
        for (int size = this.f8056a.size() - 1; size >= b10; size--) {
            Integer num = (Integer) this.f8056a.a(size);
            int intValue = num.intValue() + 1;
            a(num.intValue(), intValue);
            this.f8056a.a(size, Integer.valueOf(intValue));
        }
    }

    public boolean g(int i10) {
        return this.f8056a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f8057b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int b10 = this.f8056a.b(Integer.valueOf(i10));
        if (g(i10)) {
            this.f8058c.remove(Integer.valueOf(i10));
            this.f8057b.remove(Integer.valueOf(i10));
            this.f8056a.b(b10);
        }
        while (b10 < this.f8056a.size()) {
            Integer num = (Integer) this.f8056a.a(b10);
            int intValue = num.intValue() - 1;
            a(num.intValue(), intValue);
            this.f8056a.a(b10, Integer.valueOf(intValue));
            b10++;
        }
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public void c(int i10, int i11) {
        this.f8059d = i10;
        this.f8060e = i11;
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f8058c.get(Integer.valueOf(i10));
    }

    public void a(MaxAd maxAd, int i10) {
        this.f8058c.put(Integer.valueOf(i10), maxAd);
        this.f8057b.add(Integer.valueOf(i10));
    }

    public void a() {
        this.f8058c.clear();
        this.f8057b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f8058c.remove(num);
            this.f8057b.remove(num);
        }
    }

    private void a(int i10, int i11) {
        if (this.f8058c.containsKey(Integer.valueOf(i10))) {
            this.f8058c.put(Integer.valueOf(i11), (MaxAd) this.f8058c.get(Integer.valueOf(i10)));
            this.f8057b.add(Integer.valueOf(i11));
            this.f8058c.remove(Integer.valueOf(i10));
            this.f8057b.remove(Integer.valueOf(i10));
        }
    }

    private int a(int i10, boolean z10) {
        int c10 = this.f8056a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + c10;
            while (c10 < this.f8056a.size() && i11 >= ((Integer) this.f8056a.a(c10)).intValue()) {
                i11++;
                c10++;
            }
        }
        return c10;
    }
}
