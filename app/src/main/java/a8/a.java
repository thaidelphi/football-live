package a8;

import android.content.Context;
import android.widget.RelativeLayout;
import c8.e;
import c8.g;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.scar.adapter.common.m;
/* compiled from: ScarAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends k {

    /* renamed from: e  reason: collision with root package name */
    private b8.a f564e;

    /* compiled from: ScarAdapter.java */
    /* renamed from: a8.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class RunnableC0010a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u7.c f566b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: a8.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class C0011a implements u7.b {
            C0011a() {
            }

            @Override // u7.b
            public void onAdLoaded() {
                ((k) a.this).f23826b.put(RunnableC0010a.this.f566b.c(), RunnableC0010a.this.f565a);
            }
        }

        RunnableC0010a(e eVar, u7.c cVar) {
            this.f565a = eVar;
            this.f566b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f565a.b(new C0011a());
        }
    }

    /* compiled from: ScarAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u7.c f570b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: a8.a$b$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class C0012a implements u7.b {
            C0012a() {
            }

            @Override // u7.b
            public void onAdLoaded() {
                ((k) a.this).f23826b.put(b.this.f570b.c(), b.this.f569a);
            }
        }

        b(g gVar, u7.c cVar) {
            this.f569a = gVar;
            this.f570b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f569a.b(new C0012a());
        }
    }

    /* compiled from: ScarAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c8.c f573a;

        c(c8.c cVar) {
            this.f573a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f573a.b(null);
        }
    }

    public a(d<m> dVar, String str) {
        super(dVar);
        b8.a aVar = new b8.a(new t7.a(str));
        this.f564e = aVar;
        this.f23825a = new d8.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, u7.c cVar, h hVar) {
        l.a(new RunnableC0010a(new e(context, this.f564e, cVar, this.f23828d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void f(Context context, RelativeLayout relativeLayout, u7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new c8.c(context, relativeLayout, this.f564e, cVar, i10, i11, this.f23828d, gVar)));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void g(Context context, u7.c cVar, i iVar) {
        l.a(new b(new g(context, this.f564e, cVar, this.f23828d, iVar), cVar));
    }
}
