package androidx.work;

import android.annotation.SuppressLint;
/* compiled from: Operation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface s {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f4822a = new b.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0088b f4823b = new b.C0088b();

    /* compiled from: Operation.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class b {

        /* compiled from: Operation.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f4824a;

            public a(Throwable th) {
                this.f4824a = th;
            }

            public Throwable a() {
                return this.f4824a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f4824a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.s$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class C0088b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0088b() {
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }
}
