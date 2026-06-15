package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdhn extends zzbfb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdip {
    public static final zzfvv zza = zzfvv.zzq("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgba zzf;
    private View zzg;
    private zzdgm zzi;
    private zzaxm zzj;
    private zzbev zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 250505300;

    public zzdhn(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzv.zzy();
        zzbzc.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzbzc.zzb(frameLayout, this);
        this.zzf = zzbyp.zzf;
        this.zzj = new zzaxm(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public static /* synthetic */ void zzs(zzdhn zzdhnVar) {
        if (zzdhnVar.zzg == null) {
            View view = new View(zzdhnVar.zzd.getContext());
            zzdhnVar.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (zzdhnVar.zzd != zzdhnVar.zzg.getParent()) {
            zzdhnVar.zzd.addView(zzdhnVar.zzg);
        }
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e8) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Encountered invalid base64 watermark.", e8);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhm
            @Override // java.lang.Runnable
            public final void run() {
                zzdhn.zzs(zzdhn.this);
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlv)).booleanValue() || this.zzi.zza() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdhv(this.zzi, this));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdgm zzdgmVar = this.zzi;
        if (zzdgmVar == null || !zzdgmVar.zzV()) {
            return;
        }
        this.zzi.zzA();
        this.zzi.zzD(view, this.zzd, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdgm zzdgmVar = this.zzi;
        if (zzdgmVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdgmVar.zzB(frameLayout, zzl(), zzm(), zzdgm.zzY(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdgm zzdgmVar = this.zzi;
        if (zzdgmVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdgmVar.zzB(frameLayout, zzl(), zzm(), zzdgm.zzY(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdgm zzdgmVar = this.zzi;
        if (zzdgmVar != null) {
            zzdgmVar.zzL(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlv)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final synchronized IObjectWrapper zzb(String str) {
        return ObjectWrapper.u0(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdgm zzdgmVar = this.zzi;
        if (zzdgmVar != null) {
            zzdgmVar.zzT(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.t0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final synchronized void zzdt(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.t0(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final synchronized void zzdu(IObjectWrapper iObjectWrapper) {
        this.zzi.zzN((View) ObjectWrapper.t0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final synchronized void zzdv(zzbev zzbevVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbevVar;
            zzdgm zzdgmVar = this.zzi;
            if (zzdgmVar != null) {
                zzdgmVar.zzc().zzb(zzbevVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final synchronized void zzdw(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final synchronized void zzdx(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object t02 = ObjectWrapper.t0(iObjectWrapper);
        if (!(t02 instanceof zzdgm)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdgm zzdgmVar = this.zzi;
        if (zzdgmVar != null) {
            zzdgmVar.zzT(this);
        }
        zzu();
        zzdgm zzdgmVar2 = (zzdgm) t02;
        this.zzi = zzdgmVar2;
        zzdgmVar2.zzS(this);
        this.zzi.zzK(this.zzd);
        this.zzi.zzz(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdZ)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final zzaxm zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final synchronized JSONObject zzo() {
        zzdgm zzdgmVar = this.zzi;
        if (zzdgmVar != null) {
            return zzdgmVar.zzi(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final synchronized JSONObject zzp() {
        zzdgm zzdgmVar = this.zzi;
        if (zzdgmVar != null) {
            return zzdgmVar.zzj(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdip
    public final synchronized void zzq(String str, View view, boolean z10) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbv.zzi(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }
}
