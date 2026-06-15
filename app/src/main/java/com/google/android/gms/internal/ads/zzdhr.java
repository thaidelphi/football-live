package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdhr {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfap zzc;
    private final zzdgw zzd;
    private final zzdgr zze;
    private final zzdif zzf;
    private final zzdin zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzben zzj;
    private final zzdgo zzk;

    public zzdhr(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfap zzfapVar, zzdgw zzdgwVar, zzdgr zzdgrVar, zzdif zzdifVar, zzdin zzdinVar, Executor executor, Executor executor2, zzdgo zzdgoVar) {
        this.zzb = zzgVar;
        this.zzc = zzfapVar;
        this.zzj = zzfapVar.zzi;
        this.zzd = zzdgwVar;
        this.zze = zzdgrVar;
        this.zzf = zzdifVar;
        this.zzg = zzdinVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdgoVar;
    }

    public static /* synthetic */ void zza(zzdhr zzdhrVar, ViewGroup viewGroup) {
        zzdgr zzdgrVar = zzdhrVar.zze;
        if (zzdgrVar.zzf() != null) {
            boolean z10 = viewGroup != null;
            if (zzdgrVar.zzc() != 2 && zzdgrVar.zzc() != 1) {
                if (zzdgrVar.zzc() == 6) {
                    zzdhrVar.zzb.zzF(zzdhrVar.zzc.zzf, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION, z10);
                    zzdhrVar.zzb.zzF(zzdhrVar.zzc.zzf, "1", z10);
                    return;
                }
                return;
            }
            zzdhrVar.zzb.zzF(zzdhrVar.zzc.zzf, String.valueOf(zzdgrVar.zzc()), z10);
        }
    }

    public static /* synthetic */ void zzb(final zzdhr zzdhrVar, zzdip zzdipVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbev zza2;
        Drawable drawable;
        if (zzdhrVar.zzd.zzf() || zzdhrVar.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i10 = 0; i10 < 2; i10++) {
                View zzg = zzdipVar.zzg(strArr[i10]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdipVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdgr zzdgrVar = zzdhrVar.zze;
        if (zzdgrVar.zze() != null) {
            zzben zzbenVar = zzdhrVar.zzj;
            view = zzdgrVar.zze();
            if (zzbenVar != null && viewGroup == null) {
                zzh(layoutParams, zzbenVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdgrVar.zzl() instanceof zzbei) {
            zzbei zzbeiVar = (zzbei) zzdgrVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbeiVar.zzc());
                viewGroup = null;
            }
            View zzbejVar = new zzbej(context, zzbeiVar, layoutParams);
            zzbejVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdU));
            view = zzbejVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdipVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdipVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdipVar.zzq(zzdipVar.zzk(), view, true);
        }
        zzfvv zzfvvVar = zzdhn.zza;
        int size = zzfvvVar.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdipVar.zzg((String) zzfvvVar.get(i11));
            i11++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        zzdhrVar.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdho
            @Override // java.lang.Runnable
            public final void run() {
                zzdhr.zza(zzdhr.this, viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzdhrVar.zzi(viewGroup2, true)) {
            zzdgr zzdgrVar2 = zzdhrVar.zze;
            if (zzdgrVar2.zzs() != null) {
                zzdgrVar2.zzs().zzar(new zzdhq(zzdipVar, viewGroup2));
            }
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjV)).booleanValue() && zzdhrVar.zzi(viewGroup2, false)) {
            zzdgr zzdgrVar3 = zzdhrVar.zze;
            if (zzdgrVar3.zzq() != null) {
                zzdgrVar3.zzq().zzar(new zzdhq(zzdipVar, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzf = zzdipVar.zzf();
            Context context2 = zzf != null ? zzf.getContext() : null;
            if (context2 == null || (zza2 = zzdhrVar.zzk.zza()) == null) {
                return;
            }
            try {
                IObjectWrapper zzi = zza2.zzi();
                if (zzi == null || (drawable = (Drawable) ObjectWrapper.t0(zzi)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzj = zzdipVar.zzj();
                if (zzj != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgb)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.t0(zzj));
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                imageView.setScaleType(zza);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get main image drawable");
            }
        }
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z10) {
        View zzg;
        FrameLayout.LayoutParams layoutParams;
        if (z10) {
            zzg = this.zze.zzf();
        } else {
            zzg = this.zze.zzg();
        }
        if (zzg == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzg.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzg.getParent()).removeView(zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdW)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzg, layoutParams);
        return true;
    }

    public final void zzc(zzdip zzdipVar) {
        if (zzdipVar == null || this.zzf == null || zzdipVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdipVar.zzh().addView(this.zzf.zza());
        } catch (zzcec e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e8);
        }
    }

    public final void zzd(zzdip zzdipVar) {
        if (zzdipVar == null) {
            return;
        }
        Context context = zzdipVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Activity context is needed for policy validator.");
            } else if (this.zzg == null || zzdipVar.zzh() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzg.zza(zzdipVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbv.zzb());
                } catch (zzcec e8) {
                    com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e8);
                }
            }
        }
    }

    public final void zze(final zzdip zzdipVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhp
            @Override // java.lang.Runnable
            public final void run() {
                zzdhr.zzb(zzdhr.this, zzdipVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
