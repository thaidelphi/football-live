package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbrw;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbrw zzo = zzbb.zza().zzo(this, new zzbnz());
            if (zzo == null) {
                zzo.zzg("OfflineUtils is null");
            } else {
                zzo.zze(getIntent());
            }
        } catch (RemoteException e8) {
            zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
