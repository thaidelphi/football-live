package v3;
/* compiled from: TrackSampleTable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class l {

    /* renamed from: a  reason: collision with root package name */
    public final i f31872a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31873b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f31874c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f31875d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31876e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f31877f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f31878g;

    /* renamed from: h  reason: collision with root package name */
    public final long f31879h;

    public l(i iVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        a5.a.a(iArr.length == jArr2.length);
        a5.a.a(jArr.length == jArr2.length);
        a5.a.a(iArr2.length == jArr2.length);
        this.f31872a = iVar;
        this.f31874c = jArr;
        this.f31875d = iArr;
        this.f31876e = i10;
        this.f31877f = jArr2;
        this.f31878g = iArr2;
        this.f31879h = j10;
        this.f31873b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }
}
