package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeu extends r3 {
    public zzeu(zzkz zzkzVar) {
        super(zzkzVar);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    protected final boolean g() {
        return false;
    }

    public final boolean h() {
        d();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f13220a.zzau().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
