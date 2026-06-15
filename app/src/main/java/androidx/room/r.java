package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.q;
/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface r extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a extends Binder implements r {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: androidx.room.r$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class C0075a implements r {

            /* renamed from: b  reason: collision with root package name */
            public static r f4270b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f4271a;

            C0075a(IBinder iBinder) {
                this.f4271a = iBinder;
            }

            @Override // androidx.room.r
            public int O(q qVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(qVar != null ? qVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f4271a.transact(1, obtain, obtain2, 0) && a.t0() != null) {
                        return a.t0().O(qVar, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4271a;
            }

            @Override // androidx.room.r
            public void r0(q qVar, int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(qVar != null ? qVar.asBinder() : null);
                    obtain.writeInt(i10);
                    if (!this.f4271a.transact(2, obtain, obtain2, 0) && a.t0() != null) {
                        a.t0().r0(qVar, i10);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.r
            public void z(int i10, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    if (this.f4271a.transact(3, obtain, null, 1) || a.t0() == null) {
                        return;
                    }
                    a.t0().z(i10, strArr);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static r Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof r)) {
                return (r) queryLocalInterface;
            }
            return new C0075a(iBinder);
        }

        public static r t0() {
            return C0075a.f4270b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int O = O(q.a.Z(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(O);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                r0(q.a.Z(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                z(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    int O(q qVar, String str) throws RemoteException;

    void r0(q qVar, int i10) throws RemoteException;

    void z(int i10, String[] strArr) throws RemoteException;
}
