package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzflf extends zzflb {
    public zzflf(zzfku zzfkuVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfkuVar, hashSet, jSONObject, j10);
    }

    private final void zzc(String str) {
        zzfjq zza = zzfjq.zza();
        if (zza != null) {
            for (zzfiz zzfizVar : zza.zzc()) {
                if (((zzflb) this).zza.contains(zzfizVar.zzh())) {
                    zzfizVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzflc, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzflc
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
