package z7;

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
    private x7.a f33724a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignalsCollector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33725a;

        static {
            int[] iArr = new int[d.values().length];
            f33725a = iArr;
            try {
                iArr[d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33725a[d.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33725a[d.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(x7.a aVar) {
        this.f33724a = aVar;
    }

    @Override // v7.c
    public void d(Context context, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        e(context, f(dVar), dVar, aVar, fVar);
    }

    @Override // v7.c
    public void e(Context context, String str, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        QueryInfo.generate(context, g(dVar), this.f33724a.a(), new z7.a(str, new v7.d(aVar, fVar)));
    }

    public AdFormat g(d dVar) {
        int i10 = a.f33725a[dVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return AdFormat.UNKNOWN;
                }
                return AdFormat.REWARDED;
            }
            return AdFormat.INTERSTITIAL;
        }
        return AdFormat.BANNER;
    }
}
