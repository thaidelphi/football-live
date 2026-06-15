package j4;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: FullSegmentEncryptionKeyCache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f26946a;

    /* compiled from: FullSegmentEncryptionKeyCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f26947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f26947a = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f26947a;
        }
    }

    public e(int i10) {
        this.f26946a = new a(i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f26946a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f26946a.put((Uri) a5.a.e(uri), (byte[]) a5.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f26946a.remove(a5.a.e(uri));
    }
}
