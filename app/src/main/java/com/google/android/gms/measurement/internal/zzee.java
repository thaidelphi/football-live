package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface zzee extends IInterface {
    void D(zzq zzqVar) throws RemoteException;

    void E(Bundle bundle, zzq zzqVar) throws RemoteException;

    List F(String str, String str2, String str3, boolean z10) throws RemoteException;

    byte[] J(zzaw zzawVar, String str) throws RemoteException;

    String K(zzq zzqVar) throws RemoteException;

    List N(String str, String str2, String str3) throws RemoteException;

    void c(zzac zzacVar) throws RemoteException;

    List c0(String str, String str2, zzq zzqVar) throws RemoteException;

    List d(zzq zzqVar, boolean z10) throws RemoteException;

    void i(zzaw zzawVar, zzq zzqVar) throws RemoteException;

    void i0(zzaw zzawVar, String str, String str2) throws RemoteException;

    void j(zzq zzqVar) throws RemoteException;

    void l(long j10, String str, String str2, String str3) throws RemoteException;

    void l0(zzac zzacVar, zzq zzqVar) throws RemoteException;

    void m(zzlc zzlcVar, zzq zzqVar) throws RemoteException;

    void o(zzq zzqVar) throws RemoteException;

    List p(String str, String str2, boolean z10, zzq zzqVar) throws RemoteException;

    void s(zzq zzqVar) throws RemoteException;
}
