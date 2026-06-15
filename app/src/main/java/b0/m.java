package b0;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d9.o0;
import g9.l0;
import g9.w;
import j8.y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.a0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: SingleProcessDataStore.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m<T> implements b0.f<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f4878k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    private static final Set<String> f4879l = new LinkedHashSet();

    /* renamed from: m  reason: collision with root package name */
    private static final Object f4880m = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final t8.a<File> f4881a;

    /* renamed from: b  reason: collision with root package name */
    private final b0.k<T> f4882b;

    /* renamed from: c  reason: collision with root package name */
    private final b0.b<T> f4883c;

    /* renamed from: d  reason: collision with root package name */
    private final o0 f4884d;

    /* renamed from: e  reason: collision with root package name */
    private final g9.e<T> f4885e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4886f;

    /* renamed from: g  reason: collision with root package name */
    private final i8.g f4887g;

    /* renamed from: h  reason: collision with root package name */
    private final w<b0.n<T>> f4888h;

    /* renamed from: i  reason: collision with root package name */
    private List<? extends t8.p<? super b0.i<T>, ? super m8.d<? super i8.w>, ? extends Object>> f4889i;

    /* renamed from: j  reason: collision with root package name */
    private final b0.l<b<T>> f4890j;

    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final Set<String> a() {
            return m.f4879l;
        }

        public final Object b() {
            return m.f4880m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final b0.n<T> f4891a;

            public a(b0.n<T> nVar) {
                super(null);
                this.f4891a = nVar;
            }

            public b0.n<T> a() {
                return this.f4891a;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        /* renamed from: b0.m$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class C0094b<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final t8.p<T, m8.d<? super T>, Object> f4892a;

            /* renamed from: b  reason: collision with root package name */
            private final d9.w<T> f4893b;

            /* renamed from: c  reason: collision with root package name */
            private final b0.n<T> f4894c;

            /* renamed from: d  reason: collision with root package name */
            private final m8.g f4895d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0094b(t8.p<? super T, ? super m8.d<? super T>, ? extends Object> transform, d9.w<T> ack, b0.n<T> nVar, m8.g callerContext) {
                super(null);
                kotlin.jvm.internal.n.f(transform, "transform");
                kotlin.jvm.internal.n.f(ack, "ack");
                kotlin.jvm.internal.n.f(callerContext, "callerContext");
                this.f4892a = transform;
                this.f4893b = ack;
                this.f4894c = nVar;
                this.f4895d = callerContext;
            }

            public final d9.w<T> a() {
                return this.f4893b;
            }

            public final m8.g b() {
                return this.f4895d;
            }

            public b0.n<T> c() {
                return this.f4894c;
            }

            public final t8.p<T, m8.d<? super T>, Object> d() {
                return this.f4892a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final FileOutputStream f4896a;

        public c(FileOutputStream fileOutputStream) {
            kotlin.jvm.internal.n.f(fileOutputStream, "fileOutputStream");
            this.f4896a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f4896a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f4896a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10) {
            kotlin.jvm.internal.n.f(b10, "b");
            this.f4896a.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i10, int i11) {
            kotlin.jvm.internal.n.f(bytes, "bytes");
            this.f4896a.write(bytes, i10, i11);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class d extends kotlin.jvm.internal.o implements t8.l<Throwable, i8.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m<T> f4897a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m<T> mVar) {
            super(1);
            this.f4897a = mVar;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
            invoke2(th);
            return i8.w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th != null) {
                ((m) this.f4897a).f4888h.setValue(new b0.h(th));
            }
            a aVar = m.f4878k;
            Object b10 = aVar.b();
            m<T> mVar = this.f4897a;
            synchronized (b10) {
                aVar.a().remove(mVar.q().getAbsolutePath());
                i8.w wVar = i8.w.f26638a;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class e extends kotlin.jvm.internal.o implements t8.p<b<T>, Throwable, i8.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f4898a = new e();

        e() {
            super(2);
        }

        public final void a(b<T> msg, Throwable th) {
            kotlin.jvm.internal.n.f(msg, "msg");
            if (msg instanceof b.C0094b) {
                d9.w<T> a10 = ((b.C0094b) msg).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a10.J(th);
            }
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ i8.w invoke(Object obj, Throwable th) {
            a((b) obj, th);
            return i8.w.f26638a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements t8.p<b<T>, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4899a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f4900b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<T> f4901c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m<T> mVar, m8.d<? super f> dVar) {
            super(2, dVar);
            this.f4901c = mVar;
        }

        @Override // t8.p
        /* renamed from: a */
        public final Object invoke(b<T> bVar, m8.d<? super i8.w> dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            f fVar = new f(this.f4901c, dVar);
            fVar.f4900b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f4899a;
            if (i10 == 0) {
                i8.p.b(obj);
                b bVar = (b) this.f4900b;
                if (bVar instanceof b.a) {
                    this.f4899a = 1;
                    if (this.f4901c.r((b.a) bVar, this) == c10) {
                        return c10;
                    }
                } else if (bVar instanceof b.C0094b) {
                    this.f4899a = 2;
                    if (this.f4901c.s((b.C0094b) bVar, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            return i8.w.f26638a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements t8.p<g9.f<? super T>, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4902a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<T> f4904c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SingleProcessDataStore.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<b0.n<T>, m8.d<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f4905a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f4906b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b0.n<T> f4907c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0.n<T> nVar, m8.d<? super a> dVar) {
                super(2, dVar);
                this.f4907c = nVar;
            }

            @Override // t8.p
            /* renamed from: a */
            public final Object invoke(b0.n<T> nVar, m8.d<? super Boolean> dVar) {
                return ((a) create(nVar, dVar)).invokeSuspend(i8.w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
                a aVar = new a(this.f4907c, dVar);
                aVar.f4906b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                n8.d.c();
                if (this.f4905a == 0) {
                    i8.p.b(obj);
                    b0.n<T> nVar = (b0.n) this.f4906b;
                    b0.n<T> nVar2 = this.f4907c;
                    boolean z10 = false;
                    if (!(nVar2 instanceof b0.c) && !(nVar2 instanceof b0.h) && nVar == nVar2) {
                        z10 = true;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class b implements g9.e<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g9.e f4908a;

            /* compiled from: Collect.kt */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            public static final class a implements g9.f<b0.n<T>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g9.f f4909a;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                /* renamed from: b0.m$g$b$a$a  reason: collision with other inner class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
                public static final class C0095a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f4910a;

                    /* renamed from: b  reason: collision with root package name */
                    int f4911b;

                    public C0095a(m8.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f4910a = obj;
                        this.f4911b |= RecyclerView.UNDEFINED_DURATION;
                        return a.this.emit(null, this);
                    }
                }

                public a(g9.f fVar) {
                    this.f4909a = fVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(java.lang.Object r5, m8.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof b0.m.g.b.a.C0095a
                        if (r0 == 0) goto L13
                        r0 = r6
                        b0.m$g$b$a$a r0 = (b0.m.g.b.a.C0095a) r0
                        int r1 = r0.f4911b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f4911b = r1
                        goto L18
                    L13:
                        b0.m$g$b$a$a r0 = new b0.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f4910a
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.f4911b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        i8.p.b(r6)
                        g9.f r6 = r4.f4909a
                        b0.n r5 = (b0.n) r5
                        boolean r2 = r5 instanceof b0.j
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof b0.h
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof b0.c
                        if (r2 == 0) goto L56
                        b0.c r5 = (b0.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f4911b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        i8.w r5 = i8.w.f26638a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof b0.o
                        if (r5 == 0) goto L66
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L66:
                        i8.l r5 = new i8.l
                        r5.<init>()
                        throw r5
                    L6c:
                        b0.h r5 = (b0.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L73:
                        b0.j r5 = (b0.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: b0.m.g.b.a.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            public b(g9.e eVar) {
                this.f4908a = eVar;
            }

            @Override // g9.e
            public Object collect(g9.f fVar, m8.d dVar) {
                Object c10;
                Object collect = this.f4908a.collect(new a(fVar), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : i8.w.f26638a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m<T> mVar, m8.d<? super g> dVar) {
            super(2, dVar);
            this.f4904c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            g gVar = new g(this.f4904c, dVar);
            gVar.f4903b = obj;
            return gVar;
        }

        public final Object invoke(g9.f<? super T> fVar, m8.d<? super i8.w> dVar) {
            return ((g) create(fVar, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, m8.d<? super i8.w> dVar) {
            return invoke((g9.f) ((g9.f) obj), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f4902a;
            if (i10 == 0) {
                i8.p.b(obj);
                g9.f fVar = (g9.f) this.f4903b;
                b0.n nVar = (b0.n) ((m) this.f4904c).f4888h.getValue();
                if (!(nVar instanceof b0.c)) {
                    ((m) this.f4904c).f4890j.e(new b.a(nVar));
                }
                b bVar = new b(g9.g.m(((m) this.f4904c).f4888h, new a(nVar, null)));
                this.f4902a = 1;
                if (g9.g.o(fVar, bVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            return i8.w.f26638a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class h extends kotlin.jvm.internal.o implements t8.a<File> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m<T> f4913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m<T> mVar) {
            super(0);
            this.f4913a = mVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // t8.a
        public final File invoke() {
            File file = (File) ((m) this.f4913a).f4881a.invoke();
            String it = file.getAbsolutePath();
            a aVar = m.f4878k;
            synchronized (aVar.b()) {
                if (!aVar.a().contains(it)) {
                    Set<String> a10 = aVar.a();
                    kotlin.jvm.internal.n.e(it, "it");
                    a10.add(it);
                } else {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
            }
            return file;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4914a;

        /* renamed from: b  reason: collision with root package name */
        Object f4915b;

        /* renamed from: c  reason: collision with root package name */
        Object f4916c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f4917d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m<T> f4918e;

        /* renamed from: f  reason: collision with root package name */
        int f4919f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(m<T> mVar, m8.d<? super i> dVar) {
            super(dVar);
            this.f4918e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4917d = obj;
            this.f4919f |= RecyclerView.UNDEFINED_DURATION;
            return this.f4918e.s(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, IronSourceError.ERROR_CODE_KEY_NOT_SET}, m = "readAndInit")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4920a;

        /* renamed from: b  reason: collision with root package name */
        Object f4921b;

        /* renamed from: c  reason: collision with root package name */
        Object f4922c;

        /* renamed from: d  reason: collision with root package name */
        Object f4923d;

        /* renamed from: e  reason: collision with root package name */
        Object f4924e;

        /* renamed from: f  reason: collision with root package name */
        Object f4925f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f4926g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m<T> f4927h;

        /* renamed from: i  reason: collision with root package name */
        int f4928i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m<T> mVar, m8.d<? super j> dVar) {
            super(dVar);
            this.f4927h = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4926g = obj;
            this.f4928i |= RecyclerView.UNDEFINED_DURATION;
            return this.f4927h.t(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class k implements b0.i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m9.a f4929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.w f4930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0<T> f4931c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m<T> f4932d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SingleProcessDataStore.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f4933a;

            /* renamed from: b  reason: collision with root package name */
            Object f4934b;

            /* renamed from: c  reason: collision with root package name */
            Object f4935c;

            /* renamed from: d  reason: collision with root package name */
            Object f4936d;

            /* renamed from: e  reason: collision with root package name */
            Object f4937e;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f4938f;

            /* renamed from: h  reason: collision with root package name */
            int f4940h;

            a(m8.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4938f = obj;
                this.f4940h |= RecyclerView.UNDEFINED_DURATION;
                return k.this.a(null, this);
            }
        }

        k(m9.a aVar, kotlin.jvm.internal.w wVar, a0<T> a0Var, m<T> mVar) {
            this.f4929a = aVar;
            this.f4930b = wVar;
            this.f4931c = a0Var;
            this.f4932d = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x0096, B:32:0x009a, B:47:0x00d7, B:48:0x00de), top: B:57:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d7 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x0096, B:32:0x009a, B:47:0x00d7, B:48:0x00de), top: B:57:0x0096 }] */
        @Override // b0.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(t8.p<? super T, ? super m8.d<? super T>, ? extends java.lang.Object> r11, m8.d<? super T> r12) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.m.k.a(t8.p, m8.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4941a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f4942b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<T> f4943c;

        /* renamed from: d  reason: collision with root package name */
        int f4944d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(m<T> mVar, m8.d<? super l> dVar) {
            super(dVar);
            this.f4943c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4942b = obj;
            this.f4944d |= RecyclerView.UNDEFINED_DURATION;
            return this.f4943c.u(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* renamed from: b0.m$m  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0096m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4945a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f4946b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<T> f4947c;

        /* renamed from: d  reason: collision with root package name */
        int f4948d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0096m(m<T> mVar, m8.d<? super C0096m> dVar) {
            super(dVar);
            this.f4947c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4946b = obj;
            this.f4948d |= RecyclerView.UNDEFINED_DURATION;
            return this.f4947c.v(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4949a;

        /* renamed from: b  reason: collision with root package name */
        Object f4950b;

        /* renamed from: c  reason: collision with root package name */
        Object f4951c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f4952d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m<T> f4953e;

        /* renamed from: f  reason: collision with root package name */
        int f4954f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(m<T> mVar, m8.d<? super n> dVar) {
            super(dVar);
            this.f4953e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4952d = obj;
            this.f4954f |= RecyclerView.UNDEFINED_DURATION;
            return this.f4953e.w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4955a;

        /* renamed from: b  reason: collision with root package name */
        Object f4956b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f4957c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m<T> f4958d;

        /* renamed from: e  reason: collision with root package name */
        int f4959e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(m<T> mVar, m8.d<? super o> dVar) {
            super(dVar);
            this.f4958d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4957c = obj;
            this.f4959e |= RecyclerView.UNDEFINED_DURATION;
            return this.f4958d.x(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, j3.a.b.f17905j}, m = "transformAndWrite")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4960a;

        /* renamed from: b  reason: collision with root package name */
        Object f4961b;

        /* renamed from: c  reason: collision with root package name */
        Object f4962c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f4963d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m<T> f4964e;

        /* renamed from: f  reason: collision with root package name */
        int f4965f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(m<T> mVar, m8.d<? super p> dVar) {
            super(dVar);
            this.f4964e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4963d = obj;
            this.f4965f |= RecyclerView.UNDEFINED_DURATION;
            return this.f4964e.y(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super T>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t8.p<T, m8.d<? super T>, Object> f4967b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f4968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(t8.p<? super T, ? super m8.d<? super T>, ? extends Object> pVar, T t10, m8.d<? super q> dVar) {
            super(2, dVar);
            this.f4967b = pVar;
            this.f4968c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            return new q(this.f4967b, this.f4968c, dVar);
        }

        public final Object invoke(o0 o0Var, m8.d<? super T> dVar) {
            return ((q) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object obj) {
            return invoke(o0Var, (m8.d) ((m8.d) obj));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f4966a;
            if (i10 == 0) {
                i8.p.b(obj);
                t8.p<T, m8.d<? super T>, Object> pVar = this.f4967b;
                T t10 = this.f4968c;
                this.f4966a = 1;
                obj = pVar.invoke(t10, this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f4969a;

        /* renamed from: b  reason: collision with root package name */
        Object f4970b;

        /* renamed from: c  reason: collision with root package name */
        Object f4971c;

        /* renamed from: d  reason: collision with root package name */
        Object f4972d;

        /* renamed from: e  reason: collision with root package name */
        Object f4973e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f4974f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m<T> f4975g;

        /* renamed from: h  reason: collision with root package name */
        int f4976h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(m<T> mVar, m8.d<? super r> dVar) {
            super(dVar);
            this.f4975g = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4974f = obj;
            this.f4976h |= RecyclerView.UNDEFINED_DURATION;
            return this.f4975g.z(null, this);
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(t8.a<? extends File> produceFile, b0.k<T> serializer, List<? extends t8.p<? super b0.i<T>, ? super m8.d<? super i8.w>, ? extends Object>> initTasksList, b0.b<T> corruptionHandler, o0 scope) {
        i8.g b10;
        List<? extends t8.p<? super b0.i<T>, ? super m8.d<? super i8.w>, ? extends Object>> M;
        kotlin.jvm.internal.n.f(produceFile, "produceFile");
        kotlin.jvm.internal.n.f(serializer, "serializer");
        kotlin.jvm.internal.n.f(initTasksList, "initTasksList");
        kotlin.jvm.internal.n.f(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.n.f(scope, "scope");
        this.f4881a = produceFile;
        this.f4882b = serializer;
        this.f4883c = corruptionHandler;
        this.f4884d = scope;
        this.f4885e = g9.g.t(new g(this, null));
        this.f4886f = ".tmp";
        b10 = i8.i.b(new h(this));
        this.f4887g = b10;
        this.f4888h = l0.a(b0.o.f4977a);
        M = y.M(initTasksList);
        this.f4889i = M;
        this.f4890j = new b0.l<>(scope, new d(this), e.f4898a, new f(this, null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(kotlin.jvm.internal.n.n("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.f4887g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b.a<T> aVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object c11;
        b0.n<T> value = this.f4888h.getValue();
        if (!(value instanceof b0.c)) {
            if (value instanceof b0.j) {
                if (value == aVar.a()) {
                    Object v10 = v(dVar);
                    c11 = n8.d.c();
                    return v10 == c11 ? v10 : i8.w.f26638a;
                }
            } else if (kotlin.jvm.internal.n.a(value, b0.o.f4977a)) {
                Object v11 = v(dVar);
                c10 = n8.d.c();
                return v11 == c10 ? v11 : i8.w.f26638a;
            } else if (value instanceof b0.h) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return i8.w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0, types: [b0.m, b0.m<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [d9.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(b0.m.b.C0094b<T> r9, m8.d<? super i8.w> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.s(b0.m$b$b, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(m8.d<? super i8.w> r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.t(m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(m8.d<? super i8.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b0.m.l
            if (r0 == 0) goto L13
            r0 = r5
            b0.m$l r0 = (b0.m.l) r0
            int r1 = r0.f4944d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4944d = r1
            goto L18
        L13:
            b0.m$l r0 = new b0.m$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4942b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f4944d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f4941a
            b0.m r0 = (b0.m) r0
            i8.p.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            i8.p.b(r5)
            r0.f4941a = r4     // Catch: java.lang.Throwable -> L48
            r0.f4944d = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            i8.w r5 = i8.w.f26638a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            g9.w<b0.n<T>> r0 = r0.f4888h
            b0.j r1 = new b0.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.u(m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(m8.d<? super i8.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b0.m.C0096m
            if (r0 == 0) goto L13
            r0 = r5
            b0.m$m r0 = (b0.m.C0096m) r0
            int r1 = r0.f4948d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4948d = r1
            goto L18
        L13:
            b0.m$m r0 = new b0.m$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4946b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f4948d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f4945a
            b0.m r0 = (b0.m) r0
            i8.p.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            i8.p.b(r5)
            r0.f4945a = r4     // Catch: java.lang.Throwable -> L45
            r0.f4948d = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            g9.w<b0.n<T>> r0 = r0.f4888h
            b0.j r1 = new b0.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            i8.w r5 = i8.w.f26638a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.v(m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [b0.m$n, m8.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [b0.m] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [b0.k<T>, b0.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(m8.d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b0.m.n
            if (r0 == 0) goto L13
            r0 = r6
            b0.m$n r0 = (b0.m.n) r0
            int r1 = r0.f4954f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4954f = r1
            goto L18
        L13:
            b0.m$n r0 = new b0.m$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4952d
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f4954f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f4951c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f4950b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f4949a
            b0.m r0 = (b0.m) r0
            i8.p.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L68
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            i8.p.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6e
            java.io.File r6 = r5.q()     // Catch: java.io.FileNotFoundException -> L6e
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6e
            r6 = 0
            b0.k<T> r4 = r5.f4882b     // Catch: java.lang.Throwable -> L66
            r0.f4949a = r5     // Catch: java.lang.Throwable -> L66
            r0.f4950b = r2     // Catch: java.lang.Throwable -> L66
            r0.f4951c = r6     // Catch: java.lang.Throwable -> L66
            r0.f4954f = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r4.readFrom(r2, r0)     // Catch: java.lang.Throwable -> L66
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r1 = r6
            r6 = r0
            r0 = r5
        L60:
            r8.c.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L64
            return r6
        L64:
            r6 = move-exception
            goto L70
        L66:
            r6 = move-exception
            r0 = r5
        L68:
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            r8.c.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L64
            throw r1     // Catch: java.io.FileNotFoundException -> L64
        L6e:
            r6 = move-exception
            r0 = r5
        L70:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L81
            b0.k<T> r6 = r0.f4882b
            java.lang.Object r6 = r6.getDefaultValue()
            return r6
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.w(m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(m8.d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof b0.m.o
            if (r0 == 0) goto L13
            r0 = r8
            b0.m$o r0 = (b0.m.o) r0
            int r1 = r0.f4959e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4959e = r1
            goto L18
        L13:
            b0.m$o r0 = new b0.m$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f4957c
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f4959e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f4956b
            java.lang.Object r0 = r0.f4955a
            b0.a r0 = (b0.a) r0
            i8.p.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f4956b
            b0.a r2 = (b0.a) r2
            java.lang.Object r4 = r0.f4955a
            b0.m r4 = (b0.m) r4
            i8.p.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f4955a
            b0.m r2 = (b0.m) r2
            i8.p.b(r8)     // Catch: b0.a -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            i8.p.b(r8)
            r0.f4955a = r7     // Catch: b0.a -> L64
            r0.f4959e = r5     // Catch: b0.a -> L64
            java.lang.Object r8 = r7.w(r0)     // Catch: b0.a -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            b0.b<T> r5 = r2.f4883c
            r0.f4955a = r2
            r0.f4956b = r8
            r0.f4959e = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f4955a = r2     // Catch: java.io.IOException -> L88
            r0.f4956b = r8     // Catch: java.io.IOException -> L88
            r0.f4959e = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.z(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            i8.a.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.x(m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(t8.p<? super T, ? super m8.d<? super T>, ? extends java.lang.Object> r8, m8.g r9, m8.d<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof b0.m.p
            if (r0 == 0) goto L13
            r0 = r10
            b0.m$p r0 = (b0.m.p) r0
            int r1 = r0.f4965f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4965f = r1
            goto L18
        L13:
            b0.m$p r0 = new b0.m$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f4963d
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f4965f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f4961b
            java.lang.Object r9 = r0.f4960a
            b0.m r9 = (b0.m) r9
            i8.p.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f4962c
            java.lang.Object r9 = r0.f4961b
            b0.c r9 = (b0.c) r9
            java.lang.Object r2 = r0.f4960a
            b0.m r2 = (b0.m) r2
            i8.p.b(r10)
            goto L73
        L49:
            i8.p.b(r10)
            g9.w<b0.n<T>> r10 = r7.f4888h
            java.lang.Object r10 = r10.getValue()
            b0.c r10 = (b0.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            b0.m$q r6 = new b0.m$q
            r6.<init>(r8, r2, r3)
            r0.f4960a = r7
            r0.f4961b = r10
            r0.f4962c = r2
            r0.f4965f = r5
            java.lang.Object r8 = d9.i.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = kotlin.jvm.internal.n.a(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f4960a = r2
            r0.f4961b = r10
            r0.f4962c = r3
            r0.f4965f = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            g9.w<b0.n<T>> r9 = r9.f4888h
            b0.c r10 = new b0.c
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.y(t8.p, m8.g, m8.d):java.lang.Object");
    }

    @Override // b0.f
    public Object a(t8.p<? super T, ? super m8.d<? super T>, ? extends Object> pVar, m8.d<? super T> dVar) {
        d9.w b10 = d9.y.b(null, 1, null);
        this.f4890j.e(new b.C0094b(pVar, b10, this.f4888h.getValue(), dVar.getContext()));
        return b10.C0(dVar);
    }

    @Override // b0.f
    public g9.e<T> getData() {
        return this.f4885e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[Catch: IOException -> 0x00c4, TryCatch #1 {IOException -> 0x00c4, blocks: (B:26:0x0092, B:29:0x00a0, B:30:0x00bb, B:33:0x00be), top: B:44:0x0021 }] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(T r8, m8.d<? super i8.w> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof b0.m.r
            if (r0 == 0) goto L13
            r0 = r9
            b0.m$r r0 = (b0.m.r) r0
            int r1 = r0.f4976h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4976h = r1
            goto L18
        L13:
            b0.m$r r0 = new b0.m$r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f4974f
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f4976h
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f4973e
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f4972d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f4971c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f4970b
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f4969a
            b0.m r0 = (b0.m) r0
            i8.p.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lbe
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            i8.p.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f4886f
            java.lang.String r2 = kotlin.jvm.internal.n.n(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc7
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc7
            r4 = 0
            b0.k<T> r5 = r7.f4882b     // Catch: java.lang.Throwable -> Lbc
            b0.m$c r6 = new b0.m$c     // Catch: java.lang.Throwable -> Lbc
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lbc
            r0.f4969a = r7     // Catch: java.lang.Throwable -> Lbc
            r0.f4970b = r9     // Catch: java.lang.Throwable -> Lbc
            r0.f4971c = r2     // Catch: java.lang.Throwable -> Lbc
            r0.f4972d = r4     // Catch: java.lang.Throwable -> Lbc
            r0.f4973e = r2     // Catch: java.lang.Throwable -> Lbc
            r0.f4976h = r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r5.writeTo(r8, r6, r0)     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            i8.w r8 = i8.w.f26638a     // Catch: java.lang.Throwable -> L3d
            r8.c.a(r2, r1)     // Catch: java.io.IOException -> Lc4
            java.io.File r9 = r0.q()     // Catch: java.io.IOException -> Lc4
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lc4
            if (r9 == 0) goto La0
            return r8
        La0:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lc4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc4
            r9.<init>()     // Catch: java.io.IOException -> Lc4
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lc4
            r9.append(r3)     // Catch: java.io.IOException -> Lc4
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lc4
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lc4
            r8.<init>(r9)     // Catch: java.io.IOException -> Lc4
            throw r8     // Catch: java.io.IOException -> Lc4
        Lbc:
            r8 = move-exception
            r3 = r9
        Lbe:
            throw r8     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r9 = move-exception
            r8.c.a(r2, r8)     // Catch: java.io.IOException -> Lc4
            throw r9     // Catch: java.io.IOException -> Lc4
        Lc4:
            r8 = move-exception
            r9 = r3
            goto Lc8
        Lc7:
            r8 = move-exception
        Lc8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld1
            r9.delete()
        Ld1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.z(java.lang.Object, m8.d):java.lang.Object");
    }
}
