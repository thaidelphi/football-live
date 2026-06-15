package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q extends zabw {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<zabe> f12240a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(zabe zabeVar) {
        this.f12240a = new WeakReference<>(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        zabe zabeVar = this.f12240a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.n(zabeVar);
    }
}
