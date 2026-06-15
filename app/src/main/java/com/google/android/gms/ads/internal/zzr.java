package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzauc;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzr extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzu f11549a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzr(zzu zzuVar, zzt zztVar) {
        this.f11549a = zzuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            zzu zzuVar = this.f11549a;
            zzu.A0(zzuVar, (zzauc) zzu.z0(zzuVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e8) {
            e = e8;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (ExecutionException e10) {
            e = e10;
            int i102 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (TimeoutException e11) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e11);
        }
        return this.f11549a.zzp();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzu zzuVar = this.f11549a;
        String str = (String) obj;
        if (zzu.u0(zzuVar) == null || str == null) {
            return;
        }
        zzu.u0(zzuVar).loadUrl(str);
    }
}
