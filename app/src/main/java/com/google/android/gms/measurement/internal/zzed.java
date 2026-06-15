package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzed extends com.google.android.gms.internal.measurement.zzbn implements zzee {
    public zzed() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                i((zzaw) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzaw.CREATOR), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                m((zzlc) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzlc.CREATOR), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                j((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                i0((zzaw) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzaw.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                D((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zzg = com.google.android.gms.internal.measurement.zzbo.zzg(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List d10 = d((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR), zzg);
                parcel2.writeNoException();
                parcel2.writeTypedList(d10);
                return true;
            case 9:
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                byte[] J = J((zzaw) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzaw.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(J);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                l(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                String K = K((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(K);
                return true;
            case 12:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                l0((zzac) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzac.CREATOR), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                c((zzac) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List p10 = p(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbo.zzg(parcel), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(p10);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean zzg2 = com.google.android.gms.internal.measurement.zzbo.zzg(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List F = F(readString7, readString8, readString9, zzg2);
                parcel2.writeNoException();
                parcel2.writeTypedList(F);
                return true;
            case 16:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List c02 = c0(parcel.readString(), parcel.readString(), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(c02);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                List N = N(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(N);
                return true;
            case 18:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                s((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                E((Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, Bundle.CREATOR), (zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                o((zzq) com.google.android.gms.internal.measurement.zzbo.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
