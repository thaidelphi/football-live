package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.y1;
import com.ironsource.b9;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: d  reason: collision with root package name */
    private static final AppLovinExceptionHandler f8677d = new AppLovinExceptionHandler();

    /* renamed from: a  reason: collision with root package name */
    private final Set f8678a = new HashSet(2);

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f8679b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f8680c;

    private String a(Throwable th, int i10) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i10, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f8677d;
    }

    public void addSdk(j jVar) {
        if (this.f8678a.contains(jVar)) {
            return;
        }
        this.f8678a.add(jVar);
    }

    public void enable() {
        if (this.f8679b.compareAndSet(false, true)) {
            this.f8680c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        long j10 = 500;
        for (j jVar : this.f8678a) {
            jVar.I();
            if (n.a()) {
                jVar.I().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) jVar.a(o4.f8137i6);
            if (num.intValue() > 0) {
                hashMap.put("details", a(th, num.intValue()));
            }
            jVar.D().d(y1.f9673j0, hashMap);
            jVar.z().trackEventSynchronously(b9.h.f16647e0);
            j10 = ((Long) jVar.a(o4.f8182o3)).longValue();
        }
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8680c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
