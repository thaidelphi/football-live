package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzatz;
import com.google.android.gms.internal.ads.zzaub;
import com.google.android.gms.internal.ads.zzauc;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzq implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzu f11548a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(zzu zzuVar) {
        this.f11548a = zzuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        VersionInfoParcel versionInfoParcel;
        Context context;
        zzu zzuVar = this.f11548a;
        versionInfoParcel = zzuVar.f11556a;
        String str = versionInfoParcel.afmaVersion;
        context = zzuVar.f11559d;
        int i10 = zzaub.zzw;
        return new zzauc(zzaub.zzt(context, new zzatz(str, false)));
    }
}
