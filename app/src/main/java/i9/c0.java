package i9;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: OnUndeliveredElement.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c0 {

    /* compiled from: OnUndeliveredElement.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.l<Throwable, i8.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.l<E, i8.w> f26648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f26649b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m8.g f26650c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t8.l<? super E, i8.w> lVar, E e8, m8.g gVar) {
            super(1);
            this.f26648a = lVar;
            this.f26649b = e8;
            this.f26650c = gVar;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
            invoke2(th);
            return i8.w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            c0.b(this.f26648a, this.f26649b, this.f26650c);
        }
    }

    public static final <E> t8.l<Throwable, i8.w> a(t8.l<? super E, i8.w> lVar, E e8, m8.g gVar) {
        return new a(lVar, e8, gVar);
    }

    public static final <E> void b(t8.l<? super E, i8.w> lVar, E e8, m8.g gVar) {
        t0 c10 = c(lVar, e8, null);
        if (c10 != null) {
            d9.l0.a(gVar, c10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> t0 c(t8.l<? super E, i8.w> lVar, E e8, t0 t0Var) {
        try {
            lVar.invoke(e8);
        } catch (Throwable th) {
            if (t0Var != null && t0Var.getCause() != th) {
                i8.b.a(t0Var, th);
            } else {
                return new t0("Exception in undelivered element handler for " + e8, th);
            }
        }
        return t0Var;
    }

    public static /* synthetic */ t0 d(t8.l lVar, Object obj, t0 t0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            t0Var = null;
        }
        return c(lVar, obj, t0Var);
    }
}
