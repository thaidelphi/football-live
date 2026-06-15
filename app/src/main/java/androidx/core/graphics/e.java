package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;
/* compiled from: TypefaceCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final k f2647a;

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.collection.f<String, Typeface> f2648b;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.f f2649a;

        public a(h.f fVar) {
            this.f2649a = fVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i10) {
            h.f fVar = this.f2649a;
            if (fVar != null) {
                fVar.f(i10);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.f fVar = this.f2649a;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f2647a = new j();
        } else if (i10 >= 28) {
            f2647a = new i();
        } else if (i10 >= 26) {
            f2647a = new h();
        } else if (i10 >= 24 && g.n()) {
            f2647a = new g();
        } else if (i10 >= 21) {
            f2647a = new f();
        } else {
            f2647a = new k();
        }
        f2648b = new androidx.collection.f<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        Typeface g10;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g10 = g(context, typeface, i10)) == null) ? Typeface.create(typeface, i10) : g10;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f2647a.c(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.f fVar, Handler handler, boolean z10) {
        Typeface b10;
        if (bVar instanceof e.C0038e) {
            e.C0038e c0038e = (e.C0038e) bVar;
            Typeface h10 = h(c0038e.c());
            if (h10 != null) {
                if (fVar != null) {
                    fVar.d(h10, handler);
                }
                return h10;
            }
            boolean z11 = !z10 ? fVar != null : c0038e.a() != 0;
            int d10 = z10 ? c0038e.d() : -1;
            b10 = androidx.core.provider.g.c(context, c0038e.b(), i12, z11, d10, h.f.e(handler), new a(fVar));
        } else {
            b10 = f2647a.b(context, (e.c) bVar, resources, i12);
            if (fVar != null) {
                if (b10 != null) {
                    fVar.d(b10, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (b10 != null) {
            f2648b.put(e(resources, i10, str, i11, i12), b10);
        }
        return b10;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface e8 = f2647a.e(context, resources, i10, str, i12);
        if (e8 != null) {
            f2648b.put(e(resources, i10, str, i11, i12), e8);
        }
        return e8;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f2648b.get(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(Context context, Typeface typeface, int i10) {
        k kVar = f2647a;
        e.c j10 = kVar.j(typeface);
        if (j10 == null) {
            return null;
        }
        return kVar.b(context, j10, context.getResources(), i10);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
