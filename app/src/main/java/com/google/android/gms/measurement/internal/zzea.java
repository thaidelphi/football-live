package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@VisibleForTesting
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzea {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f13396h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f13397a;

    /* renamed from: b  reason: collision with root package name */
    private final m f13398b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f13399c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f13400d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f13401e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f13402f = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile Object f13403g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzea(String str, Object obj, Object obj2, m mVar, zzdz zzdzVar) {
        this.f13397a = str;
        this.f13399c = obj;
        this.f13400d = obj2;
        this.f13398b = mVar;
    }

    public final Object a(Object obj) {
        synchronized (this.f13401e) {
        }
        if (obj != null) {
            return obj;
        }
        if (n.f13086a == null) {
            return this.f13399c;
        }
        synchronized (f13396h) {
            if (zzab.a()) {
                return this.f13403g == null ? this.f13399c : this.f13403g;
            }
            try {
                for (zzea zzeaVar : zzeb.b()) {
                    if (!zzab.a()) {
                        Object obj2 = null;
                        try {
                            m mVar = zzeaVar.f13398b;
                            if (mVar != null) {
                                obj2 = mVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f13396h) {
                            zzeaVar.f13403g = obj2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            m mVar2 = this.f13398b;
            if (mVar2 == null) {
                return this.f13399c;
            }
            try {
                return mVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.f13399c;
            } catch (SecurityException unused4) {
                return this.f13399c;
            }
        }
    }

    public final String b() {
        return this.f13397a;
    }
}
