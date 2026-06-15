package v0;
/* compiled from: SimpleSQLiteQuery.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final String f31676a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f31677b;

    public a(String str, Object[] objArr) {
        this.f31676a = str;
        this.f31677b = objArr;
    }

    private static void c(i iVar, int i10, Object obj) {
        if (obj == null) {
            iVar.v0(i10);
        } else if (obj instanceof byte[]) {
            iVar.p0(i10, (byte[]) obj);
        } else if (obj instanceof Float) {
            iVar.p(i10, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            iVar.p(i10, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            iVar.m0(i10, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            iVar.m0(i10, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            iVar.m0(i10, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            iVar.m0(i10, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            iVar.d0(i10, (String) obj);
        } else if (obj instanceof Boolean) {
            iVar.m0(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void d(i iVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            c(iVar, i10, obj);
        }
    }

    @Override // v0.j
    public String a() {
        return this.f31676a;
    }

    @Override // v0.j
    public void b(i iVar) {
        d(iVar, this.f31677b);
    }

    public a(String str) {
        this(str, null);
    }
}
