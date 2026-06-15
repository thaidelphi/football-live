package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f13255a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13256b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13257c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzq f13258d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f13259e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzjs f13260f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z10) {
        this.f13260f = zzjsVar;
        this.f13255a = atomicReference;
        this.f13256b = str2;
        this.f13257c = str3;
        this.f13258d = zzqVar;
        this.f13259e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjs zzjsVar;
        zzee zzeeVar;
        synchronized (this.f13255a) {
            try {
                zzjsVar = this.f13260f;
                zzeeVar = zzjsVar.f13652d;
            } catch (RemoteException e8) {
                this.f13260f.f13220a.zzay().m().d("(legacy) Failed to get user properties; remote exception", null, this.f13256b, e8);
                this.f13255a.set(Collections.emptyList());
                atomicReference = this.f13255a;
            }
            if (zzeeVar == null) {
                zzjsVar.f13220a.zzay().m().d("(legacy) Failed to get user properties; not connected to service", null, this.f13256b, this.f13257c);
                this.f13255a.set(Collections.emptyList());
                this.f13255a.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.m(this.f13258d);
                this.f13255a.set(zzeeVar.p(this.f13256b, this.f13257c, this.f13259e, this.f13258d));
            } else {
                this.f13255a.set(zzeeVar.F(null, this.f13256b, this.f13257c, this.f13259e));
            }
            this.f13260f.z();
            atomicReference = this.f13255a;
            atomicReference.notify();
        }
    }
}
