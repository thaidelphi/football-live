package androidx.core.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
/* compiled from: ConnectivityManagerCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* compiled from: ConnectivityManagerCompat.java */
    /* renamed from: androidx.core.net.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class C0040a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0040a.a(connectivityManager);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }
}
