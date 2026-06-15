package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.l;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ExecutionException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected int b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new l(context).i(cloudMessage.X()))).intValue();
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e8);
            return UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected void c(Context context, Bundle bundle) {
        Intent g10 = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (d0.A(g10)) {
            d0.s(g10);
        }
    }
}
