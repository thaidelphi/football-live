package y3;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
/* compiled from: SimpleMetadataDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f implements b {
    @Override // y3.b
    public final Metadata a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a5.a.e(dVar.f30091c);
        a5.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.k()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    protected abstract Metadata b(d dVar, ByteBuffer byteBuffer);
}
