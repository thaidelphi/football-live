package com.ironsource;

import i8.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k9 implements hb<nh> {

    /* renamed from: a  reason: collision with root package name */
    private final xc f18043a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18044b;

    /* renamed from: c  reason: collision with root package name */
    private final of f18045c;

    /* renamed from: d  reason: collision with root package name */
    private final t8.l<i8.o<? extends nh>, i8.w> f18046d;

    /* renamed from: e  reason: collision with root package name */
    private nh f18047e;

    /* JADX WARN: Multi-variable type inference failed */
    public k9(xc fileUrl, String destinationPath, of downloadManager, t8.l<? super i8.o<? extends nh>, i8.w> onFinish) {
        kotlin.jvm.internal.n.f(fileUrl, "fileUrl");
        kotlin.jvm.internal.n.f(destinationPath, "destinationPath");
        kotlin.jvm.internal.n.f(downloadManager, "downloadManager");
        kotlin.jvm.internal.n.f(onFinish, "onFinish");
        this.f18043a = fileUrl;
        this.f18044b = destinationPath;
        this.f18045c = downloadManager;
        this.f18046d = onFinish;
        this.f18047e = new nh(b());
    }

    @Override // com.ironsource.po
    public void a(nh file) {
        kotlin.jvm.internal.n.f(file, "file");
        t8.l<i8.o<? extends nh>, i8.w> i10 = i();
        o.a aVar = i8.o.f26626b;
        i10.invoke(i8.o.a(i8.o.b(file)));
    }

    @Override // com.ironsource.po
    public void a(nh nhVar, fh error) {
        kotlin.jvm.internal.n.f(error, "error");
        t8.l<i8.o<? extends nh>, i8.w> i10 = i();
        o.a aVar = i8.o.f26626b;
        i10.invoke(i8.o.a(i8.o.b(i8.p.a(new Exception("Unable to download mobileController.html: " + error.b())))));
    }

    @Override // com.ironsource.hb
    public String b() {
        return this.f18044b;
    }

    @Override // com.ironsource.hb
    public void b(nh nhVar) {
        kotlin.jvm.internal.n.f(nhVar, "<set-?>");
        this.f18047e = nhVar;
    }

    @Override // com.ironsource.hb
    public xc c() {
        return this.f18043a;
    }

    @Override // com.ironsource.hb
    public /* synthetic */ boolean h() {
        return az.a(this);
    }

    @Override // com.ironsource.hb
    public t8.l<i8.o<? extends nh>, i8.w> i() {
        return this.f18046d;
    }

    @Override // com.ironsource.hb
    public nh j() {
        return this.f18047e;
    }

    @Override // com.ironsource.hb
    public of k() {
        return this.f18045c;
    }

    @Override // com.ironsource.hb
    public /* synthetic */ void l() {
        az.b(this);
    }
}
