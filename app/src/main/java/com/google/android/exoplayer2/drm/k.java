package com.google.android.exoplayer2.drm;

import a5.p0;
import android.os.Handler;
import com.google.android.exoplayer2.drm.k;
import e4.t;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: DrmSessionEventListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface k {

    /* compiled from: DrmSessionEventListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10526a;

        /* renamed from: b  reason: collision with root package name */
        public final t.b f10527b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0172a> f10528c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: com.google.android.exoplayer2.drm.k$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        private static final class C0172a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f10529a;

            /* renamed from: b  reason: collision with root package name */
            public k f10530b;

            public C0172a(Handler handler, k kVar) {
                this.f10529a = handler;
                this.f10530b = kVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(k kVar) {
            kVar.e0(this.f10526a, this.f10527b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(k kVar) {
            kVar.M(this.f10526a, this.f10527b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(k kVar) {
            kVar.l0(this.f10526a, this.f10527b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(k kVar, int i10) {
            kVar.S(this.f10526a, this.f10527b);
            kVar.X(this.f10526a, this.f10527b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(k kVar, Exception exc) {
            kVar.Z(this.f10526a, this.f10527b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(k kVar) {
            kVar.j0(this.f10526a, this.f10527b);
        }

        public void g(Handler handler, k kVar) {
            a5.a.e(handler);
            a5.a.e(kVar);
            this.f10528c.add(new C0172a(handler, kVar));
        }

        public void h() {
            Iterator<C0172a> it = this.f10528c.iterator();
            while (it.hasNext()) {
                C0172a next = it.next();
                final k kVar = next.f10530b;
                p0.L0(next.f10529a, new Runnable() { // from class: r3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.this.n(kVar);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0172a> it = this.f10528c.iterator();
            while (it.hasNext()) {
                C0172a next = it.next();
                final k kVar = next.f10530b;
                p0.L0(next.f10529a, new Runnable() { // from class: r3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.this.o(kVar);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0172a> it = this.f10528c.iterator();
            while (it.hasNext()) {
                C0172a next = it.next();
                final k kVar = next.f10530b;
                p0.L0(next.f10529a, new Runnable() { // from class: r3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.this.p(kVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator<C0172a> it = this.f10528c.iterator();
            while (it.hasNext()) {
                C0172a next = it.next();
                final k kVar = next.f10530b;
                p0.L0(next.f10529a, new Runnable() { // from class: r3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.this.q(kVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0172a> it = this.f10528c.iterator();
            while (it.hasNext()) {
                C0172a next = it.next();
                final k kVar = next.f10530b;
                p0.L0(next.f10529a, new Runnable() { // from class: r3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.this.r(kVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0172a> it = this.f10528c.iterator();
            while (it.hasNext()) {
                C0172a next = it.next();
                final k kVar = next.f10530b;
                p0.L0(next.f10529a, new Runnable() { // from class: r3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.this.s(kVar);
                    }
                });
            }
        }

        public void t(k kVar) {
            Iterator<C0172a> it = this.f10528c.iterator();
            while (it.hasNext()) {
                C0172a next = it.next();
                if (next.f10530b == kVar) {
                    this.f10528c.remove(next);
                }
            }
        }

        public a u(int i10, t.b bVar) {
            return new a(this.f10528c, i10, bVar);
        }

        private a(CopyOnWriteArrayList<C0172a> copyOnWriteArrayList, int i10, t.b bVar) {
            this.f10528c = copyOnWriteArrayList;
            this.f10526a = i10;
            this.f10527b = bVar;
        }
    }

    void M(int i10, t.b bVar);

    @Deprecated
    void S(int i10, t.b bVar);

    void X(int i10, t.b bVar, int i11);

    void Z(int i10, t.b bVar, Exception exc);

    void e0(int i10, t.b bVar);

    void j0(int i10, t.b bVar);

    void l0(int i10, t.b bVar);
}
