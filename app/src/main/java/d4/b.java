package d4;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import d4.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import z4.m0;
/* compiled from: FilteringManifestParser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b<T extends a<T>> implements m0.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final m0.a<? extends T> f23965a;

    /* renamed from: b  reason: collision with root package name */
    private final List<StreamKey> f23966b;

    public b(m0.a<? extends T> aVar, List<StreamKey> list) {
        this.f23965a = aVar;
        this.f23966b = list;
    }

    @Override // z4.m0.a
    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T a10 = this.f23965a.a(uri, inputStream);
        List<StreamKey> list = this.f23966b;
        return (list == null || list.isEmpty()) ? a10 : (T) a10.a(this.f23966b);
    }
}
