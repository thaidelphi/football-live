package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x3 implements c4 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzkz f13227a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x3(zzkz zzkzVar) {
        this.f13227a = zzkzVar;
    }

    @Override // com.google.android.gms.measurement.internal.c4
    public final void a(String str, String str2, Bundle bundle) {
        zzfy zzfyVar;
        zzfy zzfyVar2;
        if (!TextUtils.isEmpty(str)) {
            this.f13227a.zzaz().u(new w3(this, str, "_err", bundle));
            return;
        }
        zzkz zzkzVar = this.f13227a;
        zzfyVar = zzkzVar.f13691l;
        if (zzfyVar != null) {
            zzfyVar2 = zzkzVar.f13691l;
            zzfyVar2.zzay().m().b("AppId not known when logging event", "_err");
        }
    }
}
