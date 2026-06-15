package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.b9;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcox extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcox(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcox zza(Context context, View view, zzezu zzezuVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcox zzcoxVar = new zzcox(context);
        if (!zzezuVar.zzu.isEmpty() && (resources = zzcoxVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzezv zzezvVar = (zzezv) zzezuVar.zzu.get(0);
            float f10 = displayMetrics.density;
            zzcoxVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzezvVar.zza * f10), (int) (zzezvVar.zzb * f10)));
        }
        zzcoxVar.zzb = view;
        zzcoxVar.addView(view);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzbzc.zzb(zzcoxVar, zzcoxVar);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzbzc.zza(zzcoxVar, zzcoxVar);
        JSONObject jSONObject = zzezuVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcoxVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcoxVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcoxVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcoxVar.addView(relativeLayout);
        return zzcoxVar;
    }

    private final int zzb(double d10) {
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(b9.h.K0, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
