package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i9 implements kf {

    /* renamed from: a  reason: collision with root package name */
    private final String f17817a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17818b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f17819c;

    /* renamed from: d  reason: collision with root package name */
    private final ep f17820d;

    public i9() {
        this(null, null, false, null, 15, null);
    }

    public i9(String controllerUrl, String cacheFolder, boolean z10, ep rootFolder) {
        kotlin.jvm.internal.n.f(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.n.f(cacheFolder, "cacheFolder");
        kotlin.jvm.internal.n.f(rootFolder, "rootFolder");
        this.f17817a = controllerUrl;
        this.f17818b = cacheFolder;
        this.f17819c = z10;
        this.f17820d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ i9(java.lang.String r2, java.lang.String r3, boolean r4, com.ironsource.ep r5, int r6, kotlin.jvm.internal.h r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            java.lang.String r0 = ""
            if (r7 == 0) goto L7
            r2 = r0
        L7:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            r3 = r0
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L11
            r4 = 0
        L11:
            r6 = r6 & 8
            if (r6 == 0) goto L1a
            com.ironsource.ep r5 = new com.ironsource.ep
            r5.<init>(r2)
        L1a:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.i9.<init>(java.lang.String, java.lang.String, boolean, com.ironsource.ep, int, kotlin.jvm.internal.h):void");
    }

    @Override // com.ironsource.kf
    public ep a() {
        return this.f17820d;
    }

    @Override // com.ironsource.kf
    public String b() {
        return this.f17818b;
    }

    @Override // com.ironsource.kf
    public String c() {
        return this.f17817a;
    }

    @Override // com.ironsource.kf
    public boolean d() {
        return this.f17819c;
    }
}
