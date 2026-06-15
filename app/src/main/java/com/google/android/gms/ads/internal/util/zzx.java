package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbbm;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@TargetApi(28)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class zzx extends zzv {
    private static final void b(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = true != z10 ? 2 : 1;
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    public static /* synthetic */ WindowInsets zzk(zzx zzxVar, Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzj() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzi.zzy(str);
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzy("");
            }
        }
        b(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzl(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbo)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzj() == null && !activity.isInMultiWindowMode()) {
            b(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.zzk(zzx.this, activity, view, windowInsets);
                }
            });
        }
    }
}
