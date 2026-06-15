package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class m1 implements c4 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzid f13077a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(zzid zzidVar) {
        this.f13077a = zzidVar;
    }

    @Override // com.google.android.gms.measurement.internal.c4
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f13077a.o("auto", "_err", bundle, str);
        } else {
            this.f13077a.m("auto", "_err", bundle);
        }
    }
}
