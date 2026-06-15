package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    private static volatile zzag f12639e;

    /* renamed from: g  reason: collision with root package name */
    private static Context f12641g;

    /* renamed from: a  reason: collision with root package name */
    static final i f12635a = new c(g.t0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b  reason: collision with root package name */
    static final i f12636b = new d(g.t0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    static final i f12637c = new e(g.t0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d  reason: collision with root package name */
    static final i f12638d = new f(g.t0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f  reason: collision with root package name */
    private static final Object f12640f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m a(String str, g gVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, gVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String c(boolean z10, String str, g gVar) throws Exception {
        String str2 = true != (!z10 && f(str, gVar, true, false).f12644a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = AndroidUtilsLight.b("SHA-256");
        Preconditions.m(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.a(b10.digest(gVar.u0())), Boolean.valueOf(z10), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d(Context context) {
        synchronized (k.class) {
            if (f12641g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f12641g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        boolean z10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                z10 = f12639e.zzi();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            z10 = false;
        }
        return z10;
    }

    private static m f(final String str, final g gVar, final boolean z10, boolean z11) {
        try {
            h();
            Preconditions.m(f12641g);
            try {
                return f12639e.H(new zzs(str, gVar, z10, z11), ObjectWrapper.u0(f12641g.getPackageManager())) ? m.b() : new l(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return k.c(z10, str, gVar);
                    }
                }, null);
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return m.d("module call", e8);
            }
        } catch (DynamiteModule.LoadingException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return m.d("module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    private static m g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        m d10;
        zzq g02;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.m(f12641g);
            try {
                h();
                zzo zzoVar = new zzo(str, z10, false, ObjectWrapper.u0(f12641g), false, true);
                try {
                    if (z13) {
                        g02 = f12639e.X(zzoVar);
                    } else {
                        g02 = f12639e.g0(zzoVar);
                    }
                    if (g02.zzb()) {
                        d10 = m.f(g02.n0());
                    } else {
                        String X = g02.X();
                        PackageManager.NameNotFoundException nameNotFoundException = g02.o0() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (X == null) {
                            X = "error checking package certificate";
                        }
                        d10 = m.g(g02.n0(), g02.o0(), X, nameNotFoundException);
                    }
                } catch (RemoteException e8) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                    d10 = m.d("module call", e8);
                }
            } catch (DynamiteModule.LoadingException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                d10 = m.d("module init: ".concat(String.valueOf(e10.getMessage())), e10);
            }
            return d10;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void h() throws DynamiteModule.LoadingException {
        if (f12639e != null) {
            return;
        }
        Preconditions.m(f12641g);
        synchronized (f12640f) {
            if (f12639e == null) {
                f12639e = zzaf.Z(DynamiteModule.e(f12641g, DynamiteModule.f12799f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
