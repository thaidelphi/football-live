package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    /* renamed from: a  reason: collision with root package name */
    private final String f11591a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f11592b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f11593c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f11594d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11595e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11596f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11597g;

    /* renamed from: h  reason: collision with root package name */
    private final String f11598h;

    /* renamed from: i  reason: collision with root package name */
    private final String f11599i;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z10, Location location, int i10, int i11, String str2, String str3) {
        this.f11591a = str;
        this.f11592b = bundle;
        this.f11593c = bundle2;
        this.f11594d = context;
        this.f11595e = z10;
        this.f11596f = i10;
        this.f11597g = i11;
        this.f11598h = str2;
        this.f11599i = str3;
    }

    public String getBidResponse() {
        return this.f11591a;
    }

    public Context getContext() {
        return this.f11594d;
    }

    public String getMaxAdContentRating() {
        return this.f11598h;
    }

    public Bundle getMediationExtras() {
        return this.f11593c;
    }

    public Bundle getServerParameters() {
        return this.f11592b;
    }

    public String getWatermark() {
        return this.f11599i;
    }

    public boolean isTestRequest() {
        return this.f11595e;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f11596f;
    }

    public int taggedForUnderAgeTreatment() {
        return this.f11597g;
    }
}
