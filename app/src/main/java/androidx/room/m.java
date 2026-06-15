package androidx.room;

import v0.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoClosingRoomOpenHelperFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f4209a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4210b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(h.c cVar, a aVar) {
        this.f4209a = cVar;
        this.f4210b = aVar;
    }

    @Override // v0.h.c
    /* renamed from: b */
    public i a(h.b bVar) {
        return new i(this.f4209a.a(bVar), this.f4210b);
    }
}
