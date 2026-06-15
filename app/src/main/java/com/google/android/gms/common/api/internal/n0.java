package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final l0 f12235a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zap f12236b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(zap zapVar, l0 l0Var) {
        this.f12236b = zapVar;
        this.f12235a = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12236b.f12389a) {
            ConnectionResult b10 = this.f12235a.b();
            if (b10.y0()) {
                zap zapVar = this.f12236b;
                zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(zapVar.getActivity(), (PendingIntent) Preconditions.m(b10.o0()), this.f12235a.a(), false), 1);
                return;
            }
            zap zapVar2 = this.f12236b;
            if (zapVar2.f12392d.d(zapVar2.getActivity(), b10.X(), null) != null) {
                zap zapVar3 = this.f12236b;
                zapVar3.f12392d.z(zapVar3.getActivity(), this.f12236b.mLifecycleFragment, b10.X(), 2, this.f12236b);
            } else if (b10.X() == 18) {
                zap zapVar4 = this.f12236b;
                Dialog u10 = zapVar4.f12392d.u(zapVar4.getActivity(), this.f12236b);
                zap zapVar5 = this.f12236b;
                zapVar5.f12392d.v(zapVar5.getActivity().getApplicationContext(), new m0(this, u10));
            } else {
                this.f12236b.a(b10, this.f12235a.a());
            }
        }
    }
}
