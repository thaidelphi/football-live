package v7;

import android.content.Context;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: SignalsCollectorBase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class e implements c {

    /* compiled from: SignalsCollectorBase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31894a;

        static {
            int[] iArr = new int[u7.d.values().length];
            f31894a = iArr;
            try {
                iArr[u7.d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31894a[u7.d.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31894a[u7.d.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: SignalsCollectorBase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private v7.b f31895a;

        /* renamed from: b  reason: collision with root package name */
        private f f31896b;

        public b(v7.b bVar, f fVar) {
            this.f31895a = bVar;
            this.f31896b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> c10 = this.f31896b.c();
            if (c10.size() > 0) {
                this.f31895a.onSignalsCollected(new JSONObject(c10).toString());
            } else if (this.f31896b.b() == null) {
                this.f31895a.onSignalsCollected("");
            } else {
                this.f31895a.onSignalsCollectionFailed(this.f31896b.b());
            }
        }
    }

    @Override // v7.c
    public void a(Context context, List<u7.d> list, v7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        for (u7.d dVar : list) {
            aVar.a();
            d(context, dVar, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // v7.c
    public void b(Context context, String str, u7.d dVar, v7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        e(context, str, dVar, aVar, fVar);
        aVar.c(new b(bVar, fVar));
    }

    @Override // v7.c
    public void c(Context context, boolean z10, v7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        d(context, u7.d.INTERSTITIAL, aVar, fVar);
        aVar.a();
        d(context, u7.d.REWARDED, aVar, fVar);
        if (z10) {
            aVar.a();
            d(context, u7.d.BANNER, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    public String f(u7.d dVar) {
        int i10 = a.f31894a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal" : "gmaScarBiddingBannerSignal";
    }
}
