package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: IMediaSession.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface b extends IInterface {

    /* compiled from: IMediaSession.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class C0014a implements b {

            /* renamed from: b  reason: collision with root package name */
            public static b f686b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f687a;

            C0014a(IBinder iBinder) {
                this.f687a = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public void C(android.support.v4.media.session.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (!this.f687a.transact(3, obtain, obtain2, 0) && a.t0() != null) {
                        a.t0().C(aVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f687a;
            }
        }

        public static b Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0014a(iBinder);
        }

        public static b t0() {
            return C0014a.f686b;
        }
    }

    void C(android.support.v4.media.session.a aVar) throws RemoteException;
}
