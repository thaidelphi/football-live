package com.startapp;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.ImpressionsTrackingMetadata;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k3 implements i2<String, e3, Throwable, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22163a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f22164b;

    /* renamed from: c  reason: collision with root package name */
    public final TrackingParams f22165c;

    /* renamed from: d  reason: collision with root package name */
    public final j2<ImpressionsTrackingMetadata> f22166d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Pair<Integer, String>> f22167e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f22168f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicReference<ImpressionsTrackingMetadata> f22169g;

    /* renamed from: h  reason: collision with root package name */
    public String f22170h;

    public k3(Context context, List list, TrackingParams trackingParams, com.startapp.sdk.components.c0 c0Var) {
        this.f22163a = context;
        this.f22164b = list;
        this.f22165c = trackingParams;
        this.f22166d = c0Var;
        this.f22167e = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.f22168f = new AtomicInteger(list.size());
    }

    @Override // com.startapp.i2
    public final Void a(String str, e3 e3Var, Throwable th) {
        Pair<Integer, String> pair;
        String str2 = str;
        Throwable th2 = th;
        if (e3Var != null) {
            pair = new Pair<>(4, String.valueOf(200));
        } else {
            if (th2 instanceof SDKException) {
                SDKException sDKException = (SDKException) th2;
                if (sDKException.a() > 0) {
                    pair = new Pair<>(1, String.valueOf(sDKException.a()));
                } else {
                    th2 = th2.getCause();
                }
            }
            pair = null;
        }
        if (pair == null) {
            if (th2 != null) {
                pair = new Pair<>(2, th2.getClass().getName());
            } else {
                pair = new Pair<>(2, String.valueOf(-1));
            }
        }
        this.f22167e.put(str2, pair);
        a();
        return null;
    }

    public static void a(Context context, List<String> list, TrackingParams trackingParams) {
        boolean z10;
        k3 a10 = com.startapp.sdk.components.a.a(context).L.a().a(context, list, trackingParams);
        if (a10 != null) {
            o9.a(a10.f22163a, 4, "Sending impression", true);
            Iterator<String> it = a10.f22164b.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null && next.length() > 0) {
                    if (a10.f22170h == null) {
                        a10.f22170h = com.startapp.sdk.adsbase.a.a(next, (String) null);
                    }
                    Context context2 = a10.f22163a;
                    TrackingParams trackingParams2 = a10.f22165c;
                    if (o9.b(next)) {
                        StringBuilder sb = new StringBuilder(next);
                        String a11 = com.startapp.sdk.adsbase.a.a(next, (String) null);
                        if (a11 != null) {
                            sb.append(a.c(a11));
                        }
                        if (trackingParams2 != null) {
                            sb.append(trackingParams2.e());
                        }
                        next = sb.toString();
                    }
                    try {
                        com.startapp.sdk.components.a a12 = com.startapp.sdk.components.a.a(context2);
                        a12.f23249y.a().execute(new g9(a12.f23232h, a12.f23237m, next, a10));
                        z10 = true;
                    } catch (Throwable th) {
                        l3.a(th);
                        a10.a(next, (e3) null, th);
                        z10 = false;
                    }
                    Pair pair = new Pair(next, Boolean.valueOf(z10));
                    boolean equals = Boolean.TRUE.equals(pair.second);
                    a10.f22167e.put((String) pair.first, null);
                    if (!equals) {
                        a10.a();
                    }
                } else {
                    a10.f22167e.put(next, null);
                    a10.a();
                }
            }
        }
    }

    public final void a() {
        String name;
        if (this.f22168f.decrementAndGet() == 0) {
            AtomicReference<ImpressionsTrackingMetadata> atomicReference = this.f22169g;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata call = this.f22166d.call();
                AtomicReference<ImpressionsTrackingMetadata> atomicReference2 = new AtomicReference<>((call == null || call.a() <= Math.random()) ? null : null);
                this.f22169g = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                boolean z10 = false;
                String str = "";
                for (Map.Entry<String, Pair<Integer, String>> entry : this.f22167e.entrySet()) {
                    Integer num = entry.getValue() != null ? entry.getValue().first : 2;
                    if (num != null && (impressionsTrackingMetadata.b() & num.intValue()) == num.intValue()) {
                        String valueOf = entry.getValue() != null ? entry.getValue().second : String.valueOf(-2);
                        String key = entry.getKey();
                        sb.append(str);
                        sb.append(valueOf);
                        sb2.append(str);
                        if (key != null) {
                            try {
                                Uri parse = Uri.parse(key);
                                name = parse.getAuthority() + parse.getPath();
                            } catch (Throwable th) {
                                name = th.getClass().getName();
                            }
                        } else {
                            name = String.valueOf((char[]) null);
                        }
                        sb2.append(name);
                        z10 = true;
                        str = ",";
                    }
                }
                if (z10) {
                    l3 l3Var = new l3(m3.f22282l);
                    l3Var.f22229e = ((Object) sb) + ";" + ((Object) sb2);
                    l3Var.f22231g = this.f22170h;
                    StringBuilder sb3 = new StringBuilder("adTag: ");
                    TrackingParams trackingParams = this.f22165c;
                    sb3.append(trackingParams != null ? trackingParams.a() : null);
                    l3Var.f22228d = sb3.toString();
                    l3Var.a();
                }
            }
        }
    }
}
