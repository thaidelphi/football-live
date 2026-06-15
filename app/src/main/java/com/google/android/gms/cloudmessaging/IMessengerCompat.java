package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
interface IMessengerCompat extends IInterface {

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Impl extends Binder implements IMessengerCompat {
        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void I(Message message) throws RemoteException {
            throw null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Proxy implements IMessengerCompat {

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f11942a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Proxy(IBinder iBinder) {
            this.f11942a = iBinder;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void I(Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f11942a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f11942a;
        }
    }

    void I(Message message) throws RemoteException;
}
