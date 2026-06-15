package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d8 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f21892a = new ConcurrentHashMap();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AdPreferences.Placement f21893a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21894b;

        public a() {
            throw null;
        }

        public a(AdPreferences.Placement placement, int i10) {
            this.f21893a = placement;
            this.f21894b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21894b == aVar.f21894b && this.f21893a == aVar.f21893a;
        }

        public final int hashCode() {
            Object[] objArr = {this.f21893a, Integer.valueOf(this.f21894b)};
            WeakHashMap weakHashMap = o9.f22359a;
            return Arrays.deepHashCode(objArr);
        }
    }
}
