package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbub extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbub> CREATOR = new zzbuc();
    @SafeParcelable.Field
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    @SafeParcelable.Constructor
    public zzbub(@SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e8) {
                    e = e8;
                    autoCloseOutputStream = null;
                }
                try {
                    zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbua
                        @Override // java.lang.Runnable
                        public final void run() {
                            DataOutputStream dataOutputStream;
                            Parcelable.Creator<zzbub> creator = zzbub.CREATOR;
                            OutputStream outputStream = autoCloseOutputStream;
                            byte[] bArr = marshall;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e10) {
                                    e = e10;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                IOUtils.a(dataOutputStream);
                            } catch (IOException e11) {
                                e = e11;
                                dataOutputStream2 = dataOutputStream;
                                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error transporting the ad response", e);
                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    IOUtils.a(outputStream);
                                } else {
                                    IOUtils.a(dataOutputStream2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    IOUtils.a(outputStream);
                                } else {
                                    IOUtils.a(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e10) {
                    e = e10;
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error transporting the ad response", e);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LargeParcelTeleporter.pipeData.2");
                    IOUtils.a(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int a10 = SafeParcelWriter.a(parcel);
                    SafeParcelWriter.q(parcel, 2, this.zza, i10, false);
                    SafeParcelWriter.b(parcel, a10);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a102 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.zza, i10, false);
        SafeParcelWriter.b(parcel, a102);
    }

    public final SafeParcelable zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    IOUtils.a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e8) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not read from parcel file descriptor", e8);
                    IOUtils.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                IOUtils.a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.zzb;
    }
}
