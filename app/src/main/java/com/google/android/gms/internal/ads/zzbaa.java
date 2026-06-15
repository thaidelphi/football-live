package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbaa extends zzbyu {
    final /* synthetic */ zzbag zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaa(zzbag zzbagVar) {
        this.zza = zzbagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyu, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zzbag.zze(this.zza);
        return super.cancel(z10);
    }
}
