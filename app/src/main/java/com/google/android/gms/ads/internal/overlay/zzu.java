package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbm;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageButton f11362a;

    /* renamed from: b  reason: collision with root package name */
    private final zzag f11363b;

    public zzu(Context context, zzt zztVar, zzag zzagVar) {
        super(context);
        this.f11363b = zzagVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f11362a = imageButton;
        b();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbb.zzb();
        int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zza);
        zzbb.zzb();
        int zzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, 0);
        zzbb.zzb();
        int zzy3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zzb);
        zzbb.zzb();
        imageButton.setPadding(zzy, zzy2, zzy3, com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbb.zzb();
        int zzy4 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzbb.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzy4, com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zzd + zztVar.zzc), 17));
        long longValue = ((Long) zzbd.zzc().zzb(zzbbm.zzbl)).longValue();
        if (longValue <= 0) {
            return;
        }
        zzs zzsVar = ((Boolean) zzbd.zzc().zzb(zzbbm.zzbm)).booleanValue() ? new zzs(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzsVar);
    }

    private final void b() {
        String str = (String) zzbd.zzc().zzb(zzbbm.zzbk);
        if (PlatformVersion.f() && !TextUtils.isEmpty(str) && !RewardedVideo.VIDEO_MODE_DEFAULT.equals(str)) {
            Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
            if (zze != null) {
                Drawable drawable = null;
                try {
                    if ("white".equals(str)) {
                        drawable = zze.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                    } else if ("black".equals(str)) {
                        drawable = zze.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                    }
                } catch (Resources.NotFoundException unused) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Close button resource not found, falling back to default.");
                }
                if (drawable == null) {
                    this.f11362a.setImageResource(17301527);
                    return;
                }
                this.f11362a.setImageDrawable(drawable);
                this.f11362a.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            this.f11362a.setImageResource(17301527);
            return;
        }
        this.f11362a.setImageResource(17301527);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzag zzagVar = this.f11363b;
        if (zzagVar != null) {
            zzagVar.zzj();
        }
    }

    public final void zzb(boolean z10) {
        if (z10) {
            this.f11362a.setVisibility(8);
            if (((Long) zzbd.zzc().zzb(zzbbm.zzbl)).longValue() > 0) {
                this.f11362a.animate().cancel();
                this.f11362a.clearAnimation();
                return;
            }
            return;
        }
        this.f11362a.setVisibility(0);
    }
}
