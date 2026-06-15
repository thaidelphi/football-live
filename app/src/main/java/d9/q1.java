package d9;

import java.io.Closeable;
import java.util.concurrent.Executor;
import m8.g;
/* compiled from: Executors.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class q1 extends j0 implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24507b = new a(null);

    /* compiled from: Executors.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends m8.b<j0, q1> {

        /* compiled from: Executors.kt */
        /* renamed from: d9.q1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        static final class C0267a extends kotlin.jvm.internal.o implements t8.l<g.b, q1> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0267a f24508a = new C0267a();

            C0267a() {
                super(1);
            }

            @Override // t8.l
            /* renamed from: a */
            public final q1 invoke(g.b bVar) {
                if (bVar instanceof q1) {
                    return (q1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(j0.f24469a, C0267a.f24508a);
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public abstract Executor K0();
}
