package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.p;
import java.util.Collections;
import java.util.List;
import m1.k;
import m1.o;
/* compiled from: DelayMetCommandHandler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements h1.c, e1.b, o.b {

    /* renamed from: j  reason: collision with root package name */
    private static final String f4700j = p.f("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4701a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4702b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4703c;

    /* renamed from: d  reason: collision with root package name */
    private final e f4704d;

    /* renamed from: e  reason: collision with root package name */
    private final h1.d f4705e;

    /* renamed from: h  reason: collision with root package name */
    private PowerManager.WakeLock f4708h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4709i = false;

    /* renamed from: g  reason: collision with root package name */
    private int f4707g = 0;

    /* renamed from: f  reason: collision with root package name */
    private final Object f4706f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, int i10, String str, e eVar) {
        this.f4701a = context;
        this.f4702b = i10;
        this.f4704d = eVar;
        this.f4703c = str;
        this.f4705e = new h1.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f4706f) {
            this.f4705e.e();
            this.f4704d.h().c(this.f4703c);
            PowerManager.WakeLock wakeLock = this.f4708h;
            if (wakeLock != null && wakeLock.isHeld()) {
                p.c().a(f4700j, String.format("Releasing wakelock %s for WorkSpec %s", this.f4708h, this.f4703c), new Throwable[0]);
                this.f4708h.release();
            }
        }
    }

    private void g() {
        synchronized (this.f4706f) {
            if (this.f4707g < 2) {
                this.f4707g = 2;
                p c10 = p.c();
                String str = f4700j;
                c10.a(str, String.format("Stopping work for WorkSpec %s", this.f4703c), new Throwable[0]);
                Intent g10 = b.g(this.f4701a, this.f4703c);
                e eVar = this.f4704d;
                eVar.k(new e.b(eVar, g10, this.f4702b));
                if (this.f4704d.d().g(this.f4703c)) {
                    p.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f4703c), new Throwable[0]);
                    Intent f10 = b.f(this.f4701a, this.f4703c);
                    e eVar2 = this.f4704d;
                    eVar2.k(new e.b(eVar2, f10, this.f4702b));
                } else {
                    p.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f4703c), new Throwable[0]);
                }
            } else {
                p.c().a(f4700j, String.format("Already stopped work for %s", this.f4703c), new Throwable[0]);
            }
        }
    }

    @Override // m1.o.b
    public void a(String str) {
        p.c().a(f4700j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // h1.c
    public void b(List<String> list) {
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f4708h = k.b(this.f4701a, String.format("%s (%s)", this.f4703c, Integer.valueOf(this.f4702b)));
        p c10 = p.c();
        String str = f4700j;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f4708h, this.f4703c), new Throwable[0]);
        this.f4708h.acquire();
        l1.p g10 = this.f4704d.g().w().l().g(this.f4703c);
        if (g10 == null) {
            g();
            return;
        }
        boolean b10 = g10.b();
        this.f4709i = b10;
        if (!b10) {
            p.c().a(str, String.format("No constraints for %s", this.f4703c), new Throwable[0]);
            f(Collections.singletonList(this.f4703c));
            return;
        }
        this.f4705e.d(Collections.singletonList(g10));
    }

    @Override // e1.b
    public void e(String str, boolean z10) {
        p.c().a(f4700j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        c();
        if (z10) {
            Intent f10 = b.f(this.f4701a, this.f4703c);
            e eVar = this.f4704d;
            eVar.k(new e.b(eVar, f10, this.f4702b));
        }
        if (this.f4709i) {
            Intent a10 = b.a(this.f4701a);
            e eVar2 = this.f4704d;
            eVar2.k(new e.b(eVar2, a10, this.f4702b));
        }
    }

    @Override // h1.c
    public void f(List<String> list) {
        if (list.contains(this.f4703c)) {
            synchronized (this.f4706f) {
                if (this.f4707g == 0) {
                    this.f4707g = 1;
                    p.c().a(f4700j, String.format("onAllConstraintsMet for %s", this.f4703c), new Throwable[0]);
                    if (this.f4704d.d().j(this.f4703c)) {
                        this.f4704d.h().b(this.f4703c, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    p.c().a(f4700j, String.format("Already started work for %s", this.f4703c), new Throwable[0]);
                }
            }
        }
    }
}
