package com.ironsource;

import com.ironsource.qe;
import com.ironsource.te;
import com.ironsource.xu;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface h9 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f17662a = c.f17669a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements h9 {

        /* renamed from: b  reason: collision with root package name */
        private final pe f17663b;

        /* renamed from: c  reason: collision with root package name */
        private final xu f17664c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicBoolean f17665d;

        /* renamed from: com.ironsource.h9$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class C0220a implements xu.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f17666a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f17667b;

            C0220a(d dVar, a aVar) {
                this.f17666a = dVar;
                this.f17667b = aVar;
            }

            @Override // com.ironsource.xu.a
            public void a() {
                this.f17666a.a(new te.a(new qe.a(this.f17667b.f17663b.b())));
                this.f17667b.f17665d.set(false);
            }
        }

        public a(pe config, xu timer) {
            kotlin.jvm.internal.n.f(config, "config");
            kotlin.jvm.internal.n.f(timer, "timer");
            this.f17663b = config;
            this.f17664c = timer;
            this.f17665d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.h9
        public synchronized void a() {
            this.f17664c.cancel();
            this.f17665d.set(false);
        }

        @Override // com.ironsource.h9
        public synchronized void a(d callback) {
            kotlin.jvm.internal.n.f(callback, "callback");
            if (this.f17665d.compareAndSet(false, true)) {
                this.f17664c.a(new C0220a(callback, this));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements h9 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f17668b = new b();

        private b() {
        }

        @Override // com.ironsource.h9
        public void a() {
        }

        @Override // com.ironsource.h9
        public void a(d callback) {
            kotlin.jvm.internal.n.f(callback, "callback");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ c f17669a = new c();

        private c() {
        }

        public final h9 a() {
            return b.f17668b;
        }

        public final h9 a(re featureFlag) {
            kotlin.jvm.internal.n.f(featureFlag, "featureFlag");
            if (featureFlag.c()) {
                oe oeVar = new oe(featureFlag);
                xu.b bVar = new xu.b();
                bVar.b(oeVar.a());
                bVar.a(oeVar.a());
                return new a(oeVar, new xu.d().a(bVar));
            }
            return b.f17668b;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface d {
        void a(te teVar);
    }

    void a();

    void a(d dVar);
}
