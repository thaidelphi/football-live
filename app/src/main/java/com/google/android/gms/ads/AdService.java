package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbnz;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdService extends IntentService {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            zzbb.zza().zzo(this, new zzbnz()).zze(intent);
        } catch (RemoteException e8) {
            zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }
}
