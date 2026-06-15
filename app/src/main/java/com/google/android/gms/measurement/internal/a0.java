package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a0 extends androidx.collection.f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzfp f12834a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(zzfp zzfpVar, int i10) {
        super(20);
        this.f12834a = zzfpVar;
    }

    @Override // androidx.collection.f
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.g(str);
        return zzfp.n(this.f12834a, str);
    }
}
