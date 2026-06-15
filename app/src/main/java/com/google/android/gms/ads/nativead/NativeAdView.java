package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbfc;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f11673a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbfc f11674b;

    public NativeAdView(Context context) {
        super(context);
        this.f11673a = b(context);
        this.f11674b = c();
    }

    private final FrameLayout b(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzbfc c() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f11673a;
        return zzbb.zza().zzj(frameLayout.getContext(), this, frameLayout);
    }

    private final void d(String str, View view) {
        zzbfc zzbfcVar = this.f11674b;
        if (zzbfcVar == null) {
            return;
        }
        try {
            zzbfcVar.zzdt(str, ObjectWrapper.u0(view));
        } catch (RemoteException e8) {
            zzo.zzh("Unable to call setAssetView on delegate", e8);
        }
    }

    public static /* synthetic */ void zzb(NativeAdView nativeAdView, ImageView.ScaleType scaleType) {
        zzbfc zzbfcVar = nativeAdView.f11674b;
        if (zzbfcVar == null || scaleType == null) {
            return;
        }
        try {
            zzbfcVar.zzdw(ObjectWrapper.u0(scaleType));
        } catch (RemoteException e8) {
            zzo.zzh("Unable to call setMediaViewImageScaleType on delegate", e8);
        }
    }

    public static /* synthetic */ void zzc(NativeAdView nativeAdView, MediaContent mediaContent) {
        zzbfc zzbfcVar = nativeAdView.f11674b;
        if (zzbfcVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfa) {
                zzbfcVar.zzdv(((zzfa) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbfcVar.zzdv(null);
            } else {
                zzo.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e8) {
            zzo.zzh("Unable to call setMediaContent on delegate", e8);
        }
    }

    protected final View a(String str) {
        zzbfc zzbfcVar = this.f11674b;
        if (zzbfcVar != null) {
            try {
                IObjectWrapper zzb = zzbfcVar.zzb(str);
                if (zzb != null) {
                    return (View) ObjectWrapper.t0(zzb);
                }
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call getAssetView on delegate", e8);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f11673a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f11673a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbfc zzbfcVar = this.f11674b;
        if (zzbfcVar == null) {
            return;
        }
        try {
            zzbfcVar.zzc();
        } catch (RemoteException e8) {
            zzo.zzh("Unable to destroy native ad view", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f11674b != null) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzlv)).booleanValue()) {
                try {
                    this.f11674b.zzd(ObjectWrapper.u0(motionEvent));
                } catch (RemoteException e8) {
                    zzo.zzh("Unable to call handleTouchEvent on delegate", e8);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View a10 = a("3011");
        if (a10 instanceof AdChoicesView) {
            return (AdChoicesView) a10;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View a10 = a("3010");
        if (a10 instanceof MediaView) {
            return (MediaView) a10;
        }
        if (a10 != null) {
            zzo.zze("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzbfc zzbfcVar = this.f11674b;
        if (zzbfcVar == null) {
            return;
        }
        try {
            zzbfcVar.zze(ObjectWrapper.u0(view), i10);
        } catch (RemoteException e8) {
            zzo.zzh("Unable to call onVisibilityChanged on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f11673a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f11673a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        d("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        d("3005", view);
    }

    public final void setBodyView(View view) {
        d("3004", view);
    }

    public final void setCallToActionView(View view) {
        d("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbfc zzbfcVar = this.f11674b;
        if (zzbfcVar == null) {
            return;
        }
        try {
            zzbfcVar.zzdu(ObjectWrapper.u0(view));
        } catch (RemoteException e8) {
            zzo.zzh("Unable to call setClickConfirmingView on delegate", e8);
        }
    }

    public final void setHeadlineView(View view) {
        d("3001", view);
    }

    public final void setIconView(View view) {
        d("3003", view);
    }

    public final void setImageView(View view) {
        d("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        d("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbfc zzbfcVar = this.f11674b;
        if (zzbfcVar == null) {
            return;
        }
        try {
            zzbfcVar.zzdx((IObjectWrapper) nativeAd.zza());
        } catch (RemoteException e8) {
            zzo.zzh("Unable to call setNativeAd on delegate", e8);
        }
    }

    public final void setPriceView(View view) {
        d("3007", view);
    }

    public final void setStarRatingView(View view) {
        d("3009", view);
    }

    public final void setStoreView(View view) {
        d("3006", view);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11673a = b(context);
        this.f11674b = c();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11673a = b(context);
        this.f11674b = c();
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f11673a = b(context);
        this.f11674b = c();
    }
}
