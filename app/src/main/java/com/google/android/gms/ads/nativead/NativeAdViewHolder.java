package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class NativeAdViewHolder {
    public static final WeakHashMap zza = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private zzbfi f11675a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f11676b;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.n(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzo.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzo.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.f11676b = new WeakReference(view);
        this.f11675a = zzbb.zza().zzk(view, a(map), a(map2));
    }

    private static final HashMap a(Map map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f11675a.zzb(ObjectWrapper.u0(view));
        } catch (RemoteException e8) {
            zzo.zzh("Unable to call setClickConfirmingView on delegate", e8);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        IObjectWrapper iObjectWrapper = (IObjectWrapper) nativeAd.zza();
        WeakReference weakReference = this.f11676b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzo.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        zzbfi zzbfiVar = this.f11675a;
        if (zzbfiVar != null) {
            try {
                zzbfiVar.zzc(iObjectWrapper);
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call setNativeAd on delegate", e8);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbfi zzbfiVar = this.f11675a;
        if (zzbfiVar != null) {
            try {
                zzbfiVar.zzd();
            } catch (RemoteException e8) {
                zzo.zzh("Unable to call unregisterNativeAd on delegate", e8);
            }
        }
        WeakReference weakReference = this.f11676b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
