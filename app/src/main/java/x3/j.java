package x3;

import a5.p0;
import java.io.IOException;
import x3.b;
import x3.l;
import x3.x;
/* compiled from: DefaultMediaCodecAdapterFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements l.b {

    /* renamed from: a  reason: collision with root package name */
    private int f32474a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32475b;

    @Override // x3.l.b
    public l a(l.a aVar) throws IOException {
        int i10;
        int i11 = p0.f482a;
        if (i11 >= 23 && ((i10 = this.f32474a) == 1 || (i10 == 0 && i11 >= 31))) {
            int k10 = a5.x.k(aVar.f32483c.f28185l);
            a5.t.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + p0.k0(k10));
            return new b.C0376b(k10, this.f32475b).a(aVar);
        }
        return new x.b().a(aVar);
    }
}
