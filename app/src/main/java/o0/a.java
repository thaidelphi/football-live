package o0;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import d9.f1;
import d9.i;
import d9.o0;
import d9.p0;
import i8.w;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import t8.p;
/* compiled from: MeasurementManagerFutures.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f29043a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MeasurementManagerFutures.kt */
    /* renamed from: o0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0324a extends a {

        /* renamed from: b  reason: collision with root package name */
        private final q0.b f29044b;

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: o0.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class C0325a extends l implements p<o0, m8.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29045a;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q0.a f29047c;

            C0325a(q0.a aVar, m8.d<? super C0325a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                return new C0325a(this.f29047c, dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
                return ((C0325a) create(o0Var, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f29045a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    q0.b bVar = C0324a.this.f29044b;
                    q0.a aVar = this.f29047c;
                    this.f29045a = 1;
                    if (bVar.a(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return w.f26638a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: o0.a$a$b */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class b extends l implements p<o0, m8.d<? super Integer>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29048a;

            b(m8.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                return new b(dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, m8.d<? super Integer> dVar) {
                return ((b) create(o0Var, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f29048a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    q0.b bVar = C0324a.this.f29044b;
                    this.f29048a = 1;
                    obj = bVar.b(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return obj;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: o0.a$a$c */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class c extends l implements p<o0, m8.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29050a;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Uri f29052c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ InputEvent f29053d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, m8.d<? super c> dVar) {
                super(2, dVar);
                this.f29052c = uri;
                this.f29053d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                return new c(this.f29052c, this.f29053d, dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
                return ((c) create(o0Var, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f29050a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    q0.b bVar = C0324a.this.f29044b;
                    Uri uri = this.f29052c;
                    InputEvent inputEvent = this.f29053d;
                    this.f29050a = 1;
                    if (bVar.c(uri, inputEvent, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return w.f26638a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: o0.a$a$d */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class d extends l implements p<o0, m8.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29054a;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Uri f29056c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, m8.d<? super d> dVar) {
                super(2, dVar);
                this.f29056c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                return new d(this.f29056c, dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
                return ((d) create(o0Var, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f29054a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    q0.b bVar = C0324a.this.f29044b;
                    Uri uri = this.f29056c;
                    this.f29054a = 1;
                    if (bVar.d(uri, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return w.f26638a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: o0.a$a$e */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class e extends l implements p<o0, m8.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29057a;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q0.c f29059c;

            e(q0.c cVar, m8.d<? super e> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                return new e(this.f29059c, dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
                return ((e) create(o0Var, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f29057a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    q0.b bVar = C0324a.this.f29044b;
                    q0.c cVar = this.f29059c;
                    this.f29057a = 1;
                    if (bVar.e(cVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return w.f26638a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: o0.a$a$f */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class f extends l implements p<o0, m8.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29060a;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ q0.d f29062c;

            f(q0.d dVar, m8.d<? super f> dVar2) {
                super(2, dVar2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                return new f(this.f29062c, dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
                return ((f) create(o0Var, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f29060a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    q0.b bVar = C0324a.this.f29044b;
                    q0.d dVar = this.f29062c;
                    this.f29060a = 1;
                    if (bVar.f(dVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return w.f26638a;
            }
        }

        public C0324a(q0.b mMeasurementManager) {
            n.f(mMeasurementManager, "mMeasurementManager");
            this.f29044b = mMeasurementManager;
        }

        @Override // o0.a
        public b6.a<Integer> b() {
            return n0.b.c(i.b(p0.a(f1.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // o0.a
        public b6.a<w> c(Uri attributionSource, InputEvent inputEvent) {
            n.f(attributionSource, "attributionSource");
            return n0.b.c(i.b(p0.a(f1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        public b6.a<w> e(q0.a deletionRequest) {
            n.f(deletionRequest, "deletionRequest");
            return n0.b.c(i.b(p0.a(f1.a()), null, null, new C0325a(deletionRequest, null), 3, null), null, 1, null);
        }

        public b6.a<w> f(Uri trigger) {
            n.f(trigger, "trigger");
            return n0.b.c(i.b(p0.a(f1.a()), null, null, new d(trigger, null), 3, null), null, 1, null);
        }

        public b6.a<w> g(q0.c request) {
            n.f(request, "request");
            return n0.b.c(i.b(p0.a(f1.a()), null, null, new e(request, null), 3, null), null, 1, null);
        }

        public b6.a<w> h(q0.d request) {
            n.f(request, "request");
            return n0.b.c(i.b(p0.a(f1.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final a a(Context context) {
            n.f(context, "context");
            q0.b a10 = q0.b.f30030a.a(context);
            if (a10 != null) {
                return new C0324a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f29043a.a(context);
    }

    public abstract b6.a<Integer> b();

    public abstract b6.a<w> c(Uri uri, InputEvent inputEvent);
}
