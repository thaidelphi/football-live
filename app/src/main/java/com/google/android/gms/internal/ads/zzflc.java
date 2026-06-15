package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzflc extends AsyncTask {
    private zzfld zza;
    protected final zzfku zzd;

    public zzflc(zzfku zzfkuVar) {
        this.zzd = zzfkuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfld zzfldVar = this.zza;
        if (zzfldVar != null) {
            zzfldVar.zza(this);
        }
    }

    public final void zzb(zzfld zzfldVar) {
        this.zza = zzfldVar;
    }
}
