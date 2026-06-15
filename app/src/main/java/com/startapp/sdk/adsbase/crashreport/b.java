package com.startapp.sdk.adsbase.crashreport;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends Thread implements Handler.Callback, Printer {

    /* renamed from: a  reason: collision with root package name */
    public d f23090a;

    /* renamed from: b  reason: collision with root package name */
    public e f23091b;

    /* renamed from: c  reason: collision with root package name */
    public final c f23092c;

    /* renamed from: d  reason: collision with root package name */
    public f f23093d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f23094e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicLong f23095f;

    /* renamed from: g  reason: collision with root package name */
    public final long f23096g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<String> f23097h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f23098i;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements d {
        @Override // com.startapp.sdk.adsbase.crashreport.b.d
        public final void a() {
        }

        @Override // com.startapp.sdk.adsbase.crashreport.b.d
        public final boolean a(String str, long j10) {
            return false;
        }

        @Override // com.startapp.sdk.adsbase.crashreport.b.d
        public final void remove() {
        }
    }

    /* compiled from: Sta */
    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0251b implements e {
        @Override // com.startapp.sdk.adsbase.crashreport.b.e
        public final long a(long j10) {
            return 0L;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c {
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a();

        boolean a(String str, long j10);

        void remove();
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        long a(long j10);
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
    }

    public b(long j10, boolean z10) {
        super("startapp-anr");
        this.f23090a = new a();
        this.f23091b = new C0251b();
        this.f23092c = new c();
        this.f23094e = new Handler(Looper.getMainLooper(), this);
        this.f23095f = new AtomicLong(0L);
        this.f23097h = new AtomicReference<>("");
        this.f23096g = j10;
        this.f23098i = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.crashreport.b.a():void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.f23095f.set(0L);
        return true;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.f23097h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f23097h.set("");
            this.f23095f.set(0L);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        this.f23090a.a();
        this.f23090a.remove();
        if (this.f23098i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }
}
