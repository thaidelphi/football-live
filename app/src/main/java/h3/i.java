package h3;

import android.content.Context;
import i3.y;
/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements d3.b<y> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<Context> f26206a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<j3.d> f26207b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a<i3.g> f26208c;

    /* renamed from: d  reason: collision with root package name */
    private final h8.a<l3.a> f26209d;

    public i(h8.a<Context> aVar, h8.a<j3.d> aVar2, h8.a<i3.g> aVar3, h8.a<l3.a> aVar4) {
        this.f26206a = aVar;
        this.f26207b = aVar2;
        this.f26208c = aVar3;
        this.f26209d = aVar4;
    }

    public static i a(h8.a<Context> aVar, h8.a<j3.d> aVar2, h8.a<i3.g> aVar3, h8.a<l3.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static y c(Context context, j3.d dVar, i3.g gVar, l3.a aVar) {
        return (y) d3.d.c(h.a(context, dVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h8.a
    /* renamed from: b */
    public y get() {
        return c(this.f26206a.get(), this.f26207b.get(), this.f26208c.get(), this.f26209d.get());
    }
}
