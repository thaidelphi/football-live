package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaf extends i0<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final zaci f12377c;

    public zaf(zaci zaciVar, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f12377c = zaciVar;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void d(zaad zaadVar, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq<?> zabqVar) {
        return this.f12377c.f12352a.f();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(zabq<?> zabqVar) {
        return this.f12377c.f12352a.c();
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void h(zabq<?> zabqVar) throws RemoteException {
        this.f12377c.f12352a.d(zabqVar.s(), this.f12217b);
        ListenerHolder.ListenerKey<?> b10 = this.f12377c.f12352a.b();
        if (b10 != null) {
            zabqVar.u().put(b10, this.f12377c);
        }
    }
}
