package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdValue {

    /* renamed from: a  reason: collision with root package name */
    private final int f11078a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11079b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11080c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i10, String str, long j10) {
        this.f11078a = i10;
        this.f11079b = str;
        this.f11080c = j10;
    }

    public static AdValue zza(int i10, String str, long j10) {
        return new AdValue(i10, str, j10);
    }

    public String getCurrencyCode() {
        return this.f11079b;
    }

    public int getPrecisionType() {
        return this.f11078a;
    }

    public long getValueMicros() {
        return this.f11080c;
    }
}
