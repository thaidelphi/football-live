package n3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayList;
import p3.c0;
import x3.l;
/* compiled from: DefaultRenderersFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m implements c3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f28163a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28167e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28169g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f28170h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f28171i;

    /* renamed from: b  reason: collision with root package name */
    private final x3.j f28164b = new x3.j();

    /* renamed from: c  reason: collision with root package name */
    private int f28165c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f28166d = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;

    /* renamed from: f  reason: collision with root package name */
    private x3.q f28168f = x3.q.f32536a;

    public m(Context context) {
        this.f28163a = context;
    }

    @Override // n3.c3
    public y2[] a(Handler handler, b5.y yVar, p3.t tVar, n4.n nVar, y3.e eVar) {
        ArrayList<y2> arrayList = new ArrayList<>();
        h(this.f28163a, this.f28165c, this.f28168f, this.f28167e, handler, yVar, this.f28166d, arrayList);
        p3.v c10 = c(this.f28163a, this.f28169g, this.f28170h, this.f28171i);
        if (c10 != null) {
            b(this.f28163a, this.f28165c, this.f28168f, this.f28167e, c10, handler, tVar, arrayList);
        }
        g(this.f28163a, nVar, handler.getLooper(), this.f28165c, arrayList);
        e(this.f28163a, eVar, handler.getLooper(), this.f28165c, arrayList);
        d(this.f28163a, this.f28165c, arrayList);
        f(this.f28163a, handler, this.f28165c, arrayList);
        return (y2[]) arrayList.toArray(new y2[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(1:7)|8|9|10|11|(2:12|13)|14|15|16|17|18|19|(5:21|22|23|24|25)|(2:27|28)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:12|13)|15|16|17|18|19|(5:21|22|23|24|25)|(2:27|28)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        r6 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void b(android.content.Context r15, int r16, x3.q r17, boolean r18, p3.v r19, android.os.Handler r20, p3.t r21, java.util.ArrayList<n3.y2> r22) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.m.b(android.content.Context, int, x3.q, boolean, p3.v, android.os.Handler, p3.t, java.util.ArrayList):void");
    }

    protected p3.v c(Context context, boolean z10, boolean z11, boolean z12) {
        return new c0.f().g(p3.f.c(context)).i(z10).h(z11).j(z12 ? 1 : 0).f();
    }

    protected void d(Context context, int i10, ArrayList<y2> arrayList) {
        arrayList.add(new c5.b());
    }

    protected void e(Context context, y3.e eVar, Looper looper, int i10, ArrayList<y2> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.metadata.a(eVar, looper));
    }

    protected void f(Context context, Handler handler, int i10, ArrayList<y2> arrayList) {
    }

    protected void g(Context context, n4.n nVar, Looper looper, int i10, ArrayList<y2> arrayList) {
        arrayList.add(new n4.o(nVar, looper));
    }

    protected void h(Context context, int i10, x3.q qVar, boolean z10, Handler handler, b5.y yVar, long j10, ArrayList<y2> arrayList) {
        int i11;
        arrayList.add(new b5.h(context, i(), qVar, j10, z10, handler, yVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (y2) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, b5.y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, yVar, 50));
                    a5.t.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    arrayList.add(i11, (y2) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, b5.y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, yVar, 50));
                    a5.t.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
            } catch (Exception e8) {
                throw new RuntimeException("Error instantiating VP9 extension", e8);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i11, (y2) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, b5.y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, yVar, 50));
            a5.t.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating AV1 extension", e10);
        }
    }

    protected l.b i() {
        return this.f28164b;
    }
}
