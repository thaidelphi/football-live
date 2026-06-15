package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Api;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends Thread {

    /* renamed from: l  reason: collision with root package name */
    private static final int f16198l = 1;

    /* renamed from: m  reason: collision with root package name */
    private static final com.ironsource.b f16199m = new C0218a();

    /* renamed from: n  reason: collision with root package name */
    private static final yi f16200n = new b();

    /* renamed from: d  reason: collision with root package name */
    private final int f16204d;

    /* renamed from: a  reason: collision with root package name */
    private com.ironsource.b f16201a = f16199m;

    /* renamed from: b  reason: collision with root package name */
    private yi f16202b = f16200n;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f16203c = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    private String f16205e = "";

    /* renamed from: f  reason: collision with root package name */
    private boolean f16206f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16207g = false;

    /* renamed from: h  reason: collision with root package name */
    private volatile int f16208h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f16209i = 1;

    /* renamed from: j  reason: collision with root package name */
    private int f16210j = 0;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f16211k = new c();

    /* renamed from: com.ironsource.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class C0218a implements com.ironsource.b {
        C0218a() {
        }

        @Override // com.ironsource.b
        public void a() {
        }

        @Override // com.ironsource.b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements yi {
        b() {
        }

        @Override // com.ironsource.yi
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f16208h = (aVar.f16208h + 1) % Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    public a(int i10) {
        this.f16204d = i10;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }

    public int a() {
        return this.f16210j;
    }

    public a a(com.ironsource.b bVar) {
        if (bVar == null) {
            bVar = f16199m;
        }
        this.f16201a = bVar;
        return this;
    }

    public a a(yi yiVar) {
        if (yiVar == null) {
            yiVar = f16200n;
        }
        this.f16202b = yiVar;
        return this;
    }

    public a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f16205e = str;
        return this;
    }

    public a a(boolean z10) {
        this.f16207g = z10;
        return this;
    }

    public void a(int i10) {
        this.f16209i = i10;
    }

    public int b() {
        return this.f16209i;
    }

    public a b(boolean z10) {
        this.f16206f = z10;
        return this;
    }

    public a c() {
        this.f16205e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f16210j < this.f16209i) {
            int i11 = this.f16208h;
            this.f16203c.post(this.f16211k);
            try {
                Thread.sleep(this.f16204d);
                if (this.f16208h != i11) {
                    this.f16210j = 0;
                } else if (this.f16207g || !Debug.isDebuggerConnected()) {
                    this.f16210j++;
                    this.f16201a.a();
                    String str = o9.f19529l;
                    if (str != null && !str.trim().isEmpty()) {
                        new lc(o9.f19529l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.f16208h != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f16208h;
                }
            } catch (InterruptedException e8) {
                this.f16202b.a(e8);
                return;
            }
        }
        if (this.f16210j >= this.f16209i) {
            this.f16201a.b();
        }
    }
}
