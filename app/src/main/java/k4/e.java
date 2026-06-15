package k4;

import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;
import z4.m0;
/* compiled from: FilteringHlsPlaylistParserFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f27164a;

    /* renamed from: b  reason: collision with root package name */
    private final List<StreamKey> f27165b;

    public e(k kVar, List<StreamKey> list) {
        this.f27164a = kVar;
        this.f27165b = list;
    }

    @Override // k4.k
    public m0.a<i> a() {
        return new d4.b(this.f27164a.a(), this.f27165b);
    }

    @Override // k4.k
    public m0.a<i> b(h hVar, g gVar) {
        return new d4.b(this.f27164a.b(hVar, gVar), this.f27165b);
    }
}
