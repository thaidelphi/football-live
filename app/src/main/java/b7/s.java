package b7;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f5277a;

    /* renamed from: b  reason: collision with root package name */
    public static final s f5278b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ s[] f5279c;

    /* compiled from: LongSerializationPolicy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    enum a extends s {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f5277a = aVar;
        s sVar = new s("STRING", 1) { // from class: b7.s.b
        };
        f5278b = sVar;
        f5279c = new s[]{aVar, sVar};
    }

    private s(String str, int i10) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f5279c.clone();
    }

    /* synthetic */ s(String str, int i10, a aVar) {
        this(str, i10);
    }
}
