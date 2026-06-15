package v7;
/* compiled from: SignalCallbackListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class d<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private com.unity3d.scar.adapter.common.a f31892a;

    /* renamed from: b  reason: collision with root package name */
    private f f31893b;

    public d(com.unity3d.scar.adapter.common.a aVar, f fVar) {
        this(aVar, null, fVar);
    }

    @Override // v7.a
    public void a(String str, String str2, T t10) {
        this.f31893b.a(str, str2);
        this.f31892a.b();
    }

    @Override // v7.a
    public void onFailure(String str) {
        this.f31893b.d(str);
        this.f31892a.b();
    }

    public d(com.unity3d.scar.adapter.common.a aVar, g<T> gVar, f fVar) {
        this.f31892a = aVar;
        this.f31893b = fVar;
    }
}
