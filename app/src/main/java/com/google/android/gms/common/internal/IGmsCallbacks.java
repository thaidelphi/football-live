package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface IGmsCallbacks extends IInterface {
    void Q(int i10, Bundle bundle) throws RemoteException;

    void k(int i10, IBinder iBinder, Bundle bundle) throws RemoteException;

    void o0(int i10, IBinder iBinder, zzk zzkVar) throws RemoteException;
}
