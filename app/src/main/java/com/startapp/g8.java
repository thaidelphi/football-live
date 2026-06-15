package com.startapp;

import android.content.pm.PackageInfo;
import java.util.Comparator;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g8 implements Comparator<PackageInfo> {
    @Override // java.util.Comparator
    public final int compare(PackageInfo packageInfo, PackageInfo packageInfo2) {
        int i10 = (packageInfo.firstInstallTime > packageInfo2.firstInstallTime ? 1 : (packageInfo.firstInstallTime == packageInfo2.firstInstallTime ? 0 : -1));
        if (i10 > 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }
}
