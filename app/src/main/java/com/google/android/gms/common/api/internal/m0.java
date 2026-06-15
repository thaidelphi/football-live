package com.google.android.gms.common.api.internal;

import android.app.Dialog;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class m0 extends zabw {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f12232a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n0 f12233b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(n0 n0Var, Dialog dialog) {
        this.f12233b = n0Var;
        this.f12232a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        this.f12233b.f12236b.d();
        if (this.f12232a.isShowing()) {
            this.f12232a.dismiss();
        }
    }
}
