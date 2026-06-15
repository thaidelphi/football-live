package com.ironsource;

import com.ironsource.tt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ev implements hp {

    /* renamed from: a  reason: collision with root package name */
    private final o1 f17332a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f17333b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17334c;

    /* renamed from: d  reason: collision with root package name */
    private final List<gp> f17335d;

    /* renamed from: e  reason: collision with root package name */
    private final tt f17336e;

    /* JADX WARN: Multi-variable type inference failed */
    public ev(o1 adTools, Runnable task, long j10, List<? extends gp> pauseTriggers) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(task, "task");
        kotlin.jvm.internal.n.f(pauseTriggers, "pauseTriggers");
        this.f17332a = adTools;
        this.f17333b = task;
        this.f17334c = j10;
        this.f17335d = pauseTriggers;
        this.f17336e = new tt(adTools.a(), new Runnable() { // from class: com.ironsource.yx
            @Override // java.lang.Runnable
            public final void run() {
                ev.b(ev.this);
            }
        }, j10);
        for (gp gpVar : pauseTriggers) {
            gpVar.a(this);
            if (gpVar.d()) {
                a(gpVar.b());
            }
        }
        if (a()) {
            tt.a b10 = this.f17336e.b();
            List<gp> list = this.f17335d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((gp) obj).d()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (!it.hasNext()) {
                a(((gp) next).b(), b10);
            }
            long c10 = ((gp) next).c();
            do {
                Object next2 = it.next();
                long c11 = ((gp) next2).c();
                if (c10 > c11) {
                    next = next2;
                    c10 = c11;
                }
            } while (it.hasNext());
            a(((gp) next).b(), b10);
        }
    }

    public /* synthetic */ ev(o1 o1Var, Runnable runnable, long j10, List list, int i10, kotlin.jvm.internal.h hVar) {
        this(o1Var, runnable, j10, (i10 & 8) != 0 ? new ArrayList() : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ev this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        for (gp gpVar : this$0.f17335d) {
            gpVar.a((hp) null);
        }
        this$0.f17336e.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ev this$0, gp pauseableTrigger) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(pauseableTrigger, "$pauseableTrigger");
        this$0.a(pauseableTrigger.b());
        if (!this$0.a() || this$0.f17336e.e()) {
            return;
        }
        this$0.a(pauseableTrigger.b(), this$0.f17336e.b());
    }

    private final void a(String str) {
        this.f17332a.e().h().d(str);
    }

    private final void a(String str, tt.a aVar) {
        this.f17332a.e().h().a(str, this.f17334c, aVar.c(), aVar.d());
    }

    private final boolean a() {
        List<gp> list = this.f17335d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (gp gpVar : list) {
                if (gpVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void b() {
        c();
        this.f17333b.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ev this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ev this$0, gp pauseableTrigger) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(pauseableTrigger, "$pauseableTrigger");
        this$0.b(pauseableTrigger.b());
        if (this$0.a() || !this$0.f17336e.e()) {
            return;
        }
        this$0.b(pauseableTrigger.b(), this$0.f17336e.a());
    }

    private final void b(String str) {
        this.f17332a.e().h().e(str);
    }

    private final void b(String str, tt.a aVar) {
        this.f17332a.e().h().b(str, this.f17334c, aVar.c(), aVar.d());
    }

    @Override // com.ironsource.hp
    public void a(final gp pauseableTrigger) {
        kotlin.jvm.internal.n.f(pauseableTrigger, "pauseableTrigger");
        this.f17332a.d(new Runnable() { // from class: com.ironsource.by
            @Override // java.lang.Runnable
            public final void run() {
                ev.a(ev.this, pauseableTrigger);
            }
        });
    }

    @Override // com.ironsource.hp
    public void b(final gp pauseableTrigger) {
        kotlin.jvm.internal.n.f(pauseableTrigger, "pauseableTrigger");
        this.f17332a.d(new Runnable() { // from class: com.ironsource.ay
            @Override // java.lang.Runnable
            public final void run() {
                ev.b(ev.this, pauseableTrigger);
            }
        });
    }

    public final void c() {
        this.f17332a.d(new Runnable() { // from class: com.ironsource.zx
            @Override // java.lang.Runnable
            public final void run() {
                ev.a(ev.this);
            }
        });
    }
}
