package d9;
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    private static final i9.k0 f24456a = new i9.k0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final i9.k0 f24457b = new i9.k0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c  reason: collision with root package name */
    private static final i9.k0 f24458c = new i9.k0("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    private static final i9.k0 f24459d = new i9.k0("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    private static final i9.k0 f24460e = new i9.k0("SEALED");

    /* renamed from: f  reason: collision with root package name */
    private static final j1 f24461f = new j1(false);

    /* renamed from: g  reason: collision with root package name */
    private static final j1 f24462g = new j1(true);

    public static final Object g(Object obj) {
        return obj instanceof u1 ? new v1((u1) obj) : obj;
    }

    public static final Object h(Object obj) {
        u1 u1Var;
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        return (v1Var == null || (u1Var = v1Var.f24524a) == null) ? obj : u1Var;
    }
}
