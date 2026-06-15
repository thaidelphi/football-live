package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;

    /* renamed from: a  reason: collision with root package name */
    private final int f11070a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11071b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11072c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11073d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11074e;

    /* renamed from: f  reason: collision with root package name */
    private int f11075f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11076g;

    /* renamed from: h  reason: collision with root package name */
    private int f11077h;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    static {
        new AdSize(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdSize(int r4, int r5) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r4)
        La:
            r1 = -2
            if (r5 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r5)
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "_as"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize zzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i10, 50, 0);
        zzd.f11073d = true;
        return zzd;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int zza2 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i10, 0);
        adSize.f11075f = zza2;
        adSize.f11074e = true;
        return adSize;
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        AdSize adSize = new AdSize(i10, 0);
        adSize.f11075f = i11;
        adSize.f11074e = true;
        if (i11 < 32) {
            zzo.zzj("The maximum height set for the inline adaptive ad size was " + i11 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize zzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i10, 50, 2);
        zzd.f11073d = true;
        return zzd;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i10) {
        int zza2 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        AdSize adSize = new AdSize(i10, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.f11075f = zza2;
        adSize.f11074e = true;
        return adSize;
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize zzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i10, 50, 1);
        zzd.f11073d = true;
        return zzd;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i10) {
        int zza2 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        AdSize adSize = new AdSize(i10, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.f11075f = zza2;
        adSize.f11074e = true;
        return adSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.f11077h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.f11075f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i10) {
        this.f11075f = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i10) {
        this.f11077h = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(boolean z10) {
        this.f11074e = true;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            return this.f11070a == adSize.f11070a && this.f11071b == adSize.f11071b && this.f11072c.equals(adSize.f11072c);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z10) {
        this.f11076g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return this.f11073d;
    }

    public int getHeight() {
        return this.f11071b;
    }

    public int getHeightInPixels(Context context) {
        int i10 = this.f11071b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 != -2) {
            zzbb.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i10);
        }
        return zzr.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidth() {
        return this.f11070a;
    }

    public int getWidthInPixels(Context context) {
        int i10 = this.f11070a;
        if (i10 != -3) {
            if (i10 != -1) {
                zzbb.zzb();
                return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i10);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzr> creator = zzr.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.f11074e;
    }

    public int hashCode() {
        return this.f11072c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.f11076g;
    }

    public boolean isAutoHeight() {
        return this.f11071b == -2;
    }

    public boolean isFluid() {
        return this.f11070a == -3 && this.f11071b == -4;
    }

    public boolean isFullWidth() {
        return this.f11070a == -1;
    }

    public String toString() {
        return this.f11072c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSize(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i10);
        } else if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i11);
        } else {
            this.f11070a = i10;
            this.f11071b = i11;
            this.f11072c = str;
        }
    }
}
