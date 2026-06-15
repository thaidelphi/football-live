package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfx;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class VideoOptions {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11107a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11108b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11109c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11110a = true;

        /* renamed from: b  reason: collision with root package name */
        private boolean f11111b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f11112c = false;

        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        public Builder setClickToExpandRequested(boolean z10) {
            this.f11112c = z10;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z10) {
            this.f11111b = z10;
            return this;
        }

        public Builder setStartMuted(boolean z10) {
            this.f11110a = z10;
            return this;
        }
    }

    /* synthetic */ VideoOptions(Builder builder, zzj zzjVar) {
        this.f11107a = builder.f11110a;
        this.f11108b = builder.f11111b;
        this.f11109c = builder.f11112c;
    }

    public VideoOptions(zzfx zzfxVar) {
        this.f11107a = zzfxVar.zza;
        this.f11108b = zzfxVar.zzb;
        this.f11109c = zzfxVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.f11109c;
    }

    public boolean getCustomControlsRequested() {
        return this.f11108b;
    }

    public boolean getStartMuted() {
        return this.f11107a;
    }
}
