package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ConnectionResult f12259a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f12260b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(a0 a0Var, ConnectionResult connectionResult) {
        this.f12260b = a0Var;
        this.f12259a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        ApiKey apiKey;
        Api.Client client;
        Api.Client client2;
        Api.Client client3;
        Api.Client client4;
        a0 a0Var = this.f12260b;
        map = a0Var.f12187f.f12123l;
        apiKey = a0Var.f12183b;
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            return;
        }
        if (this.f12259a.z0()) {
            this.f12260b.f12186e = true;
            client = this.f12260b.f12182a;
            if (client.requiresSignIn()) {
                this.f12260b.h();
                return;
            }
            try {
                a0 a0Var2 = this.f12260b;
                client3 = a0Var2.f12182a;
                client4 = a0Var2.f12182a;
                client3.getRemoteService(null, client4.getScopesForConnectionlessNonSignIn());
                return;
            } catch (SecurityException e8) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
                client2 = this.f12260b.f12182a;
                client2.disconnect("Failed to get service from broker.");
                zabqVar.E(new ConnectionResult(10), null);
                return;
            }
        }
        zabqVar.E(this.f12259a, null);
    }
}
