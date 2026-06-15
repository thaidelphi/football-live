package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbta;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class BaseAdView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final zzek f11083a;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, int i10) {
        super(context);
        this.f11083a = new zzek(this, i10);
    }

    public void destroy() {
        zzbbm.zza(getContext());
        if (((Boolean) zzbdk.zze.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.f11083a.zzl();
                        } catch (IllegalStateException e8) {
                            zzbta.zza(baseAdView.getContext()).zzh(e8, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f11083a.zzl();
    }

    public AdListener getAdListener() {
        return this.f11083a.zza();
    }

    public AdSize getAdSize() {
        return this.f11083a.zzb();
    }

    public String getAdUnitId() {
        return this.f11083a.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.f11083a.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.f11083a.zzd();
    }

    public boolean isCollapsible() {
        return this.f11083a.zzA();
    }

    public boolean isLoading() {
        return this.f11083a.zzB();
    }

    public void loadAd(final AdRequest adRequest) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbbm.zza(getContext());
        if (((Boolean) zzbdk.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzld)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.f11083a.zzm(adRequest.f11069a);
                        } catch (IllegalStateException e8) {
                            zzbta.zza(baseAdView.getContext()).zzh(e8, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f11083a.zzm(adRequest.f11069a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        AdSize adSize;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        } else {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e8) {
                zzo.zzh("Unable to retrieve ad size.", e8);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i12 = adSize.getHeightInPixels(context);
                i13 = widthInPixels;
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void pause() {
        zzbbm.zza(getContext());
        if (((Boolean) zzbdk.zzg.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzlb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.f11083a.zzn();
                        } catch (IllegalStateException e8) {
                            zzbta.zza(baseAdView.getContext()).zzh(e8, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f11083a.zzn();
    }

    public void resume() {
        zzbbm.zza(getContext());
        if (((Boolean) zzbdk.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzkZ)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.f11083a.zzp();
                        } catch (IllegalStateException e8) {
                            zzbta.zza(baseAdView.getContext()).zzh(e8, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f11083a.zzp();
    }

    public void setAdListener(AdListener adListener) {
        this.f11083a.zzr(adListener);
        if (adListener == null) {
            this.f11083a.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.f11083a.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.f11083a.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.f11083a.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.f11083a.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f11083a.zzx(onPaidEventListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f11083a = new zzek(this, attributeSet, false, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f11083a = new zzek(this, attributeSet, false, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11, boolean z10) {
        super(context, attributeSet, i10);
        this.f11083a = new zzek(this, attributeSet, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdView(Context context, AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.f11083a = new zzek(this, attributeSet, z10);
    }
}
