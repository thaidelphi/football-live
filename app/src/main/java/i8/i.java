package i8;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class i {

    /* compiled from: LazyJVM.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26619a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26619a = iArr;
        }
    }

    public static <T> g<T> a(k mode, t8.a<? extends T> initializer) {
        kotlin.jvm.internal.n.f(mode, "mode");
        kotlin.jvm.internal.n.f(initializer, "initializer");
        int i10 = a.f26619a[mode.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new x(initializer);
                }
                throw new l();
            }
            return new q(initializer);
        }
        return new r(initializer, null, 2, null);
    }

    public static <T> g<T> b(t8.a<? extends T> initializer) {
        kotlin.jvm.internal.n.f(initializer, "initializer");
        return new r(initializer, null, 2, null);
    }
}
