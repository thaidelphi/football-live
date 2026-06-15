package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzn {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f11299a = new Bundle();

    /* renamed from: b  reason: collision with root package name */
    private List f11300b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f11301c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f11302d = -1;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f11303e = new Bundle();

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f11304f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    private final List f11305g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private int f11306h = -1;

    /* renamed from: i  reason: collision with root package name */
    private String f11307i = null;

    /* renamed from: j  reason: collision with root package name */
    private final List f11308j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private int f11309k = 60000;

    /* renamed from: l  reason: collision with root package name */
    private final int f11310l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();

    /* renamed from: m  reason: collision with root package name */
    private long f11311m = 0;

    public final zzm zza() {
        Bundle bundle = this.f11303e;
        Bundle bundle2 = this.f11299a;
        Bundle bundle3 = this.f11304f;
        return new zzm(8, -1L, bundle2, -1, this.f11300b, this.f11301c, this.f11302d, false, null, null, null, null, bundle, bundle3, this.f11305g, null, null, false, null, this.f11306h, this.f11307i, this.f11308j, this.f11309k, null, this.f11310l, this.f11311m);
    }

    public final zzn zzb(Bundle bundle) {
        this.f11299a = bundle;
        return this;
    }

    public final zzn zzc(int i10) {
        this.f11309k = i10;
        return this;
    }

    public final zzn zzd(boolean z10) {
        this.f11301c = z10;
        return this;
    }

    public final zzn zze(List list) {
        this.f11300b = list;
        return this;
    }

    public final zzn zzf(String str) {
        this.f11307i = str;
        return this;
    }

    public final zzn zzg(long j10) {
        this.f11311m = j10;
        return this;
    }

    public final zzn zzh(int i10) {
        this.f11302d = i10;
        return this;
    }

    public final zzn zzi(int i10) {
        this.f11306h = i10;
        return this;
    }
}
