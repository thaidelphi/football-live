package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class w2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13210a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13211b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13212c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzq f13213d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzjs f13214e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w2(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.f13214e = zzjsVar;
        this.f13210a = atomicReference;
        this.f13211b = str2;
        this.f13212c = str3;
        this.f13213d = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjs zzjsVar;
        zzee zzeeVar;
        synchronized (this.f13210a) {
            try {
                zzjsVar = this.f13214e;
                zzeeVar = zzjsVar.f13652d;
            } catch (RemoteException e8) {
                this.f13214e.f13220a.zzay().m().d("(legacy) Failed to get conditional properties; remote exception", null, this.f13211b, e8);
                this.f13210a.set(Collections.emptyList());
                atomicReference = this.f13210a;
            }
            if (zzeeVar == null) {
                zzjsVar.f13220a.zzay().m().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f13211b, this.f13212c);
                this.f13210a.set(Collections.emptyList());
                this.f13210a.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.m(this.f13213d);
                this.f13210a.set(zzeeVar.c0(this.f13211b, this.f13212c, this.f13213d));
            } else {
                this.f13210a.set(zzeeVar.N(null, this.f13211b, this.f13212c));
            }
            this.f13214e.z();
            atomicReference = this.f13210a;
            atomicReference.notify();
        }
    }
}
