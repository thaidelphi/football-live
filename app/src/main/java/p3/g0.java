package p3;

import a5.p0;
import java.nio.ByteBuffer;
import p3.g;
/* compiled from: FloatResamplingAudioProcessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private static final int f29690i = Float.floatToIntBits(Float.NaN);

    private static void l(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f29690i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p3.g
    public void d(ByteBuffer byteBuffer) {
        ByteBuffer k10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f29838b.f29688c;
        if (i11 == 536870912) {
            k10 = k((i10 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), k10);
                position += 3;
            }
        } else if (i11 == 805306368) {
            k10 = k(i10);
            while (position < limit) {
                l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), k10);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        k10.flip();
    }

    @Override // p3.z
    public g.a g(g.a aVar) throws g.b {
        int i10 = aVar.f29688c;
        if (p0.t0(i10)) {
            if (i10 != 4) {
                return new g.a(aVar.f29686a, aVar.f29687b, 4);
            }
            return g.a.f29685e;
        }
        throw new g.b(aVar);
    }
}
