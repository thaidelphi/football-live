package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzod extends ContentObserver {
    final /* synthetic */ zzog zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzod(zzog zzogVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzogVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Context context;
        zze zzeVar;
        zzoh zzohVar;
        zzog zzogVar = this.zza;
        context = zzogVar.zza;
        zzeVar = zzogVar.zzh;
        zzohVar = zzogVar.zzg;
        this.zza.zzj(zzob.zzc(context, zzeVar, zzohVar));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
