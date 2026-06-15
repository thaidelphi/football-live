package com.google.android.gms.ads.preload;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class PreloadConfiguration {

    /* renamed from: a  reason: collision with root package name */
    private final String f11847a;

    /* renamed from: b  reason: collision with root package name */
    private final AdFormat f11848b;

    /* renamed from: c  reason: collision with root package name */
    private final AdRequest f11849c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11850d;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final String f11851a;

        /* renamed from: b  reason: collision with root package name */
        private final AdFormat f11852b;

        /* renamed from: c  reason: collision with root package name */
        private AdRequest f11853c = new AdRequest.Builder().build();

        /* renamed from: d  reason: collision with root package name */
        private int f11854d;

        public Builder(String str, AdFormat adFormat) {
            this.f11851a = str;
            this.f11852b = adFormat;
        }

        public PreloadConfiguration build() {
            return new PreloadConfiguration(this, null);
        }

        public Builder setAdRequest(AdRequest adRequest) {
            this.f11853c = adRequest;
            return this;
        }

        public Builder setBufferSize(int i10) {
            this.f11854d = i10;
            return this;
        }
    }

    /* synthetic */ PreloadConfiguration(Builder builder, zza zzaVar) {
        this.f11847a = builder.f11851a;
        this.f11848b = builder.f11852b;
        this.f11849c = builder.f11853c;
        this.f11850d = builder.f11854d;
    }

    public AdFormat getAdFormat() {
        return this.f11848b;
    }

    public AdRequest getAdRequest() {
        return this.f11849c;
    }

    public String getAdUnitId() {
        return this.f11847a;
    }

    public int getBufferSize() {
        return this.f11850d;
    }
}
