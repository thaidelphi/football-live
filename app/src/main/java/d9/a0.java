package d9;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f24405a;

    /* renamed from: b  reason: collision with root package name */
    public final l f24406b;

    /* renamed from: c  reason: collision with root package name */
    public final t8.l<Throwable, i8.w> f24407c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f24408d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f24409e;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Object obj, l lVar, t8.l<? super Throwable, i8.w> lVar2, Object obj2, Throwable th) {
        this.f24405a = obj;
        this.f24406b = lVar;
        this.f24407c = lVar2;
        this.f24408d = obj2;
        this.f24409e = th;
    }

    public static /* synthetic */ a0 b(a0 a0Var, Object obj, l lVar, t8.l lVar2, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = a0Var.f24405a;
        }
        if ((i10 & 2) != 0) {
            lVar = a0Var.f24406b;
        }
        l lVar3 = lVar;
        t8.l<Throwable, i8.w> lVar4 = lVar2;
        if ((i10 & 4) != 0) {
            lVar4 = a0Var.f24407c;
        }
        t8.l lVar5 = lVar4;
        if ((i10 & 8) != 0) {
            obj2 = a0Var.f24408d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = a0Var.f24409e;
        }
        return a0Var.a(obj, lVar3, lVar5, obj4, th);
    }

    public final a0 a(Object obj, l lVar, t8.l<? super Throwable, i8.w> lVar2, Object obj2, Throwable th) {
        return new a0(obj, lVar, lVar2, obj2, th);
    }

    public final boolean c() {
        return this.f24409e != null;
    }

    public final void d(o<?> oVar, Throwable th) {
        l lVar = this.f24406b;
        if (lVar != null) {
            oVar.n(lVar, th);
        }
        t8.l<Throwable, i8.w> lVar2 = this.f24407c;
        if (lVar2 != null) {
            oVar.o(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return kotlin.jvm.internal.n.a(this.f24405a, a0Var.f24405a) && kotlin.jvm.internal.n.a(this.f24406b, a0Var.f24406b) && kotlin.jvm.internal.n.a(this.f24407c, a0Var.f24407c) && kotlin.jvm.internal.n.a(this.f24408d, a0Var.f24408d) && kotlin.jvm.internal.n.a(this.f24409e, a0Var.f24409e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f24405a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        l lVar = this.f24406b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        t8.l<Throwable, i8.w> lVar2 = this.f24407c;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Object obj2 = this.f24408d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f24409e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f24405a + ", cancelHandler=" + this.f24406b + ", onCancellation=" + this.f24407c + ", idempotentResume=" + this.f24408d + ", cancelCause=" + this.f24409e + ')';
    }

    public /* synthetic */ a0(Object obj, l lVar, t8.l lVar2, Object obj2, Throwable th, int i10, kotlin.jvm.internal.h hVar) {
        this(obj, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? null : lVar2, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
