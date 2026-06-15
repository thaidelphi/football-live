package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zze implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final int f12614a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f12615b;

    public zze(BaseGmsClient baseGmsClient, int i10) {
        this.f12615b = baseGmsClient;
        this.f12614a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        IGmsServiceBroker gVar;
        BaseGmsClient baseGmsClient = this.f12615b;
        if (iBinder == null) {
            BaseGmsClient.zzk(baseGmsClient, 16);
            return;
        }
        obj = baseGmsClient.zzq;
        synchronized (obj) {
            BaseGmsClient baseGmsClient2 = this.f12615b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                gVar = (IGmsServiceBroker) queryLocalInterface;
            } else {
                gVar = new g(iBinder);
            }
            baseGmsClient2.zzr = gVar;
        }
        this.f12615b.zzl(0, null, this.f12614a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f12615b.zzq;
        synchronized (obj) {
            this.f12615b.zzr = null;
        }
        BaseGmsClient baseGmsClient = this.f12615b;
        int i10 = this.f12614a;
        Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
