package com.startapp.sdk.common.utils;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Pair<F, S> implements Serializable {
    private static final long serialVersionUID = 1680587643219848112L;
    public final F first;
    public final S second;

    public Pair(F f10, S s10) {
        this.first = f10;
        this.second = s10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        return o9.a(this.first, pair.first) && o9.a(this.second, pair.second);
    }

    public final int hashCode() {
        Object[] objArr = {this.first, this.second};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final String toString() {
        return super.toString();
    }
}
