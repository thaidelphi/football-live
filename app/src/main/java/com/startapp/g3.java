package com.startapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface g3 extends IInterface {

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a extends Binder implements g3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f21981a = 0;

        /* compiled from: Sta */
        /* renamed from: com.startapp.g3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class C0245a implements g3 {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f21982a;

            public C0245a(IBinder iBinder) {
                this.f21982a = iBinder;
            }

            @Override // com.startapp.g3
            public final Bundle a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f21982a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f21981a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f21982a;
            }
        }
    }

    Bundle a(Bundle bundle) throws RemoteException;
}
