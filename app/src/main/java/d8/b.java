package d8;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import u7.d;
import v7.e;
import v7.f;
/* compiled from: SignalsCollector.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private b8.a f24402a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignalsCollector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24403a;

        static {
            int[] iArr = new int[d.values().length];
            f24403a = iArr;
            try {
                iArr[d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24403a[d.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(b8.a aVar) {
        this.f24402a = aVar;
    }

    @Override // v7.c
    public void d(Context context, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        e(context, f(dVar), dVar, aVar, fVar);
    }

    @Override // v7.c
    public void e(Context context, String str, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        QueryInfo.generate(context, g(dVar), this.f24402a.a(), new d8.a(str, new v7.d(aVar, fVar)));
    }

    public AdFormat g(d dVar) {
        int i10 = a.f24403a[dVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return AdFormat.INTERSTITIAL;
            }
            return AdFormat.REWARDED;
        }
        return AdFormat.BANNER;
    }
}
