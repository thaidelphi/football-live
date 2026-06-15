package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f11961a;

    /* renamed from: b  reason: collision with root package name */
    private final zzd f11962b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f11961a = new Messenger(iBinder);
            this.f11962b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f11962b = new zzd(iBinder);
            this.f11961a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.f11961a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f11962b;
        if (zzdVar != null) {
            zzdVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
