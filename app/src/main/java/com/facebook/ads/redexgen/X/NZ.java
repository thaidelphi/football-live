package com.facebook.ads.redexgen.X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class NZ extends Binder {
    public static final int A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static OI<Bundle> A00(IBinder iBinder) {
        C4T A01 = OI.A01();
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
                        i11 = obtain2.readInt();
                        if (i11 == 1) {
                            A01.A04((Bundle) AbstractC1589es.A01(obtain2.readBundle()));
                            i10++;
                        }
                    }
                } catch (RemoteException e8) {
                    throw new RuntimeException(e8);
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return A01.A05();
    }

    static {
        A00 = AbstractC1672gE.A02 >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }
}
