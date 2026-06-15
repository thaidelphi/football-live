package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11115a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11116b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11117c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11118d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11119e;

    /* renamed from: f  reason: collision with root package name */
    private final VideoOptions f11120f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11121g;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {

        /* renamed from: e  reason: collision with root package name */
        private VideoOptions f11126e;

        /* renamed from: a  reason: collision with root package name */
        private boolean f11122a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f11123b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f11124c = 0;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11125d = false;

        /* renamed from: f  reason: collision with root package name */
        private int f11127f = 1;

        /* renamed from: g  reason: collision with root package name */
        private boolean f11128g = false;

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i10) {
            this.f11127f = i10;
            return this;
        }

        @Deprecated
        public Builder setImageOrientation(int i10) {
            this.f11123b = i10;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i10) {
            this.f11124c = i10;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z10) {
            this.f11128g = z10;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z10) {
            this.f11125d = z10;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z10) {
            this.f11122a = z10;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.f11126e = videoOptions;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface NativeMediaAspectRatio {
    }

    /* synthetic */ NativeAdOptions(Builder builder, zzd zzdVar) {
        this.f11115a = builder.f11122a;
        this.f11116b = builder.f11123b;
        this.f11117c = builder.f11124c;
        this.f11118d = builder.f11125d;
        this.f11119e = builder.f11127f;
        this.f11120f = builder.f11126e;
        this.f11121g = builder.f11128g;
    }

    public int getAdChoicesPlacement() {
        return this.f11119e;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.f11116b;
    }

    public int getMediaAspectRatio() {
        return this.f11117c;
    }

    public VideoOptions getVideoOptions() {
        return this.f11120f;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f11118d;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f11115a;
    }

    public final boolean zza() {
        return this.f11121g;
    }
}
