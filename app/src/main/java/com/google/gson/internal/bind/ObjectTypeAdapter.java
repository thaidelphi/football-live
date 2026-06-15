package com.google.gson.internal.bind;

import b7.e;
import b7.t;
import b7.u;
import d7.f;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ObjectTypeAdapter extends t<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f15126b = new u() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // b7.u
        public <T> t<T> c(e eVar, g7.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new ObjectTypeAdapter(eVar);
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final e f15127a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15128a;

        static {
            int[] iArr = new int[h7.b.values().length];
            f15128a = iArr;
            try {
                iArr[h7.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15128a[h7.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15128a[h7.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15128a[h7.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15128a[h7.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15128a[h7.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    ObjectTypeAdapter(e eVar) {
        this.f15127a = eVar;
    }

    @Override // b7.t
    public Object b(h7.a aVar) throws IOException {
        switch (a.f15128a[aVar.C0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.E()) {
                    arrayList.add(b(aVar));
                }
                aVar.t();
                return arrayList;
            case 2:
                f fVar = new f();
                aVar.b();
                while (aVar.E()) {
                    fVar.put(aVar.S(), b(aVar));
                }
                aVar.w();
                return fVar;
            case 3:
                return aVar.y0();
            case 4:
                return Double.valueOf(aVar.L());
            case 5:
                return Boolean.valueOf(aVar.K());
            case 6:
                aVar.n0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // b7.t
    public void d(h7.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.K();
            return;
        }
        t l10 = this.f15127a.l(obj.getClass());
        if (l10 instanceof ObjectTypeAdapter) {
            cVar.j();
            cVar.w();
            return;
        }
        l10.d(cVar, obj);
    }
}
