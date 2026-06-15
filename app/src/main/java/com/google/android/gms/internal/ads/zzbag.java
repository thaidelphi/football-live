package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbag {
    private zzazv zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbag(Context context) {
        this.zzc = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzbag zzbagVar) {
        synchronized (zzbagVar.zzd) {
            zzazv zzazvVar = zzbagVar.zza;
            if (zzazvVar == null) {
                return;
            }
            zzazvVar.disconnect();
            zzbagVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future zzc(zzazw zzazwVar) {
        zzbaa zzbaaVar = new zzbaa(this);
        zzbae zzbaeVar = new zzbae(this, zzazwVar, zzbaaVar);
        zzbaf zzbafVar = new zzbaf(this, zzbaaVar);
        synchronized (this.zzd) {
            zzazv zzazvVar = new zzazv(this.zzc, com.google.android.gms.ads.internal.zzv.zzu().zzb(), zzbaeVar, zzbafVar);
            this.zza = zzazvVar;
            zzazvVar.checkAvailabilityAndConnect();
        }
        return zzbaaVar;
    }
}
