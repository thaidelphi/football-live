package f2;

import android.graphics.Bitmap;
import f2.m;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamBitmapDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z implements w1.j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final m f25384a;

    /* renamed from: b  reason: collision with root package name */
    private final z1.b f25385b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StreamBitmapDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements m.b {

        /* renamed from: a  reason: collision with root package name */
        private final w f25386a;

        /* renamed from: b  reason: collision with root package name */
        private final s2.d f25387b;

        a(w wVar, s2.d dVar) {
            this.f25386a = wVar;
            this.f25387b = dVar;
        }

        @Override // f2.m.b
        public void a(z1.e eVar, Bitmap bitmap) throws IOException {
            IOException a10 = this.f25387b.a();
            if (a10 != null) {
                if (bitmap != null) {
                    eVar.c(bitmap);
                }
                throw a10;
            }
        }

        @Override // f2.m.b
        public void b() {
            this.f25386a.b();
        }
    }

    public z(m mVar, z1.b bVar) {
        this.f25384a = mVar;
        this.f25385b = bVar;
    }

    @Override // w1.j
    /* renamed from: c */
    public y1.v<Bitmap> a(InputStream inputStream, int i10, int i11, w1.h hVar) throws IOException {
        boolean z10;
        w wVar;
        if (inputStream instanceof w) {
            wVar = (w) inputStream;
            z10 = false;
        } else {
            z10 = true;
            wVar = new w(inputStream, this.f25385b);
        }
        s2.d b10 = s2.d.b(wVar);
        try {
            return this.f25384a.g(new s2.h(b10), i10, i11, hVar, new a(wVar, b10));
        } finally {
            b10.f();
            if (z10) {
                wVar.f();
            }
        }
    }

    @Override // w1.j
    /* renamed from: d */
    public boolean b(InputStream inputStream, w1.h hVar) {
        return this.f25384a.p(inputStream);
    }
}
