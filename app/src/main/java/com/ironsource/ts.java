package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum ts {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f20869b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f20874a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final ts a(int i10) {
            ts tsVar;
            ts[] values = ts.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    tsVar = null;
                    break;
                }
                tsVar = values[i11];
                if (tsVar.f20874a == i10) {
                    break;
                }
                i11++;
            }
            return tsVar == null ? ts.CurrentlyLoadedAds : tsVar;
        }
    }

    ts(int i10) {
        this.f20874a = i10;
    }

    public final int b() {
        return this.f20874a;
    }
}
