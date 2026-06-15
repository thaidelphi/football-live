package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h extends com.google.android.gms.internal.common.zzi {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f12549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f12549a = baseGmsClient;
    }

    private static final void a(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.b();
        zzcVar.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z10;
        if (this.f12549a.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && ((i10 != 4 || this.f12549a.enableLocalFallback()) && message.what != 5)) || this.f12549a.isConnecting()) {
            int i11 = message.what;
            if (i11 == 4) {
                this.f12549a.zzB = new ConnectionResult(message.arg2);
                if (BaseGmsClient.zzo(this.f12549a)) {
                    BaseGmsClient baseGmsClient = this.f12549a;
                    z10 = baseGmsClient.zzC;
                    if (!z10) {
                        baseGmsClient.zzp(3, null);
                        return;
                    }
                }
                BaseGmsClient baseGmsClient2 = this.f12549a;
                connectionResult2 = baseGmsClient2.zzB;
                ConnectionResult connectionResult3 = connectionResult2 != null ? baseGmsClient2.zzB : new ConnectionResult(8);
                this.f12549a.zzc.a(connectionResult3);
                this.f12549a.onConnectionFailed(connectionResult3);
                return;
            } else if (i11 == 5) {
                BaseGmsClient baseGmsClient3 = this.f12549a;
                connectionResult = baseGmsClient3.zzB;
                ConnectionResult connectionResult4 = connectionResult != null ? baseGmsClient3.zzB : new ConnectionResult(8);
                this.f12549a.zzc.a(connectionResult4);
                this.f12549a.onConnectionFailed(connectionResult4);
                return;
            } else if (i11 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                this.f12549a.zzc.a(connectionResult5);
                this.f12549a.onConnectionFailed(connectionResult5);
                return;
            } else if (i11 == 6) {
                this.f12549a.zzp(5, null);
                BaseGmsClient baseGmsClient4 = this.f12549a;
                baseConnectionCallbacks = baseGmsClient4.zzw;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = baseGmsClient4.zzw;
                    baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
                }
                this.f12549a.onConnectionSuspended(message.arg2);
                BaseGmsClient.zzn(this.f12549a, 5, 1, null);
                return;
            } else if (i11 == 2 && !this.f12549a.isConnected()) {
                a(message);
                return;
            } else if (b(message)) {
                ((zzc) message.obj).c();
                return;
            } else {
                int i12 = message.what;
                Log.wtf("GmsClient", "Don't know how to handle message: " + i12, new Exception());
                return;
            }
        }
        a(message);
    }
}
