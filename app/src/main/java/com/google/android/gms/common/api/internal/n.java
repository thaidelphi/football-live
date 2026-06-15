package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class n extends com.google.android.gms.signin.internal.zac {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<zaaw> f12234a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(zaaw zaawVar) {
        this.f12234a = new WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void g(com.google.android.gms.signin.internal.zak zakVar) {
        zabi zabiVar;
        zaaw zaawVar = this.f12234a.get();
        if (zaawVar == null) {
            return;
        }
        zabiVar = zaawVar.f12268a;
        zabiVar.k(new m(this, zaawVar, zaawVar, zakVar));
    }
}
