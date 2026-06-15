package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d4 {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f6802a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6803b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6804c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6805d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6806e;

    public d4(Activity activity) {
        this.f6802a = activity;
        int c10 = d7.c(activity);
        this.f6804c = c10;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f6805d = isTablet;
        this.f6803b = a(c10, isTablet);
        this.f6806e = isTablet && 2 == a(activity);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i10;
        if (bVar.B0() && (i10 = this.f6803b) != -1) {
            a(i10);
        } else {
            a(bVar.c0());
        }
    }

    private int a(int i10, boolean z10) {
        if (z10 && this.f6806e) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 1) {
                return 9;
            }
            if (i10 == 2) {
                return 8;
            }
            return i10 == 3 ? 1 : -1;
        } else if (i10 == 0) {
            return 1;
        } else {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 9;
            }
            return i10 == 3 ? 8 : -1;
        }
    }

    private void a(b.c cVar) {
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (this.f6805d && this.f6806e) {
                int i10 = this.f6804c;
                if (i10 != 1 && i10 != 3) {
                    a(1);
                    return;
                } else if (i10 == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i11 = this.f6804c;
            if (i11 != 0 && i11 != 2) {
                a(1);
            } else {
                a(i11 != 0 ? 9 : 1);
            }
        } else if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            if (this.f6805d && this.f6806e) {
                int i12 = this.f6804c;
                if (i12 != 0 && i12 != 2) {
                    a(0);
                    return;
                } else {
                    a(i12 != 2 ? 0 : 8);
                    return;
                }
            }
            int i13 = this.f6804c;
            if (i13 != 1 && i13 != 3) {
                a(0);
            } else {
                a(i13 == 1 ? 0 : 8);
            }
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i10) {
        try {
            this.f6802a.setRequestedOrientation(i10);
        } catch (Throwable unused) {
        }
    }
}
