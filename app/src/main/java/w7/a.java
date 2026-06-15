package w7;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.scar.adapter.common.m;
import y7.e;
import y7.g;
/* compiled from: ScarAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends k {

    /* renamed from: e  reason: collision with root package name */
    private x7.a f32372e;

    /* compiled from: ScarAdapter.java */
    /* renamed from: w7.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class RunnableC0372a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f32373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u7.c f32374b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: w7.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class C0373a implements u7.b {
            C0373a() {
            }

            @Override // u7.b
            public void onAdLoaded() {
                ((k) a.this).f23826b.put(RunnableC0372a.this.f32374b.c(), RunnableC0372a.this.f32373a);
            }
        }

        RunnableC0372a(e eVar, u7.c cVar) {
            this.f32373a = eVar;
            this.f32374b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32373a.b(new C0373a());
        }
    }

    /* compiled from: ScarAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f32377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u7.c f32378b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: w7.a$b$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class C0374a implements u7.b {
            C0374a() {
            }

            @Override // u7.b
            public void onAdLoaded() {
                ((k) a.this).f23826b.put(b.this.f32378b.c(), b.this.f32377a);
            }
        }

        b(g gVar, u7.c cVar) {
            this.f32377a = gVar;
            this.f32378b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32377a.b(new C0374a());
        }
    }

    /* compiled from: ScarAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y7.c f32381a;

        c(y7.c cVar) {
            this.f32381a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32381a.b(null);
        }
    }

    public a(d<m> dVar, String str) {
        super(dVar);
        x7.a aVar = new x7.a(new t7.a(str));
        this.f32372e = aVar;
        this.f23825a = new z7.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, u7.c cVar, h hVar) {
        l.a(new RunnableC0372a(new e(context, this.f32372e, cVar, this.f23828d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void f(Context context, RelativeLayout relativeLayout, u7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new y7.c(context, relativeLayout, this.f32372e, cVar, i10, i11, this.f23828d, gVar)));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void g(Context context, u7.c cVar, i iVar) {
        l.a(new b(new g(context, this.f32372e, cVar, this.f23828d, iVar), cVar));
    }
}
