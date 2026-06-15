package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzayn implements Comparator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayn(zzayp zzaypVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzayt zzaytVar = (zzayt) obj;
        zzayt zzaytVar2 = (zzayt) obj2;
        int i10 = zzaytVar.zzc - zzaytVar2.zzc;
        return i10 != 0 ? i10 : Long.compare(zzaytVar.zza, zzaytVar2.zza);
    }
}
