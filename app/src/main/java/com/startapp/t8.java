package com.startapp;

import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t8 extends TelephonyManager.CellInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u8 f23385a;

    public t8(u8 u8Var) {
        this.f23385a = u8Var;
    }

    @Override // android.telephony.TelephonyManager.CellInfoCallback
    public final void onCellInfo(List<CellInfo> list) {
        this.f23385a.b(false);
    }
}
