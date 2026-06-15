package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzeg {

    /* renamed from: g  reason: collision with root package name */
    private String f11223g;

    /* renamed from: i  reason: collision with root package name */
    private String f11225i;

    /* renamed from: j  reason: collision with root package name */
    private String f11226j;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11228l;

    /* renamed from: m  reason: collision with root package name */
    private String f11229m;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet f11217a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f11218b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f11219c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet f11220d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f11221e = new Bundle();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet f11222f = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    private final List f11224h = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private int f11227k = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f11230n = 60000;

    public final void zzA(String str) {
        this.f11225i = str;
    }

    public final void zzB(String str) {
        this.f11226j = str;
    }

    @Deprecated
    public final void zzC(boolean z10) {
        this.f11227k = z10 ? 1 : 0;
    }

    public final void zzn(String str) {
        this.f11222f.add(str);
    }

    public final void zzo(Class cls, Bundle bundle) {
        if (this.f11218b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f11218b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.f11218b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.m(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzp(String str, String str2) {
        this.f11221e.putString(str, str2);
    }

    public final void zzq(String str) {
        this.f11217a.add(str);
    }

    public final void zzr(Class cls, Bundle bundle) {
        this.f11218b.putBundle(cls.getName(), bundle);
    }

    public final void zzs(String str) {
        this.f11220d.add(str);
    }

    public final void zzt(String str) {
        this.f11220d.remove(AdRequest.DEVICE_ID_EMULATOR);
    }

    public final void zzu(String str) {
        this.f11229m = str;
    }

    public final void zzv(String str) {
        this.f11223g = str;
    }

    public final void zzw(int i10) {
        this.f11230n = i10;
    }

    @Deprecated
    public final void zzx(boolean z10) {
        this.f11228l = z10;
    }

    public final void zzy(List list) {
        this.f11224h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("neighboring content URL should not be null or empty");
            } else {
                this.f11224h.add(str);
            }
        }
    }

    public final void zzz(Bundle bundle) {
        this.f11218b.putAll(bundle);
    }
}
