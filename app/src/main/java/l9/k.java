package l9;

import d9.n;
import i8.w;
import i9.k0;
import kotlin.jvm.internal.o;
import t8.q;
/* compiled from: Select.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f27605a = a.f27611a;

    /* renamed from: b  reason: collision with root package name */
    private static final k0 f27606b = new k0("STATE_REG");

    /* renamed from: c  reason: collision with root package name */
    private static final k0 f27607c = new k0("STATE_COMPLETED");

    /* renamed from: d  reason: collision with root package name */
    private static final k0 f27608d = new k0("STATE_CANCELLED");

    /* renamed from: e  reason: collision with root package name */
    private static final k0 f27609e = new k0("NO_RESULT");

    /* renamed from: f  reason: collision with root package name */
    private static final k0 f27610f = new k0("PARAM_CLAUSE_0");

    /* compiled from: Select.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends o implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f27611a = new a();

        a() {
            super(3);
        }

        @Override // t8.q
        /* renamed from: a */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return l.ALREADY_SELECTED;
                    }
                    throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
                }
                return l.CANCELLED;
            }
            return l.REREGISTER;
        }
        return l.SUCCESSFUL;
    }

    public static final k0 i() {
        return f27610f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(n<? super w> nVar, t8.l<? super Throwable, w> lVar) {
        Object p10 = nVar.p(w.f26638a, null, lVar);
        if (p10 == null) {
            return false;
        }
        nVar.u(p10);
        return true;
    }
}
