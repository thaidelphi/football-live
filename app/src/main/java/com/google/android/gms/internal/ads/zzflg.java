package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzflg extends zzflb {
    public zzflg(zzfku zzfkuVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfkuVar, hashSet, jSONObject, j10);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfkm.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzflc, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzflc
    public final void zza(String str) {
        zzfjq zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfjq.zza()) != null) {
            for (zzfiz zzfizVar : zza.zzc()) {
                if (((zzflb) this).zza.contains(zzfizVar.zzh())) {
                    zzfizVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
