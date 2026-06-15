package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.adcolony.sdk.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"UseSparseArrays"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<Integer, k0> f6030a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f6031b = 2;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<j0>> f6032c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f6033d = 1;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedBlockingQueue<f1> f6034e = new LinkedBlockingQueue<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f6035f = false;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f6036g = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f6037h = Executors.newSingleThreadExecutor();

    /* renamed from: i  reason: collision with root package name */
    private ScheduledFuture<?> f6038i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f6039a;

        a(Context context) {
            this.f6039a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 b10 = com.adcolony.sdk.a.b().u().b();
            f1 b11 = c0.b();
            c0.a(b10, "os_name", "android");
            c0.a(b11, "filepath", com.adcolony.sdk.a.b().z().a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            c0.a(b11, "info", b10);
            c0.b(b11, "m_origin", 0);
            c0.b(b11, "m_id", i0.a(i0.this));
            c0.a(b11, "m_type", "Controller.create");
            try {
                l.b(this.f6039a, new h0(b11));
            } catch (RuntimeException e8) {
                e0.a aVar = new e0.a();
                aVar.a(e8.toString() + ": during WebView initialization.").a(" Disabling AdColony.").a(e0.f5980h);
                AdColony.disable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    f1 f1Var = (f1) i0.this.f6034e.poll(60L, TimeUnit.SECONDS);
                    if (f1Var == null) {
                        synchronized (i0.this.f6034e) {
                            if (i0.this.f6034e.peek() == null) {
                                i0.this.f6035f = false;
                                return;
                            }
                        }
                    } else {
                        i0.this.b(f1Var);
                    }
                } catch (InterruptedException e8) {
                    new e0.a().a("Native messages thread was interrupted: ").a(e8.toString()).a(e0.f5981i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adcolony.sdk.a.f();
            if (i0.this.f()) {
                return;
            }
            i0.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f1 f6044b;

        d(String str, f1 f1Var) {
            this.f6043a = str;
            this.f6044b = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            i0.this.a(this.f6043a, this.f6044b);
        }
    }

    static /* synthetic */ int a(i0 i0Var) {
        int i10 = i0Var.f6033d;
        i0Var.f6033d = i10 + 1;
        return i10;
    }

    private void g() {
        if (this.f6038i == null) {
            try {
                this.f6038i = this.f6036g.scheduleAtFixedRate(new c(), 0L, 17L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e8) {
                new e0.a().a("Error when scheduling message pumping").a(e8.toString()).a(e0.f5981i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(f1 f1Var) {
        try {
            if (f1Var.c("m_id", this.f6033d)) {
                this.f6033d++;
            }
            f1Var.c("m_origin", 0);
            int b10 = f1Var.b("m_target");
            if (b10 == 0) {
                a(f1Var);
                return;
            }
            k0 k0Var = this.f6030a.get(Integer.valueOf(b10));
            if (k0Var != null) {
                k0Var.a(f1Var);
            }
        } catch (JSONException e8) {
            new e0.a().a("JSON error in ADCMessageDispatcher's sendMessage(): ").a(e8.toString()).a(e0.f5981i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedHashMap<Integer, k0> d() {
        return this.f6030a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        int i10 = this.f6031b;
        this.f6031b = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        for (k0 k0Var : this.f6030a.values()) {
            if (k0Var.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        if (f()) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        ScheduledFuture<?> scheduledFuture = this.f6038i;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f6038i.cancel(false);
            }
            this.f6038i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        synchronized (this.f6030a) {
            ArrayList arrayList = new ArrayList(this.f6030a.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((k0) it.next()).b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, j0 j0Var) {
        synchronized (this.f6032c) {
            ArrayList<j0> arrayList = this.f6032c.get(str);
            if (arrayList != null) {
                arrayList.remove(j0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, j0 j0Var) {
        ArrayList<j0> arrayList = this.f6032c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f6032c.put(str, arrayList);
        }
        arrayList.add(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(k0 k0Var) {
        return b(k0Var.getAdcModuleId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i10) {
        synchronized (this.f6030a) {
            k0 remove = this.f6030a.remove(Integer.valueOf(i10));
            if (remove != null) {
                remove.c();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Context a10;
        k b10 = com.adcolony.sdk.a.b();
        if (b10.E() || b10.F() || (a10 = com.adcolony.sdk.a.a()) == null) {
            return;
        }
        b();
        z0.b(new a(a10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l c() {
        k0 a10 = a(1);
        if (a10 instanceof l) {
            return (l) a10;
        }
        return null;
    }

    private void b() {
        if (this.f6035f) {
            return;
        }
        synchronized (this.f6034e) {
            if (this.f6035f) {
                return;
            }
            this.f6035f = true;
            new Thread(new b()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0 a(k0 k0Var) {
        synchronized (this.f6030a) {
            this.f6030a.put(Integer.valueOf(k0Var.getAdcModuleId()), k0Var);
            h();
        }
        return k0Var;
    }

    private void a(f1 f1Var) {
        b();
        this.f6034e.add(f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, f1 f1Var) {
        synchronized (this.f6032c) {
            ArrayList<j0> arrayList = this.f6032c.get(str);
            if (arrayList == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            h0 h0Var = new h0(f1Var);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                try {
                    ((j0) it.next()).a(h0Var);
                } catch (RuntimeException e8) {
                    new e0.a().a(e8).a(e0.f5981i);
                    e8.printStackTrace();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(f1 f1Var) {
        try {
            String e8 = f1Var.e("m_type");
            int b10 = f1Var.b("m_origin");
            d dVar = new d(e8, f1Var);
            if (b10 >= 2) {
                z0.b(dVar);
            } else {
                this.f6037h.execute(dVar);
            }
        } catch (RejectedExecutionException e10) {
            new e0.a().a("RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ").a(e10.toString()).a(e0.f5981i);
        } catch (JSONException e11) {
            new e0.a().a("JSON error from message dispatcher's dispatchNativeMessage(): ").a(e11.toString()).a(e0.f5981i);
        }
    }

    k0 a(int i10) {
        return this.f6030a.get(Integer.valueOf(i10));
    }
}
