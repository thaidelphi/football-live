package com.applovin.array.apphub.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface IAppHubDirectDownloadServiceCallback extends IInterface {
    public static final String DESCRIPTOR = "com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback";

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Default implements IAppHubDirectDownloadServiceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onAppDetailsDismissed(String str) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onAppDetailsShown(String str) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onDownloadStarted(String str) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onError(String str, String str2) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onEvent(String str, Bundle bundle) throws RemoteException {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class Stub extends Binder implements IAppHubDirectDownloadServiceCallback {
        static final int TRANSACTION_onAppDetailsDismissed = 2;
        static final int TRANSACTION_onAppDetailsShown = 1;
        static final int TRANSACTION_onDownloadStarted = 3;
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onEvent = 5;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        private static class Proxy implements IAppHubDirectDownloadServiceCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAppHubDirectDownloadServiceCallback.DESCRIPTOR;
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onAppDetailsDismissed(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onAppDetailsShown(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onDownloadStarted(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onError(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
        }

        public static IAppHubDirectDownloadServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAppHubDirectDownloadServiceCallback)) {
                return (IAppHubDirectDownloadServiceCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                return true;
            }
            if (i10 == 1) {
                onAppDetailsShown(parcel.readString());
            } else if (i10 == 2) {
                onAppDetailsDismissed(parcel.readString());
            } else if (i10 == 3) {
                onDownloadStarted(parcel.readString());
            } else if (i10 == 4) {
                onError(parcel.readString(), parcel.readString());
            } else if (i10 != 5) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                onEvent(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            }
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void onAppDetailsDismissed(String str) throws RemoteException;

    void onAppDetailsShown(String str) throws RemoteException;

    void onDownloadStarted(String str) throws RemoteException;

    void onError(String str, String str2) throws RemoteException;

    void onEvent(String str, Bundle bundle) throws RemoteException;
}
