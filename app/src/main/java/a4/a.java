package a4;

import a5.c0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import y3.d;
import y3.f;
/* compiled from: EventMessageDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends f {
    @Override // y3.f
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        return new Metadata(c(new c0(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage c(c0 c0Var) {
        return new EventMessage((String) a5.a.e(c0Var.u()), (String) a5.a.e(c0Var.u()), c0Var.t(), c0Var.t(), Arrays.copyOfRange(c0Var.d(), c0Var.e(), c0Var.f()));
    }
}
