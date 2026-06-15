package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface q extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a extends Binder implements q {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: androidx.room.q$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class C0074a implements q {

            /* renamed from: b  reason: collision with root package name */
            public static q f4238b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f4239a;

            C0074a(IBinder iBinder) {
                this.f4239a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4239a;
            }

            @Override // androidx.room.q
            public void f(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (this.f4239a.transact(1, obtain, null, 1) || a.t0() == null) {
                        return;
                    }
                    a.t0().f(strArr);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static q Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof q)) {
                return (q) queryLocalInterface;
            }
            return new C0074a(iBinder);
        }

        public static q t0() {
            return C0074a.f4238b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                f(parcel.createStringArray());
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    void f(String[] strArr) throws RemoteException;
}
