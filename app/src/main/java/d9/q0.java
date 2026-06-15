package d9;
/* compiled from: CoroutineStart.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public enum q0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24506a;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24506a = iArr;
        }
    }

    public final <R, T> void b(t8.p<? super R, ? super m8.d<? super T>, ? extends Object> pVar, R r10, m8.d<? super T> dVar) {
        int i10 = a.f24506a[ordinal()];
        if (i10 == 1) {
            j9.a.d(pVar, r10, dVar, null, 4, null);
        } else if (i10 == 2) {
            m8.f.a(pVar, r10, dVar);
        } else if (i10 == 3) {
            j9.b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new i8.l();
        }
    }

    public final boolean c() {
        return this == LAZY;
    }
}
