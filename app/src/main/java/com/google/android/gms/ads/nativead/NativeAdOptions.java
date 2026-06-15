package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
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
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11655a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11656b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11657c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11658d;

    /* renamed from: e  reason: collision with root package name */
    private final VideoOptions f11659e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f11660f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11661g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11662h;

    /* renamed from: i  reason: collision with root package name */
    private final int f11663i;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {

        /* renamed from: d  reason: collision with root package name */
        private VideoOptions f11667d;

        /* renamed from: a  reason: collision with root package name */
        private boolean f11664a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f11665b = 0;

        /* renamed from: c  reason: collision with root package name */
        private boolean f11666c = false;

        /* renamed from: e  reason: collision with root package name */
        private int f11668e = 1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11669f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f11670g = false;

        /* renamed from: h  reason: collision with root package name */
        private int f11671h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f11672i = 1;

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int i10, boolean z10) {
            this.f11670g = z10;
            this.f11671h = i10;
            return this;
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i10) {
            this.f11668e = i10;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i10) {
            this.f11665b = i10;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z10) {
            this.f11669f = z10;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z10) {
            this.f11666c = z10;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z10) {
            this.f11664a = z10;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.f11667d = videoOptions;
            return this;
        }

        public final Builder zzi(int i10) {
            this.f11672i = i10;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface NativeMediaAspectRatio {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface SwipeGestureDirection {
    }

    /* synthetic */ NativeAdOptions(Builder builder, zza zzaVar) {
        this.f11655a = builder.f11664a;
        this.f11656b = builder.f11665b;
        this.f11657c = builder.f11666c;
        this.f11658d = builder.f11668e;
        this.f11659e = builder.f11667d;
        this.f11660f = builder.f11669f;
        this.f11661g = builder.f11670g;
        this.f11662h = builder.f11671h;
        this.f11663i = builder.f11672i;
    }

    public int getAdChoicesPlacement() {
        return this.f11658d;
    }

    public int getMediaAspectRatio() {
        return this.f11656b;
    }

    public VideoOptions getVideoOptions() {
        return this.f11659e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f11657c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f11655a;
    }

    public final int zza() {
        return this.f11662h;
    }

    public final boolean zzb() {
        return this.f11661g;
    }

    public final boolean zzc() {
        return this.f11660f;
    }

    public final int zzd() {
        return this.f11663i;
    }
}
