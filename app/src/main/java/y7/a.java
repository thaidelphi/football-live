package y7;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
/* compiled from: ScarAdBase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f33291a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f33292b;

    /* renamed from: c  reason: collision with root package name */
    protected u7.c f33293c;

    /* renamed from: d  reason: collision with root package name */
    protected x7.a f33294d;

    /* renamed from: e  reason: collision with root package name */
    protected b f33295e;

    /* renamed from: f  reason: collision with root package name */
    protected com.unity3d.scar.adapter.common.d f33296f;

    public a(Context context, u7.c cVar, x7.a aVar, com.unity3d.scar.adapter.common.d dVar) {
        this.f33292b = context;
        this.f33293c = cVar;
        this.f33294d = aVar;
        this.f33296f = dVar;
    }

    public void b(u7.b bVar) {
        AdRequest b10 = this.f33294d.b(this.f33293c.a());
        if (bVar != null) {
            this.f33295e.a(bVar);
        }
        c(b10, bVar);
    }

    protected abstract void c(AdRequest adRequest, u7.b bVar);

    public void d(T t10) {
        this.f33291a = t10;
    }
}
