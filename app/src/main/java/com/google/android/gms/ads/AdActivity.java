package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    /* renamed from: a  reason: collision with root package name */
    private zzbsd f11057a;

    private final void a() {
        zzbsd zzbsdVar = this.f11057a;
        if (zzbsdVar != null) {
            try {
                zzbsdVar.zzx();
            } catch (RemoteException e8) {
                zzo.zzl("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzh(i10, i11, intent);
            }
        } catch (Exception e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                if (!zzbsdVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        }
        super.onBackPressed();
        try {
            zzbsd zzbsdVar2 = this.f11057a;
            if (zzbsdVar2 != null) {
                zzbsdVar2.zzi();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzk(ObjectWrapper.u0(configuration));
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbsd zzq = zzbb.zza().zzq(this);
        this.f11057a = zzq;
        if (zzq != null) {
            try {
                zzq.zzl(bundle);
                return;
            } catch (RemoteException e8) {
                zzo.zzl("#007 Could not call remote method.", e8);
                finish();
                return;
            }
        }
        zzo.zzl("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzm();
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzo();
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzp(i10, strArr, iArr);
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzq();
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzr();
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzs(bundle);
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzt();
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzu();
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbsd zzbsdVar = this.f11057a;
            if (zzbsdVar != null) {
                zzbsdVar.zzv();
            }
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
