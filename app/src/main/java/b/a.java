package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* compiled from: ICustomTabsCallback.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface a extends IInterface {

    /* renamed from: p0  reason: collision with root package name */
    public static final String f4842p0 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* compiled from: ICustomTabsCallback.java */
    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class AbstractBinderC0089a extends Binder implements a {
        public AbstractBinderC0089a() {
            attachInterface(this, a.f4842p0);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.f4842p0;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    k0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    n(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 4:
                    p0((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    n0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    q0(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 7:
                    Bundle h10 = h(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, h10, 1);
                    break;
                case 8:
                    h0(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 9:
                    r((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 10:
                    e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 11:
                    Y((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 12:
                    b0((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
            return true;
        }
    }

    /* compiled from: ICustomTabsCallback.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
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

    void Y(Bundle bundle) throws RemoteException;

    void b0(Bundle bundle) throws RemoteException;

    void e(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException;

    Bundle h(String str, Bundle bundle) throws RemoteException;

    void h0(int i10, int i11, Bundle bundle) throws RemoteException;

    void k0(int i10, Bundle bundle) throws RemoteException;

    void n(String str, Bundle bundle) throws RemoteException;

    void n0(String str, Bundle bundle) throws RemoteException;

    void p0(Bundle bundle) throws RemoteException;

    void q0(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    void r(Bundle bundle) throws RemoteException;
}
