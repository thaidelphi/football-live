package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbrw;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: a  reason: collision with root package name */
    private final zzbrw f11314a;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f11314a = zzbb.zza().zzo(context, new zzbnz());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f11314a.zzj(ObjectWrapper.u0(getApplicationContext()), new zza(getInputData().j("uri"), getInputData().j("gws_query_id"), getInputData().j("image_url")));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
