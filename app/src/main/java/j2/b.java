package j2;

import android.graphics.Bitmap;
import v1.a;
/* compiled from: GifBitmapProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements a.InterfaceC0366a {

    /* renamed from: a  reason: collision with root package name */
    private final z1.e f26796a;

    /* renamed from: b  reason: collision with root package name */
    private final z1.b f26797b;

    public b(z1.e eVar, z1.b bVar) {
        this.f26796a = eVar;
        this.f26797b = bVar;
    }

    @Override // v1.a.InterfaceC0366a
    public void a(Bitmap bitmap) {
        this.f26796a.c(bitmap);
    }

    @Override // v1.a.InterfaceC0366a
    public byte[] b(int i10) {
        z1.b bVar = this.f26797b;
        if (bVar == null) {
            return new byte[i10];
        }
        return (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // v1.a.InterfaceC0366a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f26796a.e(i10, i11, config);
    }

    @Override // v1.a.InterfaceC0366a
    public int[] d(int i10) {
        z1.b bVar = this.f26797b;
        if (bVar == null) {
            return new int[i10];
        }
        return (int[]) bVar.c(i10, int[].class);
    }

    @Override // v1.a.InterfaceC0366a
    public void e(byte[] bArr) {
        z1.b bVar = this.f26797b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // v1.a.InterfaceC0366a
    public void f(int[] iArr) {
        z1.b bVar = this.f26797b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
