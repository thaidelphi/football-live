package n3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import y5.q;
/* compiled from: BundleListRetriever.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private static final int f27961a;

    static {
        f27961a = a5.p0.f482a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public static y5.q<Bundle> a(IBinder iBinder) {
        int readInt;
        q.a j10 = y5.q.j();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            j10.a((Bundle) a5.a.e(obtain2.readBundle()));
                            i10++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i11 = readInt;
                } catch (RemoteException e8) {
                    throw new RuntimeException(e8);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return j10.h();
    }
}
