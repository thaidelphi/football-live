package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.collection.i;
import androidx.core.util.c;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f3686c = false;

    /* renamed from: a  reason: collision with root package name */
    private final p f3687a;

    /* renamed from: b  reason: collision with root package name */
    private final C0067b f3688b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a<D> extends w<D> {

        /* renamed from: l  reason: collision with root package name */
        private final int f3689l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f3690m;

        /* renamed from: n  reason: collision with root package name */
        private final l0.a<D> f3691n;

        /* renamed from: o  reason: collision with root package name */
        private p f3692o;

        @Override // androidx.lifecycle.LiveData
        protected void f() {
            if (b.f3686c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void g() {
            if (b.f3686c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void i(x<? super D> xVar) {
            super.i(xVar);
            this.f3692o = null;
        }

        @Override // androidx.lifecycle.w, androidx.lifecycle.LiveData
        public void j(D d10) {
            super.j(d10);
        }

        l0.a<D> k(boolean z10) {
            if (b.f3686c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3689l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3690m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3691n);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void m() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3689l);
            sb.append(" : ");
            c.a(this.f3691n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class C0067b extends k0 {

        /* renamed from: f  reason: collision with root package name */
        private static final l0.b f3693f = new a();

        /* renamed from: d  reason: collision with root package name */
        private i<a> f3694d = new i<>();

        /* renamed from: e  reason: collision with root package name */
        private boolean f3695e = false;

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: androidx.loader.app.b$b$a */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static class a implements l0.b {
            a() {
            }

            @Override // androidx.lifecycle.l0.b
            public <T extends k0> T a(Class<T> cls) {
                return new C0067b();
            }

            @Override // androidx.lifecycle.l0.b
            public /* synthetic */ k0 b(Class cls, k0.a aVar) {
                return m0.b(this, cls, aVar);
            }
        }

        C0067b() {
        }

        static C0067b g(o0 o0Var) {
            return (C0067b) new l0(o0Var, f3693f).a(C0067b.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.k0
        public void d() {
            super.d();
            int l10 = this.f3694d.l();
            for (int i10 = 0; i10 < l10; i10++) {
                this.f3694d.m(i10).k(true);
            }
            this.f3694d.d();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3694d.l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f3694d.l(); i10++) {
                    a m7 = this.f3694d.m(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3694d.j(i10));
                    printWriter.print(": ");
                    printWriter.println(m7.toString());
                    m7.l(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void h() {
            int l10 = this.f3694d.l();
            for (int i10 = 0; i10 < l10; i10++) {
                this.f3694d.m(i10).m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(p pVar, o0 o0Var) {
        this.f3687a = pVar;
        this.f3688b = C0067b.g(o0Var);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3688b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f3688b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c.a(this.f3687a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
