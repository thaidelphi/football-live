package p8;

import kotlin.jvm.internal.n;
/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends o8.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: p8.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class C0338a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0338a f29904a = new C0338a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f29905b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                p8.a$a r0 = new p8.a$a
                r0.<init>()
                p8.a.C0338a.f29904a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                p8.a.C0338a.f29905b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.a.C0338a.<clinit>():void");
        }

        private C0338a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0338a.f29905b;
        return num == null || num.intValue() >= i10;
    }

    @Override // o8.a
    public void a(Throwable cause, Throwable exception) {
        n.f(cause, "cause");
        n.f(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
