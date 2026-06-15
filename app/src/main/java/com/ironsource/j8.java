package com.ironsource;

import com.ironsource.ff;
import i8.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j8 implements ff, ff.a {

    /* renamed from: a  reason: collision with root package name */
    private final zo f17938a;

    /* renamed from: b  reason: collision with root package name */
    private final mt f17939b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17940a;

        static {
            int[] iArr = new int[n8.values().length];
            try {
                iArr[n8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17940a = iArr;
        }
    }

    public j8() {
        this(null, null, null, 7, null);
    }

    public j8(q9 currentTimeProvider, yf pacingDataRepository, ei showCountDataRepository) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(pacingDataRepository, "pacingDataRepository");
        kotlin.jvm.internal.n.f(showCountDataRepository, "showCountDataRepository");
        this.f17938a = new zo(currentTimeProvider, pacingDataRepository);
        this.f17939b = new mt(currentTimeProvider, showCountDataRepository);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ j8(com.ironsource.q9 r8, com.ironsource.yf r9, com.ironsource.ei r10, int r11, kotlin.jvm.internal.h r12) {
        /*
            r7 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L9
            com.ironsource.q9$a r8 = new com.ironsource.q9$a
            r8.<init>()
        L9:
            r12 = r11 & 2
            java.lang.String r0 = "getInstance().applicationContext"
            if (r12 == 0) goto L2a
            com.ironsource.ap r9 = new com.ironsource.ap
            com.ironsource.gt r12 = new com.ironsource.gt
            com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r2 = r1.getApplicationContext()
            kotlin.jvm.internal.n.e(r2, r0)
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r3 = "pacing_service"
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r9.<init>(r12)
        L2a:
            r11 = r11 & 4
            if (r11 == 0) goto L49
            com.ironsource.kt r10 = new com.ironsource.kt
            com.ironsource.gt r11 = new com.ironsource.gt
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r2 = r12.getApplicationContext()
            kotlin.jvm.internal.n.e(r2, r0)
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r3 = "capping_service"
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10.<init>(r11)
        L49:
            r7.<init>(r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.j8.<init>(com.ironsource.q9, com.ironsource.yf, com.ironsource.ei, int, kotlin.jvm.internal.h):void");
    }

    @Override // com.ironsource.ff
    public synchronized l8 a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        l8 a10 = this.f17938a.a(identifier);
        if (a10.d()) {
            return a10;
        }
        return this.f17939b.a(identifier);
    }

    @Override // com.ironsource.ff.a
    public synchronized Object a(String identifier, n8 cappingType, df cappingConfig) {
        Object a10;
        kotlin.jvm.internal.n.f(identifier, "identifier");
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
        int i10 = a.f17940a[cappingType.ordinal()];
        if (i10 == 1) {
            a10 = this.f17938a.a(identifier, cappingType, cappingConfig);
        } else if (i10 == 2) {
            a10 = this.f17939b.a(identifier, cappingType, cappingConfig);
        } else if (i10 != 3) {
            throw new i8.l();
        } else {
            o.a aVar = i8.o.f26626b;
            a10 = i8.o.b(i8.w.f26638a);
        }
        return a10;
    }

    @Override // com.ironsource.ff.a
    public synchronized void b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f17938a.b(identifier);
        this.f17939b.b(identifier);
    }
}
