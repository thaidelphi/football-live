package d9;

import m8.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: CoroutineContext.kt */
@IgnoreJRERequirement
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class m0 extends m8.a implements v2<String> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24487b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f24488a;

    /* compiled from: CoroutineContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements g.c<m0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public m0(long j10) {
        super(f24487b);
        this.f24488a = j10;
    }

    public final long G0() {
        return this.f24488a;
    }

    @Override // d9.v2
    /* renamed from: H0 */
    public void D0(m8.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // d9.v2
    /* renamed from: I0 */
    public String k(m8.g gVar) {
        int O;
        n0 n0Var = (n0) gVar.get(n0.f24490b);
        String str = (n0Var == null || (str = n0Var.G0()) == null) ? "coroutine" : "coroutine";
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        O = b9.p.O(name, " @", 0, false, 6, null);
        if (O < 0) {
            O = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + O + 10);
        String substring = name.substring(0, O);
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f24488a);
        String sb2 = sb.toString();
        kotlin.jvm.internal.n.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.f24488a == ((m0) obj).f24488a;
    }

    public int hashCode() {
        return androidx.privacysandbox.ads.adservices.topics.d.a(this.f24488a);
    }

    public String toString() {
        return "CoroutineId(" + this.f24488a + ')';
    }
}
