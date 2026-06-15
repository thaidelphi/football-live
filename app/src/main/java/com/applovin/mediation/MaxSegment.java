package com.applovin.mediation;

import com.applovin.impl.sdk.n;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxSegment {

    /* renamed from: a  reason: collision with root package name */
    private final int f9855a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9856b;

    public MaxSegment(int i10, List<Integer> list) {
        this.f9855a = i10;
        this.f9856b = list;
        a(i10);
        for (Integer num : list) {
            a(num.intValue());
        }
    }

    private void a(int i10) {
        if (i10 >= 0) {
            return;
        }
        n.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i10);
    }

    public int getKey() {
        return this.f9855a;
    }

    public List<Integer> getValues() {
        return this.f9856b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f9855a + ", values=" + this.f9856b + '}';
    }
}
