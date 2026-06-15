package y7;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
/* compiled from: ScarBannerAd.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class c extends a<AdView> {

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f33298g;

    /* renamed from: h  reason: collision with root package name */
    private int f33299h;

    /* renamed from: i  reason: collision with root package name */
    private int f33300i;

    /* renamed from: j  reason: collision with root package name */
    private AdView f33301j;

    public c(Context context, RelativeLayout relativeLayout, x7.a aVar, u7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.g gVar) {
        super(context, cVar, aVar, dVar);
        this.f33298g = relativeLayout;
        this.f33299h = i10;
        this.f33300i = i11;
        this.f33301j = new AdView(this.f33292b);
        this.f33295e = new d(gVar, this);
    }

    @Override // y7.a
    protected void c(AdRequest adRequest, u7.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f33298g;
        if (relativeLayout == null || (adView = this.f33301j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f33301j.setAdSize(new AdSize(this.f33299h, this.f33300i));
        this.f33301j.setAdUnitId(this.f33293c.b());
        this.f33301j.setAdListener(((d) this.f33295e).d());
        this.f33301j.loadAd(adRequest);
    }

    public void e() {
        AdView adView;
        RelativeLayout relativeLayout = this.f33298g;
        if (relativeLayout == null || (adView = this.f33301j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
