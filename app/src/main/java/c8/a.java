package c8;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
/* compiled from: ScarAdBase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f5571a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f5572b;

    /* renamed from: c  reason: collision with root package name */
    protected u7.c f5573c;

    /* renamed from: d  reason: collision with root package name */
    protected b8.a f5574d;

    /* renamed from: e  reason: collision with root package name */
    protected b f5575e;

    /* renamed from: f  reason: collision with root package name */
    protected com.unity3d.scar.adapter.common.d f5576f;

    public a(Context context, u7.c cVar, b8.a aVar, com.unity3d.scar.adapter.common.d dVar) {
        this.f5572b = context;
        this.f5573c = cVar;
        this.f5574d = aVar;
        this.f5576f = dVar;
    }

    public void b(u7.b bVar) {
        AdRequest b10 = this.f5574d.b(this.f5573c.a());
        if (bVar != null) {
            this.f5575e.a(bVar);
        }
        c(b10, bVar);
    }

    protected abstract void c(AdRequest adRequest, u7.b bVar);

    public void d(T t10) {
        this.f5571a = t10;
    }
}
