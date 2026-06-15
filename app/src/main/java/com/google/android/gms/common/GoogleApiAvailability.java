package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.j;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zal;
import com.ironsource.cc;
import com.unity3d.services.UnityAdsConstants;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* renamed from: c  reason: collision with root package name */
    private String f12019c;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f12017e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final GoogleApiAvailability f12018f = new GoogleApiAvailability();

    /* renamed from: d  reason: collision with root package name */
    public static final int f12016d = GoogleApiAvailabilityLight.f12020a;

    public static GoogleApiAvailability q() {
        return f12018f;
    }

    public final boolean A(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent p10;
        if (InstantApps.a(context) || (p10 = p(context, connectionResult)) == null) {
            return false;
        }
        x(context, connectionResult.X(), null, zal.zaa(context, 0, GoogleApiActivity.a(context, p10, i10, true), zal.zaa | 134217728));
        return true;
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public Intent d(Context context, int i10, String str) {
        return super.d(context, i10, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent e(Context context, int i10, int i11) {
        return super.e(context, i10, i11);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String g(int i10) {
        return super.g(i10);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    public int i(Context context) {
        return super.i(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int j(Context context, int i10) {
        return super.j(context, i10);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean m(int i10) {
        return super.m(i10);
    }

    public Dialog o(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return t(activity, i10, zag.b(activity, d(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent p(Context context, ConnectionResult connectionResult) {
        if (connectionResult.y0()) {
            return connectionResult.o0();
        }
        return e(context, connectionResult.X(), 0);
    }

    public boolean r(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o10 = o(activity, i10, i11, onCancelListener);
        if (o10 == null) {
            return false;
        }
        w(activity, o10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void s(Context context, int i10) {
        x(context, i10, null, f(context, i10, 0, cc.f16875q));
    }

    final Dialog t(Context context, int i10, zag zagVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(zac.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = zac.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, zagVar);
        }
        String g10 = zac.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(zac.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        w(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final zabx v(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        context.registerReceiver(zabxVar, intentFilter);
        zabxVar.a(context);
        if (l(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.a();
        zabxVar.b();
        return null;
    }

    final void w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.l2(dialog, onCancelListener).k2(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void x(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            y(context);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String f10 = zac.f(context, i10);
            String e8 = zac.e(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) Preconditions.m(context.getSystemService("notification"));
            j.e x10 = new j.e(context).q(true).f(true).k(f10).x(new j.c().h(e8));
            if (DeviceProperties.f(context)) {
                Preconditions.p(PlatformVersion.e());
                x10.v(context.getApplicationInfo().icon).t(2);
                if (DeviceProperties.g(context)) {
                    x10.a(com.google.android.gms.base.R.drawable.f11916a, resources.getString(com.google.android.gms.base.R.string.f11935o), pendingIntent);
                } else {
                    x10.i(pendingIntent);
                }
            } else {
                x10.v(17301642).y(resources.getString(com.google.android.gms.base.R.string.f11928h)).B(System.currentTimeMillis()).i(pendingIntent).j(e8);
            }
            if (PlatformVersion.i()) {
                Preconditions.p(PlatformVersion.i());
                synchronized (f12017e) {
                    str2 = this.f12019c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String b10 = zac.b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b10, 4));
                    } else if (!b10.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b10);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                x10.g(str2);
            }
            Notification b11 = x10.b();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                GooglePlayServicesUtilLight.f12027b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, b11);
        }
    }

    final void y(Context context) {
        new a(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final boolean z(Activity activity, LifecycleFragment lifecycleFragment, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog t10 = t(activity, i10, zag.c(lifecycleFragment, d(activity, i10, "d"), 2), onCancelListener);
        if (t10 == null) {
            return false;
        }
        w(activity, t10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
