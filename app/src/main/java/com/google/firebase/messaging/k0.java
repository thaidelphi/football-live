package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: RemoteMessageCreator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class k0 implements Parcelable.Creator<RemoteMessage> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 2, remoteMessage.f14902a, false);
        SafeParcelWriter.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.J(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 2) {
                SafeParcelReader.I(parcel, C);
            } else {
                bundle = SafeParcelReader.f(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, J);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
