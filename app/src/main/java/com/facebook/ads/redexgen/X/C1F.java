package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.1F  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1F<T> {
    public final T A00;
    public final Throwable A01;
    public final boolean A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1F != com.facebook.ads.cache.api.CacheResponse<T> */
    public C1F(boolean z10, T result) {
        this.A02 = z10;
        this.A00 = result;
        this.A01 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1F != com.facebook.ads.cache.api.CacheResponse<T> */
    public C1F(boolean z10, T result, Throwable th) {
        this.A02 = z10;
        this.A00 = result;
        this.A01 = th;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1F != com.facebook.ads.cache.api.CacheResponse<T> */
    public final T A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1F != com.facebook.ads.cache.api.CacheResponse<T> */
    public final boolean A01() {
        return this.A02;
    }
}
