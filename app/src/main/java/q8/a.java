package q8;

import w8.c;
/* compiled from: JDK8PlatformImplementations.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends p8.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK8PlatformImplementations.kt */
    /* renamed from: q8.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class C0347a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0347a f30144a = new C0347a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f30145b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                q8.a$a r0 = new q8.a$a
                r0.<init>()
                q8.a.C0347a.f30144a = r0
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
                q8.a.C0347a.f30145b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q8.a.C0347a.<clinit>():void");
        }

        private C0347a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0347a.f30145b;
        return num == null || num.intValue() >= i10;
    }

    @Override // o8.a
    public c b() {
        return c(34) ? new x8.a() : super.b();
    }
}
