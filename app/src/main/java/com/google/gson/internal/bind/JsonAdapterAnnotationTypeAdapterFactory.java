package com.google.gson.internal.bind;

import b7.e;
import b7.i;
import b7.q;
import b7.t;
import b7.u;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d7.c f15119a;

    public JsonAdapterAnnotationTypeAdapterFactory(d7.c cVar) {
        this.f15119a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t<?> a(d7.c cVar, e eVar, g7.a<?> aVar, c7.b bVar) {
        t<?> treeTypeAdapter;
        Object a10 = cVar.a(g7.a.a(bVar.value())).a();
        if (a10 instanceof t) {
            treeTypeAdapter = (t) a10;
        } else if (a10 instanceof u) {
            treeTypeAdapter = ((u) a10).c(eVar, aVar);
        } else {
            boolean z10 = a10 instanceof q;
            if (!z10 && !(a10 instanceof i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (q) a10 : null, a10 instanceof i ? (i) a10 : null, eVar, aVar, null);
        }
        return (treeTypeAdapter == null || !bVar.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.a();
    }

    @Override // b7.u
    public <T> t<T> c(e eVar, g7.a<T> aVar) {
        c7.b bVar = (c7.b) aVar.c().getAnnotation(c7.b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) a(this.f15119a, eVar, aVar, bVar);
    }
}
