package androidx.concurrent.futures;

import com.ironsource.b9;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Object f1998a;

        /* renamed from: b  reason: collision with root package name */
        d<T> f1999b;

        /* renamed from: c  reason: collision with root package name */
        private androidx.concurrent.futures.d<Void> f2000c = androidx.concurrent.futures.d.t();

        /* renamed from: d  reason: collision with root package name */
        private boolean f2001d;

        a() {
        }

        private void d() {
            this.f1998a = null;
            this.f1999b = null;
            this.f2000c = null;
        }

        void a() {
            this.f1998a = null;
            this.f1999b = null;
            this.f2000c.p(null);
        }

        public boolean b(T t10) {
            boolean z10 = true;
            this.f2001d = true;
            d<T> dVar = this.f1999b;
            z10 = (dVar == null || !dVar.b(t10)) ? false : false;
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            boolean z10 = true;
            this.f2001d = true;
            d<T> dVar = this.f1999b;
            z10 = (dVar == null || !dVar.a(true)) ? false : false;
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th) {
            boolean z10 = true;
            this.f2001d = true;
            d<T> dVar = this.f1999b;
            z10 = (dVar == null || !dVar.c(th)) ? false : false;
            if (z10) {
                d();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f1999b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1998a));
            }
            if (this.f2001d || (dVar = this.f2000c) == null) {
                return;
            }
            dVar.p(null);
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: androidx.concurrent.futures.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0031c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d<T> implements b6.a<T> {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<a<T>> f2002a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f2003b = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String m() {
                a<T> aVar = d.this.f2002a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1998a + b9.i.f16698e;
            }
        }

        d(a<T> aVar) {
            this.f2002a = new WeakReference<>(aVar);
        }

        boolean a(boolean z10) {
            return this.f2003b.cancel(z10);
        }

        @Override // b6.a
        public void addListener(Runnable runnable, Executor executor) {
            this.f2003b.addListener(runnable, executor);
        }

        boolean b(T t10) {
            return this.f2003b.p(t10);
        }

        boolean c(Throwable th) {
            return this.f2003b.q(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f2002a.get();
            boolean cancel = this.f2003b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f2003b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f2003b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f2003b.isDone();
        }

        public String toString() {
            return this.f2003b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f2003b.get(j10, timeUnit);
        }
    }

    public static <T> b6.a<T> a(InterfaceC0031c<T> interfaceC0031c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f1999b = dVar;
        aVar.f1998a = interfaceC0031c.getClass();
        try {
            Object a10 = interfaceC0031c.a(aVar);
            if (a10 != null) {
                aVar.f1998a = a10;
            }
        } catch (Exception e8) {
            dVar.c(e8);
        }
        return dVar;
    }
}
