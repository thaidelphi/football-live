package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import i8.o;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c implements hb<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final xc f16801a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16802b;

    /* renamed from: c  reason: collision with root package name */
    private final of f16803c;

    /* renamed from: d  reason: collision with root package name */
    private final t8.l<i8.o<? extends JSONObject>, i8.w> f16804d;

    /* renamed from: e  reason: collision with root package name */
    private nh f16805e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(xc fileUrl, String destinationPath, of downloadManager, t8.l<? super i8.o<? extends JSONObject>, i8.w> onFinish) {
        kotlin.jvm.internal.n.f(fileUrl, "fileUrl");
        kotlin.jvm.internal.n.f(destinationPath, "destinationPath");
        kotlin.jvm.internal.n.f(downloadManager, "downloadManager");
        kotlin.jvm.internal.n.f(onFinish, "onFinish");
        this.f16801a = fileUrl;
        this.f16802b = destinationPath;
        this.f16803c = downloadManager;
        this.f16804d = onFinish;
        this.f16805e = new nh(b(), b9.f16513h);
    }

    private final JSONObject c(nh nhVar) {
        return new JSONObject(IronSourceStorageUtils.readFile(nhVar));
    }

    @Override // com.ironsource.po
    public void a(nh file) {
        kotlin.jvm.internal.n.f(file, "file");
        if (kotlin.jvm.internal.n.a(file.getName(), b9.f16513h)) {
            try {
                JSONObject c10 = c(file);
                t8.l<i8.o<? extends JSONObject>, i8.w> i10 = i();
                o.a aVar = i8.o.f26626b;
                i10.invoke(i8.o.a(i8.o.b(c10)));
            } catch (Exception e8) {
                o9.d().a(e8);
                t8.l<i8.o<? extends JSONObject>, i8.w> i11 = i();
                o.a aVar2 = i8.o.f26626b;
                i11.invoke(i8.o.a(i8.o.b(i8.p.a(e8))));
            }
        }
    }

    @Override // com.ironsource.po
    public void a(nh nhVar, fh error) {
        kotlin.jvm.internal.n.f(error, "error");
        t8.l<i8.o<? extends JSONObject>, i8.w> i10 = i();
        o.a aVar = i8.o.f26626b;
        i10.invoke(i8.o.a(i8.o.b(i8.p.a(new Exception("Unable to download abTestMap.json: " + error.b())))));
    }

    @Override // com.ironsource.hb
    public String b() {
        return this.f16802b;
    }

    @Override // com.ironsource.hb
    public void b(nh nhVar) {
        kotlin.jvm.internal.n.f(nhVar, "<set-?>");
        this.f16805e = nhVar;
    }

    @Override // com.ironsource.hb
    public xc c() {
        return this.f16801a;
    }

    @Override // com.ironsource.hb
    public /* synthetic */ boolean h() {
        return az.a(this);
    }

    @Override // com.ironsource.hb
    public t8.l<i8.o<? extends JSONObject>, i8.w> i() {
        return this.f16804d;
    }

    @Override // com.ironsource.hb
    public nh j() {
        return this.f16805e;
    }

    @Override // com.ironsource.hb
    public of k() {
        return this.f16803c;
    }

    @Override // com.ironsource.hb
    public /* synthetic */ void l() {
        az.b(this);
    }
}
