package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class GmsClientSupervisor {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f12500a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static l f12501b = null;

    /* renamed from: c  reason: collision with root package name */
    static HandlerThread f12502c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Executor f12503d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f12504e = false;

    @KeepForSdk
    public static int a() {
        return 4225;
    }

    @KeepForSdk
    public static GmsClientSupervisor b(Context context) {
        Looper mainLooper;
        synchronized (f12500a) {
            if (f12501b == null) {
                Context applicationContext = context.getApplicationContext();
                if (f12504e) {
                    mainLooper = c().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                f12501b = new l(applicationContext, mainLooper, f12503d);
            }
        }
        return f12501b;
    }

    @KeepForSdk
    public static HandlerThread c() {
        synchronized (f12500a) {
            HandlerThread handlerThread = f12502c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f12502c = handlerThread2;
            handlerThread2.start();
            return f12502c;
        }
    }

    protected abstract void d(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        d(new zzo(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean f(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor);
}
