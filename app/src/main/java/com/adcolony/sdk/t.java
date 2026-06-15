package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import com.adcolony.sdk.s;
import com.google.android.gms.common.api.Api;
import com.ironsource.b9;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t implements s.a {

    /* renamed from: a  reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f6258a = new LinkedBlockingQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private int f6259b = 4;

    /* renamed from: c  reason: collision with root package name */
    private int f6260c = 16;

    /* renamed from: d  reason: collision with root package name */
    private double f6261d = 1.0d;

    /* renamed from: e  reason: collision with root package name */
    private ThreadPoolExecutor f6262e = new ThreadPoolExecutor(this.f6259b, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, this.f6258a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j0 {
        b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j0 {
        c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    private void b() {
        int corePoolSize = this.f6262e.getCorePoolSize();
        int size = this.f6258a.size();
        int i10 = this.f6259b;
        if (size * this.f6261d > (corePoolSize - i10) + 1 && corePoolSize < this.f6260c) {
            this.f6262e.setCorePoolSize(corePoolSize + 1);
        } else if (size != 0 || corePoolSize <= i10) {
        } else {
            this.f6262e.setCorePoolSize(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f6262e.allowCoreThreadTimeOut(true);
        com.adcolony.sdk.a.a("WebServices.download", new a());
        com.adcolony.sdk.a.a("WebServices.get", new b());
        com.adcolony.sdk.a.a("WebServices.post", new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i10) {
        this.f6262e.setKeepAliveTime(i10, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(s sVar) {
        b();
        try {
            this.f6262e.execute(sVar);
        } catch (RejectedExecutionException unused) {
            e0.a a10 = new e0.a().a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            a10.a("execute download for url " + sVar.f6245l).a(e0.f5981i);
            a(sVar, sVar.b(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i10) {
        this.f6260c = i10;
        int corePoolSize = this.f6262e.getCorePoolSize();
        int i11 = this.f6260c;
        if (corePoolSize > i11) {
            this.f6262e.setCorePoolSize(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10) {
        this.f6259b = i10;
        int corePoolSize = this.f6262e.getCorePoolSize();
        int i11 = this.f6259b;
        if (corePoolSize < i11) {
            this.f6262e.setCorePoolSize(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d10) {
        this.f6261d = d10;
    }

    @Override // com.adcolony.sdk.s.a
    public void a(s sVar, h0 h0Var, Map<String, List<String>> map) {
        f1 b10 = c0.b();
        c0.a(b10, "url", sVar.f6245l);
        c0.b(b10, "success", sVar.f6247n);
        c0.b(b10, "status", sVar.f6249p);
        c0.a(b10, b9.h.E0, sVar.f6246m);
        c0.b(b10, "size", sVar.f6248o);
        if (map != null) {
            f1 b11 = c0.b();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String obj = entry.getValue().toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (entry.getKey() != null) {
                    c0.a(b11, entry.getKey(), substring);
                }
            }
            c0.a(b10, "headers", b11);
        }
        h0Var.a(b10).c();
    }
}
