package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzflz implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfmv zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzflq zzf;
    private final long zzg;
    private final int zzh;

    public zzflz(Context context, int i10, int i11, String str, String str2, String str3, zzflq zzflqVar) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzflqVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfmv zzfmvVar = new zzfmv(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfmvVar;
        this.zzd = new LinkedBlockingQueue();
        zzfmvVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i10, long j10, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfna zzc = zzc();
        if (zzc != null) {
            try {
                zzfnh zzf = zzc.zzf(new zzfnf(1, this.zzh, this.zzb, this.zzc));
                zzd(IronSourceConstants.errorCode_internal, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzg, null);
            this.zzd.put(new zzfnh(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new zzfnh(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfnh zza(int i10) {
        zzfnh zzfnhVar;
        try {
            zzfnhVar = (zzfnh) this.zzd.poll(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            zzd(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e8);
            zzfnhVar = null;
        }
        zzd(IronSourceError.ERROR_REWARD_VALIDATION_FAILED, this.zzg, null);
        if (zzfnhVar != null) {
            if (zzfnhVar.zzc == 7) {
                zzflq.zzg(3);
            } else {
                zzflq.zzg(2);
            }
        }
        return zzfnhVar == null ? new zzfnh(null, 1) : zzfnhVar;
    }

    public final void zzb() {
        zzfmv zzfmvVar = this.zza;
        if (zzfmvVar != null) {
            if (zzfmvVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfna zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
