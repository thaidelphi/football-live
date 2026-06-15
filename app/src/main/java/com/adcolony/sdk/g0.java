package com.adcolony.sdk;

import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.ug;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g0 {

    /* renamed from: f  reason: collision with root package name */
    static boolean f6000f = false;

    /* renamed from: g  reason: collision with root package name */
    static int f6001g = 3;

    /* renamed from: h  reason: collision with root package name */
    static int f6002h = 1;

    /* renamed from: a  reason: collision with root package name */
    private f1 f6003a = c0.b();

    /* renamed from: b  reason: collision with root package name */
    private e1 f6004b = null;

    /* renamed from: c  reason: collision with root package name */
    private ExecutorService f6005c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Runnable> f6006d = new ConcurrentLinkedQueue();

    /* renamed from: e  reason: collision with root package name */
    s0 f6007e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 0, c0.h(h0Var.a(), "message"), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6010b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6011c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f6012d;

        b(int i10, String str, int i11, boolean z10) {
            this.f6009a = i10;
            this.f6010b = str;
            this.f6011c = i11;
            this.f6012d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.a(this.f6009a, this.f6010b, this.f6011c);
            int i10 = 0;
            while (i10 <= this.f6010b.length() / 4000) {
                int i11 = i10 * 4000;
                i10++;
                int min = Math.min(i10 * 4000, this.f6010b.length());
                if (this.f6011c == 3) {
                    g0 g0Var = g0.this;
                    if (g0Var.a(c0.f(g0Var.f6003a, Integer.toString(this.f6009a)), 3, this.f6012d)) {
                        Log.d("AdColony [TRACE]", this.f6010b.substring(i11, min));
                    }
                }
                if (this.f6011c == 2) {
                    g0 g0Var2 = g0.this;
                    if (g0Var2.a(c0.f(g0Var2.f6003a, Integer.toString(this.f6009a)), 2, this.f6012d)) {
                        Log.i("AdColony [INFO]", this.f6010b.substring(i11, min));
                    }
                }
                if (this.f6011c == 1) {
                    g0 g0Var3 = g0.this;
                    if (g0Var3.a(c0.f(g0Var3.f6003a, Integer.toString(this.f6009a)), 1, this.f6012d)) {
                        Log.w("AdColony [WARNING]", this.f6010b.substring(i11, min));
                    }
                }
                if (this.f6011c == 0) {
                    g0 g0Var4 = g0.this;
                    if (g0Var4.a(c0.f(g0Var4.f6003a, Integer.toString(this.f6009a)), 0, this.f6012d)) {
                        Log.e("AdColony [ERROR]", this.f6010b.substring(i11, min));
                    }
                }
                if (this.f6011c == -1 && g0.f6001g >= -1) {
                    Log.e("AdColony [FATAL]", this.f6010b.substring(i11, min));
                }
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements j0 {
        c(g0 g0Var) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.f6001g = c0.d(h0Var.a(), AppLovinEventTypes.USER_COMPLETED_LEVEL);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements j0 {
        d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 3, c0.h(h0Var.a(), "message"), false);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e implements j0 {
        e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 3, c0.h(h0Var.a(), "message"), true);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f implements j0 {
        f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 2, c0.h(h0Var.a(), "message"), false);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g implements j0 {
        g() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 2, c0.h(h0Var.a(), "message"), true);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class h implements j0 {
        h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 1, c0.h(h0Var.a(), "message"), false);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class i implements j0 {
        i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 1, c0.h(h0Var.a(), "message"), true);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class j implements j0 {
        j() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            g0.this.b(c0.d(h0Var.a(), "module"), 0, c0.h(h0Var.a(), "message"), false);
        }
    }

    void b(int i10, int i11, String str, boolean z10) {
        if (a(a(i10, i11, str, z10))) {
            return;
        }
        synchronized (this.f6006d) {
            this.f6006d.add(a(i10, i11, str, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        com.adcolony.sdk.a.a("Log.set_log_level", new c(this));
        com.adcolony.sdk.a.a("Log.public.trace", new d());
        com.adcolony.sdk.a.a("Log.private.trace", new e());
        com.adcolony.sdk.a.a("Log.public.info", new f());
        com.adcolony.sdk.a.a("Log.private.info", new g());
        com.adcolony.sdk.a.a("Log.public.warning", new h());
        com.adcolony.sdk.a.a("Log.private.warning", new i());
        com.adcolony.sdk.a.a("Log.public.error", new j());
        com.adcolony.sdk.a.a("Log.private.error", new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        ExecutorService executorService = this.f6005c;
        if (executorService == null || executorService.isShutdown() || this.f6005c.isTerminated()) {
            this.f6005c = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f6006d) {
            while (!this.f6006d.isEmpty()) {
                a(this.f6006d.poll());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10, String str, boolean z10) {
        b(0, i10, str, z10);
    }

    private Runnable a(int i10, int i11, String str, boolean z10) {
        return new b(i10, str, i11, z10);
    }

    boolean a(f1 f1Var, int i10, boolean z10) {
        int d10 = c0.d(f1Var, "print_level");
        boolean b10 = c0.b(f1Var, "log_private");
        if (f1Var.b()) {
            d10 = f6001g;
            b10 = f6000f;
        }
        return (!z10 || b10) && d10 != 4 && d10 >= i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e1 e1Var) {
        this.f6003a = a(e1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1 b() {
        return this.f6004b;
    }

    boolean a(f1 f1Var, int i10) {
        int d10 = c0.d(f1Var, "send_level");
        if (f1Var.b()) {
            d10 = f6002h;
        }
        return d10 >= i10 && d10 != 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(e1 e1Var) {
        if (e1Var != null) {
            e1Var.b(AppLovinEventTypes.USER_COMPLETED_LEVEL);
            e1Var.b("message");
        }
        this.f6004b = e1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(HashMap<String, Object> hashMap) {
        try {
            s0 s0Var = new s0(new d0(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            this.f6007e = s0Var;
            s0Var.a(5L, TimeUnit.SECONDS);
        } catch (MalformedURLException e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, int i11) {
        if (this.f6007e == null) {
            return;
        }
        if (i11 == 3 && a(c0.f(this.f6003a, Integer.toString(i10)), 3)) {
            this.f6007e.a(str);
        } else if (i11 == 2 && a(c0.f(this.f6003a, Integer.toString(i10)), 2)) {
            this.f6007e.c(str);
        } else if (i11 == 1 && a(c0.f(this.f6003a, Integer.toString(i10)), 1)) {
            this.f6007e.d(str);
        } else if (i11 == 0 && a(c0.f(this.f6003a, Integer.toString(i10)), 0)) {
            this.f6007e.b(str);
        }
    }

    f1 a(e1 e1Var) {
        f1 b10 = c0.b();
        for (int i10 = 0; i10 < e1Var.b(); i10++) {
            f1 a10 = c0.a(e1Var, i10);
            c0.a(b10, Integer.toString(c0.d(a10, ug.f21009x)), a10);
        }
        return b10;
    }

    private boolean a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f6005c;
            if (executorService == null || executorService.isShutdown() || this.f6005c.isTerminated()) {
                return false;
            }
            this.f6005c.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0 a() {
        return this.f6007e;
    }
}
