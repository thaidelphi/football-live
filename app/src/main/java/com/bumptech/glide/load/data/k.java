package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import f2.w;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamRewinder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final w f10363a;

    /* compiled from: InputStreamRewinder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final z1.b f10364a;

        public a(z1.b bVar) {
            this.f10364a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f10364a);
        }
    }

    public k(InputStream inputStream, z1.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f10363a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f10363a.f();
    }

    public void c() {
        this.f10363a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d */
    public InputStream a() throws IOException {
        this.f10363a.reset();
        return this.f10363a;
    }
}
