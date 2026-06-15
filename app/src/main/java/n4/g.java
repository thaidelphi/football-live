package n4;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class g extends q3.j<l, m, j> implements i {

    /* renamed from: n  reason: collision with root package name */
    private final String f28644n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleSubtitleDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends m {
        a() {
        }

        @Override // q3.h
        public void p() {
            g.this.r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g(String str) {
        super(new l[2], new m[2]);
        this.f28644n = str;
        u(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.j
    /* renamed from: A */
    public final j j(l lVar, m mVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) a5.a.e(lVar.f30091c);
            mVar.q(lVar.f30093e, z(byteBuffer.array(), byteBuffer.limit(), z10), lVar.f28647i);
            mVar.h(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (j e8) {
            return e8;
        }
    }

    @Override // n4.i
    public void a(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.j
    /* renamed from: w */
    public final l g() {
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.j
    /* renamed from: x */
    public final m h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.j
    /* renamed from: y */
    public final j i(Throwable th) {
        return new j("Unexpected decode error", th);
    }

    protected abstract h z(byte[] bArr, int i10, boolean z10) throws j;
}
