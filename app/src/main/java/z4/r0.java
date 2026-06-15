package z4;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: StatsDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f33611a;

    /* renamed from: b  reason: collision with root package name */
    private long f33612b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f33613c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f33614d = Collections.emptyMap();

    public r0(l lVar) {
        this.f33611a = (l) a5.a.e(lVar);
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) throws IOException {
        int b10 = this.f33611a.b(bArr, i10, i11);
        if (b10 != -1) {
            this.f33612b += b10;
        }
        return b10;
    }

    @Override // z4.l
    public void close() throws IOException {
        this.f33611a.close();
    }

    @Override // z4.l
    public Map<String, List<String>> d() {
        return this.f33611a.d();
    }

    @Override // z4.l
    public void i(s0 s0Var) {
        a5.a.e(s0Var);
        this.f33611a.i(s0Var);
    }

    @Override // z4.l
    public long l(p pVar) throws IOException {
        this.f33613c = pVar.f33569a;
        this.f33614d = Collections.emptyMap();
        long l10 = this.f33611a.l(pVar);
        this.f33613c = (Uri) a5.a.e(m());
        this.f33614d = d();
        return l10;
    }

    @Override // z4.l
    public Uri m() {
        return this.f33611a.m();
    }

    public long o() {
        return this.f33612b;
    }

    public Uri p() {
        return this.f33613c;
    }

    public Map<String, List<String>> q() {
        return this.f33614d;
    }

    public void r() {
        this.f33612b = 0L;
    }
}
