package c8;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
/* compiled from: ScarBannerAd.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class c extends a<AdView> {

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f5578g;

    /* renamed from: h  reason: collision with root package name */
    private int f5579h;

    /* renamed from: i  reason: collision with root package name */
    private int f5580i;

    /* renamed from: j  reason: collision with root package name */
    private AdView f5581j;

    public c(Context context, RelativeLayout relativeLayout, b8.a aVar, u7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.g gVar) {
        super(context, cVar, aVar, dVar);
        this.f5578g = relativeLayout;
        this.f5579h = i10;
        this.f5580i = i11;
        this.f5581j = new AdView(this.f5572b);
        this.f5575e = new d(gVar, this);
    }

    @Override // c8.a
    protected void c(AdRequest adRequest, u7.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f5578g;
        if (relativeLayout == null || (adView = this.f5581j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f5581j.setAdSize(new AdSize(this.f5579h, this.f5580i));
        this.f5581j.setAdUnitId(this.f5573c.b());
        this.f5581j.setAdListener(((d) this.f5575e).d());
        this.f5581j.loadAd(adRequest);
    }

    public void e() {
        AdView adView;
        RelativeLayout relativeLayout = this.f5578g;
        if (relativeLayout == null || (adView = this.f5581j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
