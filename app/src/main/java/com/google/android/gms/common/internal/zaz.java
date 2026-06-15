package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaz extends RemoteCreator<zam> {

    /* renamed from: a  reason: collision with root package name */
    private static final zaz f12603a = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i10, int i11) throws RemoteCreator.RemoteCreatorException {
        zaz zazVar = f12603a;
        try {
            zax zaxVar = new zax(1, i10, i11, null);
            return (View) ObjectWrapper.t0(zazVar.getRemoteCreatorInstance(context).Z(ObjectWrapper.u0(context), zaxVar));
        } catch (Exception e8) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i10);
            sb.append(" and color ");
            sb.append(i11);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e8);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ zam getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zam(iBinder);
    }
}
