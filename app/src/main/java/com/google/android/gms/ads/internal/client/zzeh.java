package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzflj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzeh {

    /* renamed from: a  reason: collision with root package name */
    private final String f11231a;

    /* renamed from: b  reason: collision with root package name */
    private final List f11232b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f11233c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f11234d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11235e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11236f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11237g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f11238h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f11239i;

    /* renamed from: j  reason: collision with root package name */
    private final Set f11240j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f11241k;

    /* renamed from: l  reason: collision with root package name */
    private final String f11242l;

    /* renamed from: m  reason: collision with root package name */
    private final int f11243m;

    /* renamed from: n  reason: collision with root package name */
    private long f11244n = 0;

    public zzeh(zzeg zzegVar, zzflj zzfljVar) {
        String str;
        List list;
        HashSet hashSet;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i10;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z10;
        String str4;
        int i11;
        str = zzegVar.f11223g;
        this.f11231a = str;
        list = zzegVar.f11224h;
        this.f11232b = list;
        hashSet = zzegVar.f11217a;
        this.f11233c = Collections.unmodifiableSet(hashSet);
        bundle = zzegVar.f11218b;
        this.f11234d = bundle;
        hashMap = zzegVar.f11219c;
        Collections.unmodifiableMap(hashMap);
        str2 = zzegVar.f11225i;
        this.f11235e = str2;
        str3 = zzegVar.f11226j;
        this.f11236f = str3;
        i10 = zzegVar.f11227k;
        this.f11237g = i10;
        hashSet2 = zzegVar.f11220d;
        this.f11238h = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzegVar.f11221e;
        this.f11239i = bundle2;
        hashSet3 = zzegVar.f11222f;
        this.f11240j = Collections.unmodifiableSet(hashSet3);
        z10 = zzegVar.f11228l;
        this.f11241k = z10;
        str4 = zzegVar.f11229m;
        this.f11242l = str4;
        i11 = zzegVar.f11230n;
        this.f11243m = i11;
    }

    public final int zza() {
        return this.f11243m;
    }

    public final int zzb() {
        return this.f11237g;
    }

    public final long zzc() {
        return this.f11244n;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.f11234d.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.f11239i;
    }

    public final Bundle zzf(Class cls) {
        return this.f11234d.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.f11234d;
    }

    public final String zzh() {
        return this.f11242l;
    }

    public final String zzi() {
        return this.f11231a;
    }

    public final String zzj() {
        return this.f11235e;
    }

    public final String zzk() {
        return this.f11236f;
    }

    public final List zzl() {
        return new ArrayList(this.f11232b);
    }

    public final Set zzm() {
        return this.f11240j;
    }

    public final Set zzn() {
        return this.f11233c;
    }

    public final void zzo(long j10) {
        this.f11244n = j10;
    }

    @Deprecated
    public final boolean zzp() {
        return this.f11241k;
    }

    public final boolean zzq(Context context) {
        RequestConfiguration zzc = zzeu.zzf().zzc();
        zzbb.zzb();
        Set set = this.f11238h;
        String zzz = com.google.android.gms.ads.internal.util.client.zzf.zzz(context);
        return set.contains(zzz) || zzc.getTestDeviceIds().contains(zzz);
    }
}
