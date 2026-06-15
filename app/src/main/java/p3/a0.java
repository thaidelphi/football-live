package p3;

import java.nio.ByteBuffer;
import p3.g;
/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private int[] f29557i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f29558j;

    @Override // p3.g
    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a5.a.e(this.f29558j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k10 = k(((limit - position) / this.f29838b.f29689d) * this.f29839c.f29689d);
        while (position < limit) {
            for (int i10 : iArr) {
                k10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f29838b.f29689d;
        }
        byteBuffer.position(limit);
        k10.flip();
    }

    @Override // p3.z
    public g.a g(g.a aVar) throws g.b {
        int[] iArr = this.f29557i;
        if (iArr == null) {
            return g.a.f29685e;
        }
        if (aVar.f29688c == 2) {
            boolean z10 = aVar.f29687b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 >= aVar.f29687b) {
                    throw new g.b(aVar);
                }
                z10 |= i11 != i10;
                i10++;
            }
            if (z10) {
                return new g.a(aVar.f29686a, iArr.length, 2);
            }
            return g.a.f29685e;
        }
        throw new g.b(aVar);
    }

    @Override // p3.z
    protected void h() {
        this.f29558j = this.f29557i;
    }

    @Override // p3.z
    protected void j() {
        this.f29558j = null;
        this.f29557i = null;
    }

    public void l(int[] iArr) {
        this.f29557i = iArr;
    }
}
