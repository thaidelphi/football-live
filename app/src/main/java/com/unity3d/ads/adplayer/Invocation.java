package com.unity3d.ads.adplayer;

import d9.i;
import d9.p0;
import d9.w;
import d9.w0;
import d9.y;
import kotlin.jvm.internal.n;
import m8.d;
import t8.l;
/* compiled from: Invocation.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Invocation {
    private final w<i8.w> _isHandled;
    private final w<Object> completableDeferred;
    private final String location;
    private final Object[] parameters;

    public Invocation(String location, Object[] parameters) {
        n.f(location, "location");
        n.f(parameters, "parameters");
        this.location = location;
        this.parameters = parameters;
        this._isHandled = y.b(null, 1, null);
        this.completableDeferred = y.b(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object handle$default(Invocation invocation, l lVar, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new Invocation$handle$2(null);
        }
        return invocation.handle(lVar, dVar);
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult(d<Object> dVar) {
        return this.completableDeferred.C0(dVar);
    }

    public final Object handle(l<? super d<Object>, ? extends Object> lVar, d<? super i8.w> dVar) {
        w<i8.w> wVar = this._isHandled;
        i8.w wVar2 = i8.w.f26638a;
        wVar.L(wVar2);
        i.d(p0.a(dVar.getContext()), null, null, new Invocation$handle$3(lVar, this, null), 3, null);
        return wVar2;
    }

    public final w0<i8.w> isHandled() {
        return this._isHandled;
    }
}
