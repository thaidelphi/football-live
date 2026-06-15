package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.IMessengerCompat;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    Messenger f11967a;

    /* renamed from: b  reason: collision with root package name */
    IMessengerCompat f11968b;

    public zzd(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11967a = new Messenger(iBinder);
        } else {
            this.f11968b = new IMessengerCompat.Proxy(iBinder);
        }
    }

    public final IBinder a() {
        Messenger messenger = this.f11967a;
        return messenger != null ? messenger.getBinder() : this.f11968b.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f11967a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f11968b.I(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((zzd) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f11967a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f11968b.asBinder());
        }
    }
}
