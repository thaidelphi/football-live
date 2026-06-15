package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;
/* compiled from: ICustomTabsService.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface b extends IInterface {

    /* renamed from: q0  reason: collision with root package name */
    public static final String f4843q0 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* compiled from: ICustomTabsService.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a extends Binder implements b {

        /* compiled from: ICustomTabsService.java */
        /* renamed from: b.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        private static class C0090a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f4844a;

            C0090a(IBinder iBinder) {
                this.f4844a = iBinder;
            }

            @Override // b.b
            public boolean S(b.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4843q0);
                    obtain.writeStrongInterface(aVar);
                    C0091b.d(obtain, uri, 0);
                    C0091b.d(obtain, bundle, 0);
                    C0091b.c(obtain, list, 0);
                    this.f4844a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean W(long j10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4843q0);
                    obtain.writeLong(j10);
                    this.f4844a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean a(b.a aVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4843q0);
                    obtain.writeStrongInterface(aVar);
                    C0091b.d(obtain, uri, 0);
                    C0091b.d(obtain, bundle, 0);
                    this.f4844a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean a0(b.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4843q0);
                    obtain.writeStrongInterface(aVar);
                    this.f4844a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4844a;
            }

            @Override // b.b
            public int b(b.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4843q0);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    C0091b.d(obtain, bundle, 0);
                    this.f4844a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean f0(b.a aVar, Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4843q0);
                    obtain.writeStrongInterface(aVar);
                    C0091b.d(obtain, uri, 0);
                    this.f4844a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean j0(b.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4843q0);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeInt(i10);
                    C0091b.d(obtain, uri, 0);
                    C0091b.d(obtain, bundle, 0);
                    this.f4844a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean q(b.a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f4843q0);
                    obtain.writeStrongInterface(aVar);
                    C0091b.d(obtain, bundle, 0);
                    this.f4844a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f4843q0);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0090a(iBinder);
        }
    }

    /* compiled from: ICustomTabsService.java */
    /* renamed from: b.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0091b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    boolean S(b.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean W(long j10) throws RemoteException;

    boolean a(b.a aVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean a0(b.a aVar) throws RemoteException;

    int b(b.a aVar, String str, Bundle bundle) throws RemoteException;

    boolean f0(b.a aVar, Uri uri) throws RemoteException;

    boolean j0(b.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException;

    boolean q(b.a aVar, Bundle bundle) throws RemoteException;
}
