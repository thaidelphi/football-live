package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zah extends i0<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final ListenerHolder.ListenerKey<?> f12381c;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f12381c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void d(zaad zaadVar, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq<?> zabqVar) {
        zaci zaciVar = zabqVar.u().get(this.f12381c);
        return zaciVar != null && zaciVar.f12352a.f();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(zabq<?> zabqVar) {
        zaci zaciVar = zabqVar.u().get(this.f12381c);
        if (zaciVar == null) {
            return null;
        }
        return zaciVar.f12352a.c();
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void h(zabq<?> zabqVar) throws RemoteException {
        zaci remove = zabqVar.u().remove(this.f12381c);
        if (remove != null) {
            remove.f12353b.b(zabqVar.s(), this.f12217b);
            remove.f12352a.a();
            return;
        }
        this.f12217b.trySetResult(Boolean.FALSE);
    }
}
